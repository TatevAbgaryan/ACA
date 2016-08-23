package com.octopuscard.capabilities;

import com.octopuscard.components.Terminal;
import com.octopuscard.components.cards.Card;

public interface Travelable {

	public void recordTravel(Terminal initialTerminal, Terminal destinationTerminal,int money, Card card);
	
	public void onTerminalTap(Terminal terminal, Card card);
}
