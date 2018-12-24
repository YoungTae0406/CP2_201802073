package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class chatThread extends Thread{ //클라이언트를 받아서 저장하고, 메시지를 받으면 다른 클라이언트들에게 메시지를 전달하는 역할
	private Socket sock;
	private String id;
	private BufferedReader bufferedReader;
	private HashMap<String, Object> hashmap;
	
	public chatThread(Socket sock, HashMap<String, Object> hashmap) {
		this.sock = sock;
		this.hashmap = hashmap;
		try {
			PrintWriter printWriter = new PrintWriter(
			new OutputStreamWriter(sock.getOutputStream()));
			bufferedReader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			id = bufferedReader.readLine();
			broadcast(id + "님이 접속하셨습니다.");
			System.out.println("접속한 사용자의 아이디 : "+ id);
			synchronized(hashmap) {
				hashmap.put(this.id, printWriter);
			}
		}
		catch(Exception e) { e.printStackTrace();
		}
	}
	public void run() {
		try {
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				if(line.equals("/quit")) {
					break;
				}
				broadcast(id + " : " + line);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			synchronized(hashmap) {
				hashmap.remove(id);
			}
			broadcast(id + "님이 접속을 종료했습니다.");
			try {
				if(sock != null) {
					sock.close();
				}
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void broadcast(String msg) {
		synchronized(hashmap) {
			Collection<Object> collection = hashmap.values();
			Iterator<?> iterator = collection.iterator();
			while(iterator.hasNext()) {
				PrintWriter printWriter = (PrintWriter) iterator.next();
				printWriter.println(msg); //HashMap에 저장된 모든 클라이언트들에게 메세지를 전송
				printWriter.flush(); // flush를 통해 PrintWriter에 저장된 메시지를 전송
			}
		}
		
	}
	
	
	
	
}
