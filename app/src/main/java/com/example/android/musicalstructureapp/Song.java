package com.example.android.musicalstructureapp;

public class Song {

    /** String resource ID for the song name */
    private int mSongNameId;

    /** String resource ID for the song artist */
    private int mSongArtistId;

    /**
     * Create a new Song object.
     *
     * @param songNameId    is the string resource ID for the song name
     * @param songArtistId  is the string resource ID for the song artist
     */
    public Song(int songNameId, int songArtistId) {
        mSongNameId = songNameId;
        mSongArtistId = songArtistId;
    }

    /**
     * Get the string resource ID for the song name
     */
    public int getSongNameId() {
        return mSongNameId;
    }

    /**
     * Get the string resource ID for the song artist
     */
    public int getSongArtistId() {
        return mSongArtistId;
    }
}
