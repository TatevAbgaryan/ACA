package com.octopuscard.components.cards;

import java.util.Date;

import com.octopuscard.capabilities.Shopable;
import com.octopuscard.capabilities.Travelable;
import com.octopuscard.components.Account;
import com.octopuscard.components.Terminal;
import com.octopuscard.transactions.TransactionManager;

public class CardShopAndTravel extends Card implements Shopable, Travelable {
	private Terminal previousTerminal;
	private TransactionManager transactionManager = new TransactionManager();

	public CardShopAndTravel(Account account, String accountNumber, String pin) {
		super(account, accountNumber, pin);
	}

	@Override
	public void recordTravel(Terminal initialTerminal, Terminal destinationTerminal, int money, Card card) {
		transactionManager.record(money, new Date(), card, "traveling type");

	}

	@Override
	public void onTerminalTap(Terminal terminal, Card card) {
		if (previousTerminal == null) {
			previousTerminal = terminal;
		} else {
			int money = Terminal.getMoneyForItinerary(previousTerminal, terminal, card);
			this.recordTravel(previousTerminal, terminal, money, card);
		}
	}

	@Override
	public void recordShoping(String hdmNumber, int money) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onShop() {
		// TODO Auto-generated method stub

	}

}
