package model;

public class VeiculoModel {

	public VeiculoModel() {

	}

	private int idVeiculo;
	private String fabricante;
	private String modelo;
	private Double precoAluguel;
	private Boolean estaDisponivel;
	private int anoLancamento;

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(Double precoAluguel) {
		this.precoAluguel = precoAluguel;
	}

	public Boolean getEstaDisponivel() {
		return estaDisponivel;
	}

	public void setEstaDisponivel(Boolean estaDisponivel) {
		this.estaDisponivel = estaDisponivel;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

}
