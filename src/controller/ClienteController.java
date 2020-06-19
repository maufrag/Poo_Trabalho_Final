package controller;

import java.util.List;

import javax.swing.JComboBox;

import Repository.ClienteRepository;
import model.ClienteModel;

public class ClienteController {
	
	public static void cadastrarCliente(ClienteModel model) {
		ClienteRepository.insertInto(model);

		
	}
	
	public static ClienteModel preencherComboBoxComClienteCadastrado(ClienteModel model){
		ClienteModel modelCompleta = ClienteRepository.obterPorCpfParaAlocacao(model);
		
		return modelCompleta;
	}

	public static List<ClienteModel> obterListaCliente() {
		return ClienteRepository.obterListaCliente();		
	}
}
