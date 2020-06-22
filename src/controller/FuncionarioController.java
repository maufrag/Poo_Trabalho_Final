package controller;

import java.util.List;

import javax.swing.JTable;

import Repository.FuncionarioRepository;
import model.FuncionarioModel;

public class FuncionarioController {

	public static List<FuncionarioModel> obterListaFuncionario(Boolean apenasAtivos) {
		return FuncionarioRepository.obterListaFuncionario(apenasAtivos);
	}

	public static void preencherTabela(JTable table) {
		FuncionarioRepository.obterFuncionarioLista(table);
	}
}
