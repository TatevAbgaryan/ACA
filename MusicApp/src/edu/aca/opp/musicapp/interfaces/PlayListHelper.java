package edu.aca.opp.musicapp.interfaces;

import java.util.List;

import edu.aca.opp.musicapp.components.Playlist;
import edu.aca.opp.musicapp.components.interfaces.Playable;

public interface PlayListHelper {

	/**
	 * creates new playlist form given tracks
	 */
	public void createNewPlaylist(List<Playable> tracks, String name);

	/**
	 * choose playlist from existing ones by title
	 */
	public void switchPlaylist(String title);

	/**
	 * returns previous ones if it's not first time, otherwise random
	 */
	public Playlist getPlayList();
	
	public List<Playlist> getAllPlaylists();

}
