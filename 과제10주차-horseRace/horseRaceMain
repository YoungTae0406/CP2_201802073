package horseRace;

import java.util.Scanner;

public class horseRaceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String horseNumber;
		horse[] h = new horse[5]; Thread[] horse = new Thread[5];//그저 배열을 생성.
		for(int i=0;i<5;i++) {
			h[i] = new horse(i+1+"");
			horse[i] = new Thread(h[i]);   // 객체를 생성
		}

		System.out.println("5마리의 말이 100m 경주를 합니다.");
		System.out.println("말 번호를 고르세요. (1~5)");
		horseNumber = sc.next();
		System.out.println(horseNumber+"번 말을 고르셨습니다.");
		System.out.println("### 경주를 시작합니다 ###");
		for(int i=0;i<5;i++) {
			horse[i].start();
		}

		try {
			for(int i=0;i<5;i++) {
				horse[i].join();
			}
		}catch(Exception e) {

		}

		System.out.println("### 경기 결과 ###");
		for(int i=0;i<5;i++) {
			if(!horseNumber.equals(horse[i])) {
				System.out.println("["+h[i].getAB()+"등]  "+h[i].name+"번말");}
			else {
				System.out.println("["+h[i].getAB()+"등]  "+h[i].name+"번말         <--당신이 고른 말");
			}
		}

	}

}
