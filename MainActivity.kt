package com.example.simplegreetingapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun
            onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myText = findViewById<TextView>(R.id.myText)
        val ans = findViewById<EditText>(R.id.ans)
        val greet = findViewById<TextView>(R.id.greet)
        val myButton = findViewById<Button>(R.id.myButton)
        val buttonYes = findViewById<Button>(R.id.buttonYes)
        val buttonNo = findViewById<Button>(R.id.buttonNo)
        val ye = findViewById<Button>(R.id.ye)
        val noo = findViewById<Button>(R.id.noo)
        val photo = findViewById<ImageView>(R.id.photo)

        myButton.visibility = View.VISIBLE
        buttonYes.visibility = View.GONE
        buttonNo.visibility = View.GONE
        ye.visibility = View.GONE
        noo.visibility = View.GONE
        photo.visibility = View.GONE

        myButton.setOnClickListener {
            val userText = ans.text.toString()
            if(userText.isEmpty()) {
                ans.error = "Please enter your Name!"
                return@setOnClickListener
            }
           greet.text = "Hey $userText!"
            myText.text = "Do you want to see a picture?"

            ans.visibility = View.GONE
            myButton.visibility = View.GONE
            buttonYes.visibility = View.VISIBLE
            buttonNo.visibility = View.VISIBLE
        }


        buttonYes.setOnClickListener {
            myText.text =
                "The only picture available is Mom and Me picture.\nDo you want to see that?"
            greet.visibility = View.GONE
            buttonYes.visibility = View.GONE
            buttonNo.visibility = View.GONE
            ye.visibility = View.VISIBLE
            noo.visibility = View.VISIBLE
            ye.setOnClickListener {

                photo.setImageResource(R.drawable.myimage)
                myText.visibility = View.GONE
                ye.visibility = View.GONE
                noo.visibility = View.GONE
                photo.visibility = View.VISIBLE

            }
            noo.setOnClickListener {
                //No action needed
            }
        }
        buttonNo.setOnClickListener {
            //No action needed
        }

        }
    }
