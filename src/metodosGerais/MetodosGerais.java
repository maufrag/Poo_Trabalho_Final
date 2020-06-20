package metodosGerais;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
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
			if (nomes.length > 1 && nomes[1] != null && !MetodosGerais.StringIsNullOrWhiteSpace(nomes[1])) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void gerarArquivo() {
		try (Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("C:\\Users\\mateu\\Downloads\\relatorio.txt"), "utf-8"))) {
			// TODO adicionar linhas vindo do banco
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static java.sql.Date obterDataMinimaParaValidacao(int quantidadeEmAno){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, quantidadeEmAno);
		return new java.sql.Date(calendar.getTime().getTime());
	}

	public static Boolean validarData(String date) {

		try {
			String[] dateDividida = date.split("/");
			int dia = Integer.parseInt(dateDividida[0]);
			int mes = Integer.parseInt(dateDividida[1]);
			int ano = Integer.parseInt(dateDividida[2]);
			Boolean ehAnoBisexto = (ano % 4 == 0);
			switch (mes) {
			case 1:
				if (dia <= 31)
					return true;
				return false;
			case 2:
				if (ehAnoBisexto)
					if (dia <= 29)
						return true;
					else if (dia <= 28)
						return true;
				return false;
			case 3:
				if (dia <= 31)
					return true;
				return false;
			case 4:
				if (dia <= 30)
					return true;
				return false;
			case 5:
				if (dia <= 31)
					return true;
				return false;
			case 6:
				if (dia <= 30)
					return true;
				return false;
			case 7:
				if (dia <= 31)
					return true;
				return false;
			case 8:
				if (dia <= 31)
					return true;
				return false;
			case 9:
				if (dia <= 30)
					return true;
				return false;
			case 10:
				if (dia <= 31)
					return true;
				return false;
			case 11:
				if (dia <= 30)
					return true;
				return false;
			case 12:
				if (dia <= 31)
					return true;
				return false;
			default:
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	private static DateFormat obterDateFormat() {
		return new SimpleDateFormat("dd/MM/yyyy", Locale.US);
	}

	public static java.sql.Date transformarEmDate(String texto) {
		DateFormat format = obterDateFormat();
		try {
			java.util.Date date = format.parse(texto);
			return new java.sql.Date(date.getTime());

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
