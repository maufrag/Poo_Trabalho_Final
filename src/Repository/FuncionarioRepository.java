package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ConexaoDB.ConnectionFactory;
import model.ContaModel;

public class FuncionarioRepository {

	public static void insertInto(ContaModel contaModel) {
		String mensagemFinal;
		Connection con = ConnectionFactory.getConnection();
		try {
			String queryConta = "Insert into conta (login, senha, ativo) values (?, ?, 1)";
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
					+ "values (?, ?, ?, ?, 1, ?, 1)";
			PreparedStatement statement3 = con.prepareStatement(queryFuncionario);
			statement3.setString(1, contaModel.getNomeCompleto());
			statement3.setString(2, contaModel.getCpf());
			statement3.setString(3, contaModel.getTelefoneContato());
			statement3.setDate(4, null);
			statement3.setInt(5, idConta);
			statement3.execute();
			con.close();
			mensagemFinal = "Cadastro realizado com sucesso.";

		} catch (SQLException e) {
			e.printStackTrace();
			mensagemFinal = "Houve algum erro ao cadastrar o funcionario e sua conta.";
		}
		JOptionPane.showMessageDialog(new JFrame(), mensagemFinal);

	}

	public static Boolean obterConta(ContaModel model) {
		Boolean existe = false;
		try {
			Connection con = ConnectionFactory.getConnection();
			String query = "Select * from conta where login = ? and senha = ?";
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

}
