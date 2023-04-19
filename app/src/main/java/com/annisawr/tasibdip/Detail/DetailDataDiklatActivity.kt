package com.annisawr.tasibdip.Detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityDetailDataDiklatBinding

class DetailDataDiklatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailDataDiklatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailDataDiklatBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}