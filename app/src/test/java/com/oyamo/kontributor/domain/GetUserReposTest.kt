package com.oyamo.kontributor.domain

import com.oyamo.kontributor.data.FakeUserRepository
import com.oyamo.kontributor.domain.use_case.GetUserRepos
import org.junit.Before

class GetUserReposTest {

    private lateinit var getUserRepos: GetUserRepos
    private lateinit var fakeUserRepository: FakeUserRepository

    @Before
    fun setUp() {
        fakeUserRepository = FakeUserRepository()
        getUserRepos = GetUserRepos(fakeUserRepository)
    }
}