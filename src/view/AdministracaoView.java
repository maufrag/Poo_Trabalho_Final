package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import controller.FuncionarioController;
import metodosGerais.CpfTextField;
import metodosGerais.DataTextField;
import metodosGerais.MetodosGerais;
import metodosGerais.Relatorios;
import metodosGerais.TelefoneTextField;
import model.CargoModel;
import model.FuncionarioModel;
import net.miginfocom.swing.MigLayout;

public class AdministracaoView extends JPanel {

	private static final long serialVersionUID = 5127857096780878749L;
	private JTable table;
	private JTextField nomeTF;
	private JTextField cpfTF;
	private JTextField telefoneTF;
	private JTextField dataNascimentoTF;
	private JComboBox<CargoModel> cargoCB;
	private JCheckBox ativoCB;

	public AdministracaoView() {
		setLayout(new GridLayout(1, 0, 0, 0));
		setBounds(150, 150, 675, 470);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane);

		JPanel relatoriosPanel = new JPanel();
		tabbedPane.addTab("Relatórios", relatoriosPanel);

		relatoriosPanel.setBackground(Color.WHITE);
		JPanel funcionariosPanel = new JPanel();
		funcionariosPanel.setBackground(Color.WHITE);
		tabbedPane.addTab("Relatórios", relatoriosPanel);
		relatoriosPanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_19 = Box.createRigidArea(new Dimension(130, 320));
		relatoriosPanel.add(rigidArea_19, BorderLayout.WEST);

		Component rigidArea_20 = Box.createRigidArea(new Dimension(130, 320));
		relatoriosPanel.add(rigidArea_20, BorderLayout.EAST);

		Component rigidArea_21 = Box.createRigidArea(new Dimension(567, 60));
		relatoriosPanel.add(rigidArea_21, BorderLayout.NORTH);

