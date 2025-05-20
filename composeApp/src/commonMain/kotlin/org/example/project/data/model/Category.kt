package org.example.project.data.model

import org.jetbrains.compose.resources.DrawableResource
import pets.composeapp.generated.resources.Res
import pets.composeapp.generated.resources.cat
import pets.composeapp.generated.resources.cat_all
import pets.composeapp.generated.resources.dog

data class Category(
    val image: DrawableResource,
    val name: String
) {
    companion object {
        val categoryList = listOf(
            Category(image = Res.drawable.cat_all, name = "All"),
            Category(image = Res.drawable.dog, name = "Dogs"),
            Category(image = Res.drawable.cat, name = "Cats")
        )
    }
}