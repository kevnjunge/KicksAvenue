package kev.njunge.kicksavenue.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kev.njunge.kicksavenue.R
import kev.njunge.kicksavenue.SneakerImages

class ShoeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_shoe_list, container, false)

        setUpRecyclerView(view)
        return view
    }

    private fun setUpRecyclerView(view: View?) {
        val context = requireContext()

        val sneakerAdapter = SneakerAdapter(context, SneakerImages.sneakerList!!)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView?.adapter = sneakerAdapter
        recyclerView?.setHasFixedSize(true)

        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = RecyclerView.VERTICAL
        recyclerView?.layoutManager = layoutManager
    }


}