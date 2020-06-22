package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ConexaoDB.ConnectionFactory;
import model.CargoModel;

public class CargoRepository {
	
	public static List<CargoModel> obterListaCargos() {
		Connection con = ConnectionFactory.getConnection();
		try {
			String query = "select * from cargo";
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			
			List<CargoModel> modelList = new ArrayList<CargoModel>();
			while(rs.next()) {
				CargoModel model = new CargoModel(rs.getInt("idCargo"), rs.getString("nomeCargo"));
				modelList.add(model);
			}
			con.close();
			return modelList;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
