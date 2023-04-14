package com.annisawr.tasibdip.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.FragmentDataPanitiaExternalBinding

//untuk menampilkan data
class DataPanitiaExternalFragment : Fragment() {

    private var _binding : FragmentDataPanitiaExternalBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDataPanitiaExternalBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}