package edu.aca.opp.musicapp;

import java.util.List;

import edu.aca.opp.musicapp.components.Playlist;
import edu.aca.opp.musicapp.components.interfaces.Playable;
import edu.aca.opp.musicapp.interfaces.PlayListHelper;

public class PlaylistHelperImpl implements PlayListHelper {

	@Override
	public void createNewPlaylist(List<Playable> tracks,String name) {

	}

	@Override
	public void switchPlaylist(String title) {
		// currentPlayList = read playlist with this title;
	}

	@Override
	public Playlist getPlayList() {
		Playlist playlist = null;
		// read previous one from db and return
		return playlist;
	}

	@Override
	public List<Playlist> getAllPlaylists() {
		// read and return all from gb
		return null;
	}

}
