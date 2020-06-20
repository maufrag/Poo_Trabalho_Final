package controller;

import java.util.List;

import Repository.FuncionarioRepository;
import model.FuncionarioModel;

public class FuncionarioController {

	public static List<FuncionarioModel> obterListaFuncionario(Boolean apenasAtivos) {
		return FuncionarioRepository.obterListaFuncionario(apenasAtivos);
	}
}
