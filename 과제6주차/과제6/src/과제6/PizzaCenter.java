package ����6;

import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class PizzaCenter extends JPanel{
	public PizzaCenter() {
		setLayout(new GridLayout(0,2));
		
		JCheckBox Pmang = new JCheckBox("�Ǹ�");
		JCheckBox Cheese = new JCheckBox("ġ��");
		JCheckBox Peperoni = new JCheckBox("����δ�");
		JCheckBox Bacon = new JCheckBox("������");

		this.add(Pmang); this.add(Cheese); this.add(Peperoni); this.add(Bacon);
	}
}
