package com.sg.videoview.alma

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.MediaController
import com.sg.videoview.R
import com.sg.videoview.pass.Pass1Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val media=MediaController(this)
        media.setAnchorView(media)
     //  val video=Uri.parse("android.resource://$packageName/${R.raw.alma1tt}")
       val video=Uri.parse("android.resource://$packageName/${R.raw.alma1b}")



        videoView.setMediaController(media)
        videoView.setVideoURI(video)
        videoView.requestFocus()
        videoView.start()
        videoView.setOnCompletionListener {
           /* Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this, Pass1Activity::class.java))
              //  overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right)
                finish()
            },100)*/
            startActivity(Intent(this, Pass1Activity::class.java))

        }
    }
}