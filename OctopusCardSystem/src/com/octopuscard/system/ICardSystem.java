package com.octopuscard.system;

import com.octopuscard.components.Account;
import com.octopuscard.components.Terminal;
import com.octopuscard.components.cards.Card;
import com.octopuscard.components.cards.CardShopAndTravel;

public interface ICardSystem {

	public Account createAccount();

	public Card attachCard(Account account);

	public void tapTerminal(Terminal terminal, CardShopAndTravel card);

	public void topUp(Card card);

	public void printTransactions();

	public void exit();
}
