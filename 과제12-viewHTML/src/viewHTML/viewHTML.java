package viewHTML;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class viewHTML {
	String tempURL;
	JFrame frame = new JFrame();
	JPanel cpanel = new JPanel();
	JPanel spanel = new JPanel();

	JEditorPane pane; //Text
	JEditorPane pane2; // html

	JLabel label = new JLabel("URL: ");
	JTextField writeURL = new JTextField();
	JButton getHTML = new JButton("HTML ��������"); //��ư �̺�Ʈ ����

	public viewHTML() {
		pane = new JEditorPane();	pane2 = new JEditorPane();
		JScrollPane sc = new JScrollPane(pane);
		JScrollPane sc2 = new JScrollPane(pane2);

		frame.setSize(500, 400);	frame.setTitle("HTML ����");
		frame.setLayout(new BorderLayout(4,4));
		frame.add("Center", cpanel);
		frame.add("South", spanel);

		spanel.add(label);	spanel.add(writeURL);	spanel.add(getHTML);

		cpanel.setLayout(new GridLayout(2,1));
		cpanel.add(sc);	cpanel.add(sc2);

		pane.setEditable(false);	pane2.setEditable(false);
		pane.setContentType("text/plain");	pane2.setContentType("text/html");

		writeURL.setColumns(25);	writeURL.requestFocus();
		getHTML.addActionListener(new buttonListener());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private class buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			tempURL = writeURL.getText();
			try {
				readURL(tempURL);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
	}
	public void readURL(String url) throws Exception {
		URL setURL;	String inLine;	BufferedReader br;
		String plus="";
		try {
			setURL = new URL(url);
			br = new BufferedReader(new InputStreamReader(setURL.openStream()));
			while((inLine = br.readLine()) != null) {
				plus += inLine;
			}
			pane.setText(plus);	pane2.setText(plus);
			br.close();
		}catch(MalformedURLException e) {

		}
	}

	public static void main(String[] args) {
		new viewHTML();
	}

}
