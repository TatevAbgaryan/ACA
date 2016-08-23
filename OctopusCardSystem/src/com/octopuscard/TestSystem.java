package com.octopuscard;

import java.util.Scanner;

import com.octopuscard.components.Account;
import com.octopuscard.components.Terminal;
import com.octopuscard.components.Terminal.TerminalType;
import com.octopuscard.components.cards.CardShopAndTravel;
import com.octopuscard.system.CardSystem;

public class TestSystem {

	public static void main(String... args) {
		Terminal source = new Terminal("Berkamutyun", TerminalType.ENTRANCE);
		Terminal dest = new Terminal("Eritasardakan", TerminalType.LEAVING);

		CardSystem cardSystem = new CardSystem();
		Scanner scanner = new Scanner(System.in);
		String command;
		Account account = null;
		CardShopAndTravel card = null;
		System.out.println("write command");

		while(true) {
			command = scanner.nextLine();
			switch (command) {
			case "create an account":
				account = cardSystem.createAccount();
				break;
			case "attach card":
				card = (CardShopAndTravel) cardSystem.attachCard(account);
				break;
			case "top up card":
				cardSystem.topUp(card);
				break;
			case "enter metro":
				card.onTerminalTap(source, card);
				break;
			case "leave metro":
				card.onTerminalTap(dest,card);
				break;
			case "print transactions":
				cardSystem.printTransactions();
				break;
			case "exit":
				cardSystem.exit();
				break;
			}
		} 
	}
}
