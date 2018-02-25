package com.example.vulan.mp4.media

import android.media.MediaPlayer

/**
 * Created by vulan on 2/25/2018.
 */
class MediaStreaming: MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener {
    private var mMediaPlayer: MediaPlayer = MediaPlayer()

    public fun init() {
        mMediaPlayer.setDataSource("http://178.32.116.58:8080/24-6")
        mMediaPlayer.setOnBufferingUpdateListener(this)
        mMediaPlayer.setOnCompletionListener(this)
    }

    public fun play() {
        mMediaPlayer.start()
    }

    public fun pause() {
        mMediaPlayer.pause()
    }

    public fun getPlayedState(): Boolean {
        return mMediaPlayer.isPlaying
    }

    override fun onCompletion(p0: MediaPlayer?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBufferingUpdate(p0: MediaPlayer?, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}