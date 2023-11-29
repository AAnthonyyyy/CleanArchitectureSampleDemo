package com.hgm.cleanarchitecturesampledemo.core

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hgm.cleanarchitecturesampledemo.core.ui.theme.CleanArchitectureSampleDemoTheme
import com.hgm.cleanarchitecturesampledemo.feature_auth.presentation.NewsScreen

/**
 * @author：HGM
 * @created：2023/11/29 0029
 * @description：Clean Architecture 示例项目
 **/
class MainActivity : ComponentActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                  CleanArchitectureSampleDemoTheme {
                        Surface(
                              modifier = Modifier.fillMaxSize(),
                              color = MaterialTheme.colorScheme.background
                        ) {
                              NewsScreen()
                        }
                  }
            }
      }
}
