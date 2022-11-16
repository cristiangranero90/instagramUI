package com.progressapp.instagramcompose.feeds.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FeedBottom(
    homeClick: () -> Unit,
    searchClick: () -> Unit,
    reelsClick: () -> Unit,
    storesClick: () -> Unit,
    profileClick: () -> Unit,
    modifier: Modifier = Modifier,
){

    Box(
        modifier = Modifier.background(color = Color.White),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Bottom
        ) {
           IconButton(onClick = { homeClick }) {
               Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
           }
           IconButton(onClick = { searchClick }) {
               Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
           }

            IconButton(onClick = { reelsClick }) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "Reels")

            }
            IconButton(onClick = { storesClick }) {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Stores")
            }
            IconButton(onClick = profileClick) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Profile" )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedBottomPreview(){
    FeedBottom({},{},{},{},{})
}