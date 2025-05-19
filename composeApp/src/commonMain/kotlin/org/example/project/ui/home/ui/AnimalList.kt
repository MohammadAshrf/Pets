package org.example.project.ui.home.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.theme.categoryTextColor
import org.example.project.theme.rounded16
import org.jetbrains.compose.resources.painterResource
import pets.composeapp.generated.resources.Res
import pets.composeapp.generated.resources.dog2
import pets.composeapp.generated.resources.filled_star
import pets.composeapp.generated.resources.star

@Composable
fun AnimalList() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        items(20) {
            AnimalCard()
        }
    }
}

@Composable
fun AnimalCard() {
    Card(
        shape = rounded16, colors = CardDefaults.cardColors(
            containerColor = Color.White
        ), elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            AnimalImage()
            AnimalInfo()
        }
    }
}

@Composable
fun AnimalInfo() {
    Column(
        Modifier.padding(horizontal = 10.dp).padding(bottom = 30.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Grey",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = categoryTextColor
                )
            )
            Text(
                "3 years",
                style = TextStyle(
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium,
                    color = categoryTextColor.copy(alpha = 0.70f)
                )
            )
        }
        Text(
            "Yorkshire Terrier",
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                color = categoryTextColor
            )
        )
    }
}

@Composable
fun AnimalImage() {
    var iconValue by remember {
        mutableStateOf(Res.drawable.star)
    }
    Box {
        Image(
            painterResource(Res.drawable.dog2),
            modifier = Modifier.height(116.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop,
            contentDescription = "Dog Card"
        )

        Icon(
            painterResource(iconValue),
            modifier = Modifier
                .padding(top = 8.dp, end = 7.dp)
                .clip(CircleShape)
                .background(color = Color.White.copy(alpha = 0.25f), CircleShape)
                .padding(5.dp)
                .align(Alignment.TopEnd)
                .clickable {
                    iconValue = if (iconValue == Res.drawable.star) {
                        Res.drawable.filled_star
                    } else {
                        Res.drawable.star
                    }
                },
            contentDescription = "Star",
            tint = Color.Unspecified
        )
    }
}