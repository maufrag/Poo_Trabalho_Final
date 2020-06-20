package controller;

import javax.swing.JTable;

import Repository.ContratoLocacaoRepository;
import model.ContratoLocacaoModel;

public class ContratoLocacaoController {

	public static void cadastrarContrato(ContratoLocacaoModel model) {
		ContratoLocacaoRepository.insertInto(model);
	}
	
	public static void popularJTable(JTable table) {
		ContratoLocacaoRepository.obterContratos(table);
	}

}
