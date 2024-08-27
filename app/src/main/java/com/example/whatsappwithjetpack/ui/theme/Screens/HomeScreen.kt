package com.example.whatsappwithjetpack.ui.theme.Screens

import android.graphics.drawable.GradientDrawable
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerScope
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsappwithjetpack.data.tabs
import com.example.whatsappwithjetpack.ui.theme.Components.AppBarComponents
import com.example.whatsappwithjetpack.ui.theme.Components.TabComponents
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {

    val INITIAL_SCREEN_INDEX=0
  val pagerState= rememberPagerState(
      initialPage = INITIAL_SCREEN_INDEX,
      initialPageOffsetFraction = 0f
  ) {
      tabs.size
  }
    val scope= rememberCoroutineScope()


    Column {
        AppBarComponents()
        TabComponents(pagerState=pagerState, intialIndex = INITIAL_SCREEN_INDEX, onTabSelected = {selectedPage->
            scope.launch {
                pagerState.animateScrollToPage(selectedPage)
            }

        }
        )
HorizontalPager(modifier = Modifier.fillMaxSize(),
    state = pagerState) {
                page ->
            when(page){
                0-> ChatScrren()
                1-> StatusScreen()
                2-> CallsScrren()
            }

        }

    }
    }



@Preview
@Composable
fun HomeScrrenPreview() {
    HomeScreen()
}