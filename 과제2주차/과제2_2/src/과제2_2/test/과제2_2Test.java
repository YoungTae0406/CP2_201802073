package ����2_2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import ����2_2.����2_1;

class ����2_2Test {

	@Test
	void testGetName() {
		����2_1 account = new ����2_1("������", 300000, 0.1);
		assertEquals("������", account.getName());
	}
	@Test
	void testnull() {
		����2_1 account = new ����2_1("������", 300000, 0.1);
		assertNotNull(account);
	}
	@Test
	void testDeposit2() {
		����2_1 account = new ����2_1("������", 300000, 0.1);
		assertEquals(20000300000l, account.Deposit(20000000000l));
	}

	@Test
	void testGetBalance() {
		����2_1 account = new ����2_1("������", 300000, 0.1);
		assertEquals(300000, account.getBalance());
	}

	@Test
	void testDeposit() {
		����2_1 account = new ����2_1("������", 300000, 0.1);
		assertEquals(500000, account.Deposit(200000));
	}

	@Test
	void testWithdraw() {
		����2_1 account = new ����2_1("������", 300000, 0.1);
		assertEquals(100000, account.Withdraw(200000));
	}

	@Test
	void testInstallmentSavingPredict() {
		����2_1 account = new ����2_1("������", 300000, 0.1);
		long money = 10000;
		int month = 12;
		assertEquals(426500, account.InstallmentSavingPredict(month, money));
	}

	@Test
	void testFixedDepositPredict() {
		����2_1 account = new ����2_1("������", 300000, 0.1);
		assertEquals(2806899, account.FixedDepositPredict(24, 2000000));
	}

}
