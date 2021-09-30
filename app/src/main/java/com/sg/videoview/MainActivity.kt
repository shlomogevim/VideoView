package com.sg.videoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val media=MediaController(this)
        media.setAnchorView(media)
      // val offline=Uri.parse("android.resource://$packageName/${R.raw.alma10}")
       val offline=Uri.parse("android.resource://$packageName/${R.raw.dance1}")



        videoView.setMediaController(media)
        videoView.setVideoURI(offline)
        videoView.requestFocus()
        videoView.start()
    }
}