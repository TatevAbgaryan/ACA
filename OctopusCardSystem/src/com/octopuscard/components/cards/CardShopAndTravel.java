package com.octopuscard.components.cards;

import com.octopuscard.capabilities.Shopable;
import com.octopuscard.capabilities.Travelable;
import com.octopuscard.components.Account;
import com.octopuscard.components.Terminal;

public class CardShopAndTravel extends Card implements Shopable, Travelable {
	private Terminal previousTerminal;

	public CardShopAndTravel(Account account, String accountNumber, String pin) {
		super(account, accountNumber, pin);
	}

	@Override
	public void recordTravel(Terminal initialTerminal, Terminal destinationTerminal, int money) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTerminalTap(Terminal terminal) {
		if (previousTerminal == null) {
			previousTerminal = terminal;
		} else {
			int money = Terminal.getMoneyForItinerary(previousTerminal, terminal);
			this.recordTravel(previousTerminal, terminal, money);
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
