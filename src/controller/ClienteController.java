package controller;

import Repository.ClienteRepository;
import model.ClienteModel;

public class ClienteController {
	
	public static void cadastrarCliente(ClienteModel model) {
		ClienteRepository.insertInto(model);
	}
}
