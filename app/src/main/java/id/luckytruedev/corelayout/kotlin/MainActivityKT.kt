package id.luckytruedev.corelayout.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.luckytruedev.corelayout.R

class MainActivityKT : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        finish()
    }
}