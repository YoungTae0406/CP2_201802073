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
				
		while(!end.trim().equals("")) { //enterŰ�� ""��
			System.out.print("���� ������ ��ȭ��ȣ�� ��������. : "); 
			end = sc.nextLine();
			String[] temp = end.split(" ");
			list.add(size, temp[0]); size++;
			if(!temp[0].equals("")) {
			list.add(size, temp[1]); size++;
			}
			else break;				
		}
		list.removeLast();

		System.out.print("��ȭ�� �� ��ȣ�� �Է��ϼ���.(0001 ~ 9999) : ");callPhoneNumber = sc.next();
		System.out.print("��ȭ ���� �︱ ��ȣ : "); 
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
