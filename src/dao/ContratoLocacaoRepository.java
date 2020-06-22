package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import ConexaoDB.ConnectionFactory;
import metodosGerais.MetodosGerais;
import model.ContratoLocacaoModel;
import model.FiltroModel;
import model.RelatorioContratosModel;

public class ContratoLocacaoRepository {

	public static void insertInto(ContratoLocacaoModel model) {
		Connection con = ConnectionFactory.getConnection();
		model.setIdStatusContrato(1);// alterar depois

		try {
			String query = "Insert into "
					+ "contratolocacao (idCliente, idFuncionario, idVeiculo, dataDeAlocacao, dataDeDevolucao, idStatusContrato)"
					+ "values(?, ?, ?, ?, ?, ?)";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, model.getCliente().getIdCliente());
			statement.setInt(2, model.getFuncionario().getIdFuncionario());
			statement.setInt(3, model.getVeiculo().getIdVeiculo());
			statement.setDate(4, model.getDataDeAlocacao());
			statement.setDate(5, model.getDataDeDevolucao());
			statement.setInt(6, model.getIdStatusContrato());
			statement.execute();

			con.close();
			JOptionPane.showMessageDialog(null, "Contrato cadastrado com sucesso.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void obterContratos(JTable table) {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = obterQuerySelectContratos();

			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			table.setModel(MetodosGerais.resultSetToTableModel(rs));

			String[] nomesColunas = { "Código", "Cliente", "Funcionário", "Veículo", "Data Locação", "Data Devolução",
					"Status Contrato" };
			MetodosGerais.alterarNomeColuna(table, nomesColunas.length, nomesColunas);

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void obterListaFiltrada(FiltroModel model, JTable table) {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = obterQuerySelectContratos();
			int index = 1;
			
			if (model.getCliente().getIdCliente() > 0) {
				query += " where c.idCliente = ?";
			}
			if (model.getFuncionario().getIdFuncionario() > 0) {
				query += query.contains("where") ? " and f.idFuncionario = ?" : " where f.idFuncionario = ?";
			}
			if (model.getIndexOrdenacao().getChave() > 0) {
				query += " order by " + model.getIndexOrdenacao().obterNomeColuna(model.getIndexOrdenacao().getChave()) + " asc";
			}

			PreparedStatement statement = con.prepareStatement(query);

			if (model.getCliente().getIdCliente() > 0) {
				statement.setInt(index, model.getCliente().getIdCliente());
				index++;
			}
			if (model.getFuncionario().getIdFuncionario() > 0) {
				statement.setInt(index, model.getFuncionario().getIdFuncionario());
				index++;
			}


			ResultSet rs = statement.executeQuery();
			table.setModel(MetodosGerais.resultSetToTableModel(rs));
			String[] nomesColunas = { "Código", "Cliente", "Funcionário", "Veículo", "Data Locação", "Data Devolução",
					"Status Contrato" };
			MetodosGerais.alterarNomeColuna(table, nomesColunas.length, nomesColunas);

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String obterQuerySelectContratos() {
		return "Select idContrato, " + "c.nomeCompleto, " + "f.nomeCompleto, " + "CONCAT(v.fabricante, ' ', v.modelo), "
				+ "dataDeAlocacao, " + "dataDeDevolucao, " + "sc.nomeStatus " + "from contratolocacao cl "
				+ "join cliente c on cl.idCliente = c.idCliente " + "join veiculo v on cl.idVeiculo = v.idVeiculo "
				+ "join funcionario f on cl.idFuncionario = f.idFuncionario "
				+ "join statuscontrato sc on cl.idStatusContrato = sc.idStatusContrato";
	}
	
	public static List<RelatorioContratosModel> obterView() {
		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "Select * from relatorioContratos";
			List<RelatorioContratosModel> modelList = new ArrayList<RelatorioContratosModel>();
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				RelatorioContratosModel model = new RelatorioContratosModel();
				model.setNomeCompleto(rs.getString(1));
				model.setFabricante(rs.getString(2));
				model.setModelo(rs.getString(3));
				model.setNomeStatus(rs.getString(4));
				model.setSubTotal(rs.getString(5));
				modelList.add(model);
			}
			con.close();
			return modelList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
