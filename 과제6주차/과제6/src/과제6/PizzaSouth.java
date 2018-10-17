package 과제6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.SimpleDoc;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PizzaSouth extends JPanel implements ActionListener{
	JButton Order;
	JButton Cancel;
	PizzaDialog aDialog;	
	PizzaOrder PO;
	
	public PizzaSouth() {
	this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	
	Order = new JButton("주문");
	Cancel = new JButton("취소");
	
	this.add(Box.createHorizontalStrut(130));
	this.add(Order);
	this.add(Cancel);
	
	Order.addActionListener(this);
	Cancel.addActionListener(this);	
	}
public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Order) {
			if(aDialog == null) {
				aDialog = new PizzaDialog(PO, "주문 확인");
				}
			aDialog.setVisible(true);
			Order.requestFocus();}
		
		if(e.getSource() == Cancel) System.exit(0);		
}
}
