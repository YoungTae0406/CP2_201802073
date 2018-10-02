package ayayay;
import java.util.Scanner;

public class Market {
	private static int array_length;
	private Scanner sc;
	private Drink[] drink;
	private Beer[] beer;
	private Fruit[] fruit;
	private Snack[] snack;
	private Ramen[] ramen; //클래스 배열 생성
	private int[] index;
	
	public Market() {
		sc=new Scanner(System.in);
		array_length=10;
		drink = new Drink[array_length];
		beer = new Beer[array_length];
		fruit = new Fruit[array_length];
		snack = new Snack[array_length];
		ramen = new Ramen[array_length];
		index = new int[5]; index[0]=7; index[1]=3; index[2]=6; index[3]=4; index[4]=1;
	}

	void SetNamePriceProduct(String category, String...name) {
		int a,b,c,d,e; 
		if(category.toLowerCase().equals("drink")) {
			int n=name.length;
			for(int i=0;i<n;i++) {
				System.out.println("name :"+ name[i]);
				System.out.print("price : ");
				a = sc.nextInt();
				if(a>=500&&a<=2500) drink[i] = new Drink(name[i],a); //생성자로 값 넣기
				
				else {
					while(true) {
					System.out.println("!!inpute error");
				System.out.println("price :");
				a = sc.nextInt();
				if(a>=500&&a<=2500) {
					drink[i] = new Drink(name[i],a); break;}
				}
					}
			}
		}
		else if(category.toLowerCase().equals("beer")) {
			int n=name.length;
			for(int i=0;i<n;i++) {
				System.out.println("name :"+ name[i]);
				System.out.print("price : ");
				b = sc.nextInt();
				if(b>=500&&b<=2500) beer[i] = new Beer(name[i],b);
				else {
					while(true) {
					System.out.println("!!input error");
				System.out.println("price :");
				b = sc.nextInt();
				if(b>=500&&b<=2500) {
					beer[i] = new Beer(name[i],b); break;
				}
				}
					
					}
		}
	}
		else if(category.toLowerCase().equals("ramen")) {
			int n=name.length;
			for(int i=0;i<n;i++) {
				System.out.println("name :"+name[i]);
				System.out.println("price :");
				c = sc.nextInt();
				if(c>=500&&c<=2500) ramen[i] = new Ramen(name[i],c);
				else {
					while(true) {
					System.out.println("!!input error");
				System.out.println("price :");
				c = sc.nextInt();
				if(c>=500&&c<=2500) {
					ramen[i] = new Ramen(name[i],c); break;
				}
				}
					}
			}
		}
		else if(category.toLowerCase().equals("fruit")) {
			int n=name.length;
			for(int i=0;i<n;i++) {
				System.out.println("name :"+name[i]);
				System.out.println("price :");
				d = sc.nextInt();
				if(d>=500&&d<=2500) fruit[i] = new Fruit(name[i],d);
				else {
					while(true) {
					System.out.println("!!input error");
				System.out.println("price :");
				d = sc.nextInt();
				if(d>=500&&d<=2500) {
					fruit[i] = new Fruit(name[i],d); break;
				}
				}
					}
		}
		}
		else if(category.toLowerCase().equals("snack")) {
			int n=name.length;
			for(int i=0;i<n;i++) {

				System.out.println("name :"+name[i]);
				System.out.println("price :");
				e = sc.nextInt();
				if(e>=500&&e<=2500) snack[i] = new Snack(name[i],e);
				else { 
					while(true) {
					System.out.println("!!input error");
				System.out.println("price :");
				e = sc.nextInt();
				if(e>=500&&e<=2500) {
					snack[i] = new Snack(name[i],e); break;
				}
				}
				}
		}
		}
}//void setname 끝나는 곳.
	
	public void print(Fruit[] f, Beer[] b, Drink[] d, Ramen[] r, Snack[] s) {
		System.out.println("******************Product************");
		print(f);
		print(b);
		print(d);
		print(r);
		print(s);
		System.out.println("*************************************");
	}

	public Drink[] getD() {
		
		return drink;
	}

	public Beer[] getB() {
		
		return beer;
	}
	public Fruit[] getF() {return fruit;}
	public Snack[] getS() {return snack;
	}
	public Ramen[] getR() {return ramen;
	}
	private void print(Fruit[] f) {
		System.out.println("FRUIT :");
		for(int j=0;j<index[0];j++) {
		System.out.println("       "+"name :"+fruit[j].getName()+", price :"+fruit[j].getPrice());
		}		
	}
	private void print(Beer[] b) {
		System.out.println("BEER :");
		for(int j=0;j<index[1];j++) {
			System.out.println("       "+"name :"+beer[j].getName()+", price :"+beer[j].getPrice());
		}
	}
	private void print(Drink[] d) {
		System.out.println("DRINK :");
		for(int j=0;j<index[2];j++) {
			System.out.println("       "+"name :"+drink[j].getName()+", price :"+drink[j].getPrice());
		}
	}
	private void print(Ramen[] r) {
		System.out.println("RAMEN :");
		for(int j=0;j<index[3];j++) {
			System.out.println("       "+"name :"+ramen[j].getName()+", price :"+ramen[j].getPrice());
		}
	}
	private void print(Snack[] s) {
		System.out.println("SNACK :");
		for(int j=0;j<index[4];j++) {
			System.out.println("       "+"name :"+snack[j].getName()+", price :"+snack[j].getPrice());
		}
	}
	
}


