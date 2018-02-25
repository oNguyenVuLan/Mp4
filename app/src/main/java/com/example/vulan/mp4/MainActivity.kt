package com.example.vulan.mp4

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.vulan.mp4.databinding.ActivityMainBinding
import com.example.vulan.mp4.media.MainViewModel

class MainActivity : AppCompatActivity() {

    private var mMainViewModel: MainViewModel = MainViewModel()
    private var mMainActivityBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mMainActivityBinding!!.viewModel = mMainViewModel
    }
}
