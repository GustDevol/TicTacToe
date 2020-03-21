package tictactoe.pkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GameWindow extends JFrame {

	String symbols = String.valueOf(Details.s1 + Details.s2);
	private int count = 0;
	private JPanel contentPane;
	public JTextField t;
	public JTextField t1;
	public JTextField t2;
	public JTextField t3;
	public JTextField t4;
	public JTextField t5;
	public JTextField t6;
	public JTextField t7;
	public JTextField t8;
	public JTextField t9;
	private JLabel win;

	/**
	 * Launch the application.
	 */
	public static void startGame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow frame = new GameWindow();
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
	public GameWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 513);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Snap ITC", Font.ITALIC, 30));
		lblNewLabel.setBounds(85, 14, 202, 34);
		contentPane.add(lblNewLabel);
		
		t1 = new JTextField();
		t1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t = t1;
			}
		});
		t1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t1.setBounds(26, 58, 85, 55);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t = t2;
			}
		});
		t2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t2.setBounds(141, 58, 85, 55);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t3;
			}
		});
		t3.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t3.setBounds(254, 58, 85, 55);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t4;
			}
		});
		t4.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t4.setBounds(26, 159, 85, 55);
		contentPane.add(t4);
		
		t5 = new JTextField();
		t5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t5;
			}
		});
		t5.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t5.setBounds(141, 159, 85, 55);
		contentPane.add(t5);
		
		t6 = new JTextField();
		t6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t6;
			}
		});
		t6.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t6.setBounds(254, 159, 85, 55);
		contentPane.add(t6);
		
		t7 = new JTextField();
		t7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t7;
			}
		});
		t7.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t7.setBounds(26, 265, 85, 55);
		contentPane.add(t7);
		
		t8 = new JTextField();
		t8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t8;
			}
		});
		t8.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t8.setBounds(141, 265, 85, 55);
		contentPane.add(t8);
		
		t9 = new JTextField();
		t9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t9;
			}
		});
		t9.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t9.setBounds(254, 265, 85, 55);
		contentPane.add(t9);
		
		JButton but = new JButton("PUT " + symbols.charAt( 0 ));
		but.setForeground(Color.BLUE);
		but.setBackground(Color.GREEN);
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t.isEditable()) {
					t.setText(" " + symbols.charAt( count%2 ));
					t.setEditable(false);
					count++;
				}
				but.setText("PUT" + " " + symbols.charAt( count%2 ));
				if(count == 9)
					but.setVisible(false);
			}
		});
		but.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		but.setBounds(102, 422, 202, 44);
		contentPane.add(but);
		
		win = new JLabel();
		win.setFont(new Font("Tahoma", Font.PLAIN, 25));
		win.setBounds(0, 358, 375, 44);
		contentPane.add(win);
	}
}

