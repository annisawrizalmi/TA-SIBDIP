package com.annisawr.tasibdip.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.annisawr.tasibdip.R
import com.google.android.material.navigation.NavigationView

class PengajarDashActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle  /* membuat menu bar */
    lateinit var drawerLayout: DrawerLayout     /* membuat menu bar */

    private lateinit var binding : PengajarDashActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengajar_dash)

        /* membuat menu bar */
        drawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            it.isChecked = true

            when(it.itemId) {
                R.id.nav_biodata -> Toast.makeText(applicationContext, "Cliked Biodata Anda", Toast.LENGTH_SHORT).show()
                R.id.nav_logout -> Toast.makeText(applicationContext, "Cliked Logout", Toast.LENGTH_SHORT).show()
            }
            true

        }

    }
}