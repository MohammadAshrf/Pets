package org.example.project.ui.home.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.painterResource
import pets.composeapp.generated.resources.Res
import pets.composeapp.generated.resources.logo
import pets.composeapp.generated.resources.notification

@Composable
fun HeaderSection() {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(Res.drawable.logo),
            contentDescription = "Logo"
        )
        Icon(
            painter = painterResource(Res.drawable.notification),
            tint = Color.Unspecified,
            contentDescription = "Notification"
        )
    }
}