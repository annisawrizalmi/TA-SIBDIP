package com.annisawr.tasibdip.FromAdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityFormAddJadwalBinding

class FormAddJadwalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFormAddJadwalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormAddJadwalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}