package ����9;
import java.util.*;

public class Palindrome_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pd = new Palindrome();
		Scanner sc = new Scanner(System.in);
		String input="1";
		
		while(!input.trim().equals("")) {
			System.out.print("�Ǵ��ϰ��� �ϴ� ���ڸ� �Է��ϼ���.: ");
			input = sc.nextLine();
			if(input.equals("")) {
				break;
			}if(pd.palindrome(input)==true) {
				System.out.println(input+"�� ȸ�� �Դϴ�.");
			}
			else {
				System.out.println(input+"�� ȸ���� �ƴմϴ�.");}
			
		}
		

	}

}
