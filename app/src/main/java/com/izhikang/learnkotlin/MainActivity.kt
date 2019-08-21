package com.izhikang.learnkotlin

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvName.text = Test
        testTopLevel()
        println()
        val listener = object :ViewPager.SimpleOnPageChangeListener(){
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }
        }
    }
}