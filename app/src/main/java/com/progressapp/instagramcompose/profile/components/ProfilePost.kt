package com.progressapp.instagramcompose.profile.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProfilePosts(
    images: List<String>,
    modifier: Modifier
){
    LazyVerticalGrid(modifier = Modifier.padding(top = 16.dp), columns = GridCells.Fixed(3)) {
        items(images){
            PostItem(imageUrl = it)
        }
    }

}

@Composable
private fun PostItem(
    imageUrl: String,
    modifier: Modifier = Modifier
){
    Box(modifier = Modifier.padding(1.dp)){
        AsyncImage(model = imageUrl, contentDescription = "user post")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePostsPreview(){
    ProfilePosts(emptyList(), modifier = Modifier)
}