package ����6;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PizzaWest extends JPanel{
	JRadioButton Combo;
	JRadioButton Potato;
	JRadioButton Bulgogi ;
	
	public PizzaWest() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		ButtonGroup type = new ButtonGroup();		
		JRadioButton Combo = new JRadioButton("�޺�");
		JRadioButton Potato = new JRadioButton("��������");
		JRadioButton Bulgogi = new JRadioButton("�Ұ��");		
				
		type.add(Combo); type.add(Potato); type.add(Bulgogi);
		this.add(Combo); 
		this.add(Box.createVerticalStrut(23));
		this.add(Potato); 
		this.add(Box.createVerticalStrut(23));
		this.add(Bulgogi);
		
		if(Combo.isSelected()==false&&Potato.isSelected()==false&&
				Bulgogi.isSelected()==false)
			Combo.doClick();
	}		
		
					
	}

