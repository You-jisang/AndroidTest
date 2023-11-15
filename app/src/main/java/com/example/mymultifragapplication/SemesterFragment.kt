package com.example.mymultifragapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mymultifragapplication.databinding.FragmentSemesterBinding

class SemesterFragment : Fragment() {

    var binding: FragmentSemesterBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSemesterBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding?.root
    }
}