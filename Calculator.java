package Projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField.setBounds(22, 10, 329, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton BtnBackSpace = new JButton("\uF0E7");
		BtnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					
					StringBuilder builder = new StringBuilder(textField.getText());
					builder.deleteCharAt(textField.getText().length()-1);
					backSpace=builder.toString();
					textField.setText(backSpace);
				}
			}
		});
		BtnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 18));
		BtnBackSpace.setBounds(23, 70, 70, 57);
		frame.getContentPane().add(BtnBackSpace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn7.setBounds(22, 137, 70, 57);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn4.setBounds(22, 204, 70, 57);
		frame.getContentPane().add(btn4);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnClear.setBounds(115, 70, 70, 57);
		frame.getContentPane().add(btnClear);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn1.setBounds(22, 271, 70, 57);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn0.setBounds(22, 338, 70, 57);
		frame.getContentPane().add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn8.setBounds(115, 137, 70, 57);
		frame.getContentPane().add(btn8);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn00.setBounds(201, 70, 70, 57);
		frame.getContentPane().add(btn00);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPlus.setBounds(281, 70, 70, 57);
		frame.getContentPane().add(btnPlus);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn9.setBounds(201, 137, 70, 57);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMinus.setBounds(281, 137, 70, 57);
		frame.getContentPane().add(btnMinus);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn5.setBounds(115, 204, 70, 57);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn6.setBounds(201, 204, 70, 57);
		frame.getContentPane().add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMult.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnMult.setBounds(281, 204, 70, 57);
		frame.getContentPane().add(btnMult);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn2.setBounds(115, 271, 70, 57);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(201, 271, 70, 57);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDivide.setBounds(281, 271, 70, 57);
		frame.getContentPane().add(btnDivide);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setBounds(115, 338, 70, 57);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if (operation=="+") {
					result = first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if (operation=="-") {
					result = first-second;
					answer=String.format("%.2f", result);	
					textField.setText(answer);
				}
				
				else if (operation=="*") {
					result = first*second;
					answer=String.format("%.2f", result);	
					textField.setText(answer);
				}
				
				else if (operation=="/") {
					result = first/second;
					answer=String.format("%.2f", result);	
					textField.setText(answer);
				}
				
				else if (operation=="%") {
					result = first%second;
					answer=String.format("%.2f", result);	
					textField.setText(answer);
				}
				else {
					textField.setText("ERROR");
				}
				
			}
		});
		btnEqual.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnEqual.setBounds(201, 338, 70, 57);
		frame.getContentPane().add(btnEqual);
		
		JButton btmMod = new JButton("%");
		btmMod.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btmMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btmMod.setBounds(281, 338, 70, 57);
		frame.getContentPane().add(btmMod);
	}
}
