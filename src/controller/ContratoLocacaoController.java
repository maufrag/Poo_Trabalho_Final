package controller;

import Repository.ContratoLocacaoRepository;
import model.ContratoLocacaoModel;

public class ContratoLocacaoController {

	public static void cadastrarContrato(ContratoLocacaoModel model) {
		ContratoLocacaoRepository.insertInto(model);
	}

}
