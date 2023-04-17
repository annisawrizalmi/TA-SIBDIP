package com.annisawr.tasibdip.FromAdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityFormAddPanitiaBinding

class FormAddPanitiaActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFormAddPanitiaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormAddPanitiaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}