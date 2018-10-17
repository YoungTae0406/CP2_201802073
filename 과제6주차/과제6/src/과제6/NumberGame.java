package ����6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.NumberFormatter;

public class NumberGame extends JFrame {
	JLabel Score, Guess;
	JPanel Top, Middle, Bottom;
	JFormattedTextField Ninput, Output;
	JButton Retry, Esc;
	int Count = -1; int Random; int Count2 = 0;
	double imsi ;
	Random Rd;
	
	public NumberGame() {
		Rd = new Random();
		Random = Rd.nextInt(101); //0~100���� ���� ����
		
		Guess = new JLabel("���ڸ� �����Ͻÿ�: ");
		Score = new JLabel("�õ� Ƚ��: "+Count);
		Top = new JPanel(); Middle = new JPanel(); Bottom = new JPanel();
		Ninput = new JFormattedTextField(new NumberFormatter()); Output = new JFormattedTextField();
		Retry = new JButton("�ٽ� �� ��"); Esc = new JButton("����");
		
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		setLayout(new BorderLayout());
	
		Ninput.setColumns(3);
		Ninput.requestFocus();
		Ninput.setHorizontalAlignment(SwingConstants.LEFT);
		Ninput.addPropertyChangeListener("value",new Property());
		Top.add(Guess);
		Top.add(Ninput);
		add(Top, BorderLayout.NORTH);
		
		
		add(Middle, BorderLayout.CENTER);
		Output.setEditable(false);
		Middle.add(Output);
		Output.setText("        ");
		Middle.add(Score);
		
		
		add(Bottom, BorderLayout.SOUTH);
		Bottom.add(Retry);
		Bottom.add(Esc);
		Retry.addActionListener(new ConvertListener());
		Esc.addActionListener(new ConvertListener());
			
		setVisible(true);
	}
	
private class ConvertListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Retry) {
			Count = 0;
			Random = Rd.nextInt(101);
			Score.setText("�õ� Ƚ��: "+Count);
		}
		if(e.getSource() == Esc) {
			System.exit(0);
		}
		
	}
}
private class Property implements PropertyChangeListener{
	public void propertyChange(PropertyChangeEvent e) {
		
		if(!"".equals(Ninput.getText())) imsi = Double.parseDouble(Ninput.getText());	
				
		if(e.getSource() == Ninput) {
			
			if(imsi == Random) {
				Output.setBackground(Color.GREEN);
				Output.setText("�����Դϴ�.");
				Count++;
				Score.setText("�õ� Ƚ��: "+Count);
				
			}
		}if(imsi > Random) {
			Output.setBackground(Color.red);
			Output.setText("�ʹ� �����ϴ�.");
			Count++;		
			Score.setText("�õ� Ƚ��: "+Count);
			
		}if(imsi < Random) {
			Output.setBackground(Color.BLUE);
			Output.setText("�ʹ� �����ϴ�.");
			Count++;
			Score.setText("�õ� Ƚ��: "+Count);
		}
		try {
			imsi = Integer.parseInt(Ninput.getText());
		}catch(NumberFormatException ee) {
			
			Output.setBackground(Color.GRAY);
			Output.setText("������ �Է��ϼ���.");
		}finally {		
			Score.setText("�õ� Ƚ��: "+Count);
		}
	}
}
	public static void main(String[] args) {
		NumberGame NG = new NumberGame();
	}

}
