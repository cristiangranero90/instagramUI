package com.progressapp.instagramcompose.profile

data class User(
    val username: String,
    val profileImageUrl: String,
    val follower: Int,
    val following: Int,
    val name: String,
    val description: String,
    val stories: List<Story>,
    val posts: List<String>
)

data class Story(
    val image: String,
    val text: String
)