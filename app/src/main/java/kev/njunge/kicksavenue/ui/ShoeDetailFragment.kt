package kev.njunge.kicksavenue.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kev.njunge.kicksavenue.R


class ShoeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_shoe_detail, container, false)

        val sneakerImage = view.findViewById<ImageView>(R.id.imgSneaker)
        val sneakerName = view.findViewById<TextView>(R.id.sneakerName)
        val sneakerDescription = view.findViewById<TextView>(R.id.sneakerDescription)




        val args = this.arguments
        val sneakerDesc = args?.get("sneakerDescription")
        val sneakerImg = args?.get("SneakerImage")
        val shoeName = args?.get("sneakerName")

        sneakerDescription.text = sneakerDesc.toString()
        sneakerImage.setImageResource(sneakerImg.toString().toInt())
        sneakerName.text = shoeName.toString()

        return  view
    }



}