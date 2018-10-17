package 과제6;

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
		Random = Rd.nextInt(101); //0~100까지 난수 생성
		
		Guess = new JLabel("숫자를 추측하시오: ");
		Score = new JLabel("시도 횟수: "+Count);
		Top = new JPanel(); Middle = new JPanel(); Bottom = new JPanel();
		Ninput = new JFormattedTextField(new NumberFormatter()); Output = new JFormattedTextField();
		Retry = new JButton("다시 한 번"); Esc = new JButton("종료");
		
		setTitle("숫자 게임");
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
			Score.setText("시도 횟수: "+Count);
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
				Output.setText("정답입니다.");
				Count++;
				Score.setText("시도 횟수: "+Count);
				
			}
		}if(imsi > Random) {
			Output.setBackground(Color.red);
			Output.setText("너무 높습니다.");
			Count++;		
			Score.setText("시도 횟수: "+Count);
			
		}if(imsi < Random) {
			Output.setBackground(Color.BLUE);
			Output.setText("너무 낮습니다.");
			Count++;
			Score.setText("시도 횟수: "+Count);
		}
		try {
			imsi = Integer.parseInt(Ninput.getText());
		}catch(NumberFormatException ee) {
			
			Output.setBackground(Color.GRAY);
			Output.setText("정수만 입력하세요.");
		}finally {		
			Score.setText("시도 횟수: "+Count);
		}
	}
}
	public static void main(String[] args) {
		NumberGame NG = new NumberGame();
	}

}
