package com.swingdemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JButton lbl3;
	JLabel lbl5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondPage frame = new SecondPage();
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
	public SecondPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnext = new JLabel("WELCOME TO NEXT PAGE BABY");
		lblnext.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lblnext.setBounds(67, 35, 290, 52);
		contentPane.add(lblnext);
		
	    lbl3 = new JButton("RETURN");
		lbl3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MyFrame obj3 = new MyFrame();
				obj3.setVisible(true);
				dispose();
			}
		});
		lbl3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl3.setBounds(121, 172, 162, 21);
		contentPane.add(lbl3);
		
		lbl5 = new JLabel("");
		lbl5.setBounds(64, 222, 322, 21);
		contentPane.add(lbl5);
	}
}
