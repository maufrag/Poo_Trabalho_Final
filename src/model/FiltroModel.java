package model;

public class FiltroModel {

	private ClienteModel cliente;
	private FuncionarioModel funcionario;
	private OrdenacaoModel ordenacao;

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public FuncionarioModel getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioModel funcionario) {
		this.funcionario = funcionario;
	}

	public OrdenacaoModel getIndexOrdenacao() {
		return ordenacao;
	}

	public void setIndexOrdenacao(OrdenacaoModel indexOrdenacao) {
		this.ordenacao = indexOrdenacao;
	}

}
