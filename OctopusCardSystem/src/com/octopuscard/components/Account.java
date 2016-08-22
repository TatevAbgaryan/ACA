package com.octopuscard.components;

import java.util.ArrayList;
import java.util.List;

import com.octopuscard.components.cards.Card;

public class Account {

	private User user;
	private String userName;
	private String password;
	private List<Card> cards;
	private String memoriableQuestion;
	private String memoriableAnswer;

	
	public Account(User user, String userName, String password, String memoriableQuestion, String memoriableAnswer) {
		super();
		cards = new ArrayList<>();
		this.user = user;
		this.userName = userName;
		this.password = password;
		this.memoriableQuestion = memoriableQuestion;
		this.memoriableAnswer = memoriableAnswer;
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


	public String getMemoriableQuestion() {
		return memoriableQuestion;
	}

	public String getMemoriableAnswer() {
		return memoriableAnswer;
	}

	@Override
	public String toString() {
		return "Account [user=" + user + ", userName=" + userName + ", password=" + password + ", cards=" + cards
				+ ", memoriableQuestion=" + memoriableQuestion + ", memoriableAnswer=" + memoriableAnswer + "]";
	}

	
}
