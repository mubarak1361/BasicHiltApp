package com.sample.basichiltapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
internal object AppModule {

    @Provides
    @ActivityScoped
    fun provideUser(): User{
        return User((0..10).random(),"Mubarak")
    }
}