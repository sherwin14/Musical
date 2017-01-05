package com.webteq.musical;

import android.content.Context;
import android.media.MediaPlayer;


/**
 * Created by sherw on 1/4/2017.
 */

public class SoundMediaPlayer {
    private Context _context;
    private int _raw;
    private MediaPlayer mediaPlayer;
    public SoundMediaPlayer(Context _context, int _raw) {
        this._context = _context;
        this._raw = _raw;
        //Testing comment
        mediaPlayer = MediaPlayer.create(_context,_raw);
    }

    public void play() {

        mediaPlayer.start();
    }
    public void stop(){
        mediaPlayer.seekTo(-1);
        mediaPlayer.pause();
        //mediaPlayer.release();
    }
    public void pause(){
        mediaPlayer.pause();
    }

}
