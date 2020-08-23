package kr.co.tjoeun.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)


        returnToMainBtn.setOnClickListener {

            //val returnStart = Intent(this,MainActivity::class.java)
            //startActivity(returnStart)
            finish()
        }
    }
}