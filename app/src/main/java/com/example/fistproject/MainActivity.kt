package com.example.fistproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG:String =" 프로잭트 생성 "

    //현재 맴버 리스트
    val memberList=ArrayList<MemberData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 1..10){
            val memberData =MemberData(name="유저 이름 $i", profileImage = "https://lh3.googleusercontent.com/proxy/a7LKs73ecEyHUu_7dczmGemgUfcz_wxCWsHGGfGdfZi-i1F5z8Ax4VwUQ_oXhZeCkZj5g5-ChgcXZiNZxYJrgy8pec1nfVArZBNcXC8ob02f9y5W2olfu-VxndepIcHJsbCcpE9vRns0Na8YaSxPITU3W32yo_IAL2KMUrxZL_KLW3Te0ZYVrH9JgZpz6H02YXl-VwrmEfKxadnntPQsTKhyvGu0yOupLkoKSA" ,work = "개발자")
            this.memberList.add(memberData)
        }

        Log.d(TAG, "membersize ${this.memberList.size}")

    }
}