package com.annisawr.tasibdip.Detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityDetailDataPanitiaBinding

class DetailDataPanitiaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailDataPanitiaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailDataPanitiaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}