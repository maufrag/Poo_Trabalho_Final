package controller;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import Repository.FuncionarioRepository;
import metodosGerais.MetodosGerais;
import model.CargoModel;
import model.FuncionarioModel;

public class FuncionarioController {

	public static List<FuncionarioModel> obterListaFuncionario(Boolean apenasAtivos) {
		return FuncionarioRepository.obterListaFuncionario(apenasAtivos);
	}

	public static void preencherTabela(JTable table) {
		FuncionarioRepository.obterFuncionarioLista(table);
	}

	public static List<CargoModel> obterCargos() {
		return FuncionarioRepository.obterCargos();
	}

	public static void atualizarFuncionario(FuncionarioModel model) {
		String cpf = model.getCpf();

		java.sql.Date dataMinima = MetodosGerais.obterDataMinimaParaValidacao(-18);

		if (model.getDataNascimento().after(dataMinima)) {
			JOptionPane.showMessageDialog(new JFrame(), "Funcionario precisa ter mais de 18 anos.");
		} else if (!MetodosGerais.cpfIsValid(cpf)) {
			JOptionPane.showMessageDialog(new JFrame(), "CPF Inválido.");
		} else {
			FuncionarioRepository.atualizarFuncionario(model);
		}
	}
}
