package 과제3;
import java.util.*;

public class Chocolate_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		ChocolateJar chocoJar = new ChocolateJar();
		
		int i=1;
		
		System.out.println("게임을 시작합니다.");
		System.out.println("항아리에는 "+chocoJar.getItem()+"개의 아이템이 있습니다.");
		System.out.println(chocoJar.status());
		System.out.println("1~3개의 아이템을 꺼낼 수 있으며 칠리를 꺼내면 패배합니다. \n시작!!");
		
		while(chocoJar.isEmpty()==false) {
			int maxtake = Math.min(3, chocoJar.getItem()-1);
			
			int take = random.nextInt(1000)%maxtake%3 + 1;

			int number;
			System.out.println("+------ "+i+"번째 턴! ------+");
			++i;
			System.out.println("몇 개를 뽑을까요?(1~3)");
			number = sc.nextInt();
			System.out.println("플레이어는 "+number+"개의 초콜릿을 꺼냈습니다.");
			chocoJar.takeItem(number);
			System.out.println(chocoJar.status());
			if(chocoJar.isEmpty()==true) {
				System.out.println("플레이어 승리!");
			}
			if(chocoJar.getChocolate()>=1) {
				if(chocoJar.getChocolate()==3) {
					take =3;}
				if(chocoJar.getChocolate()==2) {
					take =2;}
				if(chocoJar.getChocolate()==1) {
					take =1;}
			System.out.println("컴퓨터는 "+take+"개의 초콜릿을 꺼냈습니다.");
			chocoJar.takeItem(take);
			System.out.println(chocoJar.status());
			if(chocoJar.isEmpty()==true) {
				System.out.println("컴퓨터 승리!");
			}
			}

		}
		

	}

}
