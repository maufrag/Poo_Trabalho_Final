package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import ConexaoDB.ConnectionFactory;
import model.ClienteModel;

public class ClienteRepository {

	public static void insertInto(ClienteModel model) {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "Insert into cliente (nomeCompleto, cpf, telefone, cnh, dataNascimento) VALUES"
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

	public static ClienteModel obterPorCpfParaAlocacao(ClienteModel model) {
		Connection con = ConnectionFactory.getConnection();
		try {
			String query = "select idCliente from Cliente where cpf = ?";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, model.getCpf());
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				model.setIdCliente(rs.getInt("idCliente"));
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
			model = null;
		}
		return model;
	}

	public static List<ClienteModel> obterListaCliente() {
		Connection con = ConnectionFactory.getConnection();
		List<ClienteModel> modelList = new ArrayList<ClienteModel>();

		try {
			String query = "select * from cliente";

			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				while (rs.next()) {
					ClienteModel model = new ClienteModel();
					model.setIdCliente(rs.getInt("idCliente"));
					model.setNomeCompleto(rs.getString("nomeCompleto"));
					model.setCpf(rs.getString("cpf"));
					model.setTelefone(rs.getString("telefone"));
					model.setCnh(rs.getString("cnh"));
					model.setDataNascimento(rs.getDate("dataNascimento"));
					modelList.add(model);
				}
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelList;
	}
}