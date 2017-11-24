package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageButton playButton;

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(R.string.song_1_name, R.string.song_1_artist));
        songs.add(new Song(R.string.song_2_name, R.string.song_2_artist));
        songs.add(new Song(R.string.song_3_name, R.string.song_3_artist));
        songs.add(new Song(R.string.song_4_name, R.string.song_4_artist));
        songs.add(new Song(R.string.song_5_name, R.string.song_5_artist));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        playButton = (ImageButton) findViewById(R.id.play_button);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(intent);
            }
        });

        listView.setAdapter(adapter);
    }
}
