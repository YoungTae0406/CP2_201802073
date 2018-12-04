package eatingPhilosopher;

public class Fork {
	ForkNumber fn;
	String name;
	public boolean empty = false; //존재하지 않으면 true

	public Fork(int name, ForkNumber FN) {
		this.name = "["+name+"]";
		this.fn = FN;
	}
	public synchronized void get() { //포크 가져가기
		while(empty) {//포크가 없으면
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true;
		fn.decrement();
		notifyAll();
	}
	public synchronized void put() { //포크 놓기
		while(!empty) {//포크가 있으면
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = false;
		fn.increment();
		notifyAll();
	}
	
}
