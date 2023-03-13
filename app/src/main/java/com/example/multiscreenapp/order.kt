package com.example.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val tvOrder = findViewById<TextView>(R.id.tvOrder)

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)

        tvOrder.text= "Order Recieved Successfully !!" + "\n\n" + "Your Order is as follows - " + ordersOfCustomer.toString() + "\n\n\n\n" + "Thank You For Ordering"
    }
}