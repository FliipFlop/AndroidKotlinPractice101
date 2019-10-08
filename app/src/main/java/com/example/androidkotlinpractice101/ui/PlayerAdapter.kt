package com.example.androidkotlinpractice101.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.androidkotlinpractice101.R
import com.example.androidkotlinpractice101.model.DotaProPlayerModel
import kotlinx.android.synthetic.main.item_player.view.*

class PlayerAdapter(playerList: ArrayList<DotaProPlayerModel>?) :
    RecyclerView.Adapter<RViewHolder>() {

    private var playerList = playerList
    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RViewHolder {
        context = parent.context
        var rootView: View =
            LayoutInflater.from(context).inflate(R.layout.item_player, parent, false)
        return RViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return playerList?.size ?: 0
    }

    override fun onBindViewHolder(holder: RViewHolder, position: Int) {
        playerList?.let { holder.bind(it) }
    }
}

class RViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(playerList: ArrayList<DotaProPlayerModel>) {
        itemView.tvPlayerName.text = playerList.get(adapterPosition).name
    }
}
