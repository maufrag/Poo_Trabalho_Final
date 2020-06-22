package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import ConexaoDB.ConnectionFactory;
import metodosGerais.MetodosGerais;
import model.ClienteModel;

public class ClienteRepository {

	public static void insertInto(ClienteModel model) {
		Connection con = ConnectionFactory.getConnection();
		String mensagemFinal = "";
		try {
			String query = "Insert into cliente (nomeCompleto, cpf, telefone, cnh, dataNascimento) VALUES"
					+ "(?, ?, ?, ?, ?)";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, model.getNomeCompleto());
			statement.setString(2, model.getCpf());
			statement.setString(3, model.getTelefone());
			statement.setString(4, model.getCnh());
			statement.setDate(5, model.getDataNascimento());
			statement.execute();

			con.close();
			mensagemFinal = "Cliente cadastrado com sucesso";
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
			}
			mensagemFinal = "Houve um erro ao cadastrar o funcionario e sua conta.";

			if (e instanceof SQLIntegrityConstraintViolationException) {
				mensagemFinal += "\nCpf já cadastrado";
			}
		}
		JOptionPane.showMessageDialog(null, mensagemFinal);
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

	public static void preencherTableComClientes(JTable table) {

		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "select * from cliente";

			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			table.setModel(MetodosGerais.resultSetToTableModel(rs));

			String[] nomesColunas = { "Código", "Nome Completo", "CPF", "Telefone", "CNH", "Data Nascimento" };
			MetodosGerais.alterarNomeColuna(table, nomesColunas.length, nomesColunas);

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void editarCliente(ClienteModel model) {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "update cliente set nomeCompleto = ?, cpf = ?, telefone = ?, cnh = ?, dataNascimento = ? where idCliente = ?";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, model.getNomeCompleto());
			statement.setString(2, model.getCpf());
			statement.setString(3, model.getTelefone());
			statement.setString(4, model.getCnh());
			statement.setDate(5, model.getDataNascimento());
			statement.setInt(6, model.getIdCliente());

			statement.executeUpdate();

			con.close();
			JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Houve um erro ao tentar atualizar o cliente");

		}
	}
}
