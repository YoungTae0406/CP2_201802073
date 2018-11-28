package eatingPhilosopher;
import java.util.Random;

public class philosopher implements Runnable{
	String name;
	Random rd = new Random();
	Fork right;
	Fork left;
	boolean eat1 = false, eat2 = false; //포크있으면 true

	public philosopher(int name, Fork f, Fork o) {
		this.name = "["+name+"]";
		this.left = f;
		this.right = o;
	}
	public void think() {
		System.out.println(name+" 철학자 생각중...");
		int random = rd.nextInt(101);
		try {
			Thread.currentThread().sleep(random);
		} catch (InterruptedException e) {

		}
	}
	public synchronized void eat() {
		System.out.println(name+" 철학자 먹는중...");
		System.out.println(name+"철학자가 "+left.name+" 포크를 놓았습니다.");
		System.out.println(name+"철학자가 "+right.name+" 포크를 놓았습니다.");
	}
	public void run() {
		while(!(eat1 && eat2)) {//둘 다 포크없거나, 한 쪽에만 포크가 있을 때
			if(left.fn.number==0) {
				System.out.println(name+"철학자가"+left.name+" 포크를 놓았습니다.");
				left.put();
				eat1 = false;
			}
			if(!left.empty) {
				left.get();
				System.out.println(name+"철학자가 "+left.name+" 포크를 들었습니다.");
				eat1 = true;
			}

			if(!right.empty) {
				right.get();
				System.out.println(name+"철학자가 "+right.name+" 포크를 들었습니다.");
				eat2 = true;
			}
		}
		eat();
		left.put();
		right.put();
		think();
	}
}
