package controller;

import java.util.List;
import javax.swing.JTable;
import Repository.VeiculoRepository;
import model.VeiculoModel;

public class VeiculoController {

	public static void cadastrarVeiculo(VeiculoModel model, JTable edicaoTable) {
		VeiculoRepository.insertInto(model);
	}
	
	public static void removerVeiculo(int idVeiculo) {
		VeiculoRepository.removerVeiculo(idVeiculo);
	}
	
	public static void editarVeiculo(VeiculoModel model, JTable edicaoTable) {
		VeiculoRepository.atualizarVeiculo(model);
	}
	
	public static void obterListaVeiculos(JTable table) {
		VeiculoRepository.obterVeiculos(table);
	}
	
	public static List<VeiculoModel> obterListaVeiculos(Boolean ordenada, Boolean apenasAtivos) {
		return VeiculoRepository.obterVeiculos(ordenada, apenasAtivos);
	}
}
