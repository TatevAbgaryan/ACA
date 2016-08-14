package edu.aca.opp.musicapp.components.abstracts;

import edu.aca.opp.musicapp.components.interfaces.Playable;

public abstract class Track implements Playable{

	private String title;
	private String artist;
	private int duration;
	private int rate;

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getDuration() {
		return duration;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public abstract void play();
	
}
