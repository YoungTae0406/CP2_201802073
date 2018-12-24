package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class chatClient {// Ŭ���̾�Ʈ ID�� �Է��ϰ� �̸� ������� �����Ͽ� ������ �����ϴ� ��� 
	//�����带 ���� �������� ���޵Ǵ� ������ �������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = "";
		Socket socket = null;
		BufferedReader BR = null;
		PrintWriter PW = null;
		
		try {
			socket = new Socket("13.125.52.180", 51322);
			PW = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			BR = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Ŭ���̾�Ʈ ID �Է�: ");
			id = sc.nextLine();
			PW.println(id);
			PW.flush();
			InputThread inputThread = new InputThread(socket, BR);
			inputThread.start();
			
			String line = null;
			while((line = keyboard.readLine()) != null){
				PW.println(line);
				PW.flush();
				if(line.equals("/quit")) {
					break;
				}
			}
			System.out.println("Ŭ���̾�Ʈ ���� ����");
		}catch(Exception e) {
			
		}finally {
			try {
				if(PW != null) {
					PW.close();
				}
				if(BR != null) {
					BR.close();
				}
				if(socket != null) {
					socket.close();
				}
				sc.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
