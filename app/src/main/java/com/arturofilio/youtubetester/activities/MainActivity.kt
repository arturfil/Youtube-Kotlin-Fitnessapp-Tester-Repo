package com.arturofilio.youtubetester.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import android.view.View
import com.arturofilio.youtubetester.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(view: View) {
        when(view.id) {
            R.id.logout_btn -> {
                mAuth.signOut()
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }
    }

    private val TAG = "MainActivity"
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance()
        logout_btn.setOnClickListener(this)
    }
}