		Component rigidArea_22 = Box.createRigidArea(new Dimension(567, 60));
		relatoriosPanel.add(rigidArea_22, BorderLayout.SOUTH);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(UIManager.getBorder("DesktopIcon.border"));
		relatoriosPanel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new MigLayout("", "[][][][][]", "[][][]"));

		Component rigidArea_25 = Box.createRigidArea(new Dimension(20, 20));
		panel_3.add(rigidArea_25, "cell 0 0");

		Component rigidArea_24 = Box.createRigidArea(new Dimension(20, 20));
		panel_3.add(rigidArea_24, "cell 0 1");

		Component rigidArea_23 = Box.createRigidArea(new Dimension(20, 20));
		panel_3.add(rigidArea_23, "cell 0 2");

		JLabel lblNewLabel_5 = new JLabel("Relat\u00F3rio de Contratos:");
		panel_3.add(lblNewLabel_5, "cell 1 2");

		JButton gerarRelatorio1 = new JButton("Gerar");
		gerarRelatorio1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_3.add(gerarRelatorio1, "cell 2 2");

		Component rigidArea_26 = Box.createRigidArea(new Dimension(20, 20));
		panel_3.add(rigidArea_26, "cell 3 2");

		Component rigidArea_27 = Box.createRigidArea(new Dimension(20, 20));
		panel_3.add(rigidArea_27, "cell 4 2");
		tabbedPane.addTab("Quadro Geral", funcionariosPanel);
		funcionariosPanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		funcionariosPanel.add(rigidArea_6, BorderLayout.WEST);

		Component rigidArea_9 = Box.createRigidArea(new Dimension(20, 20));
		funcionariosPanel.add(rigidArea_9, BorderLayout.NORTH);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		funcionariosPanel.add(rigidArea_10, BorderLayout.EAST);

		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 20));
		funcionariosPanel.add(rigidArea_11, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		funcionariosPanel.add(panel, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
				.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)));
		panel_1.setLayout(new BorderLayout(0, 0));

		Component rigidArea_12 = Box.createRigidArea(new Dimension(20, 20));
		panel_1.add(rigidArea_12, BorderLayout.WEST);

		Component rigidArea_13 = Box.createRigidArea(new Dimension(20, 20));
		panel_1.add(rigidArea_13, BorderLayout.EAST);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new MigLayout("", "[][132.00][][][][][][]", "[][][][][][]"));

		JLabel lblNewLabel = new JLabel("Nomer Completo:");
		panel_2.add(lblNewLabel, "cell 0 0,alignx trailing");

		nomeTF = new JTextField();
		panel_2.add(nomeTF, "cell 1 0,growx");
		nomeTF.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		panel_2.add(lblNewLabel_1, "cell 0 1,alignx trailing");

		cpfTF = new CpfTextField();
		panel_2.add(cpfTF, "cell 1 1,growx");
		cpfTF.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		panel_2.add(lblNewLabel_2, "cell 0 2,alignx trailing");

		telefoneTF = new TelefoneTextField();
		panel_2.add(telefoneTF, "cell 1 2,growx");
		telefoneTF.setColumns(10);

		Component rigidArea_14 = Box.createRigidArea(new Dimension(20, 20));
		panel_2.add(rigidArea_14, "cell 2 2");

		Component rigidArea_15 = Box.createRigidArea(new Dimension(20, 20));
		panel_2.add(rigidArea_15, "cell 3 2");

		Component rigidArea_16 = Box.createRigidArea(new Dimension(20, 20));
		panel_2.add(rigidArea_16, "cell 4 2");

		Component rigidArea_17 = Box.createRigidArea(new Dimension(20, 20));
		panel_2.add(rigidArea_17, "cell 5 2");

		Component rigidArea_18 = Box.createRigidArea(new Dimension(20, 20));
		panel_2.add(rigidArea_18, "cell 6 2");

		JButton selecionarBtn = new JButton("Selecionar");
		selecionarBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_2.add(selecionarBtn, "cell 7 2,alignx right");

		JLabel lblNewLabel_3 = new JLabel("Data Nascimento:");
		panel_2.add(lblNewLabel_3, "cell 0 3,alignx trailing");

		dataNascimentoTF = new DataTextField();
		panel_2.add(dataNascimentoTF, "cell 1 3,growx");
		dataNascimentoTF.setColumns(10);

		JButton atualizarBtn = new JButton("Atualizar");
		atualizarBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_2.add(atualizarBtn, "cell 7 3,alignx center");

		JLabel lblNewLabel_4 = new JLabel("Cargo:");
		panel_2.add(lblNewLabel_4, "cell 0 4,alignx trailing");

		cargoCB = new JComboBox<CargoModel>();
		cargoCB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_2.add(cargoCB, "cell 1 4,growx");

		JButton limparBtn = new JButton("Limpar");
		limparBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_2.add(limparBtn, "cell 7 4,alignx center");

		ativoCB = new JCheckBox("Ativo");
		panel_2.add(ativoCB, "cell 1 5,alignx center");

		table = new JTable();
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
		FuncionarioController.preencherTabela(table);

		gerarRelatorio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorios.gerarRelatorioContratos();
			}
		});

		limparBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});

		selecionarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionar();
			}
		});

		preencherComboBox();
	}

	public void limpar() {
		nomeTF.setText("");
		cpfTF.setText("");
		telefoneTF.setText("");
		dataNascimentoTF.setText("");
		ativoCB.setSelected(false);
		cargoCB.setSelectedIndex(0);
	}

	public void selecionar() {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		int linhaSelecionada = table.getSelectedRow();
		nomeTF.setText(dtm.getValueAt(linhaSelecionada, 1).toString());
		cpfTF.setText(dtm.getValueAt(linhaSelecionada, 2).toString());
		telefoneTF.setText(dtm.getValueAt(linhaSelecionada, 3).toString());
		ativoCB.setSelected(dtm.getValueAt(linhaSelecionada, 4).toString().equals("true"));
		dataNascimentoTF.setText(MetodosGerais.converterParaddMMyyyy(dtm.getValueAt(linhaSelecionada, 5).toString()));
		// cargoCB.setSelectedIndex();
	}

	public Boolean validarDados() {
		Boolean valido = true;

		if (MetodosGerais.StringIsNullOrWhiteSpace(nomeTF.getText()) || !MetodosGerais.validarNome(nomeTF.getText())) {
			JOptionPane.showMessageDialog(null, "Nome não pode ser vazio e deve ser composto de nome e sobrenome.");
			return false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(cpfTF.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(telefoneTF.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(dataNascimentoTF.getText())
				|| !MetodosGerais.validarData(dataNascimentoTF.getText())) {
			JOptionPane.showMessageDialog(null, "Data inválida");
			return false;
		} else if (cargoCB.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Selecione um cargo");
			 return false;
		}
		if (!valido) {
			JOptionPane.showMessageDialog(null, "Não podem haver campos vazios");
		}

		return valido;
	}

	public void atualizar() {
		if (!validarDados()) {

			FuncionarioModel model = new FuncionarioModel();
			DefaultTableModel dtm = (DefaultTableModel) table.getModel();
			int linhaSelecinhada = table.getSelectedRow();
			model.setIdCargo(Integer.parseInt(dtm.getValueAt(linhaSelecinhada, 0).toString()));
			model.setNomeCompleto(nomeTF.getText());
			model.setCpf(cpfTF.getText());
			model.setTelefoneContato(telefoneTF.getText());
			model.setDataNascimento(MetodosGerais.transformarEmDate(dataNascimentoTF.getText()));
			model.setAtivo(ativoCB.isSelected());
			/// model.setC
		}
	}

	public void preencherComboBox() {
		cargoCB.removeAllItems();
		List<CargoModel> modelList = FuncionarioController.obterCargos();
		cargoCB.addItem(new CargoModel(0, "--Selecione--"));
		for (CargoModel model : modelList) {
			cargoCB.addItem(model);
		}
	}
}
