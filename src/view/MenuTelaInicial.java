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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MenuTelaInicial extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6331793467680155838L;
	private JButton sairBtn;

	/**
	 * Create the panel.
	 */
	public MenuTelaInicial() {
		setLayout(new GridLayout(1, 0, 0, 0));
		setBounds(150, 150, 675, 470);

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

		JPanel clientesPanel = new ClienteView();
		layeredPane.add(clientesPanel, "name_31198873394700");

		alternarTela(botaoVeiculos, layeredPane, veiculosPanel);
		alternarTela(botaoAlocacoes, layeredPane, alocacoesPanel);
		alternarTela(botaoAdministrativo, layeredPane, administracaoPanel);
		administracaoPanel.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		administracaoPanel.add(tabbedPane);
		alternarTela(botaoClientes, layeredPane, clientesPanel);

		// adm panel
		JPanel relatoriosPanel = new JPanel();
		JPanel funcionariosPanel = new JPanel();
		JPanel exportacaoPanel = new JPanel();
		tabbedPane.addTab("Relat�rios", relatoriosPanel);
		relatoriosPanel.setLayout(new BorderLayout(0, 0));
		tabbedPane.addTab("Quadro Geral", funcionariosPanel);
		funcionariosPanel.setLayout(new BorderLayout(0, 0));
		tabbedPane.addTab("Exporta��es", exportacaoPanel);
		exportacaoPanel.setLayout(new BorderLayout(0, 0));

		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(layeredPane);
				add(new MainView());
			}
		});
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