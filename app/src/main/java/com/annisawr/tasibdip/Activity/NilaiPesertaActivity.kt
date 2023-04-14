package com.annisawr.tasibdip.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityDiklatBinding
import com.annisawr.tasibdip.databinding.ActivityNilaiPesertaBinding

class NilaiPesertaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityNilaiPesertaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNilaiPesertaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}