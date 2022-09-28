package com.oyamo.kontributor.domain.use_case

import com.oyamo.kontributor.domain.model.User
import com.oyamo.kontributor.domain.repository.UserRepository
import com.oyamo.kontributor.util.Resource
import kotlinx.coroutines.flow.Flow

class GetUserData(private val userRepository: UserRepository) {
    suspend operator fun invoke(username: String): Flow<Resource<User>> {

        return userRepository.getUser(username)
    }
}