package com.example.whatsappwithjetpack.ui.theme.Components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappwithjetpack.data.TabData
import com.example.whatsappwithjetpack.data.tabs
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabComponents(
    intialIndex: Int = 0,
    pagerState: PagerState,
    onTabSelected: (Int) -> Unit
) {
    var selectedIndex by remember {
        mutableStateOf(0)

    }
    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collectLatest { page ->
            selectedIndex = page
            onTabSelected(selectedIndex)

        }
    }
    TabRow(selectedTabIndex = selectedIndex,
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.tertiary,
        indicator = { tabPosition ->
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabPosition[selectedIndex]),
                color = MaterialTheme.colorScheme.tertiary,
                height = 4.dp
            )
        })
    {
        tabs.forEachIndexed { index, tabData ->
            Tab(
                selected = index == selectedIndex,
                onClick = {
                    selectedIndex = index
                    onTabSelected(selectedIndex)
                },
                text = {
                    TabContent(tabData)
                }
            )
        }
    }

}


//@Preview()
//@Composable
//fun TabComponentsPreview(){
//    TabComponents()
//
//}


@Composable
fun TabTittle(title: String) {
    Text(
        text = title,
        style = TextStyle(fontSize = 16.sp)
    )

}

@Composable
fun TabWithUnreadCount(tabData: TabData) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TabTittle(title = tabData.tittle)
        tabData.unreadCount?.also { unreadCount ->
//            Text(
//                text = unreadCount.toString(),
//                modifier = Modifier
//                    .padding(4.dp)
//                    .size(16.dp)
//                    .clip(CircleShape)
//                    .background(MaterialTheme.colorScheme.background),
//                style = TextStyle(color = MaterialTheme.colorScheme.primary),
//                textAlign = TextAlign.Center,
//                fontSize = 12.sp
//            )

           CircularPoint(
                unreadCount = unreadCount.toString(),
                backgroundColor = MaterialTheme.colorScheme.background,
                textColor = MaterialTheme.colorScheme.primary
            )

        }

    }

}


@Composable
fun TabContent(tabData: TabData) {
    if (tabData.unreadCount == null) {
        TabTittle(tabData.tittle)
    } else {
        TabWithUnreadCount(tabData = tabData)
    }

}

