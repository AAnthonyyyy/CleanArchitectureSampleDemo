package com.hgm.cleanarchitecturesampledemo.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * @author：HGM
 * @created：2023/11/29 0029
 * @description：新闻页面，展示新闻列表
 **/
@Composable
fun NewsScreen(
      viewModel: NewsViewModel = hiltViewModel()
) {
      val news = viewModel.news.value

      LazyColumn(
            modifier = Modifier.fillMaxSize()
      ){
            items(news){
                  //渲染你的UI
                  //.....
            }
      }
}