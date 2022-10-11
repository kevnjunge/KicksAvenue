package kev.njunge.kicksavenue.ui


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kev.njunge.kicksavenue.R
import kev.njunge.kicksavenue.SneakerImages


class ShoeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_shoe_detail, container, false)

        val sneakerImage = view.findViewById<ImageView>(R.id.sneakerImage)
        val sneakerName = view.findViewById<TextView>(R.id.sneakerName)
        val sneakerDescription = view.findViewById<TextView>(R.id.sneakerDescription)

        val args = this.arguments
        Log.d("args", "$args")
        val sneakerDesc = args?.getString("sneakerDescription")
        val sneakerImg = args?.getString("sneakerImage")
        val shoeName = args?.getString("sneakerName")
        val shoeIndex = args?.getInt("index")


        sneakerDescription.text = sneakerDesc.toString()
       sneakerImage.setImageResource(SneakerImages.images[shoeIndex!!])
        sneakerName.text = shoeName.toString()

        return view
    }


}