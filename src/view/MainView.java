package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8249069283384768352L;

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

	public MainView() {
		setTitle("LoCar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 675, 470);

		JPanel loginPanel = new LoginView();
		setContentPane(loginPanel);
	}
}
