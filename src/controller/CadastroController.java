package controller;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Repository.FuncionarioRepository;
import metodosGerais.MetodosGerais;
import model.CargoModel;
import model.ContaModel;

public class CadastroController {

	public static void CadastrarFuncionario(ContaModel model) {
		String mensagemFinal = "Cadastro realizado com sucesso.";
		model.setTelefoneContato(MetodosGerais.somenteDigitos(model.getTelefoneContato()));
		String cpf = model.getCpf();
		if (!MetodosGerais.cpfIsValid(cpf)) {
			mensagemFinal = "CPF inválido.";
		} else {
			FuncionarioRepository.insertInto(model);
		}
		JOptionPane.showMessageDialog(new JFrame(), mensagemFinal);
	}

	public static JComboBox<CargoModel> preencherComboBox() {

		JComboBox<CargoModel> comboBox = new JComboBox<CargoModel>();
		comboBox.addItem(new CargoModel(0, "--Selecione--"));
		comboBox.addItem(new CargoModel(1, "Vendedor"));
		comboBox.addItem(new CargoModel(2, "Gerente"));

		return comboBox;
	}
}
