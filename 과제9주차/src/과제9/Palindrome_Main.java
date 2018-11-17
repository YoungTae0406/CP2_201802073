package 과제9;
import java.util.*;

public class Palindrome_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pd = new Palindrome();
		Scanner sc = new Scanner(System.in);
		String input="1";
		
		while(!input.trim().equals("")) {
			System.out.print("판단하고자 하는 문자를 입력하세요.: ");
			input = sc.nextLine();
			if(input.equals("")) {
				break;
			}if(pd.palindrome(input)==true) {
				System.out.println(input+"은 회문 입니다.");
			}
			else {
				System.out.println(input+"은 회문이 아닙니다.");}
			
		}
		

	}

}
