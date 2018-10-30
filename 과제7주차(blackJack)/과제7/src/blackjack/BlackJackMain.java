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
		System.out.println("������ �����մϴ�.");
		System.out.println("������ ���� �����մϴ�.");
		py.CD.shuffle();
		dl.CD.shuffle();
		System.out.println("������ ī�带 �޽��ϴ�.");
		dl.handing(); dl.handing();
		System.out.println("�÷��̾�� ī�� 2���� �ݴϴ�.");
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
			System.out.println("<���� ī�� ����>");
			System.out.println("Dealer : { ["+dl.hand2.get(0).getSuit()+"_"
					+dl.hand2.get(0).getRank()+"] "+shap+" }");
			System.out.println("Player : { "+py.statusCard()+"}"+" Score: "+py.score());
			System.out.println();
			if(py.score()>21) break;
			System.out.println("ī�带 �� �����ðڽ��ϱ�?(y/n)");
			yesorno = sc.nextLine();
			if(yesorno.equals("n")) break;
			else if(yesorno.equals("y")) {
				py.handing();
			}									
		}
		System.out.println("���и� �����մϴ�!!");
		if(dl.score()<=21) {
			if(dl.score()>=py.score()) {
			System.out.println("������ �¸�");}
		}else if(dl.score()>21)
			System.out.println("�÷��̾��� �¸�");
		
		if(py.score()<=21) {
		if(dl.score()<py.score()) {
			System.out.println("�÷��̾��� �¸�");
		}
		}else if(py.score()>21) {System.out.println("������ �¸�");}
		System.out.println("<��� ī�� ����>");
		System.out.println("Dealer : { "+dl.statusCard()+"}"+" Score: "+dl.score());
		System.out.println("Player : { "+py.statusCard()+"}"+" Score: "+py.score());
		
		
		
	
	}

}
