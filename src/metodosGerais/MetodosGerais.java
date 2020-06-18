package metodosGerais;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MetodosGerais {

	public static boolean cpfIsValid(String cpf) {
		int[] multiplicador1 = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2 };
		int[] multiplicador2 = new int[] { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };
		String tempCpf;
		String digito;
		int soma;
		int resto;

		cpf = cpf.trim();
		cpf = cpf.replace(".", "").replace("-", "");

		if (cpf.length() != 11)
			return false;

		tempCpf = cpf.substring(0, 9);
		soma = 0;

		for (int i = 0; i < 9; i++)

			soma += (tempCpf.charAt(i) - '0') * multiplicador1[i];

		resto = soma % 11;
		if (resto < 2)
			resto = 0;
		else
			resto = 11 - resto;

		digito = String.valueOf(resto);

		tempCpf = tempCpf + digito;

		soma = 0;
		for (int i = 0; i < 10; i++)
			soma += (tempCpf.charAt(i) - '0') * multiplicador2[i];

		resto = soma % 11;
		if (resto < 2)
			resto = 0;
		else
			resto = 11 - resto;

		digito = digito + String.valueOf(resto);

		return cpf.endsWith(digito);
	}

	public static String somenteDigitos(String texto) {
		texto = texto.replaceAll("[^0-9]+", "");
		return texto;
	}

	public static Boolean StringIsNullOrWhiteSpace(String texto) {
		if (texto == null)
			return true;
		if (texto.isEmpty())
			return true;

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) != ' ') {
				return false;
			}
		}
		return true;
	}

	public static boolean valueIsInteger(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			Integer.parseInt(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static boolean stringIsChar(String strChar) {
		if (strChar == null)
			return false;
		else if (strChar.length() > 1)
			return false;
		else
			return true;
	}

	public static TableModel resultSetToTableModel(ResultSet rs) {
		try {
			ResultSetMetaData metaData = rs.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			Vector<String> columnNames = new Vector<String>();

			// Get the column names
			for (int column = 0; column < numberOfColumns; column++) {
				columnNames.addElement(metaData.getColumnLabel(column + 1));
			}

			// Get all rows.
			Vector<Vector<Object>> rows = new Vector<Vector<Object>>();

			while (rs.next()) {
				Vector<Object> newRow = new Vector<Object>();

				for (int i = 1; i <= numberOfColumns; i++) {
					newRow.addElement(rs.getObject(i));
				}

				rows.addElement(newRow);
			}

			return new DefaultTableModel(rows, columnNames);
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}
	
	public static boolean validarNome(String nome) {
		try {
			String[] nomes;
			nomes = nome.split(" ");
			if(nomes.length > 1 && nomes[1] != null && !MetodosGerais.StringIsNullOrWhiteSpace(nomes[1])) {
				return true;				
			}		
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
