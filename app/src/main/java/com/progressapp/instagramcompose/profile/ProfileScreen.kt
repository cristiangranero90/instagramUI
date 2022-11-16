package com.progressapp.instagramcompose.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.progressapp.instagramcompose.profile.components.ProfileAction
import com.progressapp.instagramcompose.profile.components.ProfileHeader
import com.progressapp.instagramcompose.profile.components.ProfilePosts
import com.progressapp.instagramcompose.profile.components.ProfileStoryHighlight

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(){
    ProfileScreen({})
}

@Composable
fun ProfileScreen(
    backArrow: () -> Unit,
) {
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

    Column {

        ProfileHeader(backArrow, {}, {}, user.username)

        ProfileInformation(
            imageUrl = user.profileImageUrl,
            post = user.posts.size,
            followers = user.follower,
            following = user.following
        )

        ProfileDescription(
            name = user.name,
            description = user.description,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
        )

        ProfileAction(modifier = Modifier.padding(start = 16.dp, end = 16.dp))

        ProfileStoryHighlight(user.stories)
        
        ProfilePosts(images = user.posts, modifier = Modifier.padding(top = 16.dp))
    }
}
