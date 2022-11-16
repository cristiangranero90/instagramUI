package com.progressapp.instagramcompose.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.progressapp.instagramcompose.profile.Story

@Composable
fun ProfileStoryHighlight(
    stories: List<Story>,
    modifier: Modifier = Modifier
){
    LazyRow(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp) ){
        items(stories){
            StoryItem(it)
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}

@Composable
private fun StoryItem(
    story: Story,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = story.image,
            contentDescription = "Story Image",
            modifier = Modifier.clip(CircleShape)
        )
        Text(text = story.text)
    }

}

@Preview(showBackground = true)
@Composable
fun ProfileStoryHighlightPreview(){
ProfileStoryHighlight(stories = listOf(
    Story("https://via.placeholder.com/200", "Image1"),
    Story("https://via.placeholder.com/200", "Image2"),
    Story("https://via.placeholder.com/200", "Image3"),
))
}