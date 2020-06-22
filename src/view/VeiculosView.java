package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
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
import controller.VeiculoController;
import metodosGerais.AnoTextField;
import metodosGerais.LimiteTextField;
import metodosGerais.MetodosGerais;
import model.VeiculoModel;

public class VeiculosView extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 127153050053954327L;
	private JTextField modeloVeiculoTF;
	private JTextField fabricanteVeiculoTF;
	private JTextField anoVeiculoTF;
	private JTextField precoVeiculoTF;
	private JCheckBox veiculoChkBox;
	private JButton atualizarVeiculoBtn;
	private JCheckBox disponibilidadeChkBox;
	private JTable table;
	private JTextField fabricanteEdicaoTF;
	private JTextField modeloEdicaoTF;
	private JTextField anoEdicaoTF;
	private JTextField precoEdicaoTF;
	private JButton removerVeiculoBtn;
	private JButton cadastrarVeiculoBtn;
	private JTable edicaoTable;

	/**
	 * Create the panel.
	 */
	public VeiculosView() {
		setBounds(150, 150, 675, 470);
		setLayout(new GridLayout(0, 1, 0, 0));
		JPanel veiculosPanel = new JPanel();
		add(veiculosPanel);
		veiculosPanel.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane veiculosTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		JPanel cadastrarVeiculoPanel = new JPanel();
		JPanel consultarVeiculoPanel = new JPanel();
		JPanel editarVeiculoPanel = new JPanel();
		editarVeiculoPanel.setBackground(Color.WHITE);
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
		obterDadosVeiculosForm.setBorder(UIManager.getBorder("DesktopIcon.border"));
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
		panel_2.setBackground(Color.WHITE);
		editarVeiculoPanel.add(panel_2, BorderLayout.CENTER);

		JPanel panelEdicaoTabela = new JPanel();
		panelEdicaoTabela.setBackground(Color.WHITE);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(panelEdicaoTabela, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
				.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelEdicaoTabela, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
		);
		
		edicaoTable = new JTable();
		scrollPane_1.setViewportView(edicaoTable);
		panelEdicaoTabela.setLayout(new BorderLayout(0, 0));

		Component rigidArea_20 = Box.createRigidArea(new Dimension(20, 20));
		panelEdicaoTabela.add(rigidArea_20, BorderLayout.EAST);

		Component rigidArea_21 = Box.createRigidArea(new Dimension(20, 20));
		panelEdicaoTabela.add(rigidArea_21, BorderLayout.WEST);

		JPanel edicaoPanel = new JPanel();
		edicaoPanel.setBorder(UIManager.getBorder("DesktopIcon.border"));
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
		VeiculoController.obterListaVeiculos(table);
		VeiculoController.obterListaVeiculos(edicaoTable);
	}

	private void limparCadastro() {
		modeloVeiculoTF.setText("");
		fabricanteVeiculoTF.setText("");
		anoVeiculoTF.setText("");
		precoVeiculoTF.setText("");
	}

	private void limparSelecao() {
		fabricanteEdicaoTF.setText("");
		modeloEdicaoTF.setText("");
		anoEdicaoTF.setText("");
		precoEdicaoTF.setText("");
		disponibilidadeChkBox.setSelected(false);
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
			limparCadastro();
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
		limparSelecao();
	}
}
