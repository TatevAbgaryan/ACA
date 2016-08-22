package com.octopuscard.capabilities;

import com.octopuscard.components.Account;
import com.octopuscard.components.cards.Card;

public interface Renewable {

	public void renew(Card card, Account account);
	
}
