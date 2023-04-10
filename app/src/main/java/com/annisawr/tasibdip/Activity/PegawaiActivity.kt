package com.annisawr.tasibdip.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.FromAdd.FormAddDiklatActivity
import com.annisawr.tasibdip.FromAdd.FromAddPegawaiActivity
import com.annisawr.tasibdip.databinding.ActivityPegawaiBinding

class PegawaiActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPegawaiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPegawaiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //arah ke form add
        binding.btnAddPegawai.setOnClickListener {
            startActivity(Intent(this, FromAddPegawaiActivity::class.java))
        }

    }
}