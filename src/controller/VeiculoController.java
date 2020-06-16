package controller;

import Repository.VeiculoRepository;
import model.VeiculoModel;

public class VeiculoController {

	public static void cadastrarVeiculo(VeiculoModel model) {
		VeiculoRepository.insertInto(model);
	}
}
