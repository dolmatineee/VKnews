package com.example.vknews.presentation.news

import com.example.vknews.domain.FeedPost

sealed class NewsFeedScreenState{

    object Initial: NewsFeedScreenState()

    object Loading : NewsFeedScreenState()

    data class Posts(
        val posts: List<FeedPost>,
        val nextDataIsLoading: Boolean = false
    ): NewsFeedScreenState()

}
