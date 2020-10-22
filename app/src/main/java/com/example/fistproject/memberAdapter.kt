package com.example.fistproject

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class memberAdapter (val item:ArrayList<MemberData>,val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {

        return 10
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}