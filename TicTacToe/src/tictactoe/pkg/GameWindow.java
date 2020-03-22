package tictactoe.pkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameWindow extends JFrame {

	String symbols = String.valueOf(Details.s1 + Details.s2);
	private boolean winner;
	private static int count = 0;
	private JPanel contentPane;
	private JTextField t;
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t6;
	private static JTextField t7;
	private static JTextField t8;
	private static JTextField t9;
	private static JLabel win;
	private static JTextField arr[];

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
		setBounds(100, 100, 433, 513);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(46, 139, 87));
		contentPane.setBackground(new Color(128, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Snap ITC", Font.ITALIC, 30));
		lblNewLabel.setBounds(102, 14, 202, 34);
		contentPane.add(lblNewLabel);
		
		t1 = new JTextField();
		t1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t = t1;
			}
		});
		t1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t1.setBounds(36, 58, 85, 55);
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
		t2.setBounds(163, 58, 85, 55);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t3;
			}
		});
		t3.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t3.setBounds(297, 58, 85, 55);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t4;
			}
		});
		t4.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t4.setBounds(36, 159, 85, 55);
		contentPane.add(t4);
		
		t5 = new JTextField();
		t5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t5;
			}
		});
		t5.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t5.setBounds(163, 159, 85, 55);
		contentPane.add(t5);
		
		t6 = new JTextField();
		t6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t6;
			}
		});
		t6.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t6.setBounds(297, 159, 85, 55);
		contentPane.add(t6);
		
		t7 = new JTextField();
		t7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t7;
			}
		});
		t7.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t7.setBounds(36, 265, 85, 55);
		contentPane.add(t7);
		
		t8 = new JTextField();
		t8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t8;
			}
		});
		t8.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t8.setBounds(163, 265, 85, 55);
		contentPane.add(t8);
		
		t9 = new JTextField();
		t9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t=t9;
			}
		});
		t9.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 43));
		t9.setBounds(297, 265, 85, 55);
		contentPane.add(t9);
		
		JButton but = new JButton("PUT " + symbols.charAt( 0 ));
		but.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				but.setBackground(Color.YELLOW);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				but.setBackground(Color.GREEN);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				but.setBackground(Color.RED);
			}
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				but.setBackground(Color.YELLOW);
//			}
		});
		but.setForeground(Color.BLUE);
		but.setBackground(Color.GREEN);
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count >= 9) {
					int a=JOptionPane.showConfirmDialog(null, "Fancy a rematch?");
					if(a==JOptionPane.YES_OPTION){
						count=0;
						GameWindow.startGame();
					}
					if(a==JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(null , "Thanks for Playing .\nHope you Liked it .");
						System.exit(0);
					}
				}
				if(t.isEditable()) {
					t.setText(" " + symbols.charAt( count%2 ));
					Color c = (count%2 == 0)?new Color(139, 0, 0):new Color(0, 128, 0);
					t.setForeground(c);
					t.setEditable(false);
					count++;
				}
				but.setText("PUT" + " " + symbols.charAt( count%2 ));
				if(count >= 5)
					winner = result();
				if(count == 9) {
//					but.setVisible(false);
					if(!winner) {
						win.setBackground(Color.BLACK);
						win.setText("Top Level Competition");// Please change the String to as you like @Co-Developer
					}
					but.setText(" EXIT ");
				}
			}
		});
		but.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		but.setBounds(102, 422, 202, 44);
		contentPane.add(but);
		
		win = new JLabel();
		win.setForeground(new Color(255, 99, 71));
		win.setFont(new Font("Kristen ITC", Font.BOLD | Font.ITALIC, 25));
		win.setBounds(0, 355, 393, 44);
		contentPane.add(win);
	}
	
	public static boolean result() {
		arr = new JTextField[]{t1 ,t2 ,t3 ,t4 , t5 , t6 ,t7 , t8 ,t9};
		
		if(textFieldEquality(arr[0] , arr[4] , arr[8]) && nonEmpty(arr[0] , arr[4] , arr[8])) //Left Diagonal
			return changeColor(arr[0] , arr[4] , arr[8] , win);
		
		if(textFieldEquality(arr[2] , arr[4] , arr[6])  && nonEmpty(arr[2] , arr[4] , arr[6]))
			return changeColor(arr[2] , arr[4] , arr[6] , win);  //Right Diagonal
//		Row wise
		for(int i=0 ; i<=6 ; i += 3)
			if(textFieldEquality(arr[i] , arr[i + 1] , arr[i + 2]) && nonEmpty(arr[i] , arr[i + 1] , arr[i + 2]))
				return changeColor(arr[i] , arr[i + 1] , arr[i + 2] , win);
//		Column wise
		for(int i=0 ; i<3 ; i++)
			if(textFieldEquality(arr[i] , arr[i + 3] , arr[i + 6]) && nonEmpty(arr[i] , arr[i + 3] , arr[i + 6]))
				return changeColor(arr[i] , arr[i + 3] , arr[i + 6] , win);
//		No match
		return false;

	}
	
	public static boolean textFieldEquality(JTextField m1 , JTextField m2 , JTextField m3) {
		return m1.getText().equals(m2.getText()) && m3.getText().equals(m2.getText()) ; 
	}
	
	public static boolean nonEmpty(JTextField m1 ,JTextField m2 , JTextField m3) {
		return !( m1.getText().trim().isEmpty() || m2.getText().trim().isEmpty() || m3.getText().trim().isEmpty() );
	}

	public static boolean changeColor(JTextField m1 ,JTextField m2 , JTextField m3 , JLabel win) {
		count = 9;
		Color c = new Color(255, 69, 0);
		m1.setForeground(c);
		m2.setForeground(c);
		m3.setForeground(c);
		Color c1 = Color.BLACK;
		m1.setBackground(c1);
		m2.setBackground(c1);
		m3.setBackground(c1);
		win.setBackground(Color.BLACK);
		System.out.println((String.valueOf(m1.getText())).equals(" " + Details.s1));
		if ((String.valueOf(m1.getText())).equals(" " + Details.s1))
			win.setText(Details.p1 + " Wins .");
		else
			win.setText(Details.p2 + " Wins .");
		for(JTextField tf : arr)
			tf.setEditable(false);
		return true;
	}	
}

