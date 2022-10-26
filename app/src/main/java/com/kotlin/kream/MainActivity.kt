package com.kotlin.kream

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.kotlin.kream.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //ViewPager2 Adapter 셋팅
        var viewPager2Adatper = Adapter(this)
        viewPager2Adatper.addFragment(BlankFragment1())
        viewPager2Adatper.addFragment(BlankFragment2())
        viewPager2Adatper.addFragment(BlankFragment3())

        //Adapter 연결
        binding.viewPager2.apply {
            adapter = viewPager2Adatper

            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                }
            })
        }

        //ViewPager, TabLayout 연결
        TabLayoutMediator(binding.tab, binding.viewPager2) { tab, position ->
//            Log.e("YMC", "ViewPager position: ${position}")
            when (position) {
            }
        }.attach()

    }

}