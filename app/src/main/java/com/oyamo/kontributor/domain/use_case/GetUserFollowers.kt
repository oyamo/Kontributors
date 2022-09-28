package com.oyamo.kontributor.domain.use_case

import com.oyamo.kontributor.domain.model.Follow
import com.oyamo.kontributor.domain.repository.UserRepository
import com.oyamo.kontributor.util.Resource
import kotlinx.coroutines.flow.Flow

class GetUserFollowers(private val userRepository: UserRepository) {
    suspend operator fun invoke(username: String): Flow<Resource<List<Follow>>> {
        return userRepository.getUserFollowers(username)
    }
}