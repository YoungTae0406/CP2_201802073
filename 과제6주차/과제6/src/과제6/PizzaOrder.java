package 과제6;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class PizzaOrder extends JFrame{
	public PizzaOrder() {
		setTitle("피자 주문");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Border typeborder = BorderFactory.createTitledBorder("종류");
		Border sizeborder = BorderFactory.createTitledBorder("크기");
		Border toping = BorderFactory.createTitledBorder("추가 토핑");
		
		PizzaNorth PN = new PizzaNorth();
		add(PN, BorderLayout.NORTH);
		
		PizzaCenter PC = new PizzaCenter();
		add(PC, BorderLayout.CENTER);
		PC.setBorder(toping);
		
		PizzaWest PW = new PizzaWest();
		add(PW, BorderLayout.WEST);
		PW.setBorder(typeborder);
		
		PizzaEast PE = new PizzaEast();
		add(PE, BorderLayout.EAST);
		PE.setBorder(sizeborder);
		
		PizzaSouth PS = new PizzaSouth();
		add(PS, BorderLayout.SOUTH);
		
		
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		PizzaOrder PO = new PizzaOrder();

}
	}

