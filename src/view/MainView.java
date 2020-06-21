package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CadastroController;
import controller.LoginController;
import metodosGerais.*;
import model.CargoModel;
import model.ContaModel;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import java.awt.Font;

public class MainView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8249069283384768352L;
	public JPanel contentPane;
	private JTextField nomeCompletoTextField;
	private JTextField telefoneTextField;
	private JTextField cpfTextField;
	private JTextField loginTextField;
	private JPasswordField passwordTextField;
	private JButton botaoCadastrarFuncionario;
	private JComboBox<CargoModel> comboBoxFuncionarios;
	private JTextField dataNascimentoTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.pack();
					frame.setLocationRelativeTo(null);
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
		setTitle("LoCar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 675, 470);
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
		gbl_loginPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_loginPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_loginPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_loginPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		loginPanel.setLayout(gbl_loginPanel);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_5.gridx = 10;
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
		gbc_rigidArea_7.gridx = 10;
		gbc_rigidArea_7.gridy = 1;
		loginPanel.add(rigidArea_7, gbc_rigidArea_7);

		Component rigidArea_40 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_40 = new GridBagConstraints();
		gbc_rigidArea_40.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_40.gridx = 10;
		gbc_rigidArea_40.gridy = 2;
		loginPanel.add(rigidArea_40, gbc_rigidArea_40);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_10 = new GridBagConstraints();
		gbc_rigidArea_10.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_10.gridx = 10;
		gbc_rigidArea_10.gridy = 3;
		loginPanel.add(rigidArea_10, gbc_rigidArea_10);

		Component rigidArea_45 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_45 = new GridBagConstraints();
		gbc_rigidArea_45.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_45.gridx = 10;
		gbc_rigidArea_45.gridy = 4;
		loginPanel.add(rigidArea_45, gbc_rigidArea_45);

		Component rigidArea_46 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_46 = new GridBagConstraints();
		gbc_rigidArea_46.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_46.gridx = 9;
		gbc_rigidArea_46.gridy = 5;
		loginPanel.add(rigidArea_46, gbc_rigidArea_46);

		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.gridheight = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 8;
		gbc_panel.gridy = 6;
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

		loginTextField = new JTextField();
		loginTextField.setDocument(new LimiteTextField(50));
		GridBagConstraints gbc_loginTextField = new GridBagConstraints();
		gbc_loginTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_loginTextField.insets = new Insets(0, 0, 5, 5);
		gbc_loginTextField.gridx = 2;
		gbc_loginTextField.gridy = 1;
		panel.add(loginTextField, gbc_loginTextField);
		loginTextField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Senha:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		passwordTextField = new JPasswordField();
		passwordTextField.setDocument(new LimiteTextField(8));
		GridBagConstraints gbc_passwordTextField = new GridBagConstraints();
		gbc_passwordTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordTextField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordTextField.gridx = 2;
		gbc_passwordTextField.gridy = 2;
		panel.add(passwordTextField, gbc_passwordTextField);

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
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_loginButton = new GridBagConstraints();
		gbc_loginButton.anchor = GridBagConstraints.EAST;
		gbc_loginButton.gridwidth = 2;
		gbc_loginButton.insets = new Insets(0, 0, 5, 5);
		gbc_loginButton.gridx = 0;
		gbc_loginButton.gridy = 4;
		panel.add(loginButton, gbc_loginButton);

		JButton botaoCadastrar1 = new JButton("Cadastrar");
		botaoCadastrar1.setFont(new Font("Tahoma", Font.PLAIN, 10));
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
		gbc_rigidArea_42.gridx = 11;
		gbc_rigidArea_42.gridy = 6;
		loginPanel.add(rigidArea_42, gbc_rigidArea_42);

		Component rigidArea_41 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_41 = new GridBagConstraints();
		gbc_rigidArea_41.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_41.gridx = 12;
		gbc_rigidArea_41.gridy = 6;
		loginPanel.add(rigidArea_41, gbc_rigidArea_41);

		Component rigidArea_21 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_21 = new GridBagConstraints();
		gbc_rigidArea_21.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_21.gridx = 13;
		gbc_rigidArea_21.gridy = 6;
		loginPanel.add(rigidArea_21, gbc_rigidArea_21);

		Component rigidArea_20 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_20 = new GridBagConstraints();
		gbc_rigidArea_20.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_20.gridx = 14;
		gbc_rigidArea_20.gridy = 6;
		loginPanel.add(rigidArea_20, gbc_rigidArea_20);

		Component rigidArea_22 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_22 = new GridBagConstraints();
		gbc_rigidArea_22.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_22.gridx = 15;
		gbc_rigidArea_22.gridy = 6;
		loginPanel.add(rigidArea_22, gbc_rigidArea_22);

		Component rigidArea_23 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_23 = new GridBagConstraints();
		gbc_rigidArea_23.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_23.gridx = 16;
		gbc_rigidArea_23.gridy = 6;
		loginPanel.add(rigidArea_23, gbc_rigidArea_23);

		Component rigidArea_24 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_24 = new GridBagConstraints();
		gbc_rigidArea_24.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_24.gridx = 17;
		gbc_rigidArea_24.gridy = 6;
		loginPanel.add(rigidArea_24, gbc_rigidArea_24);

		Component rigidArea_25 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_25 = new GridBagConstraints();
		gbc_rigidArea_25.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_25.gridx = 18;
		gbc_rigidArea_25.gridy = 6;
		loginPanel.add(rigidArea_25, gbc_rigidArea_25);

		JPanel CadastroPanel = new JPanel();
		CadastroPanel.setBackground(Color.WHITE);
		layeredPane.add(CadastroPanel, "name_131966069903300");
		GridBagLayout gbl_CadastroPanel = new GridBagLayout();
		gbl_CadastroPanel.columnWidths = new int[] { 38, 0, 0, 0, 0, 27, 92, 134, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_CadastroPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 20, 20, 0, 0, 0, 0, 36, 22, 0, 0, 0, 0, 0 };
		gbl_CadastroPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_CadastroPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		CadastroPanel.setLayout(gbl_CadastroPanel);

		Component rigidArea_18 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_18 = new GridBagConstraints();
		gbc_rigidArea_18.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_18.gridx = 7;
		gbc_rigidArea_18.gridy = 0;
		CadastroPanel.add(rigidArea_18, gbc_rigidArea_18);

		JButton botaoVoltar = new JButton("<");
		GridBagConstraints gbc_botaoVoltar = new GridBagConstraints();
		gbc_botaoVoltar.anchor = GridBagConstraints.EAST;
		gbc_botaoVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_botaoVoltar.gridx = 1;
		gbc_botaoVoltar.gridy = 1;
		CadastroPanel.add(botaoVoltar, gbc_botaoVoltar);

		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(loginPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});

		Component rigidArea_15 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_15 = new GridBagConstraints();
		gbc_rigidArea_15.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_15.gridx = 7;
		gbc_rigidArea_15.gridy = 1;
		CadastroPanel.add(rigidArea_15, gbc_rigidArea_15);

		Component rigidArea_14 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_14 = new GridBagConstraints();
		gbc_rigidArea_14.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_14.gridx = 7;
		gbc_rigidArea_14.gridy = 2;
		CadastroPanel.add(rigidArea_14, gbc_rigidArea_14);

		Component rigidArea_16 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_16 = new GridBagConstraints();
		gbc_rigidArea_16.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_16.gridx = 7;
		gbc_rigidArea_16.gridy = 3;
		CadastroPanel.add(rigidArea_16, gbc_rigidArea_16);

		Component rigidArea_49 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_49 = new GridBagConstraints();
		gbc_rigidArea_49.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_49.gridx = 7;
		gbc_rigidArea_49.gridy = 4;
		CadastroPanel.add(rigidArea_49, gbc_rigidArea_49);

		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_11 = new GridBagConstraints();
		gbc_rigidArea_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_rigidArea_11.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_11.gridx = 0;
		gbc_rigidArea_11.gridy = 5;
		CadastroPanel.add(rigidArea_11, gbc_rigidArea_11);

		Component rigidArea_47 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_47 = new GridBagConstraints();
		gbc_rigidArea_47.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_47.gridx = 2;
		gbc_rigidArea_47.gridy = 5;
		CadastroPanel.add(rigidArea_47, gbc_rigidArea_47);

		Component rigidArea_13 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_13 = new GridBagConstraints();
		gbc_rigidArea_13.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_13.gridx = 3;
		gbc_rigidArea_13.gridy = 5;
		CadastroPanel.add(rigidArea_13, gbc_rigidArea_13);

		Component rigidArea_48 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_48 = new GridBagConstraints();
		gbc_rigidArea_48.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_48.gridx = 4;
		gbc_rigidArea_48.gridy = 5;
		CadastroPanel.add(rigidArea_48, gbc_rigidArea_48);

		Component rigidArea_17 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_17 = new GridBagConstraints();
		gbc_rigidArea_17.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_17.gridx = 5;
		gbc_rigidArea_17.gridy = 5;
		CadastroPanel.add(rigidArea_17, gbc_rigidArea_17);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 8;
		gbc_panel_1.gridwidth = 4;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 6;
		gbc_panel_1.gridy = 5;
		CadastroPanel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 37, 64, 60, 104, 25, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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
		nomeCompletoTextField.setDocument(new LimiteTextField(50));
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

		cpfTextField = new CpfTextField();
		GridBagConstraints gbc_cpfTextField = new GridBagConstraints();
		gbc_cpfTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_cpfTextField.gridwidth = 2;
		gbc_cpfTextField.insets = new Insets(0, 0, 5, 5);
		gbc_cpfTextField.gridx = 2;
		gbc_cpfTextField.gridy = 2;
		panel_1.add(cpfTextField, gbc_cpfTextField);

		cpfTextField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.gridwidth = 2;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);

		telefoneTextField = new TelefoneTextField();
		GridBagConstraints gbc_telefoneTextField = new GridBagConstraints();
		gbc_telefoneTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_telefoneTextField.gridwidth = 2;
		gbc_telefoneTextField.insets = new Insets(0, 0, 5, 5);
		gbc_telefoneTextField.gridx = 2;
		gbc_telefoneTextField.gridy = 3;
		panel_1.add(telefoneTextField, gbc_telefoneTextField);
		telefoneTextField.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Cargo:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.gridwidth = 2;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);

		comboBoxFuncionarios = CadastroController.preencherComboBox();
		GridBagConstraints gbc_comboBoxFuncionarios = new GridBagConstraints();
		gbc_comboBoxFuncionarios.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxFuncionarios.gridwidth = 2;
		gbc_comboBoxFuncionarios.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxFuncionarios.gridx = 2;
		gbc_comboBoxFuncionarios.gridy = 4;
		panel_1.add(comboBoxFuncionarios, gbc_comboBoxFuncionarios);

		JLabel lblNewLabel_2 = new JLabel("Data nascimento:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 5;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

		dataNascimentoTextField = new DataTextField();

		GridBagConstraints gbc_dataNascimentoTextField = new GridBagConstraints();
		gbc_dataNascimentoTextField.gridwidth = 2;
		gbc_dataNascimentoTextField.insets = new Insets(0, 0, 5, 5);
		gbc_dataNascimentoTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_dataNascimentoTextField.gridx = 2;
		gbc_dataNascimentoTextField.gridy = 5;
		panel_1.add(dataNascimentoTextField, gbc_dataNascimentoTextField);
		dataNascimentoTextField.setColumns(10);

		Component rigidArea_33 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_33 = new GridBagConstraints();
		gbc_rigidArea_33.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_33.gridx = 2;
		gbc_rigidArea_33.gridy = 6;
		panel_1.add(rigidArea_33, gbc_rigidArea_33);

		botaoCadastrarFuncionario = new JButton("Cadastrar");
		GridBagConstraints gbc_botaoCadastrarFuncionario = new GridBagConstraints();
		gbc_botaoCadastrarFuncionario.insets = new Insets(0, 0, 5, 5);
		gbc_botaoCadastrarFuncionario.gridwidth = 2;
		gbc_botaoCadastrarFuncionario.gridx = 1;
		gbc_botaoCadastrarFuncionario.gridy = 7;
		panel_1.add(botaoCadastrarFuncionario, gbc_botaoCadastrarFuncionario);

		botaoCadastrarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarFuncionario();
			}
		});

		JButton botaoLimpar = new JButton("Limpar");
		GridBagConstraints gbc_botaoLimpar = new GridBagConstraints();
		gbc_botaoLimpar.insets = new Insets(0, 0, 5, 5);
		gbc_botaoLimpar.gridx = 3;
		gbc_botaoLimpar.gridy = 7;
		panel_1.add(botaoLimpar, gbc_botaoLimpar);

		botaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});

		Component rigidArea_50 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_50 = new GridBagConstraints();
		gbc_rigidArea_50.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_50.gridx = 2;
		gbc_rigidArea_50.gridy = 8;
		panel_1.add(rigidArea_50, gbc_rigidArea_50);

		Component rigidArea_27 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_27 = new GridBagConstraints();
		gbc_rigidArea_27.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_27.gridx = 10;
		gbc_rigidArea_27.gridy = 5;
		CadastroPanel.add(rigidArea_27, gbc_rigidArea_27);

		Component rigidArea_28 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_28 = new GridBagConstraints();
		gbc_rigidArea_28.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_28.gridx = 11;
		gbc_rigidArea_28.gridy = 5;
		CadastroPanel.add(rigidArea_28, gbc_rigidArea_28);

		Component rigidArea_29 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_29 = new GridBagConstraints();
		gbc_rigidArea_29.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_29.gridx = 12;
		gbc_rigidArea_29.gridy = 5;
		CadastroPanel.add(rigidArea_29, gbc_rigidArea_29);

		Component rigidArea_30 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_30 = new GridBagConstraints();
		gbc_rigidArea_30.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_30.gridx = 13;
		gbc_rigidArea_30.gridy = 5;
		CadastroPanel.add(rigidArea_30, gbc_rigidArea_30);

		Component rigidArea_31 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_31 = new GridBagConstraints();
		gbc_rigidArea_31.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_31.gridx = 14;
		gbc_rigidArea_31.gridy = 5;
		CadastroPanel.add(rigidArea_31, gbc_rigidArea_31);

		Component rigidArea_39 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_39 = new GridBagConstraints();
		gbc_rigidArea_39.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_39.gridx = 5;
		gbc_rigidArea_39.gridy = 12;
		CadastroPanel.add(rigidArea_39, gbc_rigidArea_39);

		Component rigidArea_32 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_32 = new GridBagConstraints();
		gbc_rigidArea_32.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_32.gridx = 7;
		gbc_rigidArea_32.gridy = 13;
		CadastroPanel.add(rigidArea_32, gbc_rigidArea_32);

		Component rigidArea_36 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_36 = new GridBagConstraints();
		gbc_rigidArea_36.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_36.gridx = 7;
		gbc_rigidArea_36.gridy = 14;
		CadastroPanel.add(rigidArea_36, gbc_rigidArea_36);

		Component rigidArea_37 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_37 = new GridBagConstraints();
		gbc_rigidArea_37.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_37.gridx = 7;
		gbc_rigidArea_37.gridy = 15;
		CadastroPanel.add(rigidArea_37, gbc_rigidArea_37);

		Component rigidArea_38 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_38 = new GridBagConstraints();
		gbc_rigidArea_38.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea_38.gridx = 7;
		gbc_rigidArea_38.gridy = 16;
		CadastroPanel.add(rigidArea_38, gbc_rigidArea_38);

		botaoCadastrar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorios.gerarRelatorio();
				layeredPane.removeAll();
				layeredPane.add(CadastroPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});

		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (autenticarLogin()) {
					layeredPane.removeAll();
					layeredPane.add(new MenuTelaInicial());
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
	}

	private void cadastrarFuncionario() {
		if (validarCadastro()) {
			ContaModel model = new ContaModel();
			model.setNomeCompleto(nomeCompletoTextField.getText());
			model.setCpf(cpfTextField.getText());
			model.setTelefoneContato(telefoneTextField.getText());
			CargoModel cargo = (CargoModel) comboBoxFuncionarios.getSelectedItem();
			model.setIdCargo(cargo.getIdCargo());

			try {
				model.setDataNascimento(MetodosGerais.transformarEmDate(dataNascimentoTextField.getText()));
			} catch (Exception e) {
				model.setDataNascimento(null);
				e.printStackTrace();
			}
			CadastroController.cadastrarFuncionario(model);
			limparCampos();
		}
	}

	private Boolean validarCadastro() {
		Boolean valido = true;
		if (MetodosGerais.StringIsNullOrWhiteSpace(nomeCompletoTextField.getText())
				|| !MetodosGerais.validarNome(nomeCompletoTextField.getText())) {
			JOptionPane.showMessageDialog(null, "Nome deve ser composto de nome e sobrenome.");
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(cpfTextField.getText())) {
			JOptionPane.showMessageDialog(null, "CPF precisa estar preenchido.");
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(telefoneTextField.getText())) {
			JOptionPane.showMessageDialog(null, "Telefone precisa estar preenchido.");
			valido = false;
		} else if (comboBoxFuncionarios.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Cargo precisa estar selecionado.");
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(dataNascimentoTextField.getText())
				|| !MetodosGerais.validarData(dataNascimentoTextField.getText())) {
			JOptionPane.showMessageDialog(null, "A data de nascimento deve ser uma data valida.");
			valido = false;
		}
		return valido;
	}

	private Boolean autenticarLogin() {
		if (validarLogin()) {
			if (loginTextField.getText().equals("admin")
					&& String.valueOf(passwordTextField.getPassword()).equals("admin")) {
				return true;
			} else {
				ContaModel model = new ContaModel(loginTextField.getText(),
						String.valueOf(passwordTextField.getPassword()));
				return LoginController.logar(model);
			}
		}
		return false;
	}

	private Boolean validarLogin() {
		Boolean valido = true;
		if (MetodosGerais.StringIsNullOrWhiteSpace(loginTextField.getText())) {
			valido = false;
		} else if (MetodosGerais.StringIsNullOrWhiteSpace(String.valueOf(passwordTextField.getPassword()))) {
			valido = false;
		}
		return valido;
	}

	private void limparCampos() {
		nomeCompletoTextField.setText("");
		telefoneTextField.setText("");
		cpfTextField.setText("");
		comboBoxFuncionarios.setSelectedIndex(0);
		dataNascimentoTextField.setText("");
	}
}
