package com.progressapp.instagramcompose.feeds

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.progressapp.instagramcompose.feeds.components.FeedHeader
import com.progressapp.instagramcompose.profile.Story
import com.progressapp.instagramcompose.profile.User
import com.progressapp.instagramcompose.profile.components.ProfileStoryHighlight

@Composable
fun FeedScreen(
    modifier: Modifier = Modifier
){
    //Hardcoded Data
    val user = User(
        username = "cristian_granero",
        profileImageUrl = "https://via.placeholder.com/200",
        //postCount = 15,
        follower = 360,
        following = 246,
        name = "Cristian Granero",
        description = "A beautiful description",
        stories = listOf(
            Story(image = "https://via.placeholder.com/200", text = "Story1"),
            Story(image = "https://via.placeholder.com/200", text = "Story2"),
            Story(image = "https://via.placeholder.com/200", text = "Story3"),
            Story(image = "https://via.placeholder.com/200", text = "Story4"),
            Story(image = "https://via.placeholder.com/200", text = "Story5"),
            Story(image = "https://via.placeholder.com/200", text = "Story6"),
            Story(image = "https://via.placeholder.com/200", text = "Story7"),
            Story(image = "https://via.placeholder.com/200", text = "Story8")
        ),
        posts = listOf(
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
        )
    )

    Column() {

        FeedHeader(
            plusClick = { /*TODO*/ },
            hearthClick = { /*TODO*/ },
            messageClick = { /*TODO*/ })

        LazyColumn(modifier = Modifier.fillMaxSize()) {

            item {  ProfileStoryHighlight(stories = user.stories) }

            item { }


        }
    }

    
}

@Preview(showBackground = true)
@Composable
fun FeedScreenPreview(){
    FeedScreen()
}