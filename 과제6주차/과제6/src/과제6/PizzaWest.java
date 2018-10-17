package 과제6;
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
		JRadioButton Combo = new JRadioButton("콤보");
		JRadioButton Potato = new JRadioButton("포테이토");
		JRadioButton Bulgogi = new JRadioButton("불고기");		
				
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

