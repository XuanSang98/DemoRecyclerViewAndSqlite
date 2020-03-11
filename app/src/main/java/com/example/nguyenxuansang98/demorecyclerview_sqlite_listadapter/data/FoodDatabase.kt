package com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.data

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.model.Food

class FoodDatabase(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME,null,
    DATABASE_VERSION) {

    companion object{
        val DATABASE_NAME =""
        val DATABASE_VERSION =1
        val TABLE_NAME = "FavoriteFood"
        val ID_FAVORITE_FOOD = 1
        val ID_FOOD = "IdFood"
        val NAME_FOOD = "NameFood"
        val URL_IMAGE = "UrlImg"
        val CHECK = "0"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTableFood = String.format("CREATE TABLE %s (%s IDENTITY(1,1) PRIMARY KEY, %s TEXT, %s TEXT, %s TEXT, %s TEXT)",
            TABLE_NAME, ID_FAVORITE_FOOD, ID_FOOD, NAME_FOOD, URL_IMAGE, CHECK)
        db?.execSQL(createTableFood)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun addFavorite (food : Food){
        val db  = this.writableDatabase
        val value = ContentValues()
        value.put(ID_FOOD,food.id)
        value.put(NAME_FOOD,food.nameFood)
        value.put(URL_IMAGE,food.urlImage)
        value.put(CHECK,food.checkFavorite)
        db.insert(TABLE_NAME,null,value)
        db.close()
    }
}