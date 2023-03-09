package com.mouhsinbourqaiba.shoppingappui_jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Promotions() {
    LazyRow(
        Modifier.height(160.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.promotion),
                title = "Fruit",
                subtitle = "Start @",
                header = "$1",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.promotion),
                title = "Meat",
                subtitle = "Discount",
                header = "20%",
                backgroundColor = Color(0xff6EB6F5)
            )
        }
    }
}