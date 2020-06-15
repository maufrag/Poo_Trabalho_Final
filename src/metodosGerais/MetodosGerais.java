package metodosGerais;

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

		for(int i=0; i<9; i++)
			
		    soma += (tempCpf.charAt(i) - '0') * multiplicador1[i];

		resto = soma % 11;
		if ( resto < 2 )
		    resto = 0;
		else
		   resto = 11 - resto;

		digito = String.valueOf(resto);

		tempCpf = tempCpf + digito;

		soma = 0;
		for(int i=0; i<10; i++)
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

}
