package com.oyamo.kontributor.data.local.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.oyamo.kontributor.domain.model.Follow

@Entity(tableName = "user_followings_table", indices = [Index(value = ["login"], unique = true)])
data class UserFollowingsEntity(
    val login: String,
    val followings: List<Follow>,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
)
