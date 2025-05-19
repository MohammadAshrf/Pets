package org.example.project.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.example.project.ui.home.ui.AnimalList
import org.example.project.ui.home.ui.CategoriesSection
import org.example.project.ui.home.ui.HeaderSection

@Composable
fun HomeScreen() {
    Column(
        Modifier.fillMaxSize()
            .background(Color.White)
            .statusBarsPadding()
            .padding(horizontal = 16.dp)
    ) {
        HeaderSection()
        Spacer(Modifier.height(38.dp))
        CategoriesSection()
        Spacer(Modifier.height(28.dp))
        AnimalList()
    }
}