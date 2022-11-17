package com.progressapp.instagramcompose.feeds

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.progressapp.instagramcompose.feeds.components.FeedBottom
import com.progressapp.instagramcompose.feeds.components.FeedHeader
import com.progressapp.instagramcompose.feeds.components.FeedPost
import com.progressapp.instagramcompose.profile.Story
import com.progressapp.instagramcompose.profile.User
import com.progressapp.instagramcompose.profile.components.ProfileStoryHighlight

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FeedScreen(
    profileClick: () -> Unit,
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
    //List of "users"
    val users = mutableListOf<User>()
    for (i in 0 until 10 ){
        users.add(i, user)
    }
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,

        topBar = {
            FeedHeader(
            plusClick = { /*TODO*/ },
            hearthClick = { /*TODO*/ },
            messageClick = { /*TODO*/ })
        },
        bottomBar = {
            FeedBottom(
                homeClick = { /*TODO*/ },
                searchClick = { /*TODO*/ },
                reelsClick = { /*TODO*/ },
                storesClick = { /*TODO*/ },
                profileClick =  profileClick )
        },
        modifier = Modifier.fillMaxSize()
    ) {

        LazyColumn(modifier = Modifier.fillMaxSize()) {

            item {  ProfileStoryHighlight(stories = user.stories) }

            items(users) {
                FeedPost(users = it)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedScreenPreview(){
    FeedScreen({})
}