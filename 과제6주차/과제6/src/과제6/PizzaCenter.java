package 과제6;

import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class PizzaCenter extends JPanel{
	public PizzaCenter() {
		setLayout(new GridLayout(0,2));
		
		JCheckBox Pmang = new JCheckBox("피망");
		JCheckBox Cheese = new JCheckBox("치즈");
		JCheckBox Peperoni = new JCheckBox("페페로니");
		JCheckBox Bacon = new JCheckBox("베이컨");

		this.add(Pmang); this.add(Cheese); this.add(Peperoni); this.add(Bacon);
	}
}
