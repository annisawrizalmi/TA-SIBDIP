package com.annisawr.tasibdip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annisawr.tasibdip.dashboard.SuperAdmin_DashActivity
import com.annisawr.tasibdip.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            login()
        }
    }

    private fun login(){
        var intent: Intent = Intent(this@LoginActivity, SuperAdmin_DashActivity::class.java)
        startActivity(intent)
    }

}


