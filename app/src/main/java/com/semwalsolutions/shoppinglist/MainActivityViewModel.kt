package com.semwalsolutions.shoppinglist

import android.graphics.drawable.Drawable
import androidx.lifecycle.ViewModel


class MainActivityViewModel: ViewModel() {

    var count = 0

    fun incrementOnPress(){
        count++
    }



}