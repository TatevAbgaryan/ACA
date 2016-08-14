package edu.aca.opp.musicapp;

import java.util.List;

import edu.aca.opp.musicapp.components.Playlist;
import edu.aca.opp.musicapp.interfaces.MusicAppInterface;

public class MusicApp implements MusicAppInterface {
	
	PlaylistHelperImpl helper = new PlaylistHelperImpl();
	Playlist current = helper.getPlayList();
	
	@Override
	public void playCurrent() {
		current.play();
	}

	@Override
	public void listAlboms() {
		// think should have helper classes for Alboms and songs also, 
		// to do some up from component level things.
		
	}

	@Override
	public void listPlaylists() {
		List<Playlist> list = helper.getAllPlaylists();
		
	}

	@Override
	public void createNewPlaylist() {
		
		// TODO Auto-generated method stubhe
	}

	@Override
	public void importNewAlbom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listTracks() {
		// TODO Auto-generated method stub
		
	}

}
