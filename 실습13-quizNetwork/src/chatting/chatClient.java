package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class chatClient {// 클라이언트 ID를 입력하고 이를 쓰레드로 생성하여 서버에 연결하는 방식 
	//쓰레드를 통해 서버에서 전달되는 내용을 출력해줌
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
			
			System.out.print("클라이언트 ID 입력: ");
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
			System.out.println("클라이언트 접속 종료");
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
