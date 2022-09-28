package com.oyamo.kontributor.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Repo(
    val allowForking: Boolean,
    val blobsUrl: String?,
    val branchesUrl: String?,
    val cloneUrl: String?,
    val collaboratorsUrl: String?,
    val commitsUrl: String?,
    val contentsUrl: String?,
    val contributorsUrl: String?,
    val description: String?,
    val forksCount: Int?,
    val forksUrl: String?,
    val fullName: String?,
    val gitCommitsUrl: String?,
    val gitUrl: String?,
    val id: Int,
    val language: String?,
    val name: String?,
    val openIssuesCount: Int,
    val owner: Owner,
    val `private`: Boolean,
    val pullsUrl: String?,
    val size: Int,
    val stargazersCount: Int,
    val svnUrl: String?,
    val topics: List<String?>,
    val url: String?,
    val visibility: String?,
    val updatedAt: String?
    ): Parcelable