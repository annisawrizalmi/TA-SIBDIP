package com.annisawr.tasibdip.Detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityDetailDataAsistenBinding

class DetailDataAsistenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailDataAsistenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailDataAsistenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }
}