package com.annisawr.tasibdip.Detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityDetailDataPengajarBinding

class DetailDataPengajarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailDataPengajarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailDataPengajarBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}