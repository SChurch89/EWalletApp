import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class AddMonthlyIncome1 extends AddMonthlyIncome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMonthlyIncome1 window = new AddMonthlyIncome1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddMonthlyIncome1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 10);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Income");
		lblNewLabel.setBounds(174, 22, 110, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Salray 1", "Salary 2", "Alimony", "debt reapid", "gift"}));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBounds(32, 69, 81, 22);
		frame.getContentPane().add(comboBox);
	}
}
