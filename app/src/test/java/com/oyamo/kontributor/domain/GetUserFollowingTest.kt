package com.oyamo.kontributor.domain

import com.oyamo.kontributor.data.FakeUserRepository
import com.oyamo.kontributor.domain.use_case.GetUserFollowings
import org.junit.Before

class GetUserFollowingTest {

    private lateinit var getUserFollowing: GetUserFollowings
    private lateinit var fakeUserRepository: FakeUserRepository

    @Before
    fun setUp() {
        fakeUserRepository = FakeUserRepository()
        getUserFollowing = GetUserFollowings(fakeUserRepository)
    }
}