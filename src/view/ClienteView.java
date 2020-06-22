package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import controller.ClienteController;
import metodosGerais.CnhTextField;
import metodosGerais.CpfTextField;
import metodosGerais.DataTextField;
import metodosGerais.LimiteTextField;
import metodosGerais.MetodosGerais;
import metodosGerais.TelefoneTextField;
import model.ClienteModel;
import net.miginfocom.swing.MigLayout;
import javax.swing.UIManager;

public class ClienteView extends JPanel {

	private static final long serialVersionUID = 4838218364221746704L;
	private JTextField nomeCompletoTextField;
	private JTextField cpfTextField;
	private JTextField telefoneTextField;
	private JTextField cnhTextField;
	private JTextField dataNascimentoTextField;
	private JTable table;
	private JTextField nomeEdicaoTF;
	private JTextField cpfEdicaoTF;
	private JTextField telefoneEdicaoTF;
	private JTextField cnhEdicaoTF;
	private JTextField dataNascimentoEdicaoTF;

	public ClienteView() {
		setBounds(150, 150, 675, 470);
		setLayout(new GridLayout(0, 1, 0, 0));
		JPanel clientesPanel = new JPanel();
		add(clientesPanel);
		clientesPanel.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane clienteTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		clientesPanel.add(clienteTabbedPane);
		JPanel vizualizarEEditarClientesPanel = new JPanel();
		vizualizarEEditarClientesPanel.setBackground(Color.WHITE);
		JPanel cadastrarClientePanel = new JPanel();
		cadastrarClientePanel.setBackground(Color.WHITE);
		clienteTabbedPane.addTab("Cadastrar Cliente", cadastrarClientePanel);
		cadastrarClientePanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_6 = Box.createRigidArea(new Dimension(120, 462));
		cadastrarClientePanel.add(rigidArea_6, BorderLayout.WEST);

		Component rigidArea_9 = Box.createRigidArea(new Dimension(120, 462));
		cadastrarClientePanel.add(rigidArea_9, BorderLayout.EAST);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(670, 101));
		cadastrarClientePanel.add(rigidArea_10, BorderLayout.NORTH);

		Component rigidArea_11 = Box.createRigidArea(new Dimension(670, 110));
		cadastrarClientePanel.add(rigidArea_11, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		cadastrarClientePanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][]"));

		Component rigidArea_14 = Box.createRigidArea(new Dimension(20, 20));
		panel.add(rigidArea_14, "cell 1 0");

		JLabel lblNewLabel = new JLabel("Nome Cliente:");
		panel.add(lblNewLabel, "cell 0 1,alignx trailing");

		nomeCompletoTextField = new JTextField();
		panel.add(nomeCompletoTextField, "cell 1 1,growx");
		nomeCompletoTextField.setColumns(10);
		nomeCompletoTextField.setDocument(new LimiteTextField(50));

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		panel.add(lblNewLabel_1, "cell 0 2,alignx trailing");

		cpfTextField = new CpfTextField();
		panel.add(cpfTextField, "cell 1 2,growx");
		cpfTextField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		panel.add(lblNewLabel_2, "cell 0 3,alignx trailing");

		telefoneTextField = new JTextField();
		panel.add(telefoneTextField, "cell 1 3,growx");
		telefoneTextField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Cnh:");
		panel.add(lblNewLabel_3, "cell 0 4,alignx trailing");

		cnhTextField = new CnhTextField();
		panel.add(cnhTextField, "cell 1 4,growx");
		cnhTextField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento:");
		panel.add(lblNewLabel_4, "cell 0 5,alignx trailing");

		dataNascimentoTextField = new DataTextField();
		panel.add(dataNascimentoTextField, "cell 1 5,growx");
		dataNascimentoTextField.setColumns(10);

		Component rigidArea_15 = Box.createRigidArea(new Dimension(20, 20));
		panel.add(rigidArea_15, "cell 0 6");

		JButton cadastrarClienteBtn = new JButton("Cadastrar");
		cadastrarClienteBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(cadastrarClienteBtn, "cell 0 7");

		cadastrarClienteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarCliente();
				ClienteController.preencherTabela(table);
				limpar();
			}
		});

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnLimpar, "cell 1 7,alignx right");

		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		clienteTabbedPane.addTab("Vizualizar e Editar", vizualizarEEditarClientesPanel);
		vizualizarEEditarClientesPanel.setLayout(new BorderLayout(0, 0));

		Component rigidArea_12 = Box.createRigidArea(new Dimension(20, 20));
		vizualizarEEditarClientesPanel.add(rigidArea_12, BorderLayout.SOUTH);

		Component rigidArea_17 = Box.createRigidArea(new Dimension(20, 20));
		vizualizarEEditarClientesPanel.add(rigidArea_17, BorderLayout.NORTH);

		Component rigidArea_18 = Box.createRigidArea(new Dimension(20, 20));
		vizualizarEEditarClientesPanel.add(rigidArea_18, BorderLayout.WEST);

		Component rigidArea_19 = Box.createRigidArea(new Dimension(20, 20));
		vizualizarEEditarClientesPanel.add(rigidArea_19, BorderLayout.EAST);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		vizualizarEEditarClientesPanel.add(panel_1, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)));
		panel_3.setLayout(new BorderLayout(0, 0));

		Component rigidArea_20 = Box.createRigidArea(new Dimension(20, 20));
		panel_3.add(rigidArea_20, BorderLayout.WEST);

		Component rigidArea_21 = Box.createRigidArea(new Dimension(20, 20));
		panel_3.add(rigidArea_21, BorderLayout.EAST);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel_3.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new MigLayout("", "[][][][][][][][][][][][][]", "[][][][][]"));

		JLabel lblNewLabel_5 = new JLabel("Nome Cliente");
		panel_4.add(lblNewLabel_5, "cell 1 0,alignx trailing");

		nomeEdicaoTF = new JTextField();
		panel_4.add(nomeEdicaoTF, "cell 2 0,growx");
		nomeEdicaoTF.setColumns(10);
		nomeEdicaoTF.setDocument(new LimiteTextField(50));

		JLabel lblNewLabel_6 = new JLabel("CPF:");
		panel_4.add(lblNewLabel_6, "cell 1 1,alignx trailing");

		cpfEdicaoTF = new CpfTextField();
		panel_4.add(cpfEdicaoTF, "cell 2 1,growx");
		cpfEdicaoTF.setColumns(10);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		panel_4.add(rigidArea, "cell 3 1");

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		panel_4.add(rigidArea_1, "cell 4 1");

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		panel_4.add(rigidArea_2, "cell 5 1");

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		panel_4.add(rigidArea_3, "cell 6 1");

		JButton selecionarBtn = new JButton("Selecionar");
		selecionarBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_4.add(selecionarBtn, "cell 12 1");

		JLabel lblNewLabel_7 = new JLabel("Telefone:");
		panel_4.add(lblNewLabel_7, "cell 1 2,alignx trailing");

		telefoneEdicaoTF = new TelefoneTextField();
		panel_4.add(telefoneEdicaoTF, "cell 2 2,growx");
		telefoneEdicaoTF.setColumns(10);

		JButton atualizarBtn = new JButton("Atualizar");
		atualizarBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_4.add(atualizarBtn, "cell 12 2,alignx center");

		JLabel lblNewLabel_8 = new JLabel("CNH:");
		panel_4.add(lblNewLabel_8, "cell 1 3,alignx trailing");

		cnhEdicaoTF = new CnhTextField();
		panel_4.add(cnhEdicaoTF, "cell 2 3,growx");
		cnhEdicaoTF.setColumns(10);

		JButton removerBtn = new JButton("Remover");
		removerBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_4.add(removerBtn, "cell 12 3,alignx center");

		JLabel lblNewLabel_9 = new JLabel("Data Nascimento:");
		panel_4.add(lblNewLabel_9, "cell 1 4,alignx trailing");

		dataNascimentoEdicaoTF = new DataTextField();
		panel_4.add(dataNascimentoEdicaoTF, "cell 2 4,growx");
		dataNascimentoEdicaoTF.setColumns(10);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		panel_1.setLayout(gl_panel_1);

		selecionarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionar();
			}
		});

		atualizarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar();
			}
		});

		ClienteController.preencherTabela(table);
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

	public void cadastrarCliente() {
		ClienteModel model = new ClienteModel();

		if (validarCadastroCliente()) {
			model.setNomeCompleto(nomeCompletoTextField.getText());
			model.setCpf(cpfTextField.getText());
			model.setTelefone(telefoneTextField.getText());
			model.setCnh(cnhTextField.getText());
			model.setDataNascimento(MetodosGerais.transformarEmDate(dataNascimentoTextField.getText()));
			ClienteController.cadastrarCliente(model);
		}
	}

	public void selecionar() {
		if (table.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Por favor selecione uma linha.");
		} else {
			DefaultTableModel dtm = (DefaultTableModel) table.getModel();
			int linhaSelecionada = table.getSelectedRow();

			nomeEdicaoTF.setText(dtm.getValueAt(linhaSelecionada, 1).toString());
			cpfEdicaoTF.setText(dtm.getValueAt(linhaSelecionada, 2).toString());
			telefoneEdicaoTF.setText(dtm.getValueAt(linhaSelecionada, 3).toString());
			cnhEdicaoTF.setText(dtm.getValueAt(linhaSelecionada, 4).toString());
			dataNascimentoEdicaoTF.setText(dtm.getValueAt(linhaSelecionada, 5).toString());
			System.out.println(telefoneEdicaoTF.getText());
			System.out.println(dtm.getValueAt(linhaSelecionada, 3).toString());
		}
	}

	public void atualizar() {
		if (table.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Por favor selecione uma linha.");
		} else {
			ClienteModel model = new ClienteModel();
			DefaultTableModel dtm = (DefaultTableModel) table.getModel();
			int linhaSelecinhada = table.getSelectedRow();
			model.setIdCliente(Integer.parseInt(dtm.getValueAt(linhaSelecinhada, 0).toString()));
			model.setNomeCompleto(nomeEdicaoTF.getText());
			model.setCpf(cpfEdicaoTF.getText());
			model.setTelefone(telefoneEdicaoTF.getText());
			model.setCnh(cnhEdicaoTF.getText());
			// model.setDataNascimento(MetodosGerais.transformarEmDate(dataNascimentoEdicaoTF.getText()));
			// //converter data para antigo formato e fazer validação
			ClienteController.editarCliente(model);
			ClienteController.preencherTabela(table);
			limparSelecao();
		}
	}

	public void remover() {

	}

	public void limparSelecao() {
		nomeEdicaoTF.setText("");
		cpfEdicaoTF.setText("");
		telefoneEdicaoTF.setText("");
		cnhEdicaoTF.setText("");
		dataNascimentoEdicaoTF.setText("");
	}
}
