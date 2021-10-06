package com.clearsky77.openurlinbrowser

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 국어사전
        krDicUrlBtn.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)  // intent 생성
            openURL.data = Uri.parse("https://ko.dict.naver.com/") // 주소 셋팅
            startActivity(openURL) // 실행
        }
        // 영어사전
        enDicUrlBtn.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)  // intent 생성
            openURL.data = Uri.parse("https://en.dict.naver.com/") // 주소 셋팅
            startActivity(openURL) // 실행
        }
    }
}