package com.semwalsolutions.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var textView : TextView
    private lateinit var mainActivityViewModel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        textView = findViewById(R.id.textView)

        setNumber()



    }


    private fun setNumber(){
        textView.text = mainActivityViewModel.count.toString()
    }

    fun increment(v : View){
        mainActivityViewModel.incrementOnPress()
        setNumber()
    }


}