package tictactoe.pkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Details extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details frame = new Details();
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
	public Details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLAYER DETAILS : ");
		lblNewLabel.setFont(new Font("Bodoni MT Poster Compressed", Font.BOLD, 45));
		lblNewLabel.setBounds(43, 54, 409, 123);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Player1 : ");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(43, 171, 482, 57);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(167, 187, 358, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("P1 SYMBOL : ");
		lblNewLabel_2.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(49, 250, 476, 51);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(400, 261, 125, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Player2 : ");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 35));
		lblNewLabel_3.setBounds(43, 325, 482, 29);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(167, 325, 358, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("P2 SYMBOL : ");
		lblNewLabel_4.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(49, 402, 476, 29);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(409, 402, 116, 29);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("START GAME");
		btnNewButton.setFont(new Font("Papyrus", Font.BOLD, 15));
		btnNewButton.setBounds(154, 10, 199, 38);
		contentPane.add(btnNewButton);
	}
}
