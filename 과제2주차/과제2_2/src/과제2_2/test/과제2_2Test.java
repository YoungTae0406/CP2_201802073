package 과제2_2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import 과제2_2.과제2_1;

class 과제2_2Test {

	@Test
	void testGetName() {
		과제2_1 account = new 과제2_1("이형진", 300000, 0.1);
		assertEquals("이형진", account.getName());
	}
	@Test
	void testnull() {
		과제2_1 account = new 과제2_1("이형진", 300000, 0.1);
		assertNotNull(account);
	}
	@Test
	void testDeposit2() {
		과제2_1 account = new 과제2_1("이형진", 300000, 0.1);
		assertEquals(20000300000l, account.Deposit(20000000000l));
	}

	@Test
	void testGetBalance() {
		과제2_1 account = new 과제2_1("이형진", 300000, 0.1);
		assertEquals(300000, account.getBalance());
	}

	@Test
	void testDeposit() {
		과제2_1 account = new 과제2_1("이형진", 300000, 0.1);
		assertEquals(500000, account.Deposit(200000));
	}

	@Test
	void testWithdraw() {
		과제2_1 account = new 과제2_1("이형진", 300000, 0.1);
		assertEquals(100000, account.Withdraw(200000));
	}

	@Test
	void testInstallmentSavingPredict() {
		과제2_1 account = new 과제2_1("이형진", 300000, 0.1);
		long money = 10000;
		int month = 12;
		assertEquals(426500, account.InstallmentSavingPredict(month, money));
	}

	@Test
	void testFixedDepositPredict() {
		과제2_1 account = new 과제2_1("이형진", 300000, 0.1);
		assertEquals(2806899, account.FixedDepositPredict(24, 2000000));
	}

}
