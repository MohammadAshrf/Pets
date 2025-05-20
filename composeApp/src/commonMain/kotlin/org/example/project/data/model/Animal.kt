package org.example.project.data.model

import org.jetbrains.compose.resources.DrawableResource
import pets.composeapp.generated.resources.Res
import pets.composeapp.generated.resources.animal1
import pets.composeapp.generated.resources.animal2
import pets.composeapp.generated.resources.animal3
import pets.composeapp.generated.resources.cat
import pets.composeapp.generated.resources.dog

data class Animal(
    val image: DrawableResource,
    val inFav: Boolean,
    val name: String,
    val age: Int,
    val family: String,
    val category: Category
) {
    companion object {
        val animalList = listOf(
            Animal(
                image = Res.drawable.animal1,
                inFav = true,
                name = "Chanita",
                age = 3,
                family = "Ciji",
                category = Category(image = Res.drawable.dog, name = "Dogs")
            ),
            Animal(
                image = Res.drawable.animal2,
                inFav = true,
                name = "Trenise",
                age = 4,
                family = "Krystle",
                category = Category(image = Res.drawable.cat, name = "Cats")
            ),
            Animal(
                image = Res.drawable.animal3,
                inFav = false,
                name = "Jerrica",
                age = 8,
                family = "Tucker",
                category = Category(image = Res.drawable.cat, name = "Cats")
            ),
            Animal(
                image = Res.drawable.animal1,
                inFav = true,
                name = "Chanita",
                age = 3,
                family = "Ciji",
                category = Category(image = Res.drawable.dog, name = "Dogs")
            ),
            Animal(
                image = Res.drawable.animal2,
                inFav = true,
                name = "Trenise",
                age = 4,
                family = "Krystle",
                category = Category(image = Res.drawable.cat, name = "Cats")
            ),
            Animal(
                image = Res.drawable.animal3,
                inFav = false,
                name = "Jerrica",
                age = 8,
                family = "Tucker",
                category = Category(image = Res.drawable.cat, name = "Cats")
            ),
            Animal(
                image = Res.drawable.animal1,
                inFav = true,
                name = "Chanita",
                age = 3,
                family = "Ciji",
                category = Category(image = Res.drawable.dog, name = "Dogs")
            ),
            Animal(
                image = Res.drawable.animal2,
                inFav = true,
                name = "Trenise",
                age = 4,
                family = "Krystle",
                category = Category(image = Res.drawable.cat, name = "Cats")
            ),
            Animal(
                image = Res.drawable.animal3,
                inFav = false,
                name = "Jerrica",
                age = 8,
                family = "Tucker",
                category = Category(image = Res.drawable.cat, name = "Cats")
            ),
        )
    }
}