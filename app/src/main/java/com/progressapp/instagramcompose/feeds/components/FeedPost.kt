package com.progressapp.instagramcompose.feeds.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.progressapp.instagramcompose.profile.User

@Composable
fun FeedPost(
    users: User,
    modifier: Modifier = Modifier
) {

    Box(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
        //All the items in a column
        Column {

            topPost(users)

            //Center Image
            AsyncImage(model = users.posts.get(users.posts.size-1), contentDescription = "latest post")

            BottomPost(users)

            Divider(modifier = Modifier, color = Color.LightGray, 1.dp)
        }
    }
}

@Composable
fun BottomPost(users: User) {
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Box() {
            Row(
                modifier = Modifier
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "like")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Edit, contentDescription = "comment")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.MailOutline, contentDescription = "message")
                }
            }
        }
        Spacer(modifier = Modifier.width(200.dp))

        Box() {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Check, contentDescription = "Save for later")
            }
        }
    }
}

@Composable
fun topPost(users: User){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Box(){
            Row() {
                AsyncImage(model = users.profileImageUrl,
                    contentDescription = "Profile image",
                    modifier = Modifier.clip(CircleShape))
                Column(
                    modifier = Modifier.padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom


                ) {
                    Text(text = users.username, fontWeight = FontWeight.Bold)
                    Text(text = users.name)

                }
            }
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Settings, contentDescription = "settings")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedPostPreview(){
    //FeedPost(null)
}