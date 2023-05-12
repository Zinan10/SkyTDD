package com.example.testdrivenproject

import android.util.Log

class BookNotFoundException(str: String) : Exception() {

    private var errStr: String

    init {
        errStr = str
    }

    override fun printStackTrace() {
        super.printStackTrace()
        Log.e("Exception", "$errStr")
    }
}