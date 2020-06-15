package model;

public class CargoModel {
	
	public CargoModel(int idCargo, String nomeCargo) {
		this.idCargo = idCargo;
		this.nomeCargo = nomeCargo;
	}

	private int idCargo;
	private String nomeCargo;

	public int getIdCargo() {
		return idCargo;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}
	
	public String toString() {
		return getNomeCargo();
	}
}
