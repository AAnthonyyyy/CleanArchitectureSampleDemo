package com.hgm.cleanarchitecturesampledemo.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.hgm.cleanarchitecturesampledemo.domain.model.News
import com.hgm.cleanarchitecturesampledemo.domain.use_case.GetNewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(
      private val getNews: GetNewsUseCase
) : ViewModel() {

      private val _news = mutableStateOf<List<News>>(emptyList())
      val news: State<List<News>> = _news

      init {
            //获取新闻
            val apiNews = getNews()
            // 更新值
            _news.value += apiNews
      }
}