package com.example.upb_xipplg1_3030

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class ActivityCalon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calon)

        val tab = findViewById<TabLayout>(R.id.tabLayout2)
        var fragment : Fragment = Fragment_calon1()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()

        tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab :TabLayout.Tab?) {
                when(tab!!.position) {
                    0 -> fragment = Fragment_calon1()
                    1 -> fragment = Fragment_calon2()
                    2 -> fragment = Fragment_calon3()

                }

                val ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.frameLayout, fragment)
                ft.commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {


            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

    }
}