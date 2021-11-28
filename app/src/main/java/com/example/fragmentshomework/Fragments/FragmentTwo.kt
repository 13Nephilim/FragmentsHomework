package com.example.fragmentshomework.Fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentshomework.R

class FragmentTwo : Fragment(R.layout.fragment_two) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            FragmentTwoArgs.fromBundle(requireArguments()).amount.toString()

    }

}