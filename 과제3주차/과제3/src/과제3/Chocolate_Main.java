package ����3;
import java.util.*;

public class Chocolate_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		ChocolateJar chocoJar = new ChocolateJar();
		
		int i=1;
		
		System.out.println("������ �����մϴ�.");
		System.out.println("�׾Ƹ����� "+chocoJar.getItem()+"���� �������� �ֽ��ϴ�.");
		System.out.println(chocoJar.status());
		System.out.println("1~3���� �������� ���� �� ������ ĥ���� ������ �й��մϴ�. \n����!!");
		
		while(chocoJar.isEmpty()==false) {
			int maxtake = Math.min(3, chocoJar.getItem()-1);
			
			int take = random.nextInt(1000)%maxtake%3 + 1;

			int number;
			System.out.println("+------ "+i+"��° ��! ------+");
			++i;
			System.out.println("�� ���� �������?(1~3)");
			number = sc.nextInt();
			System.out.println("�÷��̾�� "+number+"���� ���ݸ��� ���½��ϴ�.");
			chocoJar.takeItem(number);
			System.out.println(chocoJar.status());
			if(chocoJar.isEmpty()==true) {
				System.out.println("�÷��̾� �¸�!");
			}
			if(chocoJar.getChocolate()>=1) {
				if(chocoJar.getChocolate()==3) {
					take =3;}
				if(chocoJar.getChocolate()==2) {
					take =2;}
				if(chocoJar.getChocolate()==1) {
					take =1;}
			System.out.println("��ǻ�ʹ� "+take+"���� ���ݸ��� ���½��ϴ�.");
			chocoJar.takeItem(take);
			System.out.println(chocoJar.status());
			if(chocoJar.isEmpty()==true) {
				System.out.println("��ǻ�� �¸�!");
			}
			}

		}
		

	}

}
