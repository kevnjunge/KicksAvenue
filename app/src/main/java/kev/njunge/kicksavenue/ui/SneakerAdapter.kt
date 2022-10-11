package kev.njunge.kicksavenue.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import kev.njunge.kicksavenue.R
import kev.njunge.kicksavenue.Sneaker


class SneakerAdapter(val context: Context, var sneakerList: ArrayList<Sneaker>) :
    RecyclerView.Adapter<SneakerAdapter.SneakerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SneakerViewHolder {

        val itemView = LayoutInflater.from(context).inflate(R.layout.list_view_item, parent, false)
        return SneakerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SneakerViewHolder, position: Int) {
        val sneaker = sneakerList[position]
        holder.setData(sneaker, position)

        holder.itemView.setOnClickListener { view ->

            val bundle = Bundle().apply {
                putString("sneakerName", sneaker.name)
                putString("sneakerDescription", sneaker.description)
                putString("sneakerImage", sneaker.imageId.toString())
                putInt("index", sneaker.i)
            }


            Navigation.findNavController(view).navigate(R.id.shoeDetailFragment, bundle)

        }
    }

    override fun getItemCount(): Int {
        return sneakerList.size
    }

    inner class SneakerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var currentPosition: Int = -1
        private var currentSneaker: Sneaker? = null

        private val tvSneakerName = itemView.findViewById<TextView>(R.id.tvSneakerName)
        private val imgSneakerImage = itemView.findViewById<ImageView>(R.id.imgSneaker)

        fun setData(sneaker: Sneaker, position: Int) {
            tvSneakerName.text = sneaker.name
            imgSneakerImage.setImageResource(sneaker.imageId)
            this.currentPosition = position
            this.currentSneaker = sneaker
        }


    }
}