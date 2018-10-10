package 과제5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class 과제5_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static JButton btnNewButton;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					과제5_1 frame = new 과제5_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 과제5_1() {
		setTitle("\uC774\uC790 \uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC6D0\uAE08\uC744 \uC785\uB825\uD558\uC2DC\uC624");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setBounds(59, 44, 138, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uC728\uC744 \uC785\uB825\uD558\uC2DC\uC624");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1.setBounds(59, 82, 138, 26);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(203, 45, 148, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBounds(203, 83, 148, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
				
		btnNewButton = new JButton("\uBCC0 \uD658");
		btnNewButton.setBounds(163, 130, 77, 37);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ConvertListener());
				
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(40, 187, 332, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1.addKeyListener(new KeyListener() {
			private int money;
			private double rate;
			private double iza;
			
			public void keyTyped(KeyEvent e) {
				
			}
			public void keyReleased(KeyEvent e) {
				
			}
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						if(textField.getText().equals("")) {
							money = 0;
						}else {
							money = Integer.valueOf(textField.getText());
						}
						}
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						if(textField_1.getText().equals("")) {
							rate = 1.0;
						}else {
							rate = Double.parseDouble(textField_1.getText());
						}
					}
					iza = money*(rate/100);
					textField_2.setText("이자는 연 "+iza+"원 입니다." );
				}				
		});
	}
		
		private class ConvertListener implements ActionListener{
			private int money;
			private double rate;
			private double iza;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					if(textField.getText().equals("")) {
						money = 0;
					}else {
						money = Integer.valueOf(textField.getText());
					}
					}
				if(e.getSource() == btnNewButton) {
					if(textField_1.getText().equals("")) {
						rate = 1.0;
					}else {
						rate = Double.parseDouble(textField_1.getText());
					}
				}
				iza = money*(rate/100);	
				textField_2.setText("이자는 연 "+iza+"원 입니다." );
			}
	}		
}
