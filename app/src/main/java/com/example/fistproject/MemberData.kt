package com.example.fistproject

import android.util.Log

class MemberData(var name:String?=null,var profileImage:String?=null ,var work:String?=null) {
    val TAG: String="로그 "
    
    //기본 생성자
    init {
        Log.d(TAG, "MemberData-called: ")


    }
    
    
    
}