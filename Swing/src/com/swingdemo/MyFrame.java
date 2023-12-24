package com.swingdemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtage;
	
	JLabel lblshow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblheading = new JLabel("BOOZERZZ");
		lblheading.setForeground(new Color(255, 255, 0));
		lblheading.setFont(new Font("Segoe Print", Font.BOLD, 23));
		lblheading.setBounds(130, 23, 157, 22);
		contentPane.add(lblheading);
		
		JLabel lblname = new JLabel("NAME");
		lblname.setForeground(new Color(255, 255, 0));
		lblname.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblname.setBounds(50, 72, 89, 22);
		contentPane.add(lblname);
		
		txtname = new JTextField();
		txtname.setForeground(new Color(0, 0, 0));
		txtname.setBounds(174, 74, 96, 19);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		JLabel lblage = new JLabel("AGE");
		lblage.setForeground(new Color(255, 255, 0));
		lblage.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblage.setBounds(50, 125, 45, 13);
		contentPane.add(lblage);
		
		txtage = new JTextField();
		txtage.setForeground(new Color(0, 0, 0));
		txtage.setText("");
		txtage.setBounds(174, 122, 96, 19);
		contentPane.add(txtage);
		txtage.setColumns(10);
		
		JButton btnsubmit = new JButton("SUBMIT");
		btnsubmit.setForeground(new Color(0, 0, 0));
		btnsubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				String str = txtname.getText();
//				int a = Integer.parseInt(txtage.getText());
//				
//				if (a>= 21)
//				{
//					lblshow.setText(str+" you can now have unlimited drinks on the floor");
//				}
//				else
//				{
//					lblshow.setText(str+" go home and study you fool...");
//				}
				
//				SecondPage sp=new SecondPage();
//				sp.setVisible(true);
//				dispose();
				
//				String name = txtname.getText();
//				int age = Integer.parseInt(txtage.getText());
//				SecondPage ob = new SecondPage();
//				ob.setVisible(true);
//				ob.lbl5.setText(name +"your age is  "+age);
//				dispose();
				
				String nm = txtname.getText();
				int a = Integer.parseInt(txtage.getText());
				
				Main12 mc = new Main12();
				mc.connectdb();
				mc.insertdb(nm, a);
				
				JOptionPane.showMessageDialog(btnsubmit,"data submitted successfully... ");
				
				
			}
		});
		btnsubmit.setBounds(110, 200, 103, 21);
		contentPane.add(btnsubmit);
		
		JButton btnreset = new JButton("RESET");
		btnreset.setForeground(new Color(0, 0, 0));
		btnreset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtname.setText("");
				txtage.setText("");
				
				
			}
		});
		btnreset.setBounds(223, 200, 85, 21);
		contentPane.add(btnreset);
		
	    lblshow = new JLabel("");
	    lblshow.setForeground(new Color(255, 255, 0));
		lblshow.setBounds(50, 231, 335, 22);
		contentPane.add(lblshow);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("male");
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(167, 162, 69, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_1.setBounds(234, 162, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		bg.add(rdbtnNewRadioButton);
        bg.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("GENDER");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(50, 166, 89, 13);
		contentPane.add(lblNewLabel);
	}
}
