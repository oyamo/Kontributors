package com.oyamo.kontributor.domain.repository

import com.oyamo.kontributor.domain.model.*
import com.oyamo.kontributor.util.Resource
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun getUser(username: String): Flow<Resource<User>>
    suspend fun getUserFollowers(username: String): Flow<Resource<List<Follow>>>
    suspend fun getUserFollowing(username: String): Flow<Resource<List<Follow>>>
    suspend fun getUserRepos(username: String): Flow<Resource<List<Repo>>>
}