package controller;

import javax.swing.JComboBox;

import Repository.ClienteRepository;
import model.ClienteModel;

public class ClienteController {
	
	public static void cadastrarCliente(ClienteModel model) {
		ClienteRepository.insertInto(model);

		
	}
	
	public static ClienteModel preencherComboBoxComClienteCadastrado(ClienteModel model){
		ClienteModel modelCompleta = ClienteRepository.obterPorCpfParaAlocacao(model);
//		JComboBox<ClienteModel> comboBox = new JComboBox<ClienteModel>();
	//	comboBox.addItem(modelCompleta);
		
		return modelCompleta;
	}
}
