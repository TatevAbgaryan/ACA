package com.octopuscard.transactions;

import java.util.Date;

import com.octopuscard.components.cards.Card;

public interface ITransaction {

	public void record(int money, Date date, Card card, String cardUsageType);

	public void printLast();

	public void printAll();
}
