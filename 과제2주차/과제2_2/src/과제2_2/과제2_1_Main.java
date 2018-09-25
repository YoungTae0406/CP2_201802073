package 과제2_2;

public class 과제2_1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		과제2_1 account = new 과제2_1("이형진", 300000, 0.1);
		long money; int month;
		
		System.out.println("계좌 주인은 "+account.getName()+"이고, 잔액은 "+account.getBalance()+" 입니다. \n");
		
		money = 100000;
		account.Deposit(money);
		System.out.println("계좌에 "+money+"원을 입금하여, 잔액이 "+account.getBalance()+"원이 되었습니다.");
		
		money = 100000;
		if(account.getBalance()<money) {
			System.out.println("잔액이 부족합니다.");}
		else if(account.getBalance()>=money) {
			account.Withdraw(money);
			System.out.println("계좌에 "+money+"원을 출금하여, 잔액이 "+account.getBalance()+"원이 되었습니다.");}
		
		money = 10000;
		month = 12;
		System.out.println("매월 "+money+"원씩 "+month+"개월 적금하면, 잔액이 "+account.InstallmentSavingPredict(month, money)+"원이 될것입니다.");
		
		money = 2000000;
		month = 24;
		System.out.println(money+"원을 "+month+"개월 정기 예금하면, 잔액이 "+account.FixedDepositPredict(month, money)+"원이 될것입니다.");

	}

}
