package com.hgm.cleanarchitecturesampledemo.data.repository

import com.hgm.cleanarchitecturesampledemo.data.model.NewsModel
import com.hgm.cleanarchitecturesampledemo.domain.model.News

/**
 * @author：HGM
 * @created：2023/11/29 0029
 * @description：抽象接口，定义与新闻相关的方法
 **/
interface NewsRepository {

      suspend fun getNews():List<News>
      suspend fun getAuthorInfo():List<NewsModel>
}