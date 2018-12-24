package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class chatThread extends Thread{ //Ŭ���̾�Ʈ�� �޾Ƽ� �����ϰ�, �޽����� ������ �ٸ� Ŭ���̾�Ʈ�鿡�� �޽����� �����ϴ� ����
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
			broadcast(id + "���� �����ϼ̽��ϴ�.");
			System.out.println("������ ������� ���̵� : "+ id);
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
			broadcast(id + "���� ������ �����߽��ϴ�.");
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
				printWriter.println(msg); //HashMap�� ����� ��� Ŭ���̾�Ʈ�鿡�� �޼����� ����
				printWriter.flush(); // flush�� ���� PrintWriter�� ����� �޽����� ����
			}
		}
		
	}
	
	
	
	
}
