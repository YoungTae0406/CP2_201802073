package chatting;

import java.io.BufferedReader;
import java.net.Socket;

public class InputThread extends Thread{ //서버에서 클라이언트에게 보내지는 메시지를 관리하는 역할
	private Socket sock = null; //BufferedReader를 통해 받은 메시지를 출력
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
