package com.annisawr.tasibdip.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.FragmentDataAsistenBinding
import com.annisawr.tasibdip.databinding.FragmentDataDiklatBinding


class DataAsistenFragment : Fragment() {

    private var _binding: FragmentDataAsistenBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDataAsistenBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}