package controller;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Repository.ClienteRepository;
import metodosGerais.MetodosGerais;
import model.ClienteModel;

public class ClienteController {

	public static void cadastrarCliente(ClienteModel model) {
		String cpf = model.getCpf();

		java.sql.Date dataMinima = MetodosGerais.obterDataMinimaParaValidacao(-18);

		if (model.getDataNascimento().after(dataMinima)) {
			JOptionPane.showMessageDialog(new JFrame(), "Cliente precisa ter mais de 18 anos.");
		} else if (!MetodosGerais.cpfIsValid(cpf)) {
			JOptionPane.showMessageDialog(new JFrame(), "CPF Inválido.");
		} else {
			ClienteRepository.insertInto(model);
		}
	}

	public static ClienteModel preencherComboBoxComClienteCadastrado(ClienteModel model) {
		return ClienteRepository.obterPorCpfParaAlocacao(model);
	}

	public static List<ClienteModel> obterListaCliente() {
		return ClienteRepository.obterListaCliente();
	}
}
