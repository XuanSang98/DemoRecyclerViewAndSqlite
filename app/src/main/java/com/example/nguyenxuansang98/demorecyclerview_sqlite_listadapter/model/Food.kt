package com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.model

class Food {
    var id : Int = 0
    var nameFood : String ? =null
    var urlImage : String ? =null
    var checkFavorite : String ?=null
    constructor(id : Int,nameFood : String,urlImage : String,checkFavorite : String){
        this.id = id
        this.nameFood = nameFood
        this.urlImage = urlImage
        this.checkFavorite = checkFavorite
    }
}