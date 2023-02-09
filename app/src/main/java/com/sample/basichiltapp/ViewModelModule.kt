package com.sample.basichiltapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ViewModelModule {

    @Provides
    @Singleton
    fun provideUser(): User{
        return User((0..10).random(),"Mubarak")
    }
}