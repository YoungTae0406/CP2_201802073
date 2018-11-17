package °úÁ¦9;

public class Coin {
	private int a=0;
	private int[] coins = {50, 25, 10, 5, 1};
		
	public int minimalCoin(int money, int i) {
		if(i>=5) return a;
		else {
			a += money/coins[i];
			return minimalCoin(money%coins[i], i+1);
		}
	}
	

}
