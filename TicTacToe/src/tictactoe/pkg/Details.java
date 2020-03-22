package tictactoe.pkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setBounds(100, 100, 559, 516);
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
		
		tp1 = new JTextField("Player 1");
		tp1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				tp1.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(tp1.getText().trim().isEmpty())
					tp1.setText("Player 1");
			}
		});
		tp1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
		tp1.setBounds(167, 187, 358, 29);
		contentPane.add(tp1);
		tp1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("P1 SYMBOL : ");
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(49, 250, 476, 51);
		contentPane.add(lblNewLabel_2);
		
		ts1 = new JTextField("X");
		ts1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ts1.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(ts1.getText().trim().isEmpty())
					ts1.setText("X");
			}
		});
		ts1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
		ts1.setBounds(400, 261, 125, 29);
		contentPane.add(ts1);
		ts1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Player2 : ");
		lblNewLabel_3.setForeground(Color.MAGENTA);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 35));
		lblNewLabel_3.setBounds(43, 325, 482, 29);
		contentPane.add(lblNewLabel_3);
		
		tp2 = new JTextField("Player 2");
		tp2.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusGained(FocusEvent e) {
//				tp2.setText("");
//			}
			@Override
			public void focusLost(FocusEvent e) {
				if(tp2.getText().trim().isEmpty())
					tp2.setText("Player 2");
			}
			@Override
			public void focusGained(FocusEvent e) {
				tp2.setText("");
			}
		});
		tp2.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
		tp2.setBounds(167, 325, 358, 31);
		contentPane.add(tp2);
		tp2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("P2 SYMBOL : ");
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(49, 402, 476, 29);
		contentPane.add(lblNewLabel_4);
		
		ts2 = new JTextField("O");
		ts2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ts2.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(ts2.getText().trim().isEmpty())
					ts2.setText("O");
			}
		});
		ts2.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
		ts2.setBounds(409, 402, 116, 29);
		contentPane.add(ts2);
		ts2.setColumns(10);
		
		JButton butt = new JButton("START GAME");
		butt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				butt.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				butt.setBackground(Color.BLACK);
			}
		});
		butt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Details.s1 = checkedInput(ts1).substring(0 , 1).toUpperCase();
				Details.s2 = checkedInput(ts2).substring(0 , 1).toUpperCase();
				Details.p1 = checkedInput(tp1);
				Details.p2 = checkedInput(tp2);
							
				Details.frame.setVisible(false);
				GameWindow.startGame();
				
			}
		});
		
		butt.setForeground(new Color(30, 144, 255));
		butt.setBackground(Color.BLACK);
		butt.setFont(new Font("Papyrus", Font.BOLD, 15));
		butt.setBounds(154, 10, 199, 38);
		contentPane.add(butt);
	}
	
	public static String checkedInput(JTextField t) {

		return String.valueOf(t.getText());
	}
		
}
