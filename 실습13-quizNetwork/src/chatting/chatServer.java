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
				System.out.println("접속을 기다립니다.");
				Socket sock = server.accept();
				chatThread chatThread = new chatThread(sock, hashmap); //서버에 연결된 socket을 chatThread와 연결
				chatThread.start();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
