package ����6;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PizzaNorth extends JPanel{
	public PizzaNorth() {
		JPanel PN = new JPanel();		
		JLabel Welcome = new JLabel();
		setLayout(new BorderLayout());
		
		Welcome.setText("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�.");
		PN.add(Welcome);
		add(PN, BorderLayout.NORTH);
		
	}
}
