package com.octopuscard.components;

import com.octopuscard.components.cards.Card;

public class Terminal {

	public static enum TerminalType {
		ENTRANCE, LEAVING
	};

	private String address;
	private TerminalType type;

	public Terminal(String address, TerminalType type) {
		this.address = address;
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public TerminalType getType() {
		return type;
	}

	public static int getMoneyForItinerary(Terminal souce, Terminal dest, Card card) {
		// count money using address information

		return 100;
	}

}
