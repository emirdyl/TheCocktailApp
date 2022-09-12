package com.course.thecocktailapp

    object DummyList {

        fun getDummyCocktailItems(): ArrayList<CocktailModel> {
            return arrayListOf(
                CocktailModel(
                    "1",
                    "Long Island",
                    "https://www.liquor.com/thmb/6l_Djk1TI9fS7htTTJ6TWBkRE3I=/720x720/filters:fill(auto,1)/__opt__aboutcom__coeus__resources__content_migration__liquor__2019__03__14090749__Long-Island-Iced-Tea-720x720-article-272623f47e80457594178a552f708068.jpg",
                    arrayListOf("Vodka", "Tequila", "Rum", "Coke")
                ),
                CocktailModel(
                    "2",
                    "Gin Tonic",
                    "https://www.thespruceeats.com/thmb/3Xw0mdKr5J-2SwIxiW7NqmdwVmE=/1500x1000/filters:fill(auto,1)/gin-and-tonic-recipe-759300-hero-01-aa12e6504f944c54b8b9c589cc1d0ac6.jpg",
                    arrayListOf("Gin", "Tonic", "Lime")
                )
            )
        }
    }
