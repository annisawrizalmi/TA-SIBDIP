package com.annisawr.tasibdip.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityDiklatBinding
import com.annisawr.tasibdip.databinding.ActivityJadwalBinding

class JadwalActivity : AppCompatActivity() {

    private lateinit var binding : ActivityJadwalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJadwalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}