package com.example.android.tfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blue.*

/**
 * A simple [Fragment] subclass.
 */
class BlueFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        redButton.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.mainContainer, RedFragment()).addToBackStack("RedFragment").commit()
        }
    }

}
