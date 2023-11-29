package com.hgm.cleanarchitecturesampledemo.data.model

import com.hgm.cleanarchitecturesampledemo.domain.model.News

/**
 * @author：HGM
 * @created：2023/11/29 0029
 * @description：新闻模型（Api）
 **/
data class NewsModel(
      val id: Int,//编号
      val title: String,//标题
      val content: String,//内容
      val timestamp: Long,//时间戳
      val imageUrl: String,//图片
      val author: String,//作者
      val source: String,//新闻来源
      val type: String//新闻类型
) {
      //例如：我们只需要新闻的部分信息，那么需要在domain层新创建一个模型用于接收并且转换
      fun toNews(): News {
            return News(
                  id = id,
                  title = title,
                  content = content
            )
      }
}
