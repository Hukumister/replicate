package com.replicate.features.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.replicate.common.theme.textPrimary
import com.replicate.common.theme.textSecondary

@Preview(showBackground = true)
@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        ButtonCard(
            modifier = Modifier.padding()
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 16.dp),
            title = "Учить слова",
            subtitle = "6 слов на сегодня"
        )

        ButtonCard(
            modifier = Modifier.padding()
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 16.dp),
            title = "Учить слова",
            subtitle = "6 слов на сегоя"
        )
    }
}

@Composable
private fun ButtonCard(
    modifier: Modifier,
    title: String,
    subtitle: String
) {
    Card(
        modifier = modifier,
        elevation = 8.dp,
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 10.dp)
        ) {
            Text(
                color = textPrimary,
                text = title
            )
            Text(
                color = textSecondary,
                text = subtitle
            )
        }
    }
}
