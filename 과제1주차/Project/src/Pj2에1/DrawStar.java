package Pj2��1;
import java.util.*;

public class DrawStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �ٷ� ���� ����ұ��?");
		int one = sc.nextInt();
		System.out.println("---[1��]---");
		if(one<=0) {
			for(int i=0;i<5;i++) {
				for(int j=0;j<=i;j++) System.out.print("*");
				System.out.println();
			}
		}
		
		for(int i=0;i<one;i++) {
			for(int j=0;j<=i;j++) System.out.print("*");
			System.out.println();
		}
		System.out.println("�� ���� �ٷ� ���� ����ұ��?");
		int two = sc.nextInt();
		System.out.println("---[2��]---");
		if(two<=0) {
			for(int i=5;i>0;i--) {
				for(int j=1;i>=j;j++) System.out.print("*");
				System.out.println();
			}
		}
		
		for(int i=two;i>0;i--) {
			for(int j=1;i>=j;j++) System.out.print("*");
			System.out.println();
		}
		System.out.println("�� ���� �ٷ� ���� ����ұ��?(Ȧ����)");
		int three = sc.nextInt();
		System.out.println("---[3��]---");
		if(three<=0) {
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					if(i<=9/2) {
						if(i+j<=9/2-1) System.out.print(" ");
						else if(j-i>=9/2+1) System.out.print(" ");
						else System.out.print("*");
					}
					else if(i>9/2) {
						if(i-j>=9/2+1) System.out.print(" ");
						else if(i+j>=9/2*3+1) System.out.print(" ");
						else System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		for (int i=0;i<three;i++) {
			for(int j=0;j<three;j++) {
				if(i<=three/2) {
					if(i+j<=three/2-1) System.out.print(" ");
					else if(j-i>=three/2+1) System.out.print(" ");
					else System.out.print("*");
				}
				else if (i>three/2) {
					if(i-j>=three/2+1) System.out.print(" ");
					else if(i+j>=three/2*3+1) System.out.print(" ");
					else System.out.print("*");
				}
			}
			System.out.println();
			
		}
			
		
		
		
	}

}
