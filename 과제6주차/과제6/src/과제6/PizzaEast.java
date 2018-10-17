package °úÁ¦6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PizzaEast extends JPanel implements ActionListener{
	JRadioButton Small;
	JRadioButton Medium;
	JRadioButton Large;
	
	public PizzaEast() {
		ButtonGroup size = new ButtonGroup();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JRadioButton Small = new JRadioButton("Small");
		JRadioButton Medium = new JRadioButton("Medium");
		JRadioButton Large = new JRadioButton("Large");
				
		size.add(Small); 
		size.add(Medium); 
		size.add(Large);
		this.add(Small); 
		this.add(Box.createVerticalStrut(23));
		this.add(Medium); 
		this.add(Box.createVerticalStrut(23));
		this.add(Large); 
		
		Small.addActionListener(this);
		Medium.addActionListener(this);
		Large.addActionListener(this);
						
		if(Small.isSelected()==false&&Medium.isSelected()==false&&
				Large.isSelected()==false)
			Medium.doClick();
	}		
	
	public void actionPerformed(ActionEvent e) {				
		}		
	}

