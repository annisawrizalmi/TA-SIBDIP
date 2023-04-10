package com.annisawr.tasibdip.FromAdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.databinding.ActivityFormAddDiklatBinding

class FormAddDiklatActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFormAddDiklatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormAddDiklatBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}