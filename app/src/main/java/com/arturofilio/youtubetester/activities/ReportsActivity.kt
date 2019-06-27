package com.arturofilio.youtubetester.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.arturofilio.youtubetester.R

class ReportsActivity : NavigationActivity(1) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reports)
        setupBottomNavigation()

    }
}
