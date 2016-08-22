package com.octopuscard.components;

import java.util.List;

import com.octopuscard.components.cards.Card;

public class Account {

	private User user;
	private String userName;
	private String password;
	private int balance;
	private List<Card> cards;
	private String memoriableQuestion;
	private String memoriableAnswer;

	private static Account account;
	
	public Account(User user, String userName, String password, String memoriableQuestion, String memoriableAnswer) {
		super();
		this.user = user;
		this.userName = userName;
		this.password = password;
		this.memoriableQuestion = memoriableQuestion;
		this.memoriableAnswer = memoriableAnswer;
	}
	
	public Account getAccount(String username){
		// knew it's a stupidity but should have something like this to get already existing account for testing from System
		if(account == null){
			System.out.println("create an account");
		}
		return account;
	}
	public void attachNewCrad(Card card){
		cards.add(card);
	}

	public User getUser() {
		return user;
	}

	public String getUserName() {
		return userName;
	};

	public String getPassword() {
		return password;
	}

	public int getBalabce() {
		return balance;
	}

	public String getMemoriableQuestion() {
		return memoriableQuestion;
	}

	public String getMemoriableAnswer() {
		return memoriableAnswer;
	}

	public void updateBalance(int money) {
		balance += money;
	}
	
}
