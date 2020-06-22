package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import ConexaoDB.ConnectionFactory;
import metodosGerais.MetodosGerais;
import model.ContaModel;
import model.FuncionarioModel;

public class FuncionarioRepository {

	public static void insertInto(ContaModel contaModel) {
		String mensagemFinal;
		Connection con = ConnectionFactory.getConnection();
		try {
			con.setAutoCommit(false);
			String queryConta = "Insert into conta (login, senha, ativo) values (?, md5(?), 1)";
			PreparedStatement statement1 = con.prepareStatement(queryConta);
			contaModel.gerarUsuario();
			statement1.setString(1, contaModel.getLogin());
			statement1.setString(2, contaModel.getPassword());
			statement1.execute();

			String selectIdConta = "select max(idConta) from conta";
			PreparedStatement statement2 = con.prepareStatement(selectIdConta);
			ResultSet rs = statement2.executeQuery();
			int idConta = rs.next() ? rs.getInt(1) : 0;

			String queryFuncionario = "Insert into funcionario "
					+ "(nomeCompleto, cpf, telefoneContato, dataNascimento, ativo, idConta, idCargo ) "
					+ "values (?, ?, ?, ?, 1, ?, ?)";
			PreparedStatement statement3 = con.prepareStatement(queryFuncionario);
			statement3.setString(1, contaModel.getNomeCompleto());
			statement3.setString(2, contaModel.getCpf());
			statement3.setString(3, contaModel.getTelefoneContato());
			statement3.setDate(4, contaModel.getDataNascimento());
			statement3.setInt(5, idConta);
			statement3.setInt(6, contaModel.getIdCargo());
			statement3.execute();

			con.commit();
			con.close();
			mensagemFinal = "Cadastro realizado com sucesso.";

		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			mensagemFinal = "Houve um erro ao cadastrar o funcionario e sua conta.";

			if (e instanceof SQLIntegrityConstraintViolationException) {
				mensagemFinal += "\nCpf j� cadastrado";
			}
		}
		JOptionPane.showMessageDialog(new JFrame(), mensagemFinal);
	}

	public static Boolean obterConta(ContaModel model) {
		Boolean existe = false;
		try {
			Connection con = ConnectionFactory.getConnection();
			String query = "Select * from conta where login = ? and senha = md5(?)";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, model.getLogin());
			statement.setString(2, model.getPassword());

			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				// ContaModel retorno = new ContaModel(rs.getString("login"),
				// rs.getString("senha"));
				existe = true;

			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return existe;
	}

	public static List<FuncionarioModel> obterListaFuncionario(Boolean apenasAtivos) {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "select * from funcionario " + (apenasAtivos ? "where ativo = 1" : "");
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			List<FuncionarioModel> modelList = new ArrayList<FuncionarioModel>();

			while (rs.next()) {
				FuncionarioModel model = new FuncionarioModel();
				model.setIdFuncionario(rs.getInt("idFuncionario"));
				model.setNomeCompleto(rs.getString("nomeCompleto"));
				model.setCpf(rs.getString("cpf"));
				model.setAtivo(rs.getBoolean("ativo"));
				model.setDataNascimento(rs.getDate("dataNascimento"));
				model.setTelefoneContato("telefoneContato");
				model.setIdCargo(rs.getInt("idCargo"));
				model.setIdConta(rs.getInt("idConta"));
				modelList.add(model);
			}
			con.close();
			return modelList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void obterFuncionarioLista(JTable table) {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "select " + "idFuncionario as 'C�digo', " + "nomeCompleto as 'Nome Completo', "
					+ "cpf as 'CPF', " + "telefoneContato as 'Telefone', " + "ativo as 'Ativo', "
					+ "dataNascimento as 'Data Nascimento', " + "c.nomeCargo as 'Fun��o' " + "from funcionario f "
					+ "join cargo c on f.idCargo = c.idCargo";

			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();

			table.setModel(MetodosGerais.resultSetToTableModel(rs));

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
