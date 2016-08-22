package com.octopuscard.capabilities;

public interface Shopable {

	public void recordShoping(String hdmNumber, int money);
	
	public void onShop();

}
