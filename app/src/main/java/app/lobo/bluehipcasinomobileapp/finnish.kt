package app.lobo.bluehipcasinomobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class finnish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finnish)
        val receivedIntent = intent
        val receivedNumber = receivedIntent.getIntExtra("число", 0)

        lateinit var scoreTextView: TextView
        scoreTextView = findViewById(R.id.score_text)
        scoreTextView.text = "Score: $receivedNumber"

        val imageView3 = findViewById<Button>(R.id.button)
        val imageView4 = findViewById<Button>(R.id.button2)

        imageView3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        imageView4.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}