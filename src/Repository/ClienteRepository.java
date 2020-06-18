package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import ConexaoDB.ConnectionFactory;
import model.ClienteModel;

public class ClienteRepository {

	public static void insertInto(ClienteModel model) {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "Insert into cliente (nomeCliente, cpf, telefone, cnh, dataNascimento) VALUES"
					+ "(?, ?, ?, ?, ?)";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, model.getNomeCompleto());
			statement.setString(2, model.getCpf());
			statement.setString(3, model.getTelefone());
			statement.setString(4, model.getCnh());
			statement.setDate(5, null);

			statement.execute();

			con.close();
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
