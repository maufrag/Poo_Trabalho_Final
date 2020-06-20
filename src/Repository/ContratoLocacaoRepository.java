package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import ConexaoDB.ConnectionFactory;
import metodosGerais.MetodosGerais;
import model.ContratoLocacaoModel;

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
			String query = 
					"Select idContrato, "
					+ "c.nomeCompleto, "
					+ "f.nomeCompleto, "
					+ "CONCAT(v.fabricante, v.modelo), "
					+ "dataDeAlocacao, "
					+ "dataDeDevolucao, "
					+ "sc.nomeStatus "
					+ "from contratolocacao cl "
					+ "join cliente c on cl.idCliente = c.idCliente "
					+ "join veiculo v on cl.idVeiculo = v.idVeiculo "
					+ "join funcionario f on cl.idFuncionario = f.idFuncionario "
					+ "join statuscontrato sc on cl.idStatusContrato = sc.idStatusContrato";

			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			table.setModel(MetodosGerais.resultSetToTableModel(rs));
			
			String[] nomesColunas = {"Código", "Cliente", "Funcionário", "Veículo", "Data Locação", "Data Devolução", "Status Contrato"};
			MetodosGerais.alterarNomeColuna(table, nomesColunas.length, nomesColunas);
			
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
