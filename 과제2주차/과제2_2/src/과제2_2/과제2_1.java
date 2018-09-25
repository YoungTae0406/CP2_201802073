package ����2_2;

public class ����2_1 {
	/*
	
	BankAccount Ŭ�����̴�.
	
	*/
	private String name;
	private long money; //�ܾ�
	private double interestrate;
	
	public ����2_1(String name, long money, double interestrate) {
		this.name = name;
		this.money = money;
		this.interestrate = interestrate;
	}
	public String getName() {
		return name;
	}
	public long getBalance() {
		return money;
	}
	public long Deposit(long balance) {
		return money +=balance;
	}
	public long Withdraw(long balance) {
		return money -=balance;
		
	}
	public long InstallmentSavingPredict(int month, long balance) {
		return (long) (money + balance * interestrate/12 * (month * (month+1)/2) + balance*month);
	}
	public long FixedDepositPredict(int month, long balance) {
		long ttt = money+balance;
		return (long) (ttt * (Math.pow((1+(interestrate/12)), month)-1))+ttt;
	}

}
