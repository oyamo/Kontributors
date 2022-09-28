package com.oyamo.kontributor.data.local.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.oyamo.kontributor.domain.model.Follow

@Entity(tableName = "user_followers_table", indices = [Index(value = ["login"], unique = true)])
data class UserFollowersEntity(
    val login: String,
    val followers: List<Follow>,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
)