package cubex.mahesh.servicetest_oct7am

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*   var mPlayer = MediaPlayer.create(this@MainActivity,
                                        R.raw.dj)
        button.setOnClickListener {
                    mPlayer.start()
        }
        button2.setOnClickListener {
                    mPlayer.stop()
                    mPlayer = MediaPlayer.create(this@MainActivity,
                            R.raw.dj)
        }  */
        var i = Intent(this@MainActivity,
                MyService::class.java)
        button.setOnClickListener {
                startService(i)
        }
        button2.setOnClickListener {
                stopService(i)
        }
    }
}
