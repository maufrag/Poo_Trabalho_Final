package controller;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import dao.ContratoLocacaoRepository;
import model.ContratoLocacaoModel;
import model.FiltroModel;

public class ContratoLocacaoController {

	public static void cadastrarContrato(ContratoLocacaoModel model) {
		
		
		if(model.getDataDeAlocacao().after(model.getDataDeDevolucao())) {
			JOptionPane.showMessageDialog(null, "Data de devolu��o precisa ser maior que data de loca��o");
		}else {
			ContratoLocacaoRepository.insertInto(model);			
		}
	}
	
	public static void popularJTable(JTable table) {
		ContratoLocacaoRepository.obterContratos(table);
	}

	public static void filtrarContratos(FiltroModel model, JTable table) {
		ContratoLocacaoRepository.obterListaFiltrada(model, table);
	}

}
