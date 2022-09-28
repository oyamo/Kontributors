package com.oyamo.kontributor.domain.use_case

data class UserUseCases(
    val getUserData: GetUserData,
    val getUserFollowers: GetUserFollowers,
    val getUserFollowings: GetUserFollowings,
    val getUserRepos: GetUserRepos,
)