package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import java.awt.Window.Type;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField nomeCompletoTextField;
	private JTextField cpfTextField;
	private JTextField telefoneTextField;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.WHITE);
		loginPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane.add(loginPanel, "name_131966053068800");
		GridBagLayout gbl_loginPanel = new GridBagLayout();
		gbl_loginPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_loginPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_loginPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_loginPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		loginPanel.setLayout(gbl_loginPanel);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_5.gridx = 9;
		gbc_rigidArea_5.gridy = 0;
		loginPanel.add(rigidArea_5, gbc_rigidArea_5);

		Component rigidArea_9 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_9 = new GridBagConstraints();
		gbc_rigidArea_9.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_9.gridx = 0;
		gbc_rigidArea_9.gridy = 1;
		loginPanel.add(rigidArea_9, gbc_rigidArea_9);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_2.gridx = 1;
		gbc_rigidArea_2.gridy = 1;
		loginPanel.add(rigidArea_2, gbc_rigidArea_2);

		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_8 = new GridBagConstraints();
		gbc_rigidArea_8.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_8.gridx = 2;
		gbc_rigidArea_8.gridy = 1;
		loginPanel.add(rigidArea_8, gbc_rigidArea_8);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 3;
		gbc_rigidArea_3.gridy = 1;
		loginPanel.add(rigidArea_3, gbc_rigidArea_3);

		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_6 = new GridBagConstraints();
		gbc_rigidArea_6.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_6.gridx = 4;
		gbc_rigidArea_6.gridy = 1;
		loginPanel.add(rigidArea_6, gbc_rigidArea_6);
		
		Component rigidArea_43 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_43 = new GridBagConstraints();
		gbc_rigidArea_43.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_43.gridx = 5;
		gbc_rigidArea_43.gridy = 1;
		loginPanel.add(rigidArea_43, gbc_rigidArea_43);
		
		Component rigidArea_44 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_44 = new GridBagConstraints();
		gbc_rigidArea_44.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_44.gridx = 6;
		gbc_rigidArea_44.gridy = 1;
		loginPanel.add(rigidArea_44, gbc_rigidArea_44);

		Component rigidArea_19 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_19 = new GridBagConstraints();
		gbc_rigidArea_19.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_19.gridx = 7;
		gbc_rigidArea_19.gridy = 1;
		loginPanel.add(rigidArea_19, gbc_rigidArea_19);

		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_7 = new GridBagConstraints();
		gbc_rigidArea_7.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_7.gridx = 9;
		gbc_rigidArea_7.gridy = 1;
		loginPanel.add(rigidArea_7, gbc_rigidArea_7);
		
		Component rigidArea_40 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_40 = new GridBagConstraints();
		gbc_rigidArea_40.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_40.gridx = 9;
		gbc_rigidArea_40.gridy = 2;
		loginPanel.add(rigidArea_40, gbc_rigidArea_40);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_10 = new GridBagConstraints();
		gbc_rigidArea_10.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_10.gridx = 9;
		gbc_rigidArea_10.gridy = 3;
		loginPanel.add(rigidArea_10, gbc_rigidArea_10);

		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.gridheight = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 8;
		gbc_panel.gridy = 4;
		loginPanel.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 54, -45, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.anchor = GridBagConstraints.WEST;
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 2;
		gbc_rigidArea.gridy = 0;
		panel.add(rigidArea, gbc_rigidArea);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 1;
		panel.add(rigidArea_4, gbc_rigidArea_4);

		JLabel lblNewLabel = new JLabel("Usuario:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Senha:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 2;
		panel.add(passwordField, gbc_passwordField);

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.anchor = GridBagConstraints.WEST;
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_1.gridx = 2;
		gbc_rigidArea_1.gridy = 3;
		panel.add(rigidArea_1, gbc_rigidArea_1);
		
		Component rigidArea_34 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_34 = new GridBagConstraints();
		gbc_rigidArea_34.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_34.gridx = 3;
		gbc_rigidArea_34.gridy = 3;
		panel.add(rigidArea_34, gbc_rigidArea_34);

		JButton loginButton = new JButton("Login");
		GridBagConstraints gbc_loginButton = new GridBagConstraints();
		gbc_loginButton.anchor = GridBagConstraints.EAST;
		gbc_loginButton.gridwidth = 2;
		gbc_loginButton.insets = new Insets(0, 0, 5, 5);
		gbc_loginButton.gridx = 0;
		gbc_loginButton.gridy = 4;
		panel.add(loginButton, gbc_loginButton);

		JButton botaoCadastrar1 = new JButton("Cadastrar");
		GridBagConstraints gbc_botaoCadastrar1 = new GridBagConstraints();
		gbc_botaoCadastrar1.insets = new Insets(0, 0, 5, 5);
		gbc_botaoCadastrar1.gridx = 2;
		gbc_botaoCadastrar1.gridy = 4;
		panel.add(botaoCadastrar1, gbc_botaoCadastrar1);

		Component rigidArea_26 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_26 = new GridBagConstraints();
		gbc_rigidArea_26.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_26.gridx = 2;
		gbc_rigidArea_26.gridy = 5;
		panel.add(rigidArea_26, gbc_rigidArea_26);
		
		Component rigidArea_42 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_42 = new GridBagConstraints();
		gbc_rigidArea_42.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_42.gridx = 10;
		gbc_rigidArea_42.gridy = 4;
		loginPanel.add(rigidArea_42, gbc_rigidArea_42);
		
		Component rigidArea_41 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_41 = new GridBagConstraints();
		gbc_rigidArea_41.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_41.gridx = 11;
		gbc_rigidArea_41.gridy = 4;
		loginPanel.add(rigidArea_41, gbc_rigidArea_41);

		Component rigidArea_21 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_21 = new GridBagConstraints();
		gbc_rigidArea_21.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_21.gridx = 12;
		gbc_rigidArea_21.gridy = 4;
		loginPanel.add(rigidArea_21, gbc_rigidArea_21);

		Component rigidArea_20 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_20 = new GridBagConstraints();
		gbc_rigidArea_20.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_20.gridx = 13;
		gbc_rigidArea_20.gridy = 4;
		loginPanel.add(rigidArea_20, gbc_rigidArea_20);

		Component rigidArea_22 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_22 = new GridBagConstraints();
		gbc_rigidArea_22.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_22.gridx = 14;
		gbc_rigidArea_22.gridy = 4;
		loginPanel.add(rigidArea_22, gbc_rigidArea_22);

		Component rigidArea_23 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_23 = new GridBagConstraints();
		gbc_rigidArea_23.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_23.gridx = 15;
		gbc_rigidArea_23.gridy = 4;
		loginPanel.add(rigidArea_23, gbc_rigidArea_23);

		Component rigidArea_24 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_24 = new GridBagConstraints();
		gbc_rigidArea_24.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_24.gridx = 16;
		gbc_rigidArea_24.gridy = 4;
		loginPanel.add(rigidArea_24, gbc_rigidArea_24);

		Component rigidArea_25 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_25 = new GridBagConstraints();
		gbc_rigidArea_25.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_25.gridx = 17;
		gbc_rigidArea_25.gridy = 4;
		loginPanel.add(rigidArea_25, gbc_rigidArea_25);

		JPanel CadastroPanel = new JPanel();
		CadastroPanel.setBackground(Color.WHITE);
		layeredPane.add(CadastroPanel, "name_131966069903300");
		GridBagLayout gbl_CadastroPanel = new GridBagLayout();
		gbl_CadastroPanel.columnWidths = new int[] { 56, 0, 0, 27, 92, 134, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_CadastroPanel.rowHeights = new int[] { 0, 0, 0, 0, 20, 20, 20, 22, 0, 0, 0, 0, 0 };
		gbl_CadastroPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		gbl_CadastroPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		CadastroPanel.setLayout(gbl_CadastroPanel);

		JButton botaoVoltar = new JButton("<");
		GridBagConstraints gbc_botaoVoltar = new GridBagConstraints();
		gbc_botaoVoltar.anchor = GridBagConstraints.EAST;
		gbc_botaoVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_botaoVoltar.gridx = 0;
		gbc_botaoVoltar.gridy = 0;
		CadastroPanel.add(botaoVoltar, gbc_botaoVoltar);

		Component rigidArea_18 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_18 = new GridBagConstraints();
		gbc_rigidArea_18.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_18.gridx = 5;
		gbc_rigidArea_18.gridy = 0;
		CadastroPanel.add(rigidArea_18, gbc_rigidArea_18);

		Component rigidArea_15 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_15 = new GridBagConstraints();
		gbc_rigidArea_15.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_15.gridx = 5;
		gbc_rigidArea_15.gridy = 1;
		CadastroPanel.add(rigidArea_15, gbc_rigidArea_15);
		
				Component rigidArea_14 = Box.createRigidArea(new Dimension(20, 20));
				GridBagConstraints gbc_rigidArea_14 = new GridBagConstraints();
				gbc_rigidArea_14.insets = new Insets(0, 0, 5, 5);
				gbc_rigidArea_14.gridx = 5;
				gbc_rigidArea_14.gridy = 2;
				CadastroPanel.add(rigidArea_14, gbc_rigidArea_14);

		Component rigidArea_16 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_16 = new GridBagConstraints();
		gbc_rigidArea_16.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_16.gridx = 5;
		gbc_rigidArea_16.gridy = 3;
		CadastroPanel.add(rigidArea_16, gbc_rigidArea_16);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 4;
		gbc_panel_1.gridheight = 3;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 4;
		gbc_panel_1.gridy = 4;
		CadastroPanel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 37, 64, 60, 104, 25, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);
		
		Component rigidArea_35 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_35 = new GridBagConstraints();
		gbc_rigidArea_35.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_35.gridx = 3;
		gbc_rigidArea_35.gridy = 0;
		panel_1.add(rigidArea_35, gbc_rigidArea_35);

		JLabel nomeCompletoLabel = new JLabel("Nome completo:");
		GridBagConstraints gbc_nomeCompletoLabel = new GridBagConstraints();
		gbc_nomeCompletoLabel.anchor = GridBagConstraints.EAST;
		gbc_nomeCompletoLabel.gridwidth = 2;
		gbc_nomeCompletoLabel.insets = new Insets(0, 0, 5, 5);
		gbc_nomeCompletoLabel.gridx = 0;
		gbc_nomeCompletoLabel.gridy = 1;
		panel_1.add(nomeCompletoLabel, gbc_nomeCompletoLabel);

		nomeCompletoTextField = new JTextField();
		GridBagConstraints gbc_nomeCompletoTextField = new GridBagConstraints();
		gbc_nomeCompletoTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nomeCompletoTextField.gridwidth = 2;
		gbc_nomeCompletoTextField.insets = new Insets(0, 0, 5, 5);
		gbc_nomeCompletoTextField.gridx = 2;
		gbc_nomeCompletoTextField.gridy = 1;
		panel_1.add(nomeCompletoTextField, gbc_nomeCompletoTextField);
		nomeCompletoTextField.setColumns(10);
		
		Component rigidArea_12 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_12 = new GridBagConstraints();
		gbc_rigidArea_12.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_12.gridx = 4;
		gbc_rigidArea_12.gridy = 1;
		panel_1.add(rigidArea_12, gbc_rigidArea_12);

		JLabel lblNewLabel_3 = new JLabel("CPF:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.gridwidth = 2;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);

		telefoneTextField = new JTextField();
		GridBagConstraints gbc_telefoneTextField = new GridBagConstraints();
		gbc_telefoneTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_telefoneTextField.gridwidth = 2;
		gbc_telefoneTextField.insets = new Insets(0, 0, 5, 5);
		gbc_telefoneTextField.gridx = 2;
		gbc_telefoneTextField.gridy = 2;
		panel_1.add(telefoneTextField, gbc_telefoneTextField);
		telefoneTextField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.gridwidth = 2;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);

		cpfTextField = new JTextField();
		GridBagConstraints gbc_cpfTextField = new GridBagConstraints();
		gbc_cpfTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_cpfTextField.gridwidth = 2;
		gbc_cpfTextField.insets = new Insets(0, 0, 5, 5);
		gbc_cpfTextField.gridx = 2;
		gbc_cpfTextField.gridy = 3;
		panel_1.add(cpfTextField, gbc_cpfTextField);
		cpfTextField.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Cargo:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.gridwidth = 2;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);

		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 4;
		panel_1.add(comboBox, gbc_comboBox);
		
		Component rigidArea_33 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_33 = new GridBagConstraints();
		gbc_rigidArea_33.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_33.gridx = 2;
		gbc_rigidArea_33.gridy = 5;
		panel_1.add(rigidArea_33, gbc_rigidArea_33);

		JButton botaoCadastrar = new JButton("Cadastrar");
		GridBagConstraints gbc_botaoCadastrar = new GridBagConstraints();
		gbc_botaoCadastrar.insets = new Insets(0, 0, 0, 5);
		gbc_botaoCadastrar.gridwidth = 2;
		gbc_botaoCadastrar.gridx = 1;
		gbc_botaoCadastrar.gridy = 6;
		panel_1.add(botaoCadastrar, gbc_botaoCadastrar);

		JButton botaoLimpar = new JButton("Limpar");
		GridBagConstraints gbc_botaoLimpar = new GridBagConstraints();
		gbc_botaoLimpar.insets = new Insets(0, 0, 0, 5);
		gbc_botaoLimpar.gridx = 3;
		gbc_botaoLimpar.gridy = 6;
		panel_1.add(botaoLimpar, gbc_botaoLimpar);

		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_11 = new GridBagConstraints();
		gbc_rigidArea_11.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_11.gridx = 1;
		gbc_rigidArea_11.gridy = 5;
		CadastroPanel.add(rigidArea_11, gbc_rigidArea_11);

		Component rigidArea_13 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_13 = new GridBagConstraints();
		gbc_rigidArea_13.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_13.gridx = 2;
		gbc_rigidArea_13.gridy = 5;
		CadastroPanel.add(rigidArea_13, gbc_rigidArea_13);

		Component rigidArea_17 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_17 = new GridBagConstraints();
		gbc_rigidArea_17.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_17.gridx = 3;
		gbc_rigidArea_17.gridy = 5;
		CadastroPanel.add(rigidArea_17, gbc_rigidArea_17);

		Component rigidArea_27 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_27 = new GridBagConstraints();
		gbc_rigidArea_27.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_27.gridx = 8;
		gbc_rigidArea_27.gridy = 5;
		CadastroPanel.add(rigidArea_27, gbc_rigidArea_27);

		Component rigidArea_28 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_28 = new GridBagConstraints();
		gbc_rigidArea_28.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_28.gridx = 9;
		gbc_rigidArea_28.gridy = 5;
		CadastroPanel.add(rigidArea_28, gbc_rigidArea_28);

		Component rigidArea_29 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_29 = new GridBagConstraints();
		gbc_rigidArea_29.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_29.gridx = 10;
		gbc_rigidArea_29.gridy = 5;
		CadastroPanel.add(rigidArea_29, gbc_rigidArea_29);

		Component rigidArea_30 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_30 = new GridBagConstraints();
		gbc_rigidArea_30.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_30.gridx = 11;
		gbc_rigidArea_30.gridy = 5;
		CadastroPanel.add(rigidArea_30, gbc_rigidArea_30);

		Component rigidArea_31 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_31 = new GridBagConstraints();
		gbc_rigidArea_31.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_31.gridx = 12;
		gbc_rigidArea_31.gridy = 5;
		CadastroPanel.add(rigidArea_31, gbc_rigidArea_31);
				
				Component rigidArea_39 = Box.createRigidArea(new Dimension(20, 20));
				GridBagConstraints gbc_rigidArea_39 = new GridBagConstraints();
				gbc_rigidArea_39.insets = new Insets(0, 0, 5, 5);
				gbc_rigidArea_39.gridx = 5;
				gbc_rigidArea_39.gridy = 7;
				CadastroPanel.add(rigidArea_39, gbc_rigidArea_39);
		
				Component rigidArea_32 = Box.createRigidArea(new Dimension(20, 20));
				GridBagConstraints gbc_rigidArea_32 = new GridBagConstraints();
				gbc_rigidArea_32.insets = new Insets(0, 0, 5, 5);
				gbc_rigidArea_32.gridx = 5;
				gbc_rigidArea_32.gridy = 8;
				CadastroPanel.add(rigidArea_32, gbc_rigidArea_32);
				
				Component rigidArea_36 = Box.createRigidArea(new Dimension(20, 20));
				GridBagConstraints gbc_rigidArea_36 = new GridBagConstraints();
				gbc_rigidArea_36.insets = new Insets(0, 0, 5, 5);
				gbc_rigidArea_36.gridx = 5;
				gbc_rigidArea_36.gridy = 9;
				CadastroPanel.add(rigidArea_36, gbc_rigidArea_36);
				
				Component rigidArea_37 = Box.createRigidArea(new Dimension(20, 20));
				GridBagConstraints gbc_rigidArea_37 = new GridBagConstraints();
				gbc_rigidArea_37.insets = new Insets(0, 0, 5, 5);
				gbc_rigidArea_37.gridx = 5;
				gbc_rigidArea_37.gridy = 10;
				CadastroPanel.add(rigidArea_37, gbc_rigidArea_37);
				
				Component rigidArea_38 = Box.createRigidArea(new Dimension(20, 20));
				GridBagConstraints gbc_rigidArea_38 = new GridBagConstraints();
				gbc_rigidArea_38.insets = new Insets(0, 0, 0, 5);
				gbc_rigidArea_38.gridx = 5;
				gbc_rigidArea_38.gridy = 11;
				CadastroPanel.add(rigidArea_38, gbc_rigidArea_38);

		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(loginPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});

		botaoCadastrar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(CadastroPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});

		botaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomeCompletoTextField.setText("");
				cpfTextField.setText("");
				telefoneTextField.setText("");
			}
		});
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(new MenuTelaInicial());
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
	}
	//TODO adicionar verificação para usuario e senha
}
