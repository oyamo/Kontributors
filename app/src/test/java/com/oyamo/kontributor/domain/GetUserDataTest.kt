package com.oyamo.kontributor.domain

import com.oyamo.kontributor.data.FakeUserRepository
import com.oyamo.kontributor.domain.use_case.GetUserData
import org.junit.Before

class GetUserDataTest {

    private lateinit var getUserData: GetUserData
    private lateinit var fakeUserRepository: FakeUserRepository

    @Before
    fun setUp() {
        fakeUserRepository = FakeUserRepository()
        getUserData = GetUserData(fakeUserRepository)
    }
}