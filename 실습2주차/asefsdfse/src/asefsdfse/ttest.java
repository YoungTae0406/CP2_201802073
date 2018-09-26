package asefsdfse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class ttest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ttest frame = new ttest();
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
	public ttest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC778\uAC04\uC5D0\uAC8C \uC8FC\uC5B4\uC9C4 \uCD5C\uC0C1\uC758 \uC120\uBB3C\uC740 \uB9C8\uC74C\uAECF \uC6C3\uC744 \uC218 \uC788\uB2E4\uB294 \uAC83\uC774\uB2E4.");
		label.setFont(new Font("±¼¸²", Font.BOLD, 15));
		label.setBounds(94, 32, 457, 43);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\uAC00\uB2A5\uD55C \uBAA9\uD45C\uB77C\uACE0 \uD574\uB3C4 \uADF8\uAC83\uC744 \uAFC8\uAFB8\uACE0 \uC0C1\uC0C1\uD558\uB294 \uC21C\uAC04 \uC774\uBBF8 \uAC70\uAE30\uC5D0 \uB2E4\uAC00\uAC00 \uC788\uB294 \uAC83\uC774\uB2E4.");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel.setBounds(94, 65, 552, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC0C1\uC0C1\uB825\uC740 \uC0DD\uC874\uC758 \uD798\uC774\uB2E4.");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_1.setBounds(94, 129, 457, 37);
		contentPane.add(lblNewLabel_1);
	}

}
