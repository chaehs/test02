package org.techtown.test02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val returnToMainBtn = findViewById<Button>(R.id.returnToMainBtn)

        returnToMainBtn.setOnClickListener{
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

            finish()
        }

    }
}