package tictactoe.pkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jsound.audio.SimpleAudio;

import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static Welcome frame;
	public static void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Welcome();
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
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 502);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea("Tic Tac Toe is a simple game in which two players take turns to complete \na row ,a column , or a diagonal with either three O's or three X's .\r\n" + 
				"\r\n" + 
				"You are probably thinking why we are wasting time explaining these simple \nthings which you already know.\r\n" + 
				"\r\n" + 
				"Yes , everybody knows about Tic tac toe and have played it in their childhood. \nIt is a very simple game which you can easily play if a small peice of paper \nand a pen is available .\r\n" + 
				"\r\n" + 
				"Well we are changing that , now you can play tic tac toe ina simple GUI \napplication built using JAVA , one of the fastest and most energy-efficient \nobject-oriented language .\r\n" + 
				"\r\n" + 
				"We are pretty sure this application will remind you of your childhood.\r\n" + 
				"");
		textArea.setEditable(false);
		textArea.setBackground(Color.ORANGE);
		textArea.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		textArea.setBounds(10, 92, 523, 314);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("LET'S GO");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(30, 144, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				Thread nolo=new Thread(new Sound() {
					SimpleAudio playa;
					public void run(){
						try {
							playa = new SimpleAudio("beep-6.wav",false);
							playa.play();
						}
						catch(Exception e) {
							System.err.println(e);
						}
					}
				});
				nolo.start();
				
				Welcome.frame.setVisible(false);
				Details.players();
				
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 30));
		btnNewButton.setBounds(174, 411, 189, 47);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 40));
		lblNewLabel.setBounds(139, 10, 264, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Version 1.0.1");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(195, 57, 147, 23);
		contentPane.add(lblNewLabel_1);
	}
	

}
