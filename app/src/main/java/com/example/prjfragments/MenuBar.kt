package com.example.prjfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


private val frag1 = FirstFragment()
private val frag2 = SecondFragment()
class MenuBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_bar)

        replaceFrag(frag1)
        val bottomNav = findViewById<BottomNavigationView>(R.id.NavBar)
        bottomNav.setOnItemSelectedListener{
            when(it.itemId){
                R.id.id_home->replaceFrag(frag1)
                R.id.id_settings->replaceFrag(frag2)
            }
            true
        }
    }

    private fun replaceFrag(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, fragment)
            transaction.commit()
        }
    }
}