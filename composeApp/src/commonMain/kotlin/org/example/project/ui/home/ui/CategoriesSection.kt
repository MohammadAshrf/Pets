package org.example.project.ui.home.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.data.model.Category
import org.example.project.theme.buttonBG
import org.example.project.theme.categoryTextColor
import org.example.project.theme.rounded100
import org.jetbrains.compose.resources.painterResource

@Composable
fun CategoriesSection(
    selectedItem: String,
    categoryList: List<Category>?,
    onClick: (String) -> Unit
) {

    LazyRow(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)
    ) {
        itemsIndexed(categoryList ?: listOf()) { index, category ->
            CategoryItem(
                category = category,
                isSelected = category.name == selectedItem,
                onClick = {
                    onClick(category.name)
                }
            )
        }
    }
}

@Composable
fun CategoryItem(category: Category, isSelected: Boolean, onClick: () -> Unit) {
    val backgroundColor =
        animateColorAsState(
            if (isSelected) buttonBG else Color.White
        )
    val borderColor =
        animateColorAsState(
            if (isSelected) buttonBG else Color.Black.copy(alpha = 0.08f)
        )
    val textColor =
        animateColorAsState(
            if (isSelected) Color.White else categoryTextColor
        )

    Row(
        Modifier.height(52.dp)
            .background(color = backgroundColor.value, rounded100)
            .border(width = 1.dp, color = borderColor.value, rounded100)
            .clip(rounded100)
            .padding(10.dp)
            .padding(end = 14.dp)
            .clickable {
                onClick()
            },
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(category.image), contentDescription = "Cat",
            modifier = Modifier.clip(CircleShape)
                .size(32.dp)
        )
        Text(
            category.name,
            style = TextStyle(fontSize = 16.sp, color = textColor.value)
        )
    }
}
