package edu.aca.opp.musicapp.components;

import java.util.List;

import edu.aca.opp.musicapp.components.interfaces.Playable;

public class Playlist {

	private List<Playable> tracks;
	private String order; //  random, or by sequence
	private String name;
	private static int index;
	
	public Playlist(List<Playable> tracks, String name) {
		this.tracks = tracks;
	}

	public List<Playable> getTracks() {
		return tracks;
	}

	public void importAlbom(Albom albom) {
		tracks.addAll(albom.getTracks());
	}

	public void addTrack(Playable track) {
		tracks.add(track);
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Playable getCurrent() {
		return tracks.get(index);
	}

	public void play() {
		this.getTracks().get(index).play();
		index++;
	}
	
}
