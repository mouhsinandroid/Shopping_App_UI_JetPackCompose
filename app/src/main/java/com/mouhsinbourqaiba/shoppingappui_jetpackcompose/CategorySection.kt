package com.mouhsinbourqaiba.shoppingappui_jetpackcompose

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CategorySection() {
    Column(Modifier.padding(horizontal = 16.dp)) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Category", style = MaterialTheme.typography.h6)
            TextButton(onClick = {}) {
                Text(text = "More", color = MaterialTheme.colors.primary)
            }
        }

        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CategoryButton(
                text = "Fruits",
                icon = painterResource(id = R.drawable.ic_orange),
                backgroundColor = Color(0xffFEF4E7)
            )
            CategoryButton(
                text = "Vegetables",
                icon = painterResource(id = R.drawable.ic_veg),
                backgroundColor = Color(0xffF6FBF3)
            )
            CategoryButton(
                text = "Dairy",
                icon = painterResource(id = R.drawable.ic_cheese),
                backgroundColor = Color(0xffFFFBF3)
            )
            CategoryButton(
                text = "Meats",
                icon = painterResource(id = R.drawable.ic_meat),
                backgroundColor = Color(0xffF6E6E9)
            )
        }
    }
}
