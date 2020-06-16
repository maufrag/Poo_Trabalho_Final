package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import ConexaoDB.ConnectionFactory;
import model.VeiculoModel;

public class VeiculoRepository {

	public static void insertInto(VeiculoModel model) {

		Connection con = ConnectionFactory.getConnection();

		try {
			String query = "insert into veiculo (fabricante, modelo, anoLancemento, precoAluguel, estaDisponivel)"
					+ "values (?, ?, ?, ?, ?)";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, model.getFabricante());
			statement.setString(2, model.getModelo());
			statement.setInt(3, model.getAnoLancamento());
			statement.setDouble(4, model.getPrecoAluguel());
			statement.setBoolean(5, model.getEstaDisponivel());

			statement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
