package com.oyamo.kontributor.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.oyamo.kontributor.data.local.converters.Converters
import com.oyamo.kontributor.data.local.dao.FollowersDao
import com.oyamo.kontributor.data.local.dao.FollowingDao
import com.oyamo.kontributor.data.local.dao.ReposDao
import com.oyamo.kontributor.data.local.dao.UserDao
import com.oyamo.kontributor.data.local.entity.UserEntity
import com.oyamo.kontributor.data.local.entity.UserFollowersEntity
import com.oyamo.kontributor.data.local.entity.UserFollowingsEntity
import com.oyamo.kontributor.data.local.entity.UserReposEntity

@TypeConverters(Converters::class)
@Database(
    entities = [UserEntity::class, UserFollowingsEntity::class, UserFollowersEntity::class, UserReposEntity::class],
    version = 2,
    exportSchema = false
)
abstract class GithubUserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun followingDao(): FollowingDao
    abstract fun followersDao(): FollowersDao
    abstract fun reposDao(): ReposDao
}