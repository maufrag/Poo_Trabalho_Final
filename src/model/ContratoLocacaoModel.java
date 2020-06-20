package model;

import java.sql.Date;

public class ContratoLocacaoModel {

	private int idContrato;
	private ClienteModel cliente;
	private FuncionarioModel funcionario;
	private VeiculoModel veiculo;
	private Date dataDeAlocacao;
	private Date dataDeDevolucao;
	private int idStatusContrato;

	public int getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}

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

	public VeiculoModel getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(VeiculoModel veiculo) {
		this.veiculo = veiculo;
	}

	public Date getDataDeAlocacao() {
		return dataDeAlocacao;
	}

	public void setDataDeAlocacao(Date dataDeAlocacao) {
		this.dataDeAlocacao = dataDeAlocacao;
	}

	public Date getDataDeDevolucao() {
		return dataDeDevolucao;
	}

	public void setDataDeDevolucao(Date dataDeDevolucao) {
		this.dataDeDevolucao = dataDeDevolucao;
	}

	public int getIdStatusContrato() {
		return idStatusContrato;
	}

	public void setIdStatusContrato(int idStatusContrato) {
		this.idStatusContrato = idStatusContrato;
	}

}
