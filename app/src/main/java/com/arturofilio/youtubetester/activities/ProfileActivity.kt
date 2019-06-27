package com.arturofilio.youtubetester.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.arturofilio.youtubetester.R
import com.arturofilio.youtubetester.models.User
import com.arturofilio.youtubetester.utils.ValueEventListenerAdapter
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : NavigationActivity(2) {

    private val TAG = "ProfileActivity"
    private lateinit var mUser: User
    private lateinit var mAuth: FirebaseAuth
    private lateinit var mDatabase: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setupBottomNavigation()

        mAuth = FirebaseAuth.getInstance()
        mDatabase = FirebaseDatabase.getInstance().reference

        fun currentUserReference(): DatabaseReference =
            mDatabase.child("users").child(mAuth.currentUser!!.uid)

        currentUserReference().addListenerForSingleValueEvent(
            ValueEventListenerAdapter {
                mUser = it.asUser()!!
                name.setText(mUser.name)
            }
        )



    }
}
