package com.hgm.cleanarchitecturesampledemo.data.remote

import com.hgm.cleanarchitecturesampledemo.data.model.NewsModel
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @auth：HGM
 * @date：2023-09-09 21:53
 * @desc：远程数据源
 */
interface NewsApi {

      companion object {
            const val BASE_URL = "https://xxxxx.com"
      }

      @GET("/api/news")
      suspend fun getNews(): List<NewsModel>

      @GET("/api/author")
      suspend fun getAuthorInfo(): ResponseBody

}