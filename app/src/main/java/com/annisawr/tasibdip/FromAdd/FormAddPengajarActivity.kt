package com.annisawr.tasibdip.FromAdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityFormAddPengajarBinding

class FormAddPengajarActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFormAddPengajarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormAddPengajarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}