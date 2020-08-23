package kr.co.tjoeun.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message.*

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

//        화면이 만들어질때 첨부된 데이터를 받아서 텍스트 뷰에 반영

        val receivedMessage = intent.getStringExtra("message")
        messageTxt.text = receivedMessage
    }
}