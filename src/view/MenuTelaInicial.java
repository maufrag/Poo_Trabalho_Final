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
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;

public class MenuTelaInicial extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable tableConsultaVeiculo;
	private JTable tableEdicao;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public MenuTelaInicial() {
		setLayout(new GridLayout(1, 0, 0, 0));
		setBounds(150, 150, 640, 480);

		JSplitPane splitPane = new JSplitPane();
		add(splitPane);
		// Color color = new Color(0,0,0,0);
		// splitPane.setBackground(color);
		splitPane.setDividerSize(0);
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		splitPane.setLeftComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 0;
		panel.add(rigidArea, gbc_rigidArea);

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_1.gridx = 0;
		gbc_rigidArea_1.gridy = 1;
		panel.add(rigidArea_1, gbc_rigidArea_1);

		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_8 = new GridBagConstraints();
		gbc_rigidArea_8.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_8.gridx = 0;
		gbc_rigidArea_8.gridy = 2;
		panel.add(rigidArea_8, gbc_rigidArea_8);

		JButton btnNewButton = new JButton("Aloca\u00E7\u00F5es");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 3;
		panel.add(btnNewButton, gbc_btnNewButton);

		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_7 = new GridBagConstraints();
		gbc_rigidArea_7.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_7.gridx = 0;
		gbc_rigidArea_7.gridy = 4;
		panel.add(rigidArea_7, gbc_rigidArea_7);

		JButton botaoVeiculos = new JButton("Ve\u00EDculos");
		GridBagConstraints gbc_botaoVeiculos = new GridBagConstraints();
		gbc_botaoVeiculos.fill = GridBagConstraints.HORIZONTAL;
		gbc_botaoVeiculos.insets = new Insets(0, 0, 5, 0);
		gbc_botaoVeiculos.gridx = 0;
		gbc_botaoVeiculos.gridy = 5;
		panel.add(botaoVeiculos, gbc_botaoVeiculos);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_5.gridx = 0;
		gbc_rigidArea_5.gridy = 6;
		panel.add(rigidArea_5, gbc_rigidArea_5);

		JButton btnNewButton_2 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 7;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);

		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 8;
		panel.add(rigidArea_4, gbc_rigidArea_4);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_2.gridx = 0;
		gbc_rigidArea_2.gridy = 11;
		panel.add(rigidArea_2, gbc_rigidArea_2);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.gridx = 0;
		gbc_rigidArea_3.gridy = 12;
		panel.add(rigidArea_3, gbc_rigidArea_3);

		JLayeredPane layeredPane = new JLayeredPane();
		splitPane.setRightComponent(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		JPanel veiculosPanel = new JPanel();
		layeredPane.add(veiculosPanel, "name_5290351763300");
		veiculosPanel.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane tabbedPaneVeiculos = new JTabbedPane(JTabbedPane.TOP);
		JPanel cadastrarVeiculoPanel = new JPanel();
		JPanel consultarVeiculoPanel = new JPanel();
		JPanel editarVeiculoPanel = new JPanel();
		tabbedPaneVeiculos.addTab("Cadastrar", cadastrarVeiculoPanel);
		cadastrarVeiculoPanel.setLayout(new BorderLayout(0, 0));

		JPanel obterDadosPanel = new JPanel();
		obterDadosPanel.setBackground(Color.WHITE);
		cadastrarVeiculoPanel.add(obterDadosPanel, BorderLayout.CENTER);
		obterDadosPanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_6 = Box.createRigidArea(new Dimension(544, 104));
		obterDadosPanel.add(rigidArea_6, BorderLayout.NORTH);

		Component rigidArea_9 = Box.createRigidArea(new Dimension(92, 238));
		obterDadosPanel.add(rigidArea_9, BorderLayout.WEST);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(97, 238));
		obterDadosPanel.add(rigidArea_10, BorderLayout.EAST);

		Component rigidArea_11 = Box.createRigidArea(new Dimension(544, 78));
		obterDadosPanel.add(rigidArea_11, BorderLayout.SOUTH);

		JPanel obterDadosForm = new JPanel();
		obterDadosPanel.add(obterDadosForm, BorderLayout.CENTER);

		JLabel lblNewLabel_1 = new JLabel("Modelo:");

		textField = new JTextField();
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Fabricante:");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Ano Lan\u00E7amento:");

		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));

		JButton btnNewButton_3 = new JButton("Cadastrar");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 9));

		JLabel lblNewLabel_5 = new JLabel("Pre\u00E7o base:");

		JCheckBox chckbxNewCheckBox = new JCheckBox("Dispon\u00EDvel");

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GroupLayout gl_obterDadosForm = new GroupLayout(obterDadosForm);
		gl_obterDadosForm.setHorizontalGroup(
			gl_obterDadosForm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_obterDadosForm.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_obterDadosForm.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_obterDadosForm.createSequentialGroup()
							.addGroup(gl_obterDadosForm.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_1))
							.addGroup(gl_obterDadosForm.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_obterDadosForm.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED, 143, Short.MAX_VALUE)
									.addComponent(chckbxNewCheckBox)
									.addGap(45))
								.addGroup(gl_obterDadosForm.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_obterDadosForm.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_2)
										.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
										.addComponent(textField_1)
										.addComponent(textField))
									.addContainerGap(71, Short.MAX_VALUE))))
						.addGroup(gl_obterDadosForm.createSequentialGroup()
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
							.addComponent(btnNewButton_1)
							.addGap(94))))
		);
		gl_obterDadosForm.setVerticalGroup(
			gl_obterDadosForm.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_obterDadosForm.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_obterDadosForm.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_obterDadosForm.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_obterDadosForm.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_obterDadosForm.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox)
					.addGap(27)
					.addGroup(gl_obterDadosForm.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		obterDadosForm.setLayout(gl_obterDadosForm);
		tabbedPaneVeiculos.addTab("Consultar", consultarVeiculoPanel);
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
		//TODO remover columnNames e data
		String[] columnNames = { "First Name", "Last Name", "Sport", "# of Years", "Vegetarian" };

		Object[][] data = { { "Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "Joe", "Brown", "Pool", new Integer(10), new Boolean(false) } };
		tableConsultaVeiculo = new JTable(data, columnNames);
		
		scrollPane.setViewportView(tableConsultaVeiculo);
		tabbedPaneVeiculos.addTab("Editar", editarVeiculoPanel);
		editarVeiculoPanel.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea_16 = Box.createRigidArea(new Dimension(20, 20));
		editarVeiculoPanel.add(rigidArea_16, BorderLayout.NORTH);
		
		Component rigidArea_17 = Box.createRigidArea(new Dimension(20, 20));
		editarVeiculoPanel.add(rigidArea_17, BorderLayout.WEST);
		
		Component rigidArea_18 = Box.createRigidArea(new Dimension(20, 20));
		editarVeiculoPanel.add(rigidArea_18, BorderLayout.SOUTH);
		
		Component rigidArea_19 = Box.createRigidArea(new Dimension(20, 20));
		editarVeiculoPanel.add(rigidArea_19, BorderLayout.EAST);
		
		JPanel panelEdicao = new JPanel();
		editarVeiculoPanel.add(panelEdicao, BorderLayout.CENTER);
		
		JPanel panelEdicaoTabela = new JPanel();
		panelEdicaoTabela.setBackground(SystemColor.menu);
		
		JPanel panelTabelaParaEdicao = new JPanel();
		panelTabelaParaEdicao.setBackground(SystemColor.menu);
		GroupLayout gl_panelEdicao = new GroupLayout(panelEdicao);
		gl_panelEdicao.setHorizontalGroup(
			gl_panelEdicao.createParallelGroup(Alignment.LEADING)
				.addComponent(panelEdicaoTabela, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
				.addComponent(panelTabelaParaEdicao, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
		);
		gl_panelEdicao.setVerticalGroup(
			gl_panelEdicao.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelEdicao.createSequentialGroup()
					.addComponent(panelTabelaParaEdicao, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelEdicaoTabela, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
		);
		panelTabelaParaEdicao.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTabelaEdicao = new JScrollPane();
		panelTabelaParaEdicao.add(scrollPaneTabelaEdicao, BorderLayout.CENTER);
		
		tableEdicao = new JTable(data, columnNames);
		scrollPaneTabelaEdicao.setViewportView(tableEdicao);
		panelEdicaoTabela.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea_20 = Box.createRigidArea(new Dimension(20, 20));
		panelEdicaoTabela.add(rigidArea_20, BorderLayout.EAST);
		
		Component rigidArea_21 = Box.createRigidArea(new Dimension(20, 20));
		panelEdicaoTabela.add(rigidArea_21, BorderLayout.WEST);
		
		JPanel panelCamposEdicao = new JPanel();
		panelEdicaoTabela.add(panelCamposEdicao, BorderLayout.CENTER);
		GridBagLayout gbl_panelCamposEdicao = new GridBagLayout();
		gbl_panelCamposEdicao.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCamposEdicao.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelCamposEdicao.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelCamposEdicao.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCamposEdicao.setLayout(gbl_panelCamposEdicao);
		
		Component rigidArea_22 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_22 = new GridBagConstraints();
		gbc_rigidArea_22.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_22.gridx = 0;
		gbc_rigidArea_22.gridy = 0;
		panelCamposEdicao.add(rigidArea_22, gbc_rigidArea_22);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 1;
		panelCamposEdicao.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 1;
		panelCamposEdicao.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Selecionar");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 6;
		gbc_btnNewButton_4.gridy = 1;
		panelCamposEdicao.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 2;
		panelCamposEdicao.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 2;
		panelCamposEdicao.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Atualizar");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 6;
		gbc_btnNewButton_5.gridy = 2;
		panelCamposEdicao.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 3;
		panelCamposEdicao.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 3;
		gbc_textField_6.gridy = 3;
		panelCamposEdicao.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Remover");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 6;
		gbc_btnNewButton_6.gridy = 3;
		panelCamposEdicao.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 4;
		panelCamposEdicao.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 0, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 3;
		gbc_textField_7.gridy = 4;
		panelCamposEdicao.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		panelEdicao.setLayout(gl_panelEdicao);
		veiculosPanel.add(tabbedPaneVeiculos);

		alternarTela(botaoVeiculos, layeredPane, veiculosPanel);

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
}
