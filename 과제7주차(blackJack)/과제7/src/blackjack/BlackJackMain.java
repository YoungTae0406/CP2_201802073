package blackjack;

import java.util.Scanner;

public class BlackJackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player py = new Player();
		Dealer dl = new Dealer();
		StringBuffer shap = new StringBuffer();		
		String yesorno;
						
		System.out.println("--- [BlackJack] ---");
		System.out.println("게임을 시작합니다.");
		System.out.println("딜러가 덱을 셔플합니다.");
		py.CD.shuffle();
		dl.CD.shuffle();
		System.out.println("딜러가 카드를 받습니다.");
		dl.handing(); dl.handing();
		System.out.println("플레이어에게 카드 2장을 줍니다.");
		py.handing(); py.handing();
				
		while(true) {
			if(dl.score()<=16) {
				dl.handing();
			}else break;
		}
		for(int i=0;i<dl.hand2.size()-1;i++) {
			shap.append("[###_#] ");
		}
		while(true) {
			System.out.println("<현재 카드 상태>");
			System.out.println("Dealer : { ["+dl.hand2.get(0).getSuit()+"_"
					+dl.hand2.get(0).getRank()+"] "+shap+" }");
			System.out.println("Player : { "+py.statusCard()+"}"+" Score: "+py.score());
			System.out.println();
			if(py.score()>21) break;
			System.out.println("카드를 더 받으시겠습니까?(y/n)");
			yesorno = sc.nextLine();
			if(yesorno.equals("n")) break;
			else if(yesorno.equals("y")) {
				py.handing();
			}									
		}
		System.out.println("승패를 결정합니다!!");
		if(dl.score()<=21) {
			if(dl.score()>=py.score()) {
			System.out.println("딜러의 승리");}
		}else if(dl.score()>21)
			System.out.println("플레이어의 승리");
		
		if(py.score()<=21) {
		if(dl.score()<py.score()) {
			System.out.println("플레이어의 승리");
		}
		}else if(py.score()>21) {System.out.println("딜러의 승리");}
		System.out.println("<모든 카드 공개>");
		System.out.println("Dealer : { "+dl.statusCard()+"}"+" Score: "+dl.score());
		System.out.println("Player : { "+py.statusCard()+"}"+" Score: "+py.score());
		
		
		
	
	}

}
