package com.example.recyclerviewdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerviewdemo.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root
        val courses = listOf(
            Course("Mobile Apps", "Jones", R.drawable.android_icon),
            Course("Gym", "Ludka", R.drawable.gym_icon),
            Course("Math", "Reyan", R.drawable.math_icon),
            Course("Art", "Iyengar", R.drawable.art_icon),
            Course("Pokemon Go", "Pikachu", R.drawable.pokemon),
            Course("Art", "Iyengar", R.drawable.art_icon),
            )
        val myAdapter = CourseAdapter(courses)
        binding.recyclerView.adapter = myAdapter
        return rootView
    }
}
