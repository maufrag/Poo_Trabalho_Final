package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import ConexaoDB.ConnectionFactory;
import model.ContratoLocacaoModel;

public class ContratoLocacaoRepository {

	public static void insertInto(ContratoLocacaoModel model) {
		Connection con = ConnectionFactory.getConnection();

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

}
