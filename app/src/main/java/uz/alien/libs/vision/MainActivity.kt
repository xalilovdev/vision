package uz.alien.libs.vision

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            LinearLayout(this, {
                addView(TextView(this@MainActivity, "Hello world!"))
            })
        )
    }
}