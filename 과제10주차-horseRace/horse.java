package horseRace;

import java.util.Random;

public class horse implements Runnable{
	int ab;
	public horse() {}
	public horse(String name) {
		this.name = name;
	}

	Random rd = new Random();
	String name;
	int distance = 0; public static int rank = 1;
	public void run() {
		while(true) {
			int random = rd.nextInt(11);
			int temp = rd.nextInt(100);
			distance += random;

			if(temp<10) {
				try {
					Thread.sleep(100); //0.1초씩 대기
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println(name+"번 말은 지금"
					+distance+"m에 있습니다.");

			if(distance >=100) {
				System.out.println(name+"번 말이"
						+rank+"등으로 들어왔습니다.");
				ab = rank;
				rank++;

				break;
			}

			try {
				Thread.sleep(1000); //1초씩 대기
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

		}//while

	}//run
	public int getAB() {
		return ab;
	}

}
