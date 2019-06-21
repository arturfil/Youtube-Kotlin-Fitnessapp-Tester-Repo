package com.arturofilio.youtubetester.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.arturofilio.youtubetester.R
import com.arturofilio.youtubetester.models.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ProfileActivity : AppCompatActivity() {

    private val TAG = "ProfileActivity"
    private lateinit var mUser: User
    private lateinit var mAuth: FirebaseAuth
    private lateinit var mDatabase: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        mAuth = FirebaseAuth.getInstance()
        mDatabase = FirebaseDatabase.getInstance().reference

        val database = mDatabase

        fun currentUserReference(): DatabaseReference =
            database.child("users").child(mAuth.currentUser!!.uid)

        // Create the Value Event Listener Adapter



    }
}
