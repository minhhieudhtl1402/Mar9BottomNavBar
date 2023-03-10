package com.example.mar9bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mar9bottomnavigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        val name = "Vu MInh Hieu"
        val fix = "had fix error"
        val fixOnRemoteRepo = "has fixed"
        val fixOnRemoteRepoSecond = "has fixed"
        val fixThenPull = "pull instead fetch and merge"
        val fixTextBranch = true
        binding.bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_home -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_my_page -> {
                    Toast.makeText(this, "My page", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_favourite -> {
                    Toast.makeText(this, "Favourite", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> {
                    true
                }
            }


        }

    }
}
