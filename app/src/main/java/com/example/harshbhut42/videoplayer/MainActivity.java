package com.example.harshbhut42.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView mVideo;
    MediaController mController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVideo = findViewById(R.id.videoView);
        mController = new MediaController(this);
        mController.setAnchorView(mVideo);
        mVideo.setMediaController(mController);
        mVideo.setVideoPath("android.resource://com.example.harshbhut42.videoplayer/"+ R.raw.hp );

        mVideo.start();
    }
}
