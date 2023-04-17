package com.annisawr.tasibdip.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.annisawr.tasibdip.FromAdd.FormAddDiklatActivity
import com.annisawr.tasibdip.FromAdd.FormAddPanitiaActivity
import com.annisawr.tasibdip.R
import com.annisawr.tasibdip.databinding.ActivityDiklatBinding
import com.annisawr.tasibdip.databinding.ActivityPanitiaBinding
import com.google.android.material.navigation.NavigationView

class PanitiaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPanitiaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panitia)

        binding = ActivityPanitiaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //arah ke form add
        binding.btnAddPanitiaExternal.setOnClickListener {
            startActivity(Intent(this, FormAddPanitiaActivity::class.java))
        }


    }
}