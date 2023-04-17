package com.annisawr.tasibdip.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.FromAdd.FormAddPengajarActivity
import com.annisawr.tasibdip.FromAdd.FormAddPesertaActivity
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityPesertaBinding

class PesertaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPesertaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPesertaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //arah ke form add
        binding.btnAddPeserta.setOnClickListener {
            startActivity(Intent(this, FormAddPesertaActivity::class.java))
        }


    }
}