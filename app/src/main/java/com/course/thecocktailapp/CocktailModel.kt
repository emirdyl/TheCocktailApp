package com.course.thecocktailapp


data class CocktailModel(
    val id: String,
    val name: String,
    val imageUrl: String,
    val ingredients: ArrayList<String>
)
