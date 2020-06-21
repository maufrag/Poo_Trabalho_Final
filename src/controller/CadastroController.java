package controller;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Repository.CargoRepository;
import Repository.FuncionarioRepository;
import metodosGerais.MetodosGerais;
import model.CargoModel;
import model.ContaModel;

public class CadastroController {

	public static void cadastrarFuncionario(ContaModel model) {
		String cpf = model.getCpf();

		java.sql.Date dataMinima = MetodosGerais.obterDataMinimaParaValidacao(-18);

		if (model.getDataNascimento().after(dataMinima)) {
			JOptionPane.showMessageDialog(new JFrame(), "Funcionario precisa ter mais de 18 anos.");
		} else if (!MetodosGerais.cpfIsValid(cpf)) {
			JOptionPane.showMessageDialog(new JFrame(), "CPF Inválido.");
		} else {
			FuncionarioRepository.insertInto(model);
		}
	}

	public static JComboBox<CargoModel> preencherComboBox() {

		List<CargoModel> modelList = CargoRepository.obterListaCargos();
		JComboBox<CargoModel> comboBox = new JComboBox<CargoModel>();
		comboBox.addItem(new CargoModel(0, "--Selecione--"));

		for (CargoModel model : modelList) {
			comboBox.addItem(model);
		}

		return comboBox;
	}
}
