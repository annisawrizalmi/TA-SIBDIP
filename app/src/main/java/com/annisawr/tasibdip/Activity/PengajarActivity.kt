package com.annisawr.tasibdip.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.FromAdd.FromAddPegawaiActivity
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityPegawaiBinding
import com.annisawr.tasibdip.databinding.ActivityPengajarBinding

class PengajarActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPengajarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengajarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //arah ke form add
        binding.btnAddPengajar.setOnClickListener {
            startActivity(Intent(this, FromAddPegawaiActivity::class.java))
        }
    }
}