package 과제6;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PizzaDialog extends JDialog implements ActionListener{

	JPanel p2;
	JButton OrderCheck;

	
	PizzaDialog(Frame parent, String str) {
		super(parent, str, true);
		
		p2 = new JPanel();
		p2.setLayout(null);
		
		OrderCheck = new JButton("주문 완료");
		OrderCheck.addActionListener(this);
		add(p2);
		p2.add(OrderCheck);
		OrderCheck.setBounds(40, 50, 100, 40);
		
		setSize(200, 250);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == OrderCheck) {
			setVisible(false);
		}
	}
	
}
