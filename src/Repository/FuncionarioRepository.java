package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import ConexaoDB.ConnectionFactory;
import model.ContaModel;

public class FuncionarioRepository {

	public static void insertInto(ContaModel contaModel) {

		try {
			Connection con = ConnectionFactory.getConnection();
			String queryConta = "Insert into conta (login, senha, ativo) values (?, sha256(?), 1)";
			PreparedStatement statement1 = con.prepareStatement(queryConta);
			contaModel.gerarUsuario();
			statement1.setString(1, contaModel.getLogin());
			statement1.setString(2, contaModel.getPassword());
			statement1.execute();
			String queryFuncionario = "Insert into funcionario "
					+ "(nomeCompleto, cpf, telefoneContato, dataNascimento, ativo, idConta, idCargo ) "
					+ "values (?, ?, ?, ?, 1, ?, (select max(idConta) from conta))";
			PreparedStatement statement2 = con.prepareStatement(queryFuncionario);
			statement2.setString(1, contaModel.getNomeCompleto());
			statement2.setString(2, contaModel.getCpf());
			statement2.setString(3, contaModel.getTelefoneContato());
			statement2.setDate(4, contaModel.getDataNascimento());
			statement2.setInt(6, contaModel.getIdCargo());
			statement2.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Houve algum erro ao cadastrar o funcionario e sua conta.");
		}
	}
	public void obterConta(ContaModel model) {
		try {
			Connection con = ConnectionFactory.getConnection();
			String query = "Select * from conta where login = ? and senha = ?";
			PreparedStatement statement = con.prepareStatement(query);
			
			ResultSet rs = statement.executeQuery();
			ContaModel retorno = new ContaModel(rs.getString("login"), rs.getString("senha"));
			if(model.getLogin() != retorno.getLogin() || model.getPassword() != retorno.getPassword()) {
				JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
