package 과제5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class 과제5_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static JButton btnNewButton_1; static JButton btnNewButton;
	static JButton btnNewButton_2; static JButton btnNewButton_3;
	static JButton btnNewButton_4; static JButton btnNewButton_5;
	static JButton btnNewButton_6; static JButton btnNewButton_7;
	static JButton btnNewButton_8; static JButton btnNewButton_9;
	static JButton btnNewButton_10;static JButton btnNewButton_11;
	static JButton btnNewButton_12;static JButton btnNewButton_13;
	static JButton btnNewButton_14; static JButton btnNewButton_15;
	static JButton btnNewButton_16;
	
	private int num,num1, num2 =0;
	private int num_first=0;
	private int a, b, c, d=0;
	static int ab=0;
	private int result =0; //결과

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					과제5_2 frame = new 과제5_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();}}});}

	public 과제5_2() {
		setTitle("\uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(38, 23, 273, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				
			}
			public void keyReleased(KeyEvent e) {
				
			}
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_ENTER) {
					if(a==1) {
						result = num1 / num2;
						textField.setText(result+"");
					}
					if(b==1) {
						result = num1 * num2;
						textField.setText(result+"");
					}
					if(c==1) {
						result = num1 - num2;
						textField.setText(result+"");
					}
					if(d==1) {
						result = num1 + num2;
						textField.setText(result+"");
					}
				}
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
					num = 0; num_first=0; num1 = 0; num2 = 0;
					a=0; b=0; c=0; d=0;
					textField.setText("0");
					
				}
			}
		});		
		btnNewButton = new JButton("C");
		btnNewButton.setBounds(38, 66, 65, 39);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ConvertListener());
		
		btnNewButton_1 = new JButton("7");
		btnNewButton_1.setBounds(39, 117, 58, 39);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ConvertListener());
		
		btnNewButton_2 = new JButton("8");
		btnNewButton_2.setBounds(107, 117, 58, 39);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ConvertListener());
		
		btnNewButton_3 = new JButton("9");
		btnNewButton_3.setBounds(179, 117, 58, 39);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ConvertListener());
		
		btnNewButton_4 = new JButton("/");
		btnNewButton_4.setBounds(251, 117, 51, 39);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ConvertListener());
		
		
		btnNewButton_5 = new JButton("4");
		btnNewButton_5.setBounds(38, 179, 59, 39);
		contentPane.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ConvertListener());
		
		btnNewButton_6 = new JButton("5");
		btnNewButton_6.setBounds(107, 179, 60, 39);
		contentPane.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ConvertListener());
		
		btnNewButton_7 = new JButton("6");
		btnNewButton_7.setBounds(179, 179, 58, 39);
		contentPane.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ConvertListener());
		
		btnNewButton_8 = new JButton("*");
		btnNewButton_8.setBounds(251, 179, 51, 39);
		contentPane.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ConvertListener());
		
		
		btnNewButton_9 = new JButton("1");
		btnNewButton_9.setBounds(38, 244, 59, 39);
		contentPane.add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ConvertListener());
		
		btnNewButton_10 = new JButton("2");
		btnNewButton_10.setBounds(104, 244, 61, 39);
		contentPane.add(btnNewButton_10);
		btnNewButton_10.addActionListener(new ConvertListener());
		
		btnNewButton_11 = new JButton("3");
		btnNewButton_11.setBounds(179, 244, 58, 39);
		contentPane.add(btnNewButton_11);
		btnNewButton_11.addActionListener(new ConvertListener());
		
		btnNewButton_12 = new JButton("-");
		btnNewButton_12.setBounds(251, 244, 51, 39);
		contentPane.add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ConvertListener());
		
		btnNewButton_13 = new JButton("0");
		btnNewButton_13.setBounds(38, 306, 59, 39);
		contentPane.add(btnNewButton_13);
		btnNewButton_13.addActionListener(new ConvertListener());
		
		btnNewButton_14 = new JButton("00");
		btnNewButton_14.setBounds(104, 306, 71, 39);
		contentPane.add(btnNewButton_14);
		btnNewButton_14.addActionListener(new ConvertListener());
		
		btnNewButton_15 = new JButton("=");
		btnNewButton_15.setBounds(189, 306, 58, 39);
		contentPane.add(btnNewButton_15);
		btnNewButton_15.addActionListener(new ConvertListener());
		
		btnNewButton_16 = new JButton("+");
		btnNewButton_16.setBounds(262, 306, 51, 39);
		contentPane.add(btnNewButton_16);
		btnNewButton_16.addActionListener(new ConvertListener());
	}
	private class ConvertListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {

			if(textField.getText().equals("0")) {
				if(e.getSource()==btnNewButton_14) {
					textField.setText("0");
				}
			}			
			if(num_first==0||num_first==1) {
				
			if(e.getSource()==btnNewButton_1) {
				num = Integer.valueOf(textField.getText());
				num = num*10+7;
				textField.setText(num +"");
			}
			if(e.getSource()==btnNewButton_2) {
				num = Integer.valueOf(textField.getText());
				num = num*10+8;
				textField.setText(num +"");
				
			}
			if(e.getSource()==btnNewButton_3) {
				num = Integer.valueOf(textField.getText());
				num = num*10+9;
				textField.setText(num +"");
				
			}
			if(e.getSource()==btnNewButton_5) {
				num = Integer.valueOf(textField.getText());
				num = num*10+4;
				textField.setText(num +"");
				
			}
			if(e.getSource()==btnNewButton_6) {
				num = Integer.valueOf(textField.getText());
				num = num*10+5;
				textField.setText(num +"");
			}
			if(e.getSource()==btnNewButton_7) {
				num = Integer.valueOf(textField.getText());
				num = num*10+6;
				textField.setText(num +"");
			}
			if(e.getSource()==btnNewButton_9) {
				num = Integer.valueOf(textField.getText());
				num = num*10+1;
				textField.setText(num +"");
			}
			if(e.getSource()==btnNewButton_10) {
				num = Integer.valueOf(textField.getText());
				num = num*10+2;
				textField.setText(num +"");
				
			}
			if(e.getSource()==btnNewButton_11) {
				num = Integer.valueOf(textField.getText());
				num = num*10+3;
				textField.setText(num +"");
			}
			if(e.getSource()==btnNewButton_13) {
				num = Integer.valueOf(textField.getText());
				num = num*10;
				textField.setText(num +"");
			}
			if(e.getSource()==btnNewButton_14) {
				num = Integer.valueOf(textField.getText());
				num = num*100;
				textField.setText(num +"");
			}
			
			if(num_first==0) num1 = num;
			else if(num_first==1) num2 = num;
			}
			
			//연산자
			if(e.getSource()==btnNewButton) {//C
				num = 0; num_first=0; num1 = 0; num2 = 0;
				a=0; b=0; c=0; d=0;
				textField.setText("0");
				
			}
			if(e.getSource()==btnNewButton_4) {// /
				a++; num_first++;
				textField.setText("0");
				
			
			}
			if(e.getSource()==btnNewButton_8) {// *
				
				b++; num_first++;
				textField.setText("0");
			
			}
			if(e.getSource()==btnNewButton_12) {// -
				
				c++; num_first++;
				textField.setText("0");
			
			}
			if(e.getSource()==btnNewButton_15) {// =
				try {
					result = num1 / num2;
						
					}					
				catch(ArithmeticException ee) {
					num2 = 1; ab++;
					textField.setText("0을 1로 바꿉니다.");}
				if(a==1) {
					result = num1 / num2;
					textField.setText(result+"");
					if(ab==1) textField.setText("분모가 0일 땐 계산 할 수 없습니다.");

					}
				if(b==1) {
					result = num1 * num2;
					textField.setText(result+"");
				}
				if(c==1) {
					result = num1 - num2;
					textField.setText(result+"");
				}
				if(d==1) {
					result = num1 + num2;
					textField.setText(result+"");
				}
				
			}
			if(e.getSource()==btnNewButton_16) {// +
				
				d++; num_first++;
				textField.setText("0");
			
			}			
		}
	}
}
