package controller;

import javax.swing.JOptionPane;

import Repository.FuncionarioRepository;
import model.ContaModel;

public class LoginController {
	public static ContaModel logar(ContaModel model) {
		ContaModel conta = FuncionarioRepository.obterConta(model);
		if (conta == null) {
			JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto.");
		}
		return conta;
	}
}
