package com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.R

/**
 * A simple [Fragment] subclass.
 */
class FavoriteFoodFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite_food, container, false)
    }

}
