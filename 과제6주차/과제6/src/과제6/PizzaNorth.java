package 과제6;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PizzaNorth extends JPanel{
	public PizzaNorth() {
		JPanel PN = new JPanel();		
		JLabel Welcome = new JLabel();
		setLayout(new BorderLayout());
		
		Welcome.setText("자바 피자에 오신것을 환영합니다.");
		PN.add(Welcome);
		add(PN, BorderLayout.NORTH);
		
	}
}
