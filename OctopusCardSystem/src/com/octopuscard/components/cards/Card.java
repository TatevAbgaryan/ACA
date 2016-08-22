package com.octopuscard.components.cards;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import com.octopuscard.capabilities.Renewable;
import com.octopuscard.components.Account;

public class Card implements Renewable{

	private UUID id;
	private String accountNumber;
	private String pin;
	private Account account;
	private boolean isStolen;
	
	public Card(Account account, String accountNumber, String pin) {
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getPin() {
		return pin;
	}

	public boolean isStolen() {
		return isStolen;
	}

	public void setStolen(boolean isStolen) {
		this.isStolen = isStolen;
	}
	
	@Override
	public final void renew(Card card, Account account){
		System.out.print("answer memoriable question to continue renewing your card \n" + account.getMemoriableQuestion());
		Scanner scanner	 = new Scanner(System.in);
		String answer = scanner.nextLine();
		if(!answer.equals(account.getMemoriableAnswer())){
			System.out.println("Wrong answer!");
		}else{
			card.setStolen(isStolen);
			// save card state as stolen and generate new card
			String newPin = (new Random().nextInt(1000) + 1000) +"";
			card = new Card(account, answer, newPin);
		}
	}

}
