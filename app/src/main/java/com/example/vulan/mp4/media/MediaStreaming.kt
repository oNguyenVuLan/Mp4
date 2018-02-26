package com.example.vulan.mp4.media

import android.media.MediaPlayer
import java.io.IOException

/**
 * Created by vulan on 2/25/2018.
 */
class MediaStreaming {
    private var mMediaPlayer: MediaPlayer = MediaPlayer()

    fun init() {
        try {
            mMediaPlayer = MediaPlayer()
            mMediaPlayer.setDataSource("http://178.32.116.58:8080/24-6")
            mMediaPlayer.prepareAsync()
        } catch (e: IOException) {
            e.stackTrace
        }
    }

    fun play() {
        mMediaPlayer.start()
    }

    fun pause() {
        mMediaPlayer.pause()
    }

    fun getPlayedState(): Boolean {
        return mMediaPlayer.isPlaying
    }


}