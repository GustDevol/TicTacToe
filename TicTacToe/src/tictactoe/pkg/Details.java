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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Details extends JFrame {

	private JPanel contentPane;
	private JTextField tp1;
	private JTextField ts1;
	private JTextField tp2;
	private JTextField ts2;
	static String p1="" , p2="" ;
	static String s1 , s2 ;

	/**
	 * Launch the application.
	 */
	static Details frame;
	public static void players() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Details();
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
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLAYER DETAILS : ");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Bodoni MT Poster Compressed", Font.BOLD, 45));
		lblNewLabel.setBounds(43, 54, 409, 123);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Player1 : ");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(43, 171, 482, 57);
		contentPane.add(lblNewLabel_1);
		
		tp1 = new JTextField();
		tp1.setBounds(167, 187, 358, 29);
		contentPane.add(tp1);
		tp1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("P1 SYMBOL : ");
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(49, 250, 476, 51);
		contentPane.add(lblNewLabel_2);
		
		ts1 = new JTextField("X");
		ts1.setBounds(400, 261, 125, 29);
		contentPane.add(ts1);
		ts1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Player2 : ");
		lblNewLabel_3.setForeground(Color.MAGENTA);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 35));
		lblNewLabel_3.setBounds(43, 325, 482, 29);
		contentPane.add(lblNewLabel_3);
		
		tp2 = new JTextField();
		tp2.setBounds(167, 325, 358, 31);
		contentPane.add(tp2);
		tp2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("P2 SYMBOL : ");
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(49, 402, 476, 29);
		contentPane.add(lblNewLabel_4);
		
		ts2 = new JTextField("O");
		ts2.setBounds(409, 402, 116, 29);
		contentPane.add(ts2);
		ts2.setColumns(10);
		
		JButton butt = new JButton("START GAME");
		butt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Details.s2 = (String.valueOf(ts2.getText())).toUpperCase();
				Details.s1 = (String.valueOf(ts1.getText())).toUpperCase();
				Details.frame.setVisible(false);
				GameWindow.startGame();
			}
		});
		butt.setBackground(Color.GREEN);
		butt.setForeground(Color.BLUE);
		butt.setFont(new Font("Papyrus", Font.BOLD, 15));
		butt.setBounds(154, 10, 199, 38);
		contentPane.add(butt);
	}
}
