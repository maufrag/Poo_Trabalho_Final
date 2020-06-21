package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.GridLayout;
import javax.swing.JSplitPane;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JTabbedPane;

import metodosGerais.CnhTextField;
import metodosGerais.CpfTextField;
import metodosGerais.DataTextField;
import metodosGerais.LimiteTextField;
import metodosGerais.MetodosGerais;
import metodosGerais.TelefoneTextField;
import model.ClienteModel;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;

import controller.ClienteController;

import java.awt.Font;

public class MenuTelaInicial extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6331793467680155838L;
	private JButton sairBtn;
	private JTextField nomeCompletoTextField;
	private JTextField cpfTextField;
	private JTextField telefoneTextField;
	private JTextField cnhTextField;
	private JTextField dataNascimentoTextField;

	/**
	 * Create the panel.
	 */
	public MenuTelaInicial() {
		setLayout(new GridLayout(1, 0, 0, 0));
		setBounds(150, 150, 708, 532);

		JSplitPane splitPane = new JSplitPane();
		add(splitPane);
		splitPane.setDividerSize(0);
		JPanel panelBotoes = new JPanel();
		panelBotoes.setBackground(Color.BLACK);
		splitPane.setLeftComponent(panelBotoes);
		GridBagLayout gbl_panelBotoes = new GridBagLayout();
		gbl_panelBotoes.columnWidths = new int[] { 0, 0 };
		gbl_panelBotoes.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelBotoes.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panelBotoes.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelBotoes.setLayout(gbl_panelBotoes);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 0;
		panelBotoes.add(rigidArea, gbc_rigidArea);

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_1.gridx = 0;
		gbc_rigidArea_1.gridy = 1;
		panelBotoes.add(rigidArea_1, gbc_rigidArea_1);

		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_8 = new GridBagConstraints();
		gbc_rigidArea_8.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_8.gridx = 0;
		gbc_rigidArea_8.gridy = 2;
		panelBotoes.add(rigidArea_8, gbc_rigidArea_8);

		JButton botaoAlocacoes = new JButton("Aloca\u00E7\u00F5es");
		GridBagConstraints gbc_botaoAlocacoes = new GridBagConstraints();
		gbc_botaoAlocacoes.fill = GridBagConstraints.HORIZONTAL;
		gbc_botaoAlocacoes.insets = new Insets(0, 0, 5, 0);
		gbc_botaoAlocacoes.gridx = 0;
		gbc_botaoAlocacoes.gridy = 3;
		panelBotoes.add(botaoAlocacoes, gbc_botaoAlocacoes);

		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_7 = new GridBagConstraints();
		gbc_rigidArea_7.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_7.gridx = 0;
		gbc_rigidArea_7.gridy = 4;
		panelBotoes.add(rigidArea_7, gbc_rigidArea_7);

		JButton botaoVeiculos = new JButton("Ve\u00EDculos");
		GridBagConstraints gbc_botaoVeiculos = new GridBagConstraints();
		gbc_botaoVeiculos.fill = GridBagConstraints.HORIZONTAL;
		gbc_botaoVeiculos.insets = new Insets(0, 0, 5, 0);
		gbc_botaoVeiculos.gridx = 0;
		gbc_botaoVeiculos.gridy = 5;
		panelBotoes.add(botaoVeiculos, gbc_botaoVeiculos);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_5.gridx = 0;
		gbc_rigidArea_5.gridy = 6;
		panelBotoes.add(rigidArea_5, gbc_rigidArea_5);

		JButton botaoClientes = new JButton("Clientes");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 7;
		panelBotoes.add(botaoClientes, gbc_btnNewButton);

		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 8;
		panelBotoes.add(rigidArea_4, gbc_rigidArea_4);

		JButton botaoAdministrativo = new JButton("Administrativo");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 9;
		panelBotoes.add(botaoAdministrativo, gbc_btnNewButton_2);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_2.gridx = 0;
		gbc_rigidArea_2.gridy = 11;
		panelBotoes.add(rigidArea_2, gbc_rigidArea_2);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_3.gridx = 0;
		gbc_rigidArea_3.gridy = 12;
		panelBotoes.add(rigidArea_3, gbc_rigidArea_3);

		JLayeredPane layeredPane = new JLayeredPane();
		splitPane.setRightComponent(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		JPanel menuPanelInicial = new JPanel();
		layeredPane.add(menuPanelInicial, "menu panel inicial");

		JPanel veiculosPanel = new VeiculosView();
		layeredPane.add(veiculosPanel, "name_5290351763300");
		veiculosPanel.setLayout(new GridLayout(1, 0, 0, 0));

		JButton logoutBtn = new JButton("Logout");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 0;
		gbc_btnNewButton_8.gridy = 14;
		panelBotoes.add(logoutBtn, gbc_btnNewButton_8);

		sairBtn = new JButton("Sair");
		GridBagConstraints gbc_sairBtn = new GridBagConstraints();
		gbc_sairBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_sairBtn.gridx = 0;
		gbc_sairBtn.gridy = 16;
		panelBotoes.add(sairBtn, gbc_sairBtn);

		JPanel alocacoesPanel = new AlocacoesView();
		layeredPane.add(alocacoesPanel, "name_132767050113700");
		alocacoesPanel.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel administracaoPanel = new JPanel();
		layeredPane.add(administracaoPanel, "name_31180988744600");

		JPanel clientesPanel = new JPanel();
		layeredPane.add(clientesPanel, "name_31198873394700");

		alternarTela(botaoVeiculos, layeredPane, veiculosPanel);
		alternarTela(botaoAlocacoes, layeredPane, alocacoesPanel);
		alternarTela(botaoAdministrativo, layeredPane, administracaoPanel);
		administracaoPanel.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		administracaoPanel.add(tabbedPane);
		alternarTela(botaoClientes, layeredPane, clientesPanel);
		clientesPanel.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane clienteTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		clientesPanel.add(clienteTabbedPane);
		JPanel vizualizarEEditarClientesPanel = new JPanel();
		JPanel cadastrarClientePanel = new JPanel();
		cadastrarClientePanel.setBackground(Color.WHITE);
		clienteTabbedPane.addTab("Cadastrar Cliente", cadastrarClientePanel);
		cadastrarClientePanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_6 = Box.createRigidArea(new Dimension(120, 462));
		cadastrarClientePanel.add(rigidArea_6, BorderLayout.WEST);

		Component rigidArea_9 = Box.createRigidArea(new Dimension(120, 462));
		cadastrarClientePanel.add(rigidArea_9, BorderLayout.EAST);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(600, 72));
		cadastrarClientePanel.add(rigidArea_10, BorderLayout.NORTH);

		Component rigidArea_11 = Box.createRigidArea(new Dimension(600, 54));
		cadastrarClientePanel.add(rigidArea_11, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		cadastrarClientePanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][][][][]"));

		Component rigidArea_14 = Box.createRigidArea(new Dimension(20, 20));
		panel.add(rigidArea_14, "cell 1 0");

		Component rigidArea_13 = Box.createRigidArea(new Dimension(20, 20));
		panel.add(rigidArea_13, "cell 1 1");

		JLabel lblNewLabel = new JLabel("Nome Cliente:");
		panel.add(lblNewLabel, "cell 0 3,alignx trailing");

		nomeCompletoTextField = new JTextField();
		panel.add(nomeCompletoTextField, "cell 1 3,growx");
		nomeCompletoTextField.setColumns(10);
		nomeCompletoTextField.setDocument(new LimiteTextField(50));

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		panel.add(lblNewLabel_1, "cell 0 4,alignx trailing");

		cpfTextField = new CpfTextField();
		panel.add(cpfTextField, "cell 1 4,growx");
		cpfTextField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		panel.add(lblNewLabel_2, "cell 0 5,alignx trailing");

		telefoneTextField = new TelefoneTextField();
		panel.add(telefoneTextField, "cell 1 5,growx");
		telefoneTextField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Cnh:");
		panel.add(lblNewLabel_3, "cell 0 6,alignx trailing");

		cnhTextField = new CnhTextField();
		panel.add(cnhTextField, "cell 1 6,growx");
		cnhTextField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento:");
		panel.add(lblNewLabel_4, "cell 0 7,alignx trailing");

		dataNascimentoTextField = new DataTextField();
		panel.add(dataNascimentoTextField, "cell 1 7,growx");
		dataNascimentoTextField.setColumns(10);

		Component rigidArea_15 = Box.createRigidArea(new Dimension(20, 20));
		panel.add(rigidArea_15, "cell 0 8");

		Component rigidArea_16 = Box.createRigidArea(new Dimension(20, 20));
		panel.add(rigidArea_16, "cell 0 9");

		JButton cadastrarClienteBtn = new JButton("Cadastrar");
		cadastrarClienteBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(cadastrarClienteBtn, "cell 0 11");

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnLimpar, "cell 1 11,alignx right");
		clienteTabbedPane.addTab("Vizualizar e Editar", vizualizarEEditarClientesPanel);

		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});

		cadastrarClienteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarEObterCliente();
				limpar();
			}
		});

		// adm panel
		JPanel relatoriosPanel = new JPanel();
		JPanel funcionariosPanel = new JPanel();
		JPanel exportacaoPanel = new JPanel();
		tabbedPane.addTab("Relatórios", relatoriosPanel);
		relatoriosPanel.setLayout(new BorderLayout(0, 0));
		tabbedPane.addTab("Quadro Geral", funcionariosPanel);
		funcionariosPanel.setLayout(new BorderLayout(0, 0));
		tabbedPane.addTab("Exportações", exportacaoPanel);
		exportacaoPanel.setLayout(new BorderLayout(0, 0));

		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
	}

	public void limpar() {
		nomeCompletoTextField.setText("");
		cpfTextField.setText("");
		telefoneTextField.setText("");
		cnhTextField.setText("");
		dataNascimentoTextField.setText("");
	}

	public Boolean validarCadastroCliente() {
		Boolean valido = true;

		if (MetodosGerais.StringIsNullOrWhiteSpace(nomeCompletoTextField.getText())
				|| !MetodosGerais.validarNome(nomeCompletoTextField.getText())) {
			JOptionPane.showMessageDialog(null, "Nome não pode ser vazio e deve ser composto de nome e sobrenome.");
			return false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(cpfTextField.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(telefoneTextField.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(cnhTextField.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(dataNascimentoTextField.getText())
				|| !MetodosGerais.validarData(dataNascimentoTextField.getText())) {
			JOptionPane.showMessageDialog(null, "Data inválida");
			return false;
		}
		if (!valido) {
			JOptionPane.showMessageDialog(null, "Não podem haver campos vazios");
		}
		return valido;
	}

	public ClienteModel cadastrarEObterCliente() {
		ClienteModel model = new ClienteModel();

		if (validarCadastroCliente()) {
			model.setNomeCompleto(nomeCompletoTextField.getText());
			model.setCpf(cpfTextField.getText());
			model.setTelefone(telefoneTextField.getText());
			model.setCnh(cnhTextField.getText());
			model.setDataNascimento(MetodosGerais.transformarEmDate(dataNascimentoTextField.getText()));
			ClienteController.cadastrarCliente(model);
			return model;
		}
		return null;
	}

	public void alternarTela(JButton button, JLayeredPane layeredPane, JPanel panel) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
	}

	public void logout() {
		System.exit(0);
	}

}