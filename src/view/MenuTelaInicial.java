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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;

public class MenuTelaInicial extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTable edicaoTable;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Create the panel.
	 */
	public MenuTelaInicial() {
		setLayout(new GridLayout(1, 0, 0, 0));
		setBounds(150, 150, 708, 532);

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
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
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

		JButton botaoAlocacoes = new JButton("Aloca\u00E7\u00F5es");
		GridBagConstraints gbc_botaoAlocacoes = new GridBagConstraints();
		gbc_botaoAlocacoes.fill = GridBagConstraints.HORIZONTAL;
		gbc_botaoAlocacoes.insets = new Insets(0, 0, 5, 0);
		gbc_botaoAlocacoes.gridx = 0;
		gbc_botaoAlocacoes.gridy = 3;
		panel.add(botaoAlocacoes, gbc_botaoAlocacoes);

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
		
		JButton btnNewButton = new JButton("Clientes");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 7;
		panel.add(btnNewButton, gbc_btnNewButton);

		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 8;
		panel.add(rigidArea_4, gbc_rigidArea_4);
		
				JButton btnNewButton_2 = new JButton("Administrativo");
				GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
				gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
				gbc_btnNewButton_2.gridx = 0;
				gbc_btnNewButton_2.gridy = 9;
				panel.add(btnNewButton_2, gbc_btnNewButton_2);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_2.gridx = 0;
		gbc_rigidArea_2.gridy = 11;
		panel.add(rigidArea_2, gbc_rigidArea_2);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_3.gridx = 0;
		gbc_rigidArea_3.gridy = 12;
		panel.add(rigidArea_3, gbc_rigidArea_3);

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
		gbl_obterDadosVeiculosForm.columnWidths = new int[]{0, 0, 84, 134, 0, 0, 0};
		gbl_obterDadosVeiculosForm.rowHeights = new int[]{36, 20, 20, 20, 20, 23, 19, 0, 0, 0};
		gbl_obterDadosVeiculosForm.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_obterDadosVeiculosForm.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
								
										JLabel lblNewLabel_1 = new JLabel("Modelo:");
										GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
										gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
										gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
										gbc_lblNewLabel_1.gridx = 2;
										gbc_lblNewLabel_1.gridy = 1;
										obterDadosVeiculosForm.add(lblNewLabel_1, gbc_lblNewLabel_1);
										
												textField = new JTextField();
												textField.setColumns(10);
												GridBagConstraints gbc_textField = new GridBagConstraints();
												gbc_textField.anchor = GridBagConstraints.NORTH;
												gbc_textField.fill = GridBagConstraints.HORIZONTAL;
												gbc_textField.insets = new Insets(0, 0, 5, 5);
												gbc_textField.gridx = 3;
												gbc_textField.gridy = 1;
												obterDadosVeiculosForm.add(textField, gbc_textField);
										
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
								
										JLabel lblNewLabel_3 = new JLabel("Fabricante:");
										GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
										gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
										gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
										gbc_lblNewLabel_3.gridx = 2;
										gbc_lblNewLabel_3.gridy = 2;
										obterDadosVeiculosForm.add(lblNewLabel_3, gbc_lblNewLabel_3);
								
										textField_1 = new JTextField();
										textField_1.setColumns(10);
										GridBagConstraints gbc_textField_1 = new GridBagConstraints();
										gbc_textField_1.anchor = GridBagConstraints.NORTH;
										gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
										gbc_textField_1.insets = new Insets(0, 0, 5, 5);
										gbc_textField_1.gridx = 3;
										gbc_textField_1.gridy = 2;
										obterDadosVeiculosForm.add(textField_1, gbc_textField_1);
						
								JLabel lblNewLabel_4 = new JLabel("Ano Lan\u00E7amento:");
								GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
								gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
								gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
								gbc_lblNewLabel_4.gridx = 2;
								gbc_lblNewLabel_4.gridy = 3;
								obterDadosVeiculosForm.add(lblNewLabel_4, gbc_lblNewLabel_4);
						
								textField_2 = new JTextField();
								textField_2.setColumns(10);
								GridBagConstraints gbc_textField_2 = new GridBagConstraints();
								gbc_textField_2.anchor = GridBagConstraints.NORTH;
								gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
								gbc_textField_2.insets = new Insets(0, 0, 5, 5);
								gbc_textField_2.gridx = 3;
								gbc_textField_2.gridy = 3;
								obterDadosVeiculosForm.add(textField_2, gbc_textField_2);
				
						JLabel lblNewLabel_5 = new JLabel("Pre\u00E7o base:");
						GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
						gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
						gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel_5.gridx = 2;
						gbc_lblNewLabel_5.gridy = 4;
						obterDadosVeiculosForm.add(lblNewLabel_5, gbc_lblNewLabel_5);
				
						textField_3 = new JTextField();
						textField_3.setColumns(10);
						GridBagConstraints gbc_textField_3 = new GridBagConstraints();
						gbc_textField_3.anchor = GridBagConstraints.NORTH;
						gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
						gbc_textField_3.insets = new Insets(0, 0, 5, 5);
						gbc_textField_3.gridx = 3;
						gbc_textField_3.gridy = 4;
						obterDadosVeiculosForm.add(textField_3, gbc_textField_3);
		
				JCheckBox chckbxNewCheckBox = new JCheckBox("Dispon\u00EDvel");
				chckbxNewCheckBox.setSelected(true);
				GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
				gbc_chckbxNewCheckBox.anchor = GridBagConstraints.NORTHEAST;
				gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxNewCheckBox.gridx = 3;
				gbc_chckbxNewCheckBox.gridy = 5;
				obterDadosVeiculosForm.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
				
						JButton btnNewButton_3 = new JButton("Cadastrar");
						btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
						GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
						gbc_btnNewButton_3.anchor = GridBagConstraints.NORTH;
						gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
						gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
						gbc_btnNewButton_3.gridx = 2;
						gbc_btnNewButton_3.gridy = 6;
						obterDadosVeiculosForm.add(btnNewButton_3, gbc_btnNewButton_3);
		
				JButton btnNewButton_1 = new JButton("Limpar");
				btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
				GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
				gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton_1.anchor = GridBagConstraints.NORTHEAST;
				gbc_btnNewButton_1.gridx = 3;
				gbc_btnNewButton_1.gridy = 6;
				obterDadosVeiculosForm.add(btnNewButton_1, gbc_btnNewButton_1);
				
				Component rigidArea_34 = Box.createRigidArea(new Dimension(20, 20));
				GridBagConstraints gbc_rigidArea_34 = new GridBagConstraints();
				gbc_rigidArea_34.insets = new Insets(0, 0, 5, 5);
				gbc_rigidArea_34.gridx = 3;
				gbc_rigidArea_34.gridy = 7;
				obterDadosVeiculosForm.add(rigidArea_34, gbc_rigidArea_34);
				
				Component rigidArea_35 = Box.createRigidArea(new Dimension(20, 20));
				GridBagConstraints gbc_rigidArea_35 = new GridBagConstraints();
				gbc_rigidArea_35.insets = new Insets(0, 0, 0, 5);
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
		table = new JTable(data, columnNames);
		
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
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(panelEdicaoTabela, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
				.addComponent(panelTabelaParaEdicao, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(panelTabelaParaEdicao, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelEdicaoTabela, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
		);
		panelTabelaParaEdicao.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelTabelaParaEdicao.add(scrollPane_1, BorderLayout.CENTER);
		
		edicaoTable = new JTable(data, columnNames);
		scrollPane_1.setViewportView(edicaoTable);
		panelEdicaoTabela.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea_20 = Box.createRigidArea(new Dimension(20, 20));
		panelEdicaoTabela.add(rigidArea_20, BorderLayout.EAST);
		
		Component rigidArea_21 = Box.createRigidArea(new Dimension(20, 20));
		panelEdicaoTabela.add(rigidArea_21, BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		panelEdicaoTabela.add(panel_4, BorderLayout.CENTER);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		Component rigidArea_22 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_22 = new GridBagConstraints();
		gbc_rigidArea_22.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_22.gridx = 0;
		gbc_rigidArea_22.gridy = 0;
		panel_4.add(rigidArea_22, gbc_rigidArea_22);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 1;
		panel_4.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 1;
		panel_4.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Selecionar");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 6;
		gbc_btnNewButton_4.gridy = 1;
		panel_4.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 2;
		panel_4.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 2;
		panel_4.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Atualizar");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 6;
		gbc_btnNewButton_5.gridy = 2;
		panel_4.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 3;
		panel_4.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 3;
		gbc_textField_6.gridy = 3;
		panel_4.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Remover");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 6;
		gbc_btnNewButton_6.gridy = 3;
		panel_4.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 4;
		panel_4.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 0, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 3;
		gbc_textField_7.gridy = 4;
		panel_4.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		panel_2.setLayout(gl_panel_2);
		veiculosPanel.add(veiculosTabbedPane);

		alternarTela(botaoVeiculos, layeredPane, veiculosPanel);
		
		JButton btnNewButton_8 = new JButton("Logout");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 0;
		gbc_btnNewButton_8.gridy = 14;
		panel.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("Sair");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_7.gridx = 0;
		gbc_btnNewButton_7.gridy = 16;
		panel.add(btnNewButton_7, gbc_btnNewButton_7);
		
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
		informativoPanel.setLayout(new MigLayout("", "[center][center][][][110.00][][center][-36.00]", "[][][][][][][][][][][]"));
		
		Component rigidArea_53 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_53, "cell 4 0 2 1");
		
		Component rigidArea_52 = Box.createRigidArea(new Dimension(20, 20));
		informativoPanel.add(rigidArea_52, "cell 4 1 2 1");
		
		JLabel lblNewLabel = new JLabel("<html><body>Para realizar uma aloca\u00E7\u00E3o \u00E9 necess\u00E1rio que o cliente esteja cadastrado no sistema</html></body>");
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
		cadastrarAluguelPanel.setLayout(new MigLayout("", "[][][center][37.00][][][][][][29.00,left]", "[][][][][][][][][][][][]"));
		
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
		//layeredPane_1.setLayout(new FormLayout(new ColumnSpec[] {},
			//new RowSpec[] {}));
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
		
		JPanel panel_1 = new JPanel();
		consultarAluguelPanel.add(panel_1, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_5 = new JPanel();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
		);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea_74 = Box.createRigidArea(new Dimension(20, 20));
		panel_5.add(rigidArea_74, BorderLayout.WEST);
		
		Component rigidArea_75 = Box.createRigidArea(new Dimension(20, 20));
		panel_5.add(rigidArea_75, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6, BorderLayout.CENTER);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lblNewLabel_22 = new JLabel("Filtros");
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 2;
		gbc_lblNewLabel_22.gridy = 0;
		panel_6.add(lblNewLabel_22, gbc_lblNewLabel_22);
		
		JLabel lblNewLabel_18 = new JLabel("Cliente:");
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 2;
		gbc_lblNewLabel_18.gridy = 1;
		panel_6.add(lblNewLabel_18, gbc_lblNewLabel_18);
		
		JComboBox comboBox_2_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_2_1 = new GridBagConstraints();
		gbc_comboBox_2_1.gridwidth = 2;
		gbc_comboBox_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2_1.gridx = 3;
		gbc_comboBox_2_1.gridy = 1;
		panel_6.add(comboBox_2_1, gbc_comboBox_2_1);
		
		Component rigidArea_76 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_76 = new GridBagConstraints();
		gbc_rigidArea_76.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_76.gridx = 0;
		gbc_rigidArea_76.gridy = 2;
		panel_6.add(rigidArea_76, gbc_rigidArea_76);
		
		Component rigidArea_77 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_77 = new GridBagConstraints();
		gbc_rigidArea_77.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_77.gridx = 1;
		gbc_rigidArea_77.gridy = 2;
		panel_6.add(rigidArea_77, gbc_rigidArea_77);
		
		JLabel lblNewLabel_19 = new JLabel("Funcionario:");
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 2;
		gbc_lblNewLabel_19.gridy = 2;
		panel_6.add(lblNewLabel_19, gbc_lblNewLabel_19);
		
		JComboBox comboBox_2_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2_2 = new GridBagConstraints();
		gbc_comboBox_2_2.gridwidth = 2;
		gbc_comboBox_2_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2_2.gridx = 3;
		gbc_comboBox_2_2.gridy = 2;
		panel_6.add(comboBox_2_2, gbc_comboBox_2_2);
		
		Component rigidArea_78 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_78 = new GridBagConstraints();
		gbc_rigidArea_78.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_78.gridx = 5;
		gbc_rigidArea_78.gridy = 2;
		panel_6.add(rigidArea_78, gbc_rigidArea_78);
		
		Component rigidArea_79 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_79 = new GridBagConstraints();
		gbc_rigidArea_79.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_79.gridx = 6;
		gbc_rigidArea_79.gridy = 2;
		panel_6.add(rigidArea_79, gbc_rigidArea_79);
		
		Component rigidArea_80 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_80 = new GridBagConstraints();
		gbc_rigidArea_80.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_80.gridx = 7;
		gbc_rigidArea_80.gridy = 2;
		panel_6.add(rigidArea_80, gbc_rigidArea_80);
		
		Component rigidArea_81 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_81 = new GridBagConstraints();
		gbc_rigidArea_81.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_81.gridx = 8;
		gbc_rigidArea_81.gridy = 2;
		panel_6.add(rigidArea_81, gbc_rigidArea_81);
		
		Component rigidArea_82 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_82 = new GridBagConstraints();
		gbc_rigidArea_82.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_82.gridx = 9;
		gbc_rigidArea_82.gridy = 2;
		panel_6.add(rigidArea_82, gbc_rigidArea_82);
		
		JButton filtrarButton = new JButton("Filtrar");
		GridBagConstraints gbc_filtrarButton = new GridBagConstraints();
		gbc_filtrarButton.insets = new Insets(0, 0, 5, 5);
		gbc_filtrarButton.gridx = 10;
		gbc_filtrarButton.gridy = 2;
		panel_6.add(filtrarButton, gbc_filtrarButton);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 2;
		gbc_lblNewLabel_20.gridy = 3;
		panel_6.add(lblNewLabel_20, gbc_lblNewLabel_20);
		
		JButton limparFiltrosButton = new JButton("Limpar");
		GridBagConstraints gbc_limparFiltrosButton = new GridBagConstraints();
		gbc_limparFiltrosButton.insets = new Insets(0, 0, 5, 5);
		gbc_limparFiltrosButton.gridx = 10;
		gbc_limparFiltrosButton.gridy = 4;
		panel_6.add(limparFiltrosButton, gbc_limparFiltrosButton);
		
		JLabel lblNewLabel_21 = new JLabel("Ordenar por:");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 2;
		gbc_lblNewLabel_21.gridy = 5;
		panel_6.add(lblNewLabel_21, gbc_lblNewLabel_21);
		
		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.gridwidth = 2;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 5;
		panel_6.add(comboBox_2, gbc_comboBox_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Apenas ativos");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNewCheckBox_1.gridx = 3;
		gbc_chckbxNewCheckBox_1.gridy = 6;
		panel_6.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		panel_1.setLayout(gl_panel_1);
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
		cadastrarClientePanel.setLayout(new MigLayout("", "[][49.00,trailing][49.00,trailing][111.00][111.00][][][][]", "[][][][][][][][][][][][][]"));
		
		JButton btnNewButton_12 = new JButton("<");
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 9));
		cadastrarClientePanel.add(btnNewButton_12, "cell 0 0");
		
		Component rigidArea_47 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_47, "cell 3 0 2 1");
		
		Component rigidArea_46 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_46, "cell 3 1 2 1");
		
		Component rigidArea_45 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_45, "cell 0 2");
		
		JLabel lblNewLabel_2 = new JLabel("Nome completo:");
		cadastrarClientePanel.add(lblNewLabel_2, "cell 1 2,alignx trailing");
		
		textField_8 = new JTextField();
		cadastrarClientePanel.add(textField_8, "cell 2 2 3 1,growx");
		textField_8.setColumns(10);
		
		Component rigidArea_44 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_44, "cell 5 2");
		
		Component rigidArea_40 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_40, "cell 6 2");
		
		Component rigidArea_50 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_50, "cell 7 2");
		
		Component rigidArea_51 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_51, "cell 8 2");
		
		JLabel lblNewLabel_10 = new JLabel("CPF:");
		cadastrarClientePanel.add(lblNewLabel_10, "cell 1 3,alignx trailing");
		
		textField_9 = new JTextField();
		cadastrarClientePanel.add(textField_9, "cell 2 3 3 1,growx");
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Telefone:");
		cadastrarClientePanel.add(lblNewLabel_11, "cell 1 4,alignx trailing");
		
		textField_10 = new JTextField();
		cadastrarClientePanel.add(textField_10, "cell 2 4 3 1,growx");
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("CNH:");
		cadastrarClientePanel.add(lblNewLabel_12, "cell 1 5,alignx trailing");
		
		textField_11 = new JTextField();
		cadastrarClientePanel.add(textField_11, "cell 2 5 3 1,growx");
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Data nascimento:");
		cadastrarClientePanel.add(lblNewLabel_13, "cell 1 6,alignx trailing");
		
		textField_12 = new JTextField();
		cadastrarClientePanel.add(textField_12, "cell 2 6 3 1,growx");
		textField_12.setColumns(10);
		
		Component rigidArea_48 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_48, "cell 3 7 2 1");
		
		Component rigidArea_49 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_49, "cell 3 8 2 1");
		
		JButton btnNewButton_10 = new JButton("Cadastrar e Prosseguir");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cadastrarClientePanel.add(btnNewButton_10, "cell 1 9 2 1");
		
		Component rigidArea_56 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_56, "flowx,cell 3 9 2 1");
		
		Component rigidArea_55 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_55, "cell 3 9 2 1,alignx right");
		
		JButton btnNewButton_11 = new JButton("Limpar");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cadastrarClientePanel.add(btnNewButton_11, "cell 3 9 2 1,alignx right");
		
		Component rigidArea_57 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_57, "cell 2 10");
		
		Component rigidArea_58 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_58, "cell 2 11");
		
		Component rigidArea_59 = Box.createRigidArea(new Dimension(20, 20));
		cadastrarClientePanel.add(rigidArea_59, "cell 2 12");
		
		alternarTela(btnNewButton_10 ,alocarLayeredPane, cadastrarAluguelPanel);
		
		JButton LimparContratoButton = new JButton("Limpar");
		cadastrarAluguelPanel.add(LimparContratoButton, "cell 5 9");
		
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
