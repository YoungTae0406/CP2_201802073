package chatting;

import java.io.BufferedReader;
import java.net.Socket;

public class InputThread extends Thread{ //�������� Ŭ���̾�Ʈ���� �������� �޽����� �����ϴ� ����
	private Socket sock = null; //BufferedReader�� ���� ���� �޽����� ���
	private BufferedReader BR = null;
	
	public InputThread(Socket sock, BufferedReader br) {
		this.sock = sock;
		this.BR = br; 
	}
	public void run() {
		try {
			String line = null;
			while((line = BR.readLine()) != null) {
				System.out.println(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(BR != null) {
					BR.close();
				}
				if(sock != null) {
					sock.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
