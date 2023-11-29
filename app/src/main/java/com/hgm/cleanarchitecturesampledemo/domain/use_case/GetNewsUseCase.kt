package com.hgm.cleanarchitecturesampledemo.domain.use_case

import com.hgm.cleanarchitecturesampledemo.data.repository.NewsRepository
import com.hgm.cleanarchitecturesampledemo.domain.model.News

/**
 * @author：HGM
 * @created：2023/11/29 0029
 * @description：获取新闻列表（业务逻辑提取到UseCase中）
 **/
class GetNewsUseCase(
      private val repository: NewsRepository
) {
      suspend operator fun invoke():List<News>{
            //业务逻辑
            // ....
            //return repository.getNews()
      }
}