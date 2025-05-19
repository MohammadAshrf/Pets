package org.example.project

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.theme.btnTextColor
import org.example.project.theme.buttonBG
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import pets.composeapp.generated.resources.Res
import pets.composeapp.generated.resources.bg
import pets.composeapp.generated.resources.logo

@Composable
@Preview
fun SplashScreen() {
    Box(Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(Res.drawable.bg),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            Modifier.fillMaxSize()
                .systemBarsPadding(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                Modifier.weight(1f)
                    .padding(top = 36.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(Res.drawable.logo),
                    contentDescription = "Logo"
                )
            }
            Column(
                Modifier.weight(1f)
                    .padding(bottom = 28.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Happiness is closer than you think",
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        fontSize = 36.sp
                    ),
                    textAlign = TextAlign.Center
                )

                Spacer(Modifier.height(52.dp))

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = buttonBG),
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 18.dp),
                    shape = RoundedCornerShape(100)
                )
                {
                    Text(
                        "Let’s Go!",
                        style = TextStyle(
                            color = btnTextColor,
                            fontSize = 17.sp
                        )
                    )
                }
            }
        }
    }
}