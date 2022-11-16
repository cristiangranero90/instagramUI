package com.progressapp.instagramcompose.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun ProfileInformation(
    imageUrl: String,
    post: Int,
    followers: Int,
    following: Int,
    modifier: Modifier = Modifier
){

    Row(
        modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ){
        AsyncImage(
            model = imageUrl,
            contentDescription = "Profile Image",
            modifier = Modifier.clip(CircleShape)
        )

        ProfileInformationItem(post, "publicaciones")
        ProfileInformationItem(followers, "Seguidores")
        ProfileInformationItem(following, "Seguidos")
    }

}

@Composable
private fun ProfileInformationItem(
    amount: Int,
    type: String,
    modifier: Modifier = Modifier
){
    Column(
        modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = amount.toString(), fontWeight = FontWeight.Bold)
        Text(text = type)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileInformationPreview(){
    ProfileInformation("www.", 15, 365, 289)
}