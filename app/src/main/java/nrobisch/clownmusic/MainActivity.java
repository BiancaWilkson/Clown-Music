package nrobisch.clownmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    Button mButton2;
    Button mButton3;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = findViewById(R.id.button);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.button:
                mp = MediaPlayer.create(getBaseContext(), R.raw.clown_music);
                mp.start();
                return;
            case R.id.button2:
                mp = MediaPlayer.create(getBaseContext(), R.raw.clown_music_chorus);
                mp.start();
                return;
            case R.id.button3:
                mp = MediaPlayer.create(getBaseContext(), R.raw.clown_music_base_boosted);
                mp.start();
                return;
        }
    }



}
