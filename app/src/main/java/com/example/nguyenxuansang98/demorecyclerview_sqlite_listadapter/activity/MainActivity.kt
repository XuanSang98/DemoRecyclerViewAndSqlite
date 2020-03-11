package com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.R
import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.fragment.FavoriteFoodFragment
import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.fragment.FoodCategoryFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            val fragment = FoodCategoryFragment()
            supportFragmentManager.beginTransaction().replace(R.id.frame_main,fragment).commit()
        }
        bottom_navigation.setOnNavigationItemSelectedListener(navigationItemSelect)
    }
    val navigationItemSelect : BottomNavigationView.OnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
            menuItem ->
        when(menuItem.itemId){
            R.id.menu_foodCategory ->{
                val fragment = FoodCategoryFragment()
                supportFragmentManager.beginTransaction().replace(R.id.frame_main,fragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_favoriteFood ->{
                val fragment = FavoriteFoodFragment()
                supportFragmentManager.beginTransaction().replace(R.id.frame_main,fragment).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
