package com.example.android.musicalstructureapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songNameTv = (TextView) listItemView.findViewById(R.id.song_name_tv);

        songNameTv.setText(currentSong.getSongNameId());

        TextView songArtistTv = (TextView) listItemView.findViewById(R.id.song_artist_tv);

        songArtistTv.setText(currentSong.getSongArtistId());

        return listItemView;
    }

}
