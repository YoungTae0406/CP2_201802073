package chatting;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class chatServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			HashMap<String, Object> hashmap = new HashMap<>();
			while(true) {
				System.out.println("������ ��ٸ��ϴ�.");
				Socket sock = server.accept();
				chatThread chatThread = new chatThread(sock, hashmap); //������ ����� socket�� chatThread�� ����
				chatThread.start();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
