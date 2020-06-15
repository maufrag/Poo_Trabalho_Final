package model;

import metodosGerais.MetodosGerais;

public class ContaModel extends FuncionarioModel {
	
	public ContaModel() {
		
	}
	
	public ContaModel(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	
	private String login;
	private String password;
	private Boolean ativo;
	
	public void gerarUsuario() {
		String nome = getNomeCompleto().toLowerCase();
		String cpf = getCpf();
		String[] loginPt1 = nome.split(" ");
		String[] loginPt2;
		String loginFinal;

		loginFinal = loginPt1[0];
		loginPt2 = cpf.split("\\.");
		loginFinal += loginPt2[0];
		this.password = loginPt2[1] + MetodosGerais.somenteDigitos(loginPt2[2]);

		this.login = loginFinal;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}
