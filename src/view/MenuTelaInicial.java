package view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controller.VeiculoController;
import metodosGerais.AnoTextField;
import metodosGerais.LimiteTextField;
import metodosGerais.MetodosGerais;
import model.VeiculoModel;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class MenuTelaInicial extends JPanel {
	private JTextField modeloVeiculoTF;
	private JTextField fabricanteVeiculoTF;
	private JTextField anoVeiculoTF;
	private JTextField precoVeiculoTF;
	private JCheckBox veiculoChkBox;
	private JButton atualizarVeiculoBtn;
	private JCheckBox disponibilidadeChkBox;
	private JTable table;
	private JTable edicaoTable;
	private JTextField fabricanteEdicaoTF;
	private JTextField modeloEdicaoTF;
	private JTextField anoEdicaoTF;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField precoEdicaoTF;
	private JButton voltarParaAlocacaoTelaInicialBtn;
	private JButton removerVeiculoBtn;
	private JButton cadastrarVeiculoBtn;

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

		JButton btnNewButton = new JButton("Clientes");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 7;
		panelBotoes.add(btnNewButton, gbc_btnNewButton);

		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 8;
		panelBotoes.add(rigidArea_4, gbc_rigidArea_4);

		JButton btnNewButton_2 = new JButton("Administrativo");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 9;
		panelBotoes.add(btnNewButton_2, gbc_btnNewButton_2);

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

		JPanel veiculosPanel = new JPanel();
		layeredPane.add(veiculosPanel, "name_5290351763300");
		veiculosPanel.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane veiculosTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		JPanel cadastrarVeiculoPanel = new JPanel();
		JPanel consultarVeiculoPanel = new JPanel();
		JPanel editarVeiculoPanel = new JPanel();
		veiculosTabbedPane.addTab("Cadastrar", cadastrarVeiculoPanel);
		cadastrarVeiculoPanel.setLayout(new BorderLayout(0, 0));

		JPanel obterDadosPanel = new JPanel();
		obterDadosPanel.setBackground(Color.WHITE);
		cadastrarVeiculoPanel.add(obterDadosPanel, BorderLayout.CENTER);
		obterDadosPanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_6 = Box.createRigidArea(new Dimension(532, 107));
		obterDadosPanel.add(rigidArea_6, BorderLayout.NORTH);

		Component rigidArea_9 = Box.createRigidArea(new Dimension(100, 236));
		obterDadosPanel.add(rigidArea_9, BorderLayout.WEST);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(115, 236));
		obterDadosPanel.add(rigidArea_10, BorderLayout.EAST);

		Component rigidArea_11 = Box.createRigidArea(new Dimension(532, 107));
		obterDadosPanel.add(rigidArea_11, BorderLayout.SOUTH);

		JPanel obterDadosVeiculosForm = new JPanel();
		obterDadosVeiculosForm.setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
		obterDadosPanel.add(obterDadosVeiculosForm, BorderLayout.CENTER);
		GridBagLayout gbl_obterDadosVeiculosForm = new GridBagLayout();
		gbl_obterDadosVeiculosForm.columnWidths = new int[] { 0, 0, 84, 134, 0, 0, 0 };
		gbl_obterDadosVeiculosForm.rowHeights = new int[] { 36, 20, 20, 20, 20, 23, 19, 0, 0, 0, 0 };
		gbl_obterDadosVeiculosForm.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_obterDadosVeiculosForm.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		obterDadosVeiculosForm.setLayout(gbl_obterDadosVeiculosForm);

		Component rigidArea_32 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_32 = new GridBagConstraints();
		gbc_rigidArea_32.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_32.gridx = 3;
		gbc_rigidArea_32.gridy = 0;
		obterDadosVeiculosForm.add(rigidArea_32, gbc_rigidArea_32);

		Component rigidArea_31 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_31 = new GridBagConstraints();
		gbc_rigidArea_31.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_31.gridx = 0;
		gbc_rigidArea_31.gridy = 1;
		obterDadosVeiculosForm.add(rigidArea_31, gbc_rigidArea_31);

		Component rigidArea_37 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_37 = new GridBagConstraints();
		gbc_rigidArea_37.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_37.gridx = 1;
		gbc_rigidArea_37.gridy = 1;
		obterDadosVeiculosForm.add(rigidArea_37, gbc_rigidArea_37);

		JLabel lblNewLabel_3 = new JLabel("Fabricante:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 1;
		obterDadosVeiculosForm.add(lblNewLabel_3, gbc_lblNewLabel_3);

		fabricanteVeiculoTF = new JTextField();
		fabricanteVeiculoTF.setColumns(10);
		fabricanteVeiculoTF.setDocument(new LimiteTextField(20));
		GridBagConstraints gbc_fabricanteVeiculoTF = new GridBagConstraints();
		gbc_fabricanteVeiculoTF.anchor = GridBagConstraints.NORTH;
		gbc_fabricanteVeiculoTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_fabricanteVeiculoTF.insets = new Insets(0, 0, 5, 5);
		gbc_fabricanteVeiculoTF.gridx = 3;
		gbc_fabricanteVeiculoTF.gridy = 1;
		obterDadosVeiculosForm.add(fabricanteVeiculoTF, gbc_fabricanteVeiculoTF);

		Component rigidArea_33 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_33 = new GridBagConstraints();
		gbc_rigidArea_33.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_33.gridx = 4;
		gbc_rigidArea_33.gridy = 1;
		obterDadosVeiculosForm.add(rigidArea_33, gbc_rigidArea_33);

		Component rigidArea_36 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_36 = new GridBagConstraints();
		gbc_rigidArea_36.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_36.gridx = 5;
		gbc_rigidArea_36.gridy = 1;
		obterDadosVeiculosForm.add(rigidArea_36, gbc_rigidArea_36);

		JLabel lblNewLabel_1 = new JLabel("Modelo:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		obterDadosVeiculosForm.add(lblNewLabel_1, gbc_lblNewLabel_1);

		modeloVeiculoTF = new JTextField();
		modeloVeiculoTF.setColumns(10);
		modeloVeiculoTF.setDocument(new LimiteTextField(20));
		GridBagConstraints gbc_modeloVeiculoTF = new GridBagConstraints();
		gbc_modeloVeiculoTF.anchor = GridBagConstraints.NORTH;
		gbc_modeloVeiculoTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_modeloVeiculoTF.insets = new Insets(0, 0, 5, 5);
		gbc_modeloVeiculoTF.gridx = 3;
		gbc_modeloVeiculoTF.gridy = 2;
		obterDadosVeiculosForm.add(modeloVeiculoTF, gbc_modeloVeiculoTF);

		JLabel lblNewLabel_4 = new JLabel("Ano Lan\u00E7amento:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 3;
		obterDadosVeiculosForm.add(lblNewLabel_4, gbc_lblNewLabel_4);

		anoVeiculoTF = new AnoTextField();
		anoVeiculoTF.setColumns(10);
		GridBagConstraints gbc_anoVeiculoTF = new GridBagConstraints();
		gbc_anoVeiculoTF.anchor = GridBagConstraints.NORTH;
		gbc_anoVeiculoTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_anoVeiculoTF.insets = new Insets(0, 0, 5, 5);
		gbc_anoVeiculoTF.gridx = 3;
		gbc_anoVeiculoTF.gridy = 3;
		obterDadosVeiculosForm.add(anoVeiculoTF, gbc_anoVeiculoTF);

		JLabel lblNewLabel_5 = new JLabel("Pre\u00E7o base:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 4;
		obterDadosVeiculosForm.add(lblNewLabel_5, gbc_lblNewLabel_5);

		precoVeiculoTF = new JTextField();
		precoVeiculoTF.setColumns(10);
		GridBagConstraints gbc_precoVeiculoTF = new GridBagConstraints();
		gbc_precoVeiculoTF.anchor = GridBagConstraints.NORTH;
		gbc_precoVeiculoTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_precoVeiculoTF.insets = new Insets(0, 0, 5, 5);
		gbc_precoVeiculoTF.gridx = 3;
		gbc_precoVeiculoTF.gridy = 4;
		obterDadosVeiculosForm.add(precoVeiculoTF, gbc_precoVeiculoTF);

		veiculoChkBox = new JCheckBox("Dispon\u00EDvel");
		veiculoChkBox.setSelected(true);
		GridBagConstraints gbc_veiculoChkBox = new GridBagConstraints();
		gbc_veiculoChkBox.anchor = GridBagConstraints.NORTHEAST;
		gbc_veiculoChkBox.insets = new Insets(0, 0, 5, 5);
		gbc_veiculoChkBox.gridx = 3;
		gbc_veiculoChkBox.gridy = 5;
		obterDadosVeiculosForm.add(veiculoChkBox, gbc_veiculoChkBox);

		cadastrarVeiculoBtn = new JButton("Cadastrar");
		cadastrarVeiculoBtn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_cadastrarVeiculoBtn = new GridBagConstraints();
		gbc_cadastrarVeiculoBtn.anchor = GridBagConstraints.NORTH;
		gbc_cadastrarVeiculoBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_cadastrarVeiculoBtn.insets = new Insets(0, 0, 5, 5);
		gbc_cadastrarVeiculoBtn.gridx = 2;
		gbc_cadastrarVeiculoBtn.gridy = 6;
		obterDadosVeiculosForm.add(cadastrarVeiculoBtn, gbc_cadastrarVeiculoBtn);

		JButton limparVeiculoBtn = new JButton("Limpar");
		limparVeiculoBtn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_limparVeiculoBtn = new GridBagConstraints();
		gbc_limparVeiculoBtn.insets = new Insets(0, 0, 5, 5);
		gbc_limparVeiculoBtn.anchor = GridBagConstraints.NORTHEAST;
		gbc_limparVeiculoBtn.gridx = 3;
		gbc_limparVeiculoBtn.gridy = 6;
		obterDadosVeiculosForm.add(limparVeiculoBtn, gbc_limparVeiculoBtn);

		Component rigidArea_34 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_34 = new GridBagConstraints();
		gbc_rigidArea_34.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_34.gridx = 3;
		gbc_rigidArea_34.gridy = 7;
		obterDadosVeiculosForm.add(rigidArea_34, gbc_rigidArea_34);

		Component rigidArea_35 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_35 = new GridBagConstraints();
		gbc_rigidArea_35.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_35.gridx = 3;
		gbc_rigidArea_35.gridy = 8;
		obterDadosVeiculosForm.add(rigidArea_35, gbc_rigidArea_35);
		veiculosTabbedPane.addTab("Consultar", consultarVeiculoPanel);
		consultarVeiculoPanel.setLayout(new BorderLayout(0, 0));

		JPanel consultarDadosPanel = new JPanel();
		consultarDadosPanel.setBackground(Color.WHITE);
		consultarVeiculoPanel.add(consultarDadosPanel);
		consultarDadosPanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_12 = Box.createRigidArea(new Dimension(20, 20));
		consultarDadosPanel.add(rigidArea_12, BorderLayout.SOUTH);

		Component rigidArea_13 = Box.createRigidArea(new Dimension(20, 20));
		consultarDadosPanel.add(rigidArea_13, BorderLayout.NORTH);

		Component rigidArea_14 = Box.createRigidArea(new Dimension(20, 20));
		consultarDadosPanel.add(rigidArea_14, BorderLayout.WEST);

		Component rigidArea_15 = Box.createRigidArea(new Dimension(20, 20));
		consultarDadosPanel.add(rigidArea_15, BorderLayout.EAST);

		JScrollPane scrollPane = new JScrollPane();
		consultarDadosPanel.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		scrollPane.setViewportView(table);
		veiculosTabbedPane.addTab("Editar", editarVeiculoPanel);
		editarVeiculoPanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_16 = Box.createRigidArea(new Dimension(20, 20));
		editarVeiculoPanel.add(rigidArea_16, BorderLayout.NORTH);

		Component rigidArea_17 = Box.createRigidArea(new Dimension(20, 20));
		editarVeiculoPanel.add(rigidArea_17, BorderLayout.WEST);

		Component rigidArea_18 = Box.createRigidArea(new Dimension(20, 20));
		editarVeiculoPanel.add(rigidArea_18, BorderLayout.SOUTH);

		Component rigidArea_19 = Box.createRigidArea(new Dimension(20, 20));
		editarVeiculoPanel.add(rigidArea_19, BorderLayout.EAST);

		JPanel panel_2 = new JPanel();
		editarVeiculoPanel.add(panel_2, BorderLayout.CENTER);

		JPanel panelEdicaoTabela = new JPanel();
		panelEdicaoTabela.setBackground(SystemColor.menu);

		JPanel panelTabelaParaEdicao = new JPanel();
		panelTabelaParaEdicao.setBackground(SystemColor.menu);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(panelEdicaoTabela, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
				.addComponent(panelTabelaParaEdicao, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
						.addComponent(panelTabelaParaEdicao, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(panelEdicaoTabela, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)));
		panelTabelaParaEdicao.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_1 = new JScrollPane();
		panelTabelaParaEdicao.add(scrollPane_1, BorderLayout.CENTER);

		edicaoTable = new JTable();
		scrollPane_1.setViewportView(edicaoTable);
		panelEdicaoTabela.setLayout(new BorderLayout(0, 0));

		Component rigidArea_20 = Box.createRigidArea(new Dimension(20, 20));
		panelEdicaoTabela.add(rigidArea_20, BorderLayout.EAST);

		Component rigidArea_21 = Box.createRigidArea(new Dimension(20, 20));
		panelEdicaoTabela.add(rigidArea_21, BorderLayout.WEST);

		JPanel edicaoPanel = new JPanel();
		panelEdicaoTabela.add(edicaoPanel, BorderLayout.CENTER);
		GridBagLayout gbl_edicaoPanel = new GridBagLayout();
		gbl_edicaoPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_edicaoPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_edicaoPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_edicaoPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		edicaoPanel.setLayout(gbl_edicaoPanel);

		Component rigidArea_22 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_22 = new GridBagConstraints();
		gbc_rigidArea_22.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_22.gridx = 0;
		gbc_rigidArea_22.gridy = 0;
		edicaoPanel.add(rigidArea_22, gbc_rigidArea_22);

		JLabel frabricanteVeiculoLabel = new JLabel("Fabricante");
		GridBagConstraints gbc_frabricanteVeiculoLabel = new GridBagConstraints();
		gbc_frabricanteVeiculoLabel.anchor = GridBagConstraints.EAST;
		gbc_frabricanteVeiculoLabel.insets = new Insets(0, 0, 5, 5);
		gbc_frabricanteVeiculoLabel.gridx = 1;
		gbc_frabricanteVeiculoLabel.gridy = 1;
		edicaoPanel.add(frabricanteVeiculoLabel, gbc_frabricanteVeiculoLabel);

		fabricanteEdicaoTF = new JTextField();
		fabricanteEdicaoTF.setDocument(new LimiteTextField(20));
		GridBagConstraints gbc_fabricanteEdicaoTF = new GridBagConstraints();
		gbc_fabricanteEdicaoTF.insets = new Insets(0, 0, 5, 5);
		gbc_fabricanteEdicaoTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_fabricanteEdicaoTF.gridx = 3;
		gbc_fabricanteEdicaoTF.gridy = 1;
		edicaoPanel.add(fabricanteEdicaoTF, gbc_fabricanteEdicaoTF);
		fabricanteEdicaoTF.setColumns(10);

		JLabel modeloVeiculoLabel = new JLabel("Modelo:");
		GridBagConstraints gbc_modeloVeiculoLabel = new GridBagConstraints();
		gbc_modeloVeiculoLabel.anchor = GridBagConstraints.EAST;
		gbc_modeloVeiculoLabel.insets = new Insets(0, 0, 5, 5);
		gbc_modeloVeiculoLabel.gridx = 1;
		gbc_modeloVeiculoLabel.gridy = 2;
		edicaoPanel.add(modeloVeiculoLabel, gbc_modeloVeiculoLabel);

		modeloEdicaoTF = new JTextField();
		modeloEdicaoTF.setDocument(new LimiteTextField(20));
		GridBagConstraints gbc_modeloEdicaoTF = new GridBagConstraints();
		gbc_modeloEdicaoTF.insets = new Insets(0, 0, 5, 5);
		gbc_modeloEdicaoTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_modeloEdicaoTF.gridx = 3;
		gbc_modeloEdicaoTF.gridy = 2;
		edicaoPanel.add(modeloEdicaoTF, gbc_modeloEdicaoTF);
		modeloEdicaoTF.setColumns(10);

		JButton selecionarVeiculoBtn = new JButton("Selecionar");
		selecionarVeiculoBtn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_selecionarVeiculoBtn = new GridBagConstraints();
		gbc_selecionarVeiculoBtn.insets = new Insets(0, 0, 5, 5);
		gbc_selecionarVeiculoBtn.gridx = 6;
		gbc_selecionarVeiculoBtn.gridy = 2;
		edicaoPanel.add(selecionarVeiculoBtn, gbc_selecionarVeiculoBtn);

		selecionarVeiculoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionarVeiculo();
			}
		});

		JLabel lblNewLabel_8 = new JLabel("Ano:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 3;
		edicaoPanel.add(lblNewLabel_8, gbc_lblNewLabel_8);

		anoEdicaoTF = new AnoTextField();
		GridBagConstraints gbc_anoEdicaoTF = new GridBagConstraints();
		gbc_anoEdicaoTF.insets = new Insets(0, 0, 5, 5);
		gbc_anoEdicaoTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_anoEdicaoTF.gridx = 3;
		gbc_anoEdicaoTF.gridy = 3;
		edicaoPanel.add(anoEdicaoTF, gbc_anoEdicaoTF);
		anoEdicaoTF.setColumns(10);

		atualizarVeiculoBtn = new JButton("Atualizar");
		atualizarVeiculoBtn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_atualizarVeiculoBtn = new GridBagConstraints();
		gbc_atualizarVeiculoBtn.insets = new Insets(0, 0, 5, 5);
		gbc_atualizarVeiculoBtn.gridx = 6;
		gbc_atualizarVeiculoBtn.gridy = 3;
		edicaoPanel.add(atualizarVeiculoBtn, gbc_atualizarVeiculoBtn);

		JLabel lblNewLabel_23 = new JLabel("Pre\u00E7o:");
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_23.gridx = 1;
		gbc_lblNewLabel_23.gridy = 4;
		edicaoPanel.add(lblNewLabel_23, gbc_lblNewLabel_23);

		precoEdicaoTF = new JTextField();
		GridBagConstraints gbc_precoEdicaoTF = new GridBagConstraints();
		gbc_precoEdicaoTF.insets = new Insets(0, 0, 5, 5);
		gbc_precoEdicaoTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_precoEdicaoTF.gridx = 3;
		gbc_precoEdicaoTF.gridy = 4;
		edicaoPanel.add(precoEdicaoTF, gbc_precoEdicaoTF);
		precoEdicaoTF.setColumns(10);

		removerVeiculoBtn = new JButton("Remover");
		removerVeiculoBtn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_removerVeiculoBtn = new GridBagConstraints();
		gbc_removerVeiculoBtn.insets = new Insets(0, 0, 5, 5);
		gbc_removerVeiculoBtn.gridx = 6;
		gbc_removerVeiculoBtn.gridy = 4;
		edicaoPanel.add(removerVeiculoBtn, gbc_removerVeiculoBtn);

		disponibilidadeChkBox = new JCheckBox("Disponibilidade");
		GridBagConstraints gbc_disponibilidadeChkBox = new GridBagConstraints();
		gbc_disponibilidadeChkBox.insets = new Insets(0, 0, 0, 5);
		gbc_disponibilidadeChkBox.gridx = 3;
		gbc_disponibilidadeChkBox.gridy = 5;
		edicaoPanel.add(disponibilidadeChkBox, gbc_disponibilidadeChkBox);
		panel_2.setLayout(gl_panel_2);
		veiculosPanel.add(veiculosTabbedPane);

		alternarTela(botaoVeiculos, layeredPane, veiculosPanel);

		JButton btnNewButton_8 = new JButton("Logout");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 0;
		gbc_btnNewButton_8.gridy = 14;
		panelBotoes.add(btnNewButton_8, gbc_btnNewButton_8);

		JButton btnNewButton_7 = new JButton("Sair");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_7.gridx = 0;
		gbc_btnNewButton_7.gridy = 16;
		panelBotoes.add(btnNewButton_7, gbc_btnNewButton_7);

		JPanel alocacoesPanel = new JPanel();
		layeredPane.add(alocacoesPanel, "name_132767050113700");
		alocacoesPanel.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane alocacoesTabbedPane = new JTabbedPane(JTabbedPane.TOP);
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
		cadastrarAluguelPanel
				.setLayout(new MigLayout("", "[][][center][37.00][][][][][][29.00,left]", "[][][][][][][][][][][][]"));

		Component rigidArea_62 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_62, "cell 6 0");

		Component rigidArea_73 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_73, "cell 0 1");

		Component rigidArea_72 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_72, "cell 1 1");

		Component rigidArea_60 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_60, "cell 4 1");

		Component rigidArea_64 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_64, "cell 8 1");

		Component rigidArea_65 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_65, "cell 9 1");

		Component rigidArea_66 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_66, "cell 1 2");

		JLabel lblNewLabel_14 = new JLabel("Cliente:");
		cadastrarAluguelPanel.add(lblNewLabel_14, "cell 2 2,alignx trailing");

		JComboBox comboBox = new JComboBox();
		cadastrarAluguelPanel.add(comboBox, "cell 3 2 3 1,growx");

		Component rigidArea_63 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_63, "cell 8 2");

		JLabel lblNewLabel_15 = new JLabel("Veiculo:");
		cadastrarAluguelPanel.add(lblNewLabel_15, "cell 2 3,alignx trailing");

		JComboBox comboBox_1 = new JComboBox();
		cadastrarAluguelPanel.add(comboBox_1, "cell 3 3 3 1,growx");

		JLabel lblNewLabel_16 = new JLabel("Data da aloca\u00E7\u00E3o:");
		cadastrarAluguelPanel.add(lblNewLabel_16, "cell 2 4,alignx trailing");

		textField_13 = new JTextField();
		cadastrarAluguelPanel.add(textField_13, "cell 3 4 3 1,growx");
		textField_13.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("Data devolu\u00E7\u00E3o:");
		cadastrarAluguelPanel.add(lblNewLabel_17, "cell 2 5,alignx trailing");

		textField_14 = new JTextField();
		cadastrarAluguelPanel.add(textField_14, "cell 3 5 3 1,growx");
		textField_14.setColumns(10);

		Component rigidArea_68 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_68, "cell 5 6");

		Component rigidArea_67 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarAluguelPanel.add(rigidArea_67, "cell 5 7");

		JButton realizarAlocacaoButton = new JButton("Alocar");
		cadastrarAluguelPanel.add(realizarAlocacaoButton, "cell 2 9");
		alocacoesTabbedPane.addTab("Consultar Alocação", consultarAluguelPanel);
		consultarAluguelPanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_61 = Box.createRigidArea(new Dimension(20, 20));
		consultarAluguelPanel.add(rigidArea_61, BorderLayout.SOUTH);

		Component rigidArea_69 = Box.createRigidArea(new Dimension(20, 20));
		consultarAluguelPanel.add(rigidArea_69, BorderLayout.NORTH);

		Component rigidArea_70 = Box.createRigidArea(new Dimension(20, 20));
		consultarAluguelPanel.add(rigidArea_70, BorderLayout.WEST);

		Component rigidArea_71 = Box.createRigidArea(new Dimension(20, 20));
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
		panel_5.setLayout(new BorderLayout(0, 0));

		Component rigidArea_74 = Box.createRigidArea(new Dimension(20, 20));
		panel_5.add(rigidArea_74, BorderLayout.WEST);

		Component rigidArea_75 = Box.createRigidArea(new Dimension(20, 20));
		panel_5.add(rigidArea_75, BorderLayout.EAST);

		JPanel filtrosContratosPanel = new JPanel();
		filtrosContratosPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(filtrosContratosPanel, BorderLayout.CENTER);
		GridBagLayout gbl_filtrosContratosPanel = new GridBagLayout();
		gbl_filtrosContratosPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_filtrosContratosPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_filtrosContratosPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		gbl_filtrosContratosPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		filtrosContratosPanel.setLayout(gbl_filtrosContratosPanel);

		JLabel lblNewLabel_22 = new JLabel("Filtros");
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 0;
		gbc_lblNewLabel_22.gridy = 0;
		filtrosContratosPanel.add(lblNewLabel_22, gbc_lblNewLabel_22);

		JLabel lblNewLabel_18 = new JLabel("Cliente:");
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 2;
		gbc_lblNewLabel_18.gridy = 1;
		filtrosContratosPanel.add(lblNewLabel_18, gbc_lblNewLabel_18);

		JComboBox comboBox_2_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_2_1 = new GridBagConstraints();
		gbc_comboBox_2_1.gridwidth = 2;
		gbc_comboBox_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2_1.gridx = 3;
		gbc_comboBox_2_1.gridy = 1;
		filtrosContratosPanel.add(comboBox_2_1, gbc_comboBox_2_1);

		Component rigidArea_76 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_76 = new GridBagConstraints();
		gbc_rigidArea_76.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_76.gridx = 0;
		gbc_rigidArea_76.gridy = 2;
		filtrosContratosPanel.add(rigidArea_76, gbc_rigidArea_76);

		Component rigidArea_77 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_77 = new GridBagConstraints();
		gbc_rigidArea_77.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_77.gridx = 1;
		gbc_rigidArea_77.gridy = 2;
		filtrosContratosPanel.add(rigidArea_77, gbc_rigidArea_77);

		JLabel lblNewLabel_19 = new JLabel("Funcionario:");
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 2;
		gbc_lblNewLabel_19.gridy = 2;
		filtrosContratosPanel.add(lblNewLabel_19, gbc_lblNewLabel_19);

		JComboBox comboBox_2_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2_2 = new GridBagConstraints();
		gbc_comboBox_2_2.gridwidth = 2;
		gbc_comboBox_2_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2_2.gridx = 3;
		gbc_comboBox_2_2.gridy = 2;
		filtrosContratosPanel.add(comboBox_2_2, gbc_comboBox_2_2);

		Component rigidArea_78 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_78 = new GridBagConstraints();
		gbc_rigidArea_78.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_78.gridx = 5;
		gbc_rigidArea_78.gridy = 2;
		filtrosContratosPanel.add(rigidArea_78, gbc_rigidArea_78);

		Component rigidArea_79 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_79 = new GridBagConstraints();
		gbc_rigidArea_79.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_79.gridx = 6;
		gbc_rigidArea_79.gridy = 2;
		filtrosContratosPanel.add(rigidArea_79, gbc_rigidArea_79);

		Component rigidArea_80 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_80 = new GridBagConstraints();
		gbc_rigidArea_80.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_80.gridx = 7;
		gbc_rigidArea_80.gridy = 2;
		filtrosContratosPanel.add(rigidArea_80, gbc_rigidArea_80);

		Component rigidArea_81 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_81 = new GridBagConstraints();
		gbc_rigidArea_81.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_81.gridx = 8;
		gbc_rigidArea_81.gridy = 2;
		filtrosContratosPanel.add(rigidArea_81, gbc_rigidArea_81);

		Component rigidArea_82 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_82 = new GridBagConstraints();
		gbc_rigidArea_82.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_82.gridx = 9;
		gbc_rigidArea_82.gridy = 2;
		filtrosContratosPanel.add(rigidArea_82, gbc_rigidArea_82);

		JButton filtrarButton = new JButton("Filtrar");
		GridBagConstraints gbc_filtrarButton = new GridBagConstraints();
		gbc_filtrarButton.insets = new Insets(0, 0, 5, 5);
		gbc_filtrarButton.gridx = 10;
		gbc_filtrarButton.gridy = 2;
		filtrosContratosPanel.add(filtrarButton, gbc_filtrarButton);

		JLabel lblNewLabel_20 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 2;
		gbc_lblNewLabel_20.gridy = 3;
		filtrosContratosPanel.add(lblNewLabel_20, gbc_lblNewLabel_20);

		JLabel lblNewLabel_21 = new JLabel("Ordenar por:");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 2;
		gbc_lblNewLabel_21.gridy = 4;
		filtrosContratosPanel.add(lblNewLabel_21, gbc_lblNewLabel_21);

		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.gridwidth = 2;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 4;
		filtrosContratosPanel.add(comboBox_2, gbc_comboBox_2);

		JButton limparFiltrosButton = new JButton("Limpar");
		GridBagConstraints gbc_limparFiltrosButton = new GridBagConstraints();
		gbc_limparFiltrosButton.insets = new Insets(0, 0, 5, 5);
		gbc_limparFiltrosButton.gridx = 10;
		gbc_limparFiltrosButton.gridy = 4;
		filtrosContratosPanel.add(limparFiltrosButton, gbc_limparFiltrosButton);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Apenas ativos");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_1.gridx = 3;
		gbc_chckbxNewCheckBox_1.gridy = 5;
		filtrosContratosPanel.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);

		Component rigidArea_83 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_83 = new GridBagConstraints();
		gbc_rigidArea_83.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_83.gridx = 3;
		gbc_rigidArea_83.gridy = 6;
		filtrosContratosPanel.add(rigidArea_83, gbc_rigidArea_83);
		consultarContratosPanel.setLayout(gl_consultarContratosPanel);
		alocacoesPanel.add(alocacoesTabbedPane);
		alternarTela(botaoAlocacoes, layeredPane, alocacoesPanel);

		Component rigidArea_39 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_39, "cell 4 8 2 1,alignx trailing");

		JButton btnNewButton_9 = new JButton("Prosseguir");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		informativoPanel.add(btnNewButton_9, "cell 1 9");

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

		textField_8 = new JTextField();
		cadastrarClientePanel.add(textField_8, "cell 2 1 3 1,growx");
		textField_8.setColumns(10);

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

		textField_9 = new JTextField();
		cadastrarClientePanel.add(textField_9, "cell 2 2 3 1,growx");
		textField_9.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("Telefone:");
		cadastrarClientePanel.add(lblNewLabel_11, "cell 1 3,alignx trailing");

		textField_10 = new JTextField();
		cadastrarClientePanel.add(textField_10, "cell 2 3 3 1,growx");
		textField_10.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("CNH:");
		cadastrarClientePanel.add(lblNewLabel_12, "cell 1 4,alignx trailing");

		textField_11 = new JTextField();
		cadastrarClientePanel.add(textField_11, "cell 2 4 3 1,growx");
		textField_11.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("Data nascimento:");
		cadastrarClientePanel.add(lblNewLabel_13, "cell 1 5,alignx trailing");

		textField_12 = new JTextField();
		cadastrarClientePanel.add(textField_12, "cell 2 5 3 1,growx");
		textField_12.setColumns(10);

		Component rigidArea_48 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_48, "cell 3 6 2 1");

		Component rigidArea_49 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_49, "cell 3 7 2 1");

		JButton btnNewButton_10 = new JButton("Cadastrar e Prosseguir");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cadastrarClientePanel.add(btnNewButton_10, "cell 1 8 2 1");

		Component rigidArea_56 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_56, "flowx,cell 3 8 2 1");

		Component rigidArea_55 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_55, "cell 3 8 2 1,alignx right");

		JButton btnNewButton_11 = new JButton("Limpar");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cadastrarClientePanel.add(btnNewButton_11, "cell 3 8 2 1,alignx right");

		Component rigidArea_57 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_57, "cell 2 9");

		Component rigidArea_58 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_58, "cell 2 10");

		Component rigidArea_59 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_59, "cell 2 11");

		alternarTela(btnNewButton_10, alocarLayeredPane, cadastrarAluguelPanel);

		JButton LimparContratoButton = new JButton("Limpar");
		cadastrarAluguelPanel.add(LimparContratoButton, "cell 5 9");
		VeiculoController.obterListaVeiculos(edicaoTable);
		VeiculoController.obterListaVeiculos(table);
		limparVeiculoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCadastro();
			}
		});

		atualizarVeiculoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizarVeiculo();
			}
		});
		cadastrarVeiculoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obterDadosParaCadastroDeVeiculos();
			}
		});
		
		removerVeiculoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removerVeiculo();
			}
		});
		alternarTela(voltarParaAlocacaoTelaInicialBtn, alocarLayeredPane, informativoPanel);

	}

	private void limparCadastro() {
		modeloVeiculoTF.setText("");
		fabricanteVeiculoTF.setText("");
		anoVeiculoTF.setText("");
		precoVeiculoTF.setText("");
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

	private Boolean validarDadosParaCadastroDeVeiculo() {
		Boolean valido = true;

		if (MetodosGerais.StringIsNullOrWhiteSpace(modeloVeiculoTF.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(fabricanteVeiculoTF.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(anoVeiculoTF.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(precoVeiculoTF.getText())) {
			valido = false;
		}
		if (!valido) {
			JOptionPane.showMessageDialog(null, "Não podem haver campos vazios.");
		}
		return valido;
	}

	public void selecionarVeiculo() {
		if (edicaoTable.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Por favor selecione uma linha.");
		} else {
			DefaultTableModel dtm = (DefaultTableModel) edicaoTable.getModel();
			int linhaSelecionada = edicaoTable.getSelectedRow();
			fabricanteEdicaoTF.setText(dtm.getValueAt(linhaSelecionada, 1).toString());
			modeloEdicaoTF.setText(dtm.getValueAt(linhaSelecionada, 2).toString());
			anoEdicaoTF.setText(dtm.getValueAt(linhaSelecionada, 3).toString());
			precoEdicaoTF.setText(dtm.getValueAt(linhaSelecionada, 4).toString());
			disponibilidadeChkBox.setSelected(dtm.getValueAt(linhaSelecionada, 5).toString().equals("true"));
		}
	}

	public void obterDadosParaCadastroDeVeiculos() {
		if (validarDadosParaCadastroDeVeiculo()) {
			VeiculoModel model = new VeiculoModel();
			model.setModelo(modeloVeiculoTF.getText());
			model.setFabricante(fabricanteVeiculoTF.getText());
			model.setAnoLancamento(Integer.parseInt(anoVeiculoTF.getText()));
			model.setEstaDisponivel(veiculoChkBox.isSelected());
			model.setPrecoAluguel(Double.parseDouble(precoVeiculoTF.getText()));
			VeiculoController.cadastrarVeiculo(model, edicaoTable);
			VeiculoController.obterListaVeiculos(edicaoTable);
			VeiculoController.obterListaVeiculos(table);

		}
	}

	public void removerVeiculo() {
		if (edicaoTable.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Por favor selecione uma linha.");
		} else {
			DefaultTableModel dtm = (DefaultTableModel) edicaoTable.getModel();
			int linhaSelecionada = edicaoTable.getSelectedRow();
			int idVeiculo = Integer.parseInt(dtm.getValueAt(linhaSelecionada, 0).toString());
			VeiculoController.removerVeiculo(idVeiculo);
			VeiculoController.obterListaVeiculos(edicaoTable);
			VeiculoController.obterListaVeiculos(table);
		}
	}

	public void atualizarVeiculo() {
		VeiculoModel model = new VeiculoModel();
		DefaultTableModel dtm = (DefaultTableModel) edicaoTable.getModel();
		int linhaSelecinhada = edicaoTable.getSelectedRow();
		model.setIdVeiculo(Integer.parseInt(dtm.getValueAt(linhaSelecinhada, 0).toString()));
		model.setFabricante(fabricanteEdicaoTF.getText());
		model.setModelo(modeloEdicaoTF.getText());
		model.setAnoLancamento(Integer.parseInt(anoEdicaoTF.getText()));
		model.setPrecoAluguel(Double.parseDouble(precoEdicaoTF.getText()));
		model.setEstaDisponivel(disponibilidadeChkBox.isSelected());
		VeiculoController.editarVeiculo(model, edicaoTable);
		VeiculoController.obterListaVeiculos(edicaoTable);
		VeiculoController.obterListaVeiculos(table);

	}
}