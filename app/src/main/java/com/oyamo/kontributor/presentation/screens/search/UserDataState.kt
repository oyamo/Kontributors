package com.oyamo.kontributor.presentation.screens.search

import com.oyamo.kontributor.domain.model.Follow
import com.oyamo.kontributor.domain.model.Repo
import com.oyamo.kontributor.domain.model.User

data class UserDataState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val user: User? = null,
    val following: List<Follow> = emptyList(),
    val followers: List<Follow> = emptyList(),
    val repos: List<Repo> = emptyList(),
)
