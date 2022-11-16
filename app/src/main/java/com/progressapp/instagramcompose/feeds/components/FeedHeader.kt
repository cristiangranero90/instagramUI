package com.progressapp.instagramcompose.feeds.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun FeedHeader(
    plusClick: () -> Unit,
    hearthClick: () -> Unit,
    messageClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,        
    ) {
        
        Box {
            Text(
                text = "Instagram",
                fontSize = 26.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold)
        }

        Box {
            Row() {

                IconButton(onClick = { plusClick }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "add new feed")
                }

                IconButton(onClick = { hearthClick }) {
                    Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "notifications ")
                }
                
                IconButton(onClick = { messageClick }) {
                    Icon(imageVector = Icons.Default.MailOutline, contentDescription = "Messages" )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedHeaderPreview(){
    FeedHeader({},{},{})
}