package frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Dialog.ModalExclusionType;

public class Point extends JFrame {
	String num;
	String pNum = "";
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Point frame = new Point();
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
	public Point() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 435, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button1 = new JButton("\uBC84\uD2BC1");
		button1.setBackground(new Color(0, 128, 0));
		button1.setBounds(31, 22, 69, 53);
		button1.setFont(new Font("굴림", Font.PLAIN, 14));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pNum += "1";
				textField.setText(pNum);
				Integer.parseInt(pNum);
				System.out.println(pNum);
			


			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(30, 144, 255));
		lblNewLabel.setBounds(281, 22, 112, 26);
		panel.add(lblNewLabel);
		panel.add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBackground(new Color(153, 102, 255));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					pNum += "2";
					textField.setText(pNum);
					Integer.parseInt(pNum);
					System.out.println(pNum);
				


			}
		});
		button2.setBounds(112, 22, 69, 53);
		button2.setFont(new Font("굴림", Font.PLAIN, 14));
		panel.add(button2);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pNum += "3";
				textField.setText(pNum);
				Integer.parseInt(pNum);
				System.out.println(pNum);
			}
		});
		button_1.setBounds(193, 22, 69, 53);
		button_1.setFont(new Font("굴림", Font.PLAIN, 14));
		panel.add(button_1);
		
		JButton button_2 = new JButton("6");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						pNum += "6";
						textField.setText(pNum);
						Integer.parseInt(pNum);
						System.out.println(pNum);
			}
		});
		button_2.setBounds(193, 85, 69, 53);
		button_2.setFont(new Font("굴림", Font.PLAIN, 14));
		panel.add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pNum += "7";
				textField.setText(pNum);
				Integer.parseInt(pNum);
				System.out.println(pNum);
			}
		});
		button_3.setBounds(31, 148, 69, 53);
		button_3.setFont(new Font("굴림", Font.PLAIN, 14));
		panel.add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pNum += "8";
				textField.setText(pNum);
				Integer.parseInt(pNum);
				System.out.println(pNum);
			}
		});
		button_4.setBounds(112, 148, 69, 53);
		button_4.setFont(new Font("굴림", Font.PLAIN, 14));
		panel.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(112, 85, 69, 53);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pNum += "5";
				textField.setText(pNum);
				Integer.parseInt(pNum);
				System.out.println(pNum);
			}
		});
		button_5.setFont(new Font("굴림", Font.PLAIN, 14));
		panel.add(button_5);
		
		JButton button_6 = new JButton("4");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pNum += "4";
				textField.setText(pNum);
				Integer.parseInt(pNum);
				System.out.println(pNum);
			}
		});
		button_6.setBounds(31, 85, 69, 53);
		button_6.setFont(new Font("굴림", Font.PLAIN, 14));
		panel.add(button_6);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 0, 255));
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setFont(new Font("굴림", Font.PLAIN, 17));
		textField.setEnabled(false);
		textField.setBounds(280, 58, 132, 60);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC870\uD68C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "��ȸ�� ��ȭ��ȣ  :   " + pNum);
			}
		});
		btnNewButton.setBounds(193, 148, 97, 53);
		panel.add(btnNewButton);
	}
}
