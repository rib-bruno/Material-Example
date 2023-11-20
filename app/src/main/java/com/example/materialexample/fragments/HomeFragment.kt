package com.example.materialexample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.materialexample.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        group: ViewGroup?,
        state: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, group, false)
    }

    //retornar o fragment
    companion object {
        fun newInstance() = HomeFragment()
    }

}