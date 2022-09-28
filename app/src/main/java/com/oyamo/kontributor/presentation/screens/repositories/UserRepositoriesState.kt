package com.oyamo.kontributor.presentation.screens.repositories

import com.oyamo.kontributor.domain.model.Repo

data class UserRepositoriesState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val repos: List<Repo> = emptyList(),
)
