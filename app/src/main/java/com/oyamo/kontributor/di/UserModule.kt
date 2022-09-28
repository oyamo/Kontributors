package com.oyamo.kontributor.di

import android.content.Context
import androidx.room.Room
import com.oyamo.kontributor.data.local.converters.Converters
import com.oyamo.kontributor.data.local.database.GithubUserDatabase
import com.oyamo.kontributor.data.remote.GithubRestAPI
import com.oyamo.kontributor.data.repository.UserRepositoryImpl
import com.oyamo.kontributor.domain.repository.UserRepository
import com.oyamo.kontributor.domain.use_case.*
import com.oyamo.kontributor.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UserModule {

    @Provides
    @Singleton
    fun provideGithubUserDatabase(
        @ApplicationContext context: Context,
        converters: Converters
    ): GithubUserDatabase {
        return Room.databaseBuilder(
            context,
            GithubUserDatabase::class.java,
            "github_user_database"
        )
            .addTypeConverter(converters)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideGithubRestApi(okHttpClient: OkHttpClient): GithubRestAPI {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(GithubRestAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideUserRepository(
        githubRestAPI: GithubRestAPI,
        githubUserDatabase: GithubUserDatabase
    ): UserRepository {
        return UserRepositoryImpl(
            githubRestAPI = githubRestAPI,
            userDao = githubUserDatabase.userDao(),
            followingDao = githubUserDatabase.followingDao(),
            followersDao = githubUserDatabase.followersDao(),
            reposDao = githubUserDatabase.reposDao()
        )
    }

    @Provides
    @Singleton
    fun provideUseCases(userRepository: UserRepository): UserUseCases {
        return UserUseCases(
            getUserData = GetUserData(userRepository),
            getUserRepos = GetUserRepos(userRepository),
            getUserFollowers = GetUserFollowers(userRepository),
            getUserFollowings = GetUserFollowings(userRepository),
        )
    }
}