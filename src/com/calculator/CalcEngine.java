package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalcEngine {

	private JFrame frame;
	private JTextField textField;
	
	double a;
	double b;
	double result;
	String operator;
	String output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcEngine window = new CalcEngine();
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
	public CalcEngine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.getContentPane().setForeground(new Color(204, 204, 204));
		frame.setBounds(100, 100, 364, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Rockwell", Font.BOLD, 24));
		textField.setBounds(10, 11, 330, 120);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//THE NUMBER BUTTONS FROM "0 TO 9", ALONG WITH "00" AND DECIMAL.
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn0.getText();
				textField.setText(n);
			}
		});
		btn0.setBackground(new Color(204, 204, 204));
		btn0.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn0.setBounds(95, 486, 75, 75);
		frame.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn1.getText();
				textField.setText(n);
			}
		});
		btn1.setBackground(new Color(204, 204, 204));
		btn1.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn1.setBounds(10, 400, 75, 75);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn2.getText();
				textField.setText(n);
			}
		});
		btn2.setBackground(new Color(204, 204, 204));
		btn2.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn2.setBounds(95, 400, 75, 75);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn3.getText();
				textField.setText(n);
			}
		});
		btn3.setBackground(new Color(204, 204, 204));
		btn3.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn3.setBounds(180, 400, 75, 75);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn4.getText();
				textField.setText(n);
			}
		});
		btn4.setBackground(new Color(204, 204, 204));
		btn4.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn4.setBounds(10, 314, 75, 75);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn5.getText();
				textField.setText(n);
			}
		});
		btn5.setBackground(new Color(204, 204, 204));
		btn5.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn5.setBounds(95, 314, 75, 75);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn6.getText();
				textField.setText(n);
			}
		});
		btn6.setBackground(new Color(204, 204, 204));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn6.setBounds(180, 314, 75, 75);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn7.getText();
				textField.setText(n);
			}
		});
		btn7.setBackground(new Color(204, 204, 204));
		btn7.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn7.setBounds(10, 228, 75, 75);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn8.getText();
				textField.setText(n);
			}
		});
		btn8.setBackground(new Color(204, 204, 204));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn8.setBounds(95, 228, 75, 75);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn9.getText();
				textField.setText(n);
			}
		});
		btn9.setBackground(new Color(204, 204, 204));
		btn9.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn9.setBounds(180, 228, 75, 75);
		frame.getContentPane().add(btn9);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + btn00.getText();
				textField.setText(n);
			}
		});
		btn00.setBackground(new Color(204, 204, 204));
		btn00.setFont(new Font("Rockwell", Font.BOLD, 30));
		btn00.setBounds(10, 486, 75, 75);
		frame.getContentPane().add(btn00);
		
		JButton decimal = new JButton(".");
		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = textField.getText() + decimal.getText();
				textField.setText(n);
			}
		});
		decimal.setForeground(new Color(204, 204, 204));
		decimal.setBackground(new Color(51, 51, 51));
		decimal.setFont(new Font("Rockwell", Font.BOLD, 30));
		decimal.setBounds(180, 486, 75, 75);
		frame.getContentPane().add(decimal);
		
		//THE ACTION BUTTONS TO BE USED.
		
		JButton allClear = new JButton("AC");
		allClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		allClear.setForeground(new Color(204, 204, 204));
		allClear.setBackground(new Color(51, 51, 51));
		allClear.setFont(new Font("Rockwell", Font.BOLD, 24));
		allClear.setBounds(10, 142, 75, 75);
		frame.getContentPane().add(allClear);		
		
		JButton backspace = new JButton("\uF0E7");
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String reduceByOne = null;
				if(textField.getText().length() > 0) {
					StringBuilder s = new StringBuilder(textField.getText());
					s.deleteCharAt(textField.getText().length()-1);
					reduceByOne = s.toString();
					textField.setText(reduceByOne);
				}
			}
		});
		backspace.setForeground(new Color(204, 204, 204));
		backspace.setBackground(new Color(51, 51, 51));
		backspace.setFont(new Font("Wingdings", Font.BOLD, 22));
		backspace.setBounds(95, 142, 75, 75);
		frame.getContentPane().add(backspace);
		
		
		// THE OPERATOR BUTTONS TO BE USED.
		
		JButton percent = new JButton("%");
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		percent.setForeground(new Color(204, 204, 204));
		percent.setBackground(new Color(51, 51, 51));
		percent.setFont(new Font("Rockwell", Font.BOLD, 30));
		percent.setBounds(180, 140, 75, 75);
		frame.getContentPane().add(percent);		
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		divide.setForeground(new Color(204, 204, 204));
		divide.setBackground(new Color(51, 51, 51));
		divide.setFont(new Font("Rockwell", Font.BOLD, 30));
		divide.setBounds(265, 140, 75, 75);
		frame.getContentPane().add(divide);
		
		JButton multiply = new JButton("x");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "x";
			}
		});
		multiply.setForeground(new Color(204, 204, 204));
		multiply.setBackground(new Color(51, 51, 51));
		multiply.setFont(new Font("Rockwell", Font.BOLD, 30));
		multiply.setBounds(265, 228, 75, 75);
		frame.getContentPane().add(multiply);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		minus.setBackground(new Color(51, 51, 51));
		minus.setForeground(new Color(204, 204, 204));
		minus.setFont(new Font("Rockwell", Font.BOLD, 30));
		minus.setBounds(265, 314, 75, 75);
		frame.getContentPane().add(minus);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		plus.setForeground(new Color(204, 204, 204));
		plus.setBackground(new Color(51, 51, 51));
		plus.setFont(new Font("Rockwell", Font.BOLD, 30));
		plus.setBounds(265, 400, 75, 75);
		frame.getContentPane().add(plus);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b = Double.parseDouble(textField.getText());
				if (operator == "+") {
					result = a + b;
					output = String.format("%.2f", result);
					textField.setText(output);
				}else if (operator == "-"){
					result = a - b;
					output = String.format("%.2f", result);
					textField.setText(output);
				}else if (operator == "x"){
					result = a * b;
					output = String.format("%.2f", result);
					textField.setText(output);
				}else if (operator == "/") {
					result = a / b;
					output = String.format("%.2f", result);
					textField.setText(output);
				}else if (operator == "%") {
					result = a % b;
					output = String.format("%.2f", result);
					textField.setText(output);
				}
			}
		});
		equal.setBackground(new Color(204, 51, 0));
		equal.setForeground(Color.WHITE);
		equal.setFont(new Font("Rockwell", Font.BOLD, 30));
		equal.setBounds(265, 486, 75, 75);
		frame.getContentPane().add(equal);
	}
}
