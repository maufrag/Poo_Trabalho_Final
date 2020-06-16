package controller;

import javax.swing.JOptionPane;

import Repository.FuncionarioRepository;
import model.ContaModel;

public class LoginController {
	public static Boolean logar(ContaModel model) {
		Boolean existeConta = FuncionarioRepository.obterConta(model);
		if (!existeConta) {
			JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto.");
		}
		return existeConta;
	}
}
