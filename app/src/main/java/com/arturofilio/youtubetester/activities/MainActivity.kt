package com.arturofilio.youtubetester.activities

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity

import android.view.View
import com.arturofilio.youtubetester.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: NavigationActivity(0), View.OnClickListener {

    private val TAG = "MainActivity"
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomNavigation()

        mAuth = FirebaseAuth.getInstance()

        logout_btn.setOnClickListener(this)
        profile_btn.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.logout_btn -> {
                mAuth.signOut()
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }
        when (view.id) {
            R.id.profile_btn -> {
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        }
    }
}


