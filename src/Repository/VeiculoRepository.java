package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ConexaoDB.ConnectionFactory;
import metodosGerais.MetodosGerais;
import model.VeiculoModel;

public class VeiculoRepository {

	public static void insertInto(VeiculoModel model) {

		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "insert into veiculo (fabricante, modelo, anoLancamento, precoAluguel, estaDisponivel)"
					+ "values (?, ?, ?, ?, ?)";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, model.getFabricante());
			statement.setString(2, model.getModelo());
			statement.setInt(3, model.getAnoLancamento());
			statement.setDouble(4, model.getPrecoAluguel());
			statement.setBoolean(5, model.getEstaDisponivel());

			statement.execute();

			con.close();
			JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void obterVeiculos(JTable table) {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "select * from veiculo";

			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			table.setModel(MetodosGerais.resultSetToTableModel(rs));
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<VeiculoModel> obterVeiculos() {
		Connection con = ConnectionFactory.getConnection();
		List<VeiculoModel> modelList = new ArrayList<>();
		try {
			String query = "select * from veiculo order by fabricante, modelo";

			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				VeiculoModel model = new VeiculoModel();
				model.setIdVeiculo(rs.getInt("idVeiculo"));
				model.setFabricante(rs.getString("fabricante"));
				model.setModelo(rs.getString("modelo"));
				model.setAnoLancamento(rs.getInt("anoLancamento"));
				model.setPrecoAluguel(rs.getDouble("precoAluguel"));
				model.setEstaDisponivel(rs.getBoolean("estaDisponivel"));
				modelList.add(model);
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelList;
	}

	public static void removerVeiculo(int idVeiculo) {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "delete from veiculo where idVeiculo = ?";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, idVeiculo);
			statement.execute();
			con.close();
			JOptionPane.showMessageDialog(null, "Dados removidos com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void atualizarVeiculo(VeiculoModel model) {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "update veiculo set fabricante = ?, modelo = ?, anoLancamento = ?, precoAluguel = ?, estaDisponivel = ? where idVeiculo = ?";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, model.getFabricante());
			statement.setString(2, model.getModelo());
			statement.setInt(3, model.getAnoLancamento());
			statement.setDouble(4, model.getPrecoAluguel());
			statement.setBoolean(5, model.getEstaDisponivel());
			statement.setInt(6, model.getIdVeiculo());
			statement.executeUpdate();
			con.close();
			JOptionPane.showMessageDialog(null, "Veiculo atualizado com sucesso.");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Deu Merda.");
		}
	}
}
