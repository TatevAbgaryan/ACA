package com.octopuscard.capabilities;

import com.octopuscard.components.Terminal;

public interface Travelable {

	public void recordTravel(Terminal initialTerminal, Terminal destinationTerminal,int money);
	
	public void onTerminalTap(Terminal terminal);
}
