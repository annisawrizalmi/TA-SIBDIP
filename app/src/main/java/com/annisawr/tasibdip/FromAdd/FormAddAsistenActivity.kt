package com.annisawr.tasibdip.FromAdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityFormAddAsistenBinding

class FormAddAsistenActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFormAddAsistenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormAddAsistenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}