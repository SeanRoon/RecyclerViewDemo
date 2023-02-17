package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.databinding.ListItemLayoutBinding

class CourseAdapter(val courseList: List<Course>) : RecyclerView.Adapter<CourseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(binding)
    }

    override fun onBindViewHolder(currentViewHolder: CourseViewHolder, position: Int) {
        val currentCourse = courseList[position]
        currentViewHolder.bindCourse(currentCourse)
    }

    override fun getItemCount(): Int {
        return courseList.size
    }
}
