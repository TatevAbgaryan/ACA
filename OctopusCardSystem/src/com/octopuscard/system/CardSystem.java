package com.octopuscard.system;

import java.util.Scanner;

import com.octopuscard.components.Account;
import com.octopuscard.components.Terminal;
import com.octopuscard.components.User;
import com.octopuscard.components.cards.CardShopAndTravel;
import com.octopuscard.transactions.TransactionManager;

public class CardSystem implements ICardSystem {

	TransactionManager transactionManager = new TransactionManager();

	@Override
	public void tapTerminal(Terminal terminal, CardShopAndTravel card) {
		card.onTerminalTap(terminal);
	}

	@Override
	public void topUp(int money) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printTransactions() {
		transactionManager.printAll();
	}

	@Override
	public void exit() {
		return;
	}

	@Override
	public Account createAccount() {
		System.out.println("write your name ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("write your username for login");
		String userName = scanner.nextLine();
		System.out.println("write your password for login");
		String password = scanner.nextLine();
		System.out.println("write memoriable question to answer for renewing your cards in case od losing it");
		String memoriableQuestion = scanner.nextLine();
		System.out.println("and answer your qouestion");
		String memoriableAnswer = scanner.nextLine();

		User user = new User(name, name, null, "02AA621");
		return new Account(user, userName, password, memoriableQuestion, memoriableAnswer);
	}

}
