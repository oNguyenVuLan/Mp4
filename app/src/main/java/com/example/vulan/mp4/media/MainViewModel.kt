package com.example.vulan.mp4.media

import android.databinding.BaseObservable
import com.example.vulan.mp4.BR

/**
 * Created by vulan on 2/25/2018.
 */
class MainViewModel : BaseObservable() {
    private var mMediaStreaming: MediaStreaming = MediaStreaming()

    public fun isPlayed(): Boolean {
        return mMediaStreaming.getPlayedState()
    }

    public fun setPlayState() {
        if (mMediaStreaming.getPlayedState()) {
            mMediaStreaming.pause()
        } else {
            mMediaStreaming.play()
        }
        notifyPropertyChanged(BR._all)
    }

    init {
        mMediaStreaming.init()
    }
}