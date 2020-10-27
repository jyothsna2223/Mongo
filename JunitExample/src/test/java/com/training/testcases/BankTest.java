package com.training.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.example.Bank;
import com.training.example.ExceedingException;
import com.training.example.NegativevalueException;

class BankTest {
	Bank bank;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		bank=new Bank(8000);
		System.out.println("Before each testcase");
	}

	@AfterEach
	void tearDown() throws Exception {
		bank=null;
		System.out.println("After each testcase");
	}
	@Test
	void testWithdraw() throws ExceedingException {
		double balance=bank.withdraw(2000);
		assertEquals(6000,balance);
	}

	@Test
	void testWithdrawExceeding() {
		assertThrows(ExceedingException.class,()->bank.withdraw(4100));
		
	}
	@Test
	void testWithdrawNeg() {
		assertThrows(NegativevalueException.class,()->bank.withdraw(-4000));
		
	}
	 @Test
	    void testWithdrawEqual() {
	        assertThrows(ExceedingException.class,()->bank.withdraw(8000));
	       
	    }
	@Test
	void testDeposit() throws ExceedingException {
		double balance=bank.deposit(2000);
		assertEquals(10000,balance);
	}
	@Test
	@DisplayName("Test deposit")
	void testDepositExceeding() {
		assertThrows(ExceedingException.class,()->bank.deposit(5000));
		
	}
	@Test
	void testDepositNeg() {
		assertThrows(NegativevalueException.class,()->bank.deposit(-1000));
		
	}


}
