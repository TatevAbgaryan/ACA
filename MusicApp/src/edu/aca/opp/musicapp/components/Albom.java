package edu.aca.opp.musicapp.components;

import java.util.List;

import edu.aca.opp.musicapp.components.interfaces.Playable;

public class Albom {

	private List<Playable> tracks;
	private String title;
	private String description;
	private String artist;
	
	public Albom(List<Playable> tracks, String title, String description, String artist) {
		this.tracks = tracks;
		this.title = title;
		this.description = description;
		this.artist = artist;
	}
	
	public void addTrack(Playable track){
		tracks.add(track);
	};
	
	public String getArtist(){
		return artist;
	}
	
	public String getDescription(){
		return description;
	}
	
	public List<Playable> getTracks(){
		return tracks;
	}
	
	public String getTitle(){
		return title;
	}
}
