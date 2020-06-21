package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import controller.ClienteController;
import controller.ContratoLocacaoController;
import controller.FuncionarioController;
import controller.VeiculoController;
import metodosGerais.CnhTextField;
import metodosGerais.CpfTextField;
import metodosGerais.DataTextField;
import metodosGerais.LimiteTextField;
import metodosGerais.MetodosGerais;
import metodosGerais.TelefoneTextField;
import model.ClienteModel;
import model.ContratoLocacaoModel;
import model.FiltroModel;
import model.FuncionarioModel;
import model.OrdenacaoModel;
import model.VeiculoModel;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AlocacoesView extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6789645981297454386L;
	private JTextField nomeClienteTF;
	private JTextField cpfClienteTF;
	private JTextField telefoneClienteTF;
	private JTextField cnhClienteTF;
	private JTextField dataNascimentoClienteTF;
	private JTextField dataAlocacaoTF;
	private JTextField dataDevolucaoTF;
	private JButton voltarParaAlocacaoTelaInicialBtn;
	private JButton cadEProsseguirBtn;
	private JButton prosseguirBtn;
	private JComboBox<ClienteModel> clientesComboBox;
	private JComboBox<VeiculoModel> veiculosCadastradosComboBox;
	private JButton voltarParaInformativoBtn;
	private JComboBox<ClienteModel> comboBoxClientes;
	private JComboBox<FuncionarioModel> comboBoxFuncionario;
	private JComboBox<FuncionarioModel> funcionarioComboBox;
	private JTable tabelaContratos;
	private JComboBox<OrdenacaoModel> ordenacaoComboBox;

	/**
	 * Create the panel.
	 */
	public AlocacoesView() {
		setBounds(150, 150, 708, 532);
		setLayout(new GridLayout(0, 1, 0, 0));
		JPanel alocacoesPanel = new JPanel();
		alocacoesPanel.setLayout(new GridLayout(1, 0, 0, 0));
		add(alocacoesPanel);

		JTabbedPane alocacoesTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		alocacoesPanel.add(alocacoesTabbedPane);
		JPanel realizarAluguelPanel = new JPanel();
		JPanel consultarAluguelPanel = new JPanel();

		alocacoesTabbedPane.addTab("Realizar Alocação", realizarAluguelPanel);
		realizarAluguelPanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_23 = Box.createRigidArea(new Dimension(20, 20));
		realizarAluguelPanel.add(rigidArea_23, BorderLayout.SOUTH);

		Component rigidArea_24 = Box.createRigidArea(new Dimension(20, 20));
		realizarAluguelPanel.add(rigidArea_24, BorderLayout.NORTH);

		Component rigidArea_25 = Box.createRigidArea(new Dimension(20, 20));
		realizarAluguelPanel.add(rigidArea_25, BorderLayout.WEST);

		Component rigidArea_26 = Box.createRigidArea(new Dimension(20, 20));
		realizarAluguelPanel.add(rigidArea_26, BorderLayout.EAST);

		JPanel obterDadosAlocacao = new JPanel();
		realizarAluguelPanel.add(obterDadosAlocacao, BorderLayout.CENTER);
		obterDadosAlocacao.setLayout(new BorderLayout(0, 0));

		Component rigidArea_27 = Box.createRigidArea(new Dimension(72, 369));
		obterDadosAlocacao.add(rigidArea_27, BorderLayout.WEST);

		Component rigidArea_28 = Box.createRigidArea(new Dimension(560, 83));
		obterDadosAlocacao.add(rigidArea_28, BorderLayout.SOUTH);

		Component rigidArea_29 = Box.createRigidArea(new Dimension(68, 369));
		obterDadosAlocacao.add(rigidArea_29, BorderLayout.EAST);

		Component rigidArea_30 = Box.createRigidArea(new Dimension(560, 61));
		obterDadosAlocacao.add(rigidArea_30, BorderLayout.NORTH);

		JLayeredPane alocarLayeredPane = new JLayeredPane();
		alocarLayeredPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		obterDadosAlocacao.add(alocarLayeredPane, BorderLayout.CENTER);
		alocarLayeredPane.setLayout(new CardLayout(0, 0));

		JPanel informativoPanel = new JPanel();
		alocarLayeredPane.add(informativoPanel, "name_140314221499500");
		informativoPanel.setLayout(
				new MigLayout("", "[center][center][][][110.00][][center][-36.00]", "[][][][][][][][][][][]"));

		Component rigidArea_53 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_53, "cell 4 0 2 1");

		Component rigidArea_52 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_52, "cell 4 1 2 1");

		JLabel lblNewLabel = new JLabel(
				"<html><body>Para realizar uma aloca\u00E7\u00E3o \u00E9 necess\u00E1rio que o cliente esteja cadastrado no sistema</html></body>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		informativoPanel.add(lblNewLabel, "cell 0 2 6 1");

		Component rigidArea_38 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_38, "flowx,cell 0 3 6 1,alignx leading");

		Component rigidArea_42 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_42, "cell 0 5 6 1");

		Component rigidArea_43 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_43, "cell 0 6 6 1");

		Component rigidArea_41 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_41, "cell 0 7 6 1");

		JPanel cadastrarClientePanel = new JPanel();
		alocarLayeredPane.add(cadastrarClientePanel, "name_140314239938399");

		JPanel cadastrarAluguelPanel = new JPanel();
		alocarLayeredPane.add(cadastrarAluguelPanel, "name_140314256682900");
		cadastrarAluguelPanel.setLayout(
				new MigLayout("", "[][center][37.00][46.00,left][][][29.00,left][][][]", "[][][][][][][][][][][][]"));

		voltarParaInformativoBtn = new JButton("<");
		voltarParaInformativoBtn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		cadastrarAluguelPanel.add(voltarParaInformativoBtn, "cell 0 0");

		Component rigidArea_62 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_62, "cell 4 0");

		JLabel lblNewLabel_1 = new JLabel("Funcionario:");
		cadastrarAluguelPanel.add(lblNewLabel_1, "cell 1 1,alignx right");

		funcionarioComboBox = new JComboBox<FuncionarioModel>();
		cadastrarAluguelPanel.add(funcionarioComboBox, "cell 2 1 2 1,growx");

		Component rigidArea_64 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_64, "cell 5 1");

		Component rigidArea_65 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_65, "cell 6 1");

		Component rigidArea_47 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_47, "cell 7 1");

		Component rigidArea_60 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_60, "cell 8 1");

		Component rigidArea_66 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_66, "cell 9 1");

		JLabel lblNewLabel_14 = new JLabel("Cliente:");
		cadastrarAluguelPanel.add(lblNewLabel_14, "cell 1 2,alignx trailing");

		clientesComboBox = new JComboBox<ClienteModel>();
		cadastrarAluguelPanel.add(clientesComboBox, "cell 2 2 2 1,growx");

		Component rigidArea_73 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_73, "cell 4 2,aligny baseline");

		JLabel lblNewLabel_15 = new JLabel("Veiculo:");
		cadastrarAluguelPanel.add(lblNewLabel_15, "cell 1 3,alignx trailing");

		veiculosCadastradosComboBox = new JComboBox<VeiculoModel>();
		cadastrarAluguelPanel.add(veiculosCadastradosComboBox, "cell 2 3 2 1,growx");

		JLabel lblNewLabel_16 = new JLabel("Data da aloca\u00E7\u00E3o:");
		cadastrarAluguelPanel.add(lblNewLabel_16, "cell 1 4,alignx trailing");

		dataAlocacaoTF = new DataTextField();
		cadastrarAluguelPanel.add(dataAlocacaoTF, "cell 2 4 2 1,growx");
		dataAlocacaoTF.setColumns(5);

		JLabel lblNewLabel_17 = new JLabel("Data devolu\u00E7\u00E3o:");
		cadastrarAluguelPanel.add(lblNewLabel_17, "cell 1 5,alignx trailing");

		dataDevolucaoTF = new DataTextField();
		cadastrarAluguelPanel.add(dataDevolucaoTF, "cell 2 5 2 1,growx");
		dataDevolucaoTF.setColumns(5);

		Component rigidArea_68 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_68, "cell 3 6");

		Component rigidArea_67 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_67, "cell 3 7");

		JButton realizarAlocacaoButton = new JButton("Alocar");
		cadastrarAluguelPanel.add(realizarAlocacaoButton, "cell 1 9");
		alocacoesTabbedPane.addTab("Consultar Alocação", consultarAluguelPanel);
		consultarAluguelPanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_61 = Box.createRigidArea(new Dimension(20, 20));
		consultarAluguelPanel.add(rigidArea_61, BorderLayout.SOUTH);

		Component rigidArea_69 = Box.createRigidArea(new Dimension(20, 20));
		consultarAluguelPanel.add(rigidArea_69, BorderLayout.NORTH);

		Component rigidArea_70 = Box.createRigidArea(new Dimension(10, 464));
		consultarAluguelPanel.add(rigidArea_70, BorderLayout.WEST);

		Component rigidArea_71 = Box.createRigidArea(new Dimension(10, 464));
		consultarAluguelPanel.add(rigidArea_71, BorderLayout.EAST);

		JPanel consultarContratosPanel = new JPanel();
		consultarAluguelPanel.add(consultarContratosPanel, BorderLayout.CENTER);

		JPanel visualizarContratosPanel = new JPanel();

		JPanel panel_5 = new JPanel();
		GroupLayout gl_consultarContratosPanel = new GroupLayout(consultarContratosPanel);
		gl_consultarContratosPanel.setHorizontalGroup(gl_consultarContratosPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
				.addComponent(visualizarContratosPanel, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE));
		gl_consultarContratosPanel
				.setVerticalGroup(gl_consultarContratosPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_consultarContratosPanel.createSequentialGroup()
								.addComponent(visualizarContratosPanel, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)));
		visualizarContratosPanel.setLayout(new BoxLayout(visualizarContratosPanel, BoxLayout.X_AXIS));

		JScrollPane scrollPane = new JScrollPane();
		visualizarContratosPanel.add(scrollPane);

		tabelaContratos = new JTable();
		scrollPane.setViewportView(tabelaContratos);
		panel_5.setLayout(new BorderLayout(0, 0));

		Component rigidArea_74 = Box.createRigidArea(new Dimension(15, 177));
		panel_5.add(rigidArea_74, BorderLayout.WEST);

		Component rigidArea_75 = Box.createRigidArea(new Dimension(15, 177));
		panel_5.add(rigidArea_75, BorderLayout.EAST);

		JPanel filtrosContratosPanel = new JPanel();
		filtrosContratosPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(filtrosContratosPanel, BorderLayout.CENTER);
		filtrosContratosPanel.setLayout(new MigLayout("", "[29px][20px][63px][123px][20px][20px][20px][20px][63px]",
				"[14px][22px][23px][14px][23px][23px][20px]"));

		JLabel lblNewLabel_22 = new JLabel("Filtros");
		filtrosContratosPanel.add(lblNewLabel_22, "cell 0 0,alignx center,aligny center");

		JLabel lblNewLabel_18 = new JLabel("Cliente:");
		filtrosContratosPanel.add(lblNewLabel_18, "cell 2 1,alignx right,aligny center");

		comboBoxClientes = new JComboBox<ClienteModel>();
		filtrosContratosPanel.add(comboBoxClientes, "cell 3 1,growx,aligny center");

		Component rigidArea_76 = Box.createRigidArea(new Dimension(20, 20));
		filtrosContratosPanel.add(rigidArea_76, "cell 0 2,alignx center,aligny center");

		Component rigidArea_77 = Box.createRigidArea(new Dimension(20, 20));
		filtrosContratosPanel.add(rigidArea_77, "cell 1 2,alignx center,aligny center");

		JLabel lblNewLabel_19 = new JLabel("Funcionario:");
		filtrosContratosPanel.add(lblNewLabel_19, "cell 2 2,alignx right,aligny center");

		comboBoxFuncionario = new JComboBox<FuncionarioModel>();
		filtrosContratosPanel.add(comboBoxFuncionario, "cell 3 2,growx,aligny center");

		Component rigidArea_78 = Box.createRigidArea(new Dimension(20, 20));
		filtrosContratosPanel.add(rigidArea_78, "cell 4 2,alignx center,aligny center");

		Component rigidArea_79 = Box.createRigidArea(new Dimension(20, 20));
		filtrosContratosPanel.add(rigidArea_79, "cell 5 2,alignx center,aligny center");

		Component rigidArea_80 = Box.createRigidArea(new Dimension(20, 20));
		filtrosContratosPanel.add(rigidArea_80, "cell 6 2,alignx center,aligny center");

		Component rigidArea_81 = Box.createRigidArea(new Dimension(20, 20));
		filtrosContratosPanel.add(rigidArea_81, "cell 7 2,alignx center,aligny center");

		JButton filtrarButton = new JButton("Filtrar");
		filtrosContratosPanel.add(filtrarButton, "cell 8 2,alignx center,aligny center");

		JLabel lblNewLabel_21 = new JLabel("Ordenar por:");
		filtrosContratosPanel.add(lblNewLabel_21, "cell 2 4,alignx right,aligny center");

		ordenacaoComboBox = new JComboBox<OrdenacaoModel>();
		filtrosContratosPanel.add(ordenacaoComboBox, "cell 3 4,growx,aligny center");

		JButton limparFiltrosButton = new JButton("Limpar");
		filtrosContratosPanel.add(limparFiltrosButton, "cell 8 4,alignx center,aligny center");

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Apenas ativos");
		filtrosContratosPanel.add(chckbxNewCheckBox_1, "cell 3 5,alignx center,aligny center");

		Component rigidArea_83 = Box.createRigidArea(new Dimension(20, 20));
		filtrosContratosPanel.add(rigidArea_83, "cell 3 6,alignx center,aligny center");
		consultarContratosPanel.setLayout(gl_consultarContratosPanel);

		Component rigidArea_39 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_39, "cell 4 8 2 1,alignx trailing");

		prosseguirBtn = new JButton("Prosseguir");
		prosseguirBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		informativoPanel.add(prosseguirBtn, "cell 1 9");

		JButton cadastrarClienteButton = new JButton("Cadastrar Cliente");
		cadastrarClienteButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		informativoPanel.add(cadastrarClienteButton, "cell 5 9,alignx right");
		alternarTela(cadastrarClienteButton, alocarLayeredPane, cadastrarClientePanel);

		Component rigidArea_54 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_54, "cell 4 10 2 1");
		cadastrarClientePanel.setLayout(new MigLayout("", "[][49.00,trailing][49.00,trailing][111.00][111.00][][][][]",
				"[][][][][][][][][][][][]"));

		voltarParaAlocacaoTelaInicialBtn = new JButton("<");
		voltarParaAlocacaoTelaInicialBtn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		cadastrarClientePanel.add(voltarParaAlocacaoTelaInicialBtn, "cell 0 0");

		Component rigidArea_46 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_46, "cell 3 0 2 1");

		Component rigidArea_45 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_45, "cell 0 1");

		JLabel lblNewLabel_2 = new JLabel("Nome completo:");
		cadastrarClientePanel.add(lblNewLabel_2, "cell 1 1,alignx trailing");

		nomeClienteTF = new JTextField();
		nomeClienteTF.setDocument(new LimiteTextField(50));
		cadastrarClientePanel.add(nomeClienteTF, "cell 2 1 3 1,growx");
		nomeClienteTF.setColumns(10);

		Component rigidArea_44 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_44, "cell 5 1");

		Component rigidArea_40 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_40, "cell 6 1");

		Component rigidArea_50 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_50, "cell 7 1");

		Component rigidArea_51 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_51, "cell 8 1");

		JLabel lblNewLabel_10 = new JLabel("CPF:");
		cadastrarClientePanel.add(lblNewLabel_10, "cell 1 2,alignx trailing");

		cpfClienteTF = new CpfTextField();
		cadastrarClientePanel.add(cpfClienteTF, "cell 2 2 3 1,growx");
		cpfClienteTF.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("Telefone:");
		cadastrarClientePanel.add(lblNewLabel_11, "cell 1 3,alignx trailing");

		telefoneClienteTF = new TelefoneTextField();
		cadastrarClientePanel.add(telefoneClienteTF, "cell 2 3 3 1,growx");
		telefoneClienteTF.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("CNH:");
		cadastrarClientePanel.add(lblNewLabel_12, "cell 1 4,alignx trailing");

		cnhClienteTF = new CnhTextField();
		cadastrarClientePanel.add(cnhClienteTF, "cell 2 4 3 1,growx");
		cnhClienteTF.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("Data nascimento:");
		cadastrarClientePanel.add(lblNewLabel_13, "cell 1 5,alignx trailing");

		dataNascimentoClienteTF = new DataTextField();
		cadastrarClientePanel.add(dataNascimentoClienteTF, "cell 2 5 3 1,growx");
		dataNascimentoClienteTF.setColumns(10);

		Component rigidArea_48 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_48, "cell 3 6 2 1");

		Component rigidArea_49 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_49, "cell 3 7 2 1");

		cadEProsseguirBtn = new JButton("Cadastrar e Prosseguir");
		cadEProsseguirBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cadastrarClientePanel.add(cadEProsseguirBtn, "cell 1 8 2 1");

		Component rigidArea_56 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_56, "flowx,cell 3 8 2 1");

		Component rigidArea_55 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_55, "cell 3 8 2 1,alignx right");

		JButton limparClienteTF = new JButton("Limpar");
		limparClienteTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cadastrarClientePanel.add(limparClienteTF, "cell 3 8 2 1,alignx right");

		Component rigidArea_57 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_57, "cell 2 9");

		Component rigidArea_58 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_58, "cell 2 10");

		Component rigidArea_59 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_59, "cell 2 11");

		JButton limparContratoButton = new JButton("Limpar");
		cadastrarAluguelPanel.add(limparContratoButton, "cell 3 9");

		cadEProsseguirBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteModel model = cadastrarEObterCliente();
				if (model != null) {
					clientesComboBox.addItem(ClienteController.preencherComboBoxComClienteCadastrado(model));
					alocarLayeredPane.removeAll();
					alocarLayeredPane.add(cadastrarAluguelPanel);
					alocarLayeredPane.repaint();
					alocarLayeredPane.revalidate();
				}
				popularComboBoxComTodosOsVeiculos();
				popularComboBoxComFuncionarios(true, funcionarioComboBox);
			}
		});

		limparContratoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparContrato();
			}
		});

		prosseguirBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				popularComboBoxComTodosOsClientes(clientesComboBox);
				popularComboBoxComTodosOsVeiculos();
				popularComboBoxComFuncionarios(true, funcionarioComboBox);
			}
		});

		Component rigidArea_63 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_63, "cell 3 10");

		realizarAlocacaoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarAlocacaoVeiculo();
			}
		});

		filtrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filtrar();
			}
		});

		limparFiltrosButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparFiltros();
			}
		});

		alternarTela(voltarParaAlocacaoTelaInicialBtn, alocarLayeredPane, informativoPanel);
		alternarTela(prosseguirBtn, alocarLayeredPane, cadastrarAluguelPanel);
		alternarTela(voltarParaInformativoBtn, alocarLayeredPane, informativoPanel);

		popularComboBoxConsultas();
		ContratoLocacaoController.popularJTable(tabelaContratos);
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

	public Boolean validarCadastroCliente() {
		Boolean valido = true;

		if (MetodosGerais.StringIsNullOrWhiteSpace(nomeClienteTF.getText())
				|| !MetodosGerais.validarNome(nomeClienteTF.getText())) {
			JOptionPane.showMessageDialog(null, "Nome não pode ser vazio e deve ser composto de nome e sobrenome.");
			return false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(cpfClienteTF.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(telefoneClienteTF.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(cnhClienteTF.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(dataNascimentoClienteTF.getText())
				|| !MetodosGerais.validarData(dataNascimentoClienteTF.getText())) {
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
			model.setNomeCompleto(nomeClienteTF.getText());
			model.setCpf(cpfClienteTF.getText());
			model.setTelefone(telefoneClienteTF.getText());
			model.setCnh(cnhClienteTF.getText());
			model.setDataNascimento(MetodosGerais.transformarEmDate(dataNascimentoClienteTF.getText()));
			ClienteController.cadastrarCliente(model);
			return model;
		}
		return null;
	}

	public void cadastrarAlocacaoVeiculo() {
		if (validarContratoAlocacao()) {
			ContratoLocacaoModel model = new ContratoLocacaoModel();
			model.setFuncionario((FuncionarioModel) funcionarioComboBox.getSelectedItem());
			model.setCliente((ClienteModel) clientesComboBox.getSelectedItem());
			model.setVeiculo((VeiculoModel) veiculosCadastradosComboBox.getSelectedItem());
			model.setDataDeAlocacao(MetodosGerais.transformarEmDate(dataAlocacaoTF.getText()));
			model.setDataDeDevolucao(MetodosGerais.transformarEmDate(dataDevolucaoTF.getText()));
			ContratoLocacaoController.cadastrarContrato(model);
			limparContrato();
		}
	}

	public Boolean validarContratoAlocacao() {
		Boolean valido = true;
		ClienteModel model = (ClienteModel) clientesComboBox.getSelectedItem();

		if (funcionarioComboBox.getSelectedIndex() == 0) {
			valido = false;
		} else if (model.getNomeCompleto().equals("--Selecione--")) {
			valido = false;
		} else if (veiculosCadastradosComboBox.getSelectedIndex() == 0) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(dataAlocacaoTF.getText())
				|| MetodosGerais.StringIsNullOrWhiteSpace(dataDevolucaoTF.getText())) {
			valido = false;
		} else if (!MetodosGerais.validarData(dataAlocacaoTF.getText())
				|| !MetodosGerais.validarData(dataDevolucaoTF.getText())) {
			JOptionPane.showMessageDialog(null, "Data de alocação ou devolução datas está incorreta");
			return false;
		}
		if (!valido)
			JOptionPane.showMessageDialog(null, "Não podem haver campos vazios");

		return valido;
	}

	public void popularComboBoxComTodosOsVeiculos() {
		List<VeiculoModel> modelList = VeiculoController.obterListaVeiculos(true, true);
		veiculosCadastradosComboBox.addItem(new VeiculoModel(0, "", "--Selecione--"));
		for (VeiculoModel model : modelList) {
			veiculosCadastradosComboBox.addItem(model);
		}
	}

	public void popularComboBoxComTodosOsClientes(JComboBox<ClienteModel> comboBox) {
		List<ClienteModel> modelList = ClienteController.obterListaCliente();
		comboBox.addItem(new ClienteModel(0, "--Selecione--"));
		for (ClienteModel model : modelList) {
			comboBox.addItem(model);
		}
	}

	public void popularComboBoxComFuncionarios(Boolean apenasAtivos, JComboBox<FuncionarioModel> comboBox) {
		List<FuncionarioModel> modelList = FuncionarioController.obterListaFuncionario(apenasAtivos);
		comboBox.addItem(new FuncionarioModel(0, "--Selecione--"));
		for (FuncionarioModel model : modelList) {
			comboBox.addItem(model);
		}
	}

	public void limparContrato() {
		funcionarioComboBox.setSelectedIndex(0);
		clientesComboBox.setSelectedIndex(0);
		veiculosCadastradosComboBox.setSelectedIndex(0);
		dataAlocacaoTF.setText("");
		dataDevolucaoTF.setText("");
	}

	public void popularComboBoxConsultas() {
		popularComboBoxComTodosOsClientes(comboBoxClientes);
		popularComboBoxComFuncionarios(false, comboBoxFuncionario);
		popularCheckBoxFiltro();
	}

	public void popularCheckBoxFiltro() {
		String[] nomesColunas = { "Código", "Cliente", "Funcionário", "Veículo", "Data Locação", "Data Devolução",
				"Status Contrato" };

		ordenacaoComboBox.addItem(new OrdenacaoModel(0, "--Selecione--"));
		for (int i = 0; i < nomesColunas.length; i++) {
			ordenacaoComboBox.addItem(new OrdenacaoModel((i + 1), nomesColunas[i]));
		}
	}

	public void filtrar() {
		FiltroModel model = new FiltroModel();
		model.setCliente((ClienteModel) comboBoxClientes.getSelectedItem());
		model.setFuncionario((FuncionarioModel) comboBoxFuncionario.getSelectedItem());
		model.setIndexOrdenacao((OrdenacaoModel) ordenacaoComboBox.getSelectedItem());
		ContratoLocacaoController.filtrarContratos(model, tabelaContratos);
	}

	private void limparFiltros() {
		comboBoxClientes.setSelectedIndex(0);
		comboBoxFuncionario.setSelectedIndex(0);
		ordenacaoComboBox.setSelectedItem(0);
	}
}
