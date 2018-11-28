package eatingPhilosopher;

public class eatingPhilosopher_Main {
	public static void main(String[] args) {
		int number = 5;
		ForkNumber forkN = new ForkNumber(number);
		Fork[] forks = new Fork[number];
		for(int i=0;i<number;i++) {
			forks[i] = new Fork(i, forkN); //이름 설정
			
		}

		philosopher[] philosophers = new philosopher[number];
		for(int i=0;i<number;i++) {
			philosophers[i] = new philosopher(i, forks[i], forks[(i+1)%number]);
		}//철학자 이름, 왼쪽 포크, 오른쪽 포크

		for(int i=number-1;i>=0;i--) {
			(new Thread(philosophers[i])).start();
		}
	}
}
