package com.octopuscard.transactions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Date;

import com.octopuscard.components.cards.Card;

public class TransactionManager implements ITransaction {

	@Override
	public void record(int money, Date date, Card card, String cardUsageType) {
		card.updateBalance(-money);
		String record = "spent money = " + money + "from card " + card.getAccountNumber() + " on " + date.toString()
				+ " for " + cardUsageType + " \n";
		PrintWriter writer = null;
		File file = new File("C:/Users/tabgarya/Desktop/file.txt");
		file.getParentFile().mkdirs();
		try {
			writer = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		writer.println(record);
		writer.flush();
		writer.close();
	}

	@Override
	public void printLast() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printAll() {
		BufferedReader bufferedReader = null;
		try {
			String sCurrentLine;
			bufferedReader = new BufferedReader(new FileReader("C:/Users/tabgarya/Desktop/file.txt"));
			while ((sCurrentLine = bufferedReader.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
