package com.example.parkingap6800.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parkingap6800.R

class PaymentFailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_failed)

        // Initialize the NavigationBar class to handle the navigation bar functionality
        NavigationBar(this)
    }
}