package callSwitch;

import java.util.Scanner;

import List.LinkedList;

public class callSwitchMain {

	static int size =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		LList list = new LList();
		String end="1"; 
		String callPhoneNumber=""; String callingNumber="";
				
		while(!end.trim().equals("")) { //enter키는 ""값
			System.out.print("수신 연결할 전화번호를 적으세요. : "); 
			end = sc.nextLine();
			String[] temp = end.split(" ");
			list.add(size, temp[0]); size++;
			if(!temp[0].equals("")) {
			list.add(size, temp[1]); size++;
			}
			else break;				
		}
		list.removeLast();

		System.out.print("전화를 걸 번호를 입력하세요.(0001 ~ 9999) : ");callPhoneNumber = sc.next();
		System.out.print("전화 벨이 울릴 번호 : "); 
		if(callPhoneNumber.equals(list.head.data)) {
			callingNumber = (String)list.tail.data;
		}
		if(callPhoneNumber.equals(list.head.data)&&
				callPhoneNumber.equals(list.tail.data)) {
			callingNumber = "0000";
		}
		if(!callPhoneNumber.equals(list.head.data)) {
			callingNumber = callPhoneNumber;
		}
		System.out.print(callingNumber);
		
		
		
		
		
		
		

	}

}
