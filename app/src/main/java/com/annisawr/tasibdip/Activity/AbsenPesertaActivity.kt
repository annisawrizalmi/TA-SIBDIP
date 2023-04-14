package com.annisawr.tasibdip.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityAbsenPesertaBinding

class AbsenPesertaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAbsenPesertaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAbsenPesertaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}