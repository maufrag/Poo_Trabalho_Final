package model;

import java.sql.Date;

public class FuncionarioModel {

	public FuncionarioModel(int idFuncionario, String nomeCompleto) {
		this.idFuncionario = idFuncionario;
		this.nomeCompleto = nomeCompleto;
	}

	public FuncionarioModel() {

	}

	private int idFuncionario;
	private String nomeCompleto;
	private String cpf;
	private Date dataNascimento;
	private String telefoneContato;
	private Boolean ativo;
	private int idCargo;
	private int idConta;

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public int getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	
	@Override
	public String toString() {
		return getNomeCompleto();
	}

}
