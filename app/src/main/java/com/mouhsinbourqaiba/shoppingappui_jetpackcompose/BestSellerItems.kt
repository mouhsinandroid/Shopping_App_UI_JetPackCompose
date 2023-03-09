package com.mouhsinbourqaiba.shoppingappui_jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BestSellerItems() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            BestSellerItem(
                imagePainter = painterResource(id = R.drawable.item_lettuce),
                title = "Iceberg Lettuce",
                price = "1.99",
                discountPercent = 10
            )
        }
        item {
            BestSellerItem(
                imagePainter = painterResource(id = R.drawable.item_apple),
                title = "Apple",
                price = "2.64",
                discountPercent = 5
            )
        }
        item {
            BestSellerItem(
                imagePainter = painterResource(id = R.drawable.item_meat),
                title = "Meat",
                price = "4.76",
                discountPercent = 20
            )
        }
    }
}