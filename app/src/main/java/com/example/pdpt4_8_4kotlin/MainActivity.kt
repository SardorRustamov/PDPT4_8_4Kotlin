package com.example.pdpt4_8_4kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pdpt4_8_4kotlin.adapter.ViewPagerAdapter
import com.example.pdpt4_8_4kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.add("Page 1 ", PageOneFragment())
        viewPagerAdapter.add("Page 2", PageTwoFragment())

        binding.viewPager.adapter = viewPagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)

    }
}