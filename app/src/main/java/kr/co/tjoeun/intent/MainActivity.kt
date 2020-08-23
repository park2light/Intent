package kr.co.tjoeun.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        다른화면으로 이동하기 버튼이 눌리면 그때 넘어가게 한다.
        moveToOtherActivityBtn.setOnClickListener {
            val myIntent = Intent(this,OtherActivity::class.java) //티켓발권
            startActivity(myIntent) //티켓을 들고 실제 비행기에 탑승
        }

    }
}