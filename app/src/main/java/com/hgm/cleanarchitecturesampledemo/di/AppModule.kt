package com.hgm.cleanarchitecturesampledemo.di

import com.hgm.cleanarchitecturesampledemo.data.remote.NewsApi
import com.hgm.cleanarchitecturesampledemo.data.repository.NewsRepository
import com.hgm.cleanarchitecturesampledemo.data.repository.NewsRepositoryImpl
import com.hgm.cleanarchitecturesampledemo.domain.use_case.GetNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * @auth：HGM
 * @date：2023-09-04 17:59
 * @desc：
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

      @Provides
      @Singleton
      fun providePaprikaApi(): NewsApi{
            return Retrofit.Builder()
                  .baseUrl(NewsApi.BASE_URL)
                  .addConverterFactory(GsonConverterFactory.create())
                  .build()
                  .create(NewsApi::class.java)
      }

      @Provides
      @Singleton
      fun provideNewsRepository(api: NewsApi): NewsRepository {
            return NewsRepositoryImpl(api)
      }

      @Provides
      @Singleton
      fun provideGetNewsUseCase(repository: NewsRepository):GetNewsUseCase{
            return GetNewsUseCase(repository)
      }
}