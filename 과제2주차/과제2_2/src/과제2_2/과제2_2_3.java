package 苞力2_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class 苞力2_2_3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					苞力2_2_3 frame = new 苞力2_2_3();
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
	public 苞力2_2_3() {
		setTitle("\uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(14, 20, 280, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBounds(14, 62, 66, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.setBounds(14, 101, 60, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.setBounds(86, 101, 60, 30);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.setBounds(160, 101, 60, 30);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("/");
		btnNewButton_4.setBounds(234, 101, 60, 30);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.setBounds(14, 143, 60, 30);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.setBounds(86, 143, 60, 30);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.setBounds(160, 143, 60, 30);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("*");
		btnNewButton_8.setBounds(234, 143, 60, 30);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("1");
		btnNewButton_9.setBounds(14, 185, 60, 30);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("2");
		btnNewButton_10.setBounds(86, 185, 60, 30);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.setBounds(234, 185, 60, 30);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("3");
		btnNewButton_12.setBounds(160, 185, 60, 30);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("0");
		btnNewButton_13.setBounds(14, 227, 60, 27);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("00");
		btnNewButton_14.setBounds(86, 227, 66, 27);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.setBounds(160, 227, 60, 27);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("+");
		btnNewButton_16.setBounds(234, 227, 60, 27);
		contentPane.add(btnNewButton_16);
	}
}
