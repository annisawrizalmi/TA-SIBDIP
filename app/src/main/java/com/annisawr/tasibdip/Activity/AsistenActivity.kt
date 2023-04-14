package com.annisawr.tasibdip.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.FromAdd.FormAddDiklatActivity
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityAsistenBinding
import com.annisawr.tasibdip.databinding.ActivityDiklatBinding

class AsistenActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAsistenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsistenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //arah ke form add
        binding.btnAddAsisten.setOnClickListener {
            startActivity(Intent(this, FormAddDiklatActivity::class.java))
        }
    }
}