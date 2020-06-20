package controller;

import java.util.List;
import Repository.ClienteRepository;
import model.ClienteModel;

public class ClienteController {

	public static void cadastrarCliente(ClienteModel model) {
		ClienteRepository.insertInto(model);
	}

	public static ClienteModel preencherComboBoxComClienteCadastrado(ClienteModel model) {
		return ClienteRepository.obterPorCpfParaAlocacao(model);
	}

	public static List<ClienteModel> obterListaCliente() {
		return ClienteRepository.obterListaCliente();
	}
}
