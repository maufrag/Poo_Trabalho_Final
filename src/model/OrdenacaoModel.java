package model;

public class OrdenacaoModel {
	public OrdenacaoModel(int chave, String valor) {
		this.valor = valor;
		this.chave = chave;
	}

	private int chave;
	private String valor;

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return this.getValor();
	}

	public String obterNomeColuna(int index) {
		String valor = "";
		switch (index) {
		case 1:
			valor = "idContrato";
			break;
		case 2:
			valor = "c.nomeCompleto";
			break;
		case 3:
			valor = "f.nomeCompleto";
			break;
		case 4:
			valor = "v.fabricante, v.modelo";
			break;
		case 5:
			valor = "dataDeAlocacao";
			break;
		case 6:
			valor = "dataDeDevolucao";
			break;
		case 7:
			valor =  "sc.nomeStatus";
			break;
		default:
			valor = "";
			break;
		}
		return String.format(valor);
	}

}
