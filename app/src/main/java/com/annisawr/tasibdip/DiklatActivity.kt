package com.annisawr.tasibdip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.databinding.ActivityDiklatBinding

class DiklatActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDiklatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiklatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //arah ke form add
        binding.btnAddDiklat.setOnClickListener {
            startActivity(Intent(this,FormAddDiklatActivity::class.java))
        }
    }


}