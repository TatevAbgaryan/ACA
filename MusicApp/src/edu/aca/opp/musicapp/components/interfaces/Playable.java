package edu.aca.opp.musicapp.components.interfaces;

public interface Playable {

	public String getTitle();

	public String getArtist();

	public int getDuration();

	public int getRate();

	public void setRate(int rate);
	
	public void play();
}
