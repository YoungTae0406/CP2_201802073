package ����2_2;

public class ����2_1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		����2_1 account = new ����2_1("������", 300000, 0.1);
		long money; int month;
		
		System.out.println("���� ������ "+account.getName()+"�̰�, �ܾ��� "+account.getBalance()+" �Դϴ�. \n");
		
		money = 100000;
		account.Deposit(money);
		System.out.println("���¿� "+money+"���� �Ա��Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�.");
		
		money = 100000;
		if(account.getBalance()<money) {
			System.out.println("�ܾ��� �����մϴ�.");}
		else if(account.getBalance()>=money) {
			account.Withdraw(money);
			System.out.println("���¿� "+money+"���� ����Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�.");}
		
		money = 10000;
		month = 12;
		System.out.println("�ſ� "+money+"���� "+month+"���� �����ϸ�, �ܾ��� "+account.InstallmentSavingPredict(month, money)+"���� �ɰ��Դϴ�.");
		
		money = 2000000;
		month = 24;
		System.out.println(money+"���� "+month+"���� ���� �����ϸ�, �ܾ��� "+account.FixedDepositPredict(month, money)+"���� �ɰ��Դϴ�.");

	}

}
