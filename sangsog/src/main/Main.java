package main;

import asset.*; // Income, Expense, Transfer 포함
import deal.Transaction;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Transaction> list = new ArrayList<>();
		int balance = 0;

		list.add(new Income(10000, "20260116", "월급"));
		list.add(new Expense(2500, "20260116", "커피"));
		list.add(new Transfer(3000, "20260116", "친구송금"));

		System.out.println("                        ======= 거래 처리 시작 =======");

		for (Transaction t : list) {
			if (t instanceof Income) {
				balance += t.getMoney();
			} else if (t instanceof Expense || t instanceof Transfer) {
				balance -= t.getMoney();
			}

			System.out.println(t.toString() + " -> [현재 잔액: " + balance + "원]");
		}

		System.out.println("                       ============================");
		System.out.println("                             최종 잔액: " + balance + "원");
	}
}