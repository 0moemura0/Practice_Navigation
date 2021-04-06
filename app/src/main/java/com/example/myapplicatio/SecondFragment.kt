package com.example.myapplicatio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_second, container, false)
        val textView: TextView = root.findViewById(R.id.text_view)
        textView.setOnClickListener {
            findNavController().popBackStack()
        }
        return root
    }
}