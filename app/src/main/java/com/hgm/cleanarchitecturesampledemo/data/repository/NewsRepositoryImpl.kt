package com.hgm.cleanarchitecturesampledemo.data.repository

import android.util.Log
import com.hgm.cleanarchitecturesampledemo.data.model.NewsModel
import com.hgm.cleanarchitecturesampledemo.data.remote.NewsApi
import com.hgm.cleanarchitecturesampledemo.domain.model.News
import retrofit2.HttpException

/**
 * @author：HGM
 * @created：2023/11/29 0029
 * @description：NewsRepository 接口的具体实现类
 **/
class NewsRepositoryImpl(
      private val api: NewsApi
) : NewsRepository {

      override suspend fun getNews(): List<News> {
            return try {
                  //在这里处理来自远程或者本地数据（业务逻辑）
                  //val news = api.getNews().map {
                  //      it.toNews()
                  //}
            } catch (e: Exception) {
                  //...
                  Log.e("TAG", "getNews: ${e.message}", )
            } catch (e: HttpException) {
                  //...
                  Log.e("TAG", "getNews: ${e.message}", )
            }
      }

      override suspend fun getAuthorInfo(): List<NewsModel> {
            return try {
                  //在这里处理来自远程或者本地数据（业务逻辑）
                  //...
            } catch (e: Exception) {
                  //...
                  Log.e("TAG", "getNews: ${e.message}", )
            } catch (e: HttpException) {
                  //...
                  Log.e("TAG", "getNews: ${e.message}", )
            }
      }
}