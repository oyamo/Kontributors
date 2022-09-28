package com.oyamo.kontributor.domain

import com.oyamo.kontributor.data.FakeUserRepository
import com.oyamo.kontributor.domain.use_case.GetUserFollowers
import org.junit.Before

class GetUserFollowersTest {

    private lateinit var getUserFollowers: GetUserFollowers
    private lateinit var fakeUserRepository: FakeUserRepository

    @Before
    fun setUp() {
        fakeUserRepository = FakeUserRepository()
        getUserFollowers = GetUserFollowers(fakeUserRepository)
    }
}