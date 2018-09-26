package asefsdfse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class tttest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tttest frame = new tttest();
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
	public tttest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC790\uBC14 \uD638\uD154\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4. \uC219\uBC15\uC77C\uC218\uB97C \uD655\uC778\uD558\uC138\uC694.");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel.setBounds(64, 10, 574, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("1\uBA85");
		btnNewButton.setBounds(42, 71, 91, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2\uBA85");
		btnNewButton_1.setBounds(169, 71, 91, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3\uBA85");
		btnNewButton_2.setBounds(292, 72, 91, 36);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4\uBA85");
		btnNewButton_3.setBounds(423, 72, 91, 36);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5\uBA85");
		btnNewButton_4.setBounds(547, 72, 91, 36);
		contentPane.add(btnNewButton_4);
	}

}
