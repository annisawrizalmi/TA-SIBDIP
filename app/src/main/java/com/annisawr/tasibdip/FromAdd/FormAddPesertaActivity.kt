package com.annisawr.tasibdip.FromAdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityFormAddPesertaBinding

class FormAddPesertaActivity : AppCompatActivity() {
    private lateinit var binding:ActivityFormAddPesertaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormAddPesertaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}