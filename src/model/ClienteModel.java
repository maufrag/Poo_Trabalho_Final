package model;

import java.util.Date;

public class ClienteModel {
	public ClienteModel() {

	}
	
	public ClienteModel(int idCliente, String nomeCompleto) {
		this.idCliente = idCliente;
		this.nomeCompleto = nomeCompleto;
	}

	private int idCliente;
	private String nomeCompleto;
	private String cpf;
	private String telefone;
	private String cnh;
	private Date dataNascimento;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return getNomeCompleto();
	}
}
