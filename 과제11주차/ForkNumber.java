package eatingPhilosopher;

public class ForkNumber {
	int number;
	public ForkNumber(int number) {
		this.number = number;
	}
	public synchronized void increment() {
		number++;
	}
	public synchronized void decrement() {
		number--;
	}
}
