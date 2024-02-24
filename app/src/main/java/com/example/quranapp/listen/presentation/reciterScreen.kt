package com.example.quranapp.listen.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quranapp.listen.data.model.Moshaf
import com.example.quranapp.listen.data.model.ReciterResponse
import com.example.quranapp.listen.data.model.Reciters
import com.example.quranapp.ui.common.ExpandableCard

@Composable
fun ReciterScreen() {
    val response = ReciterResponse()
    Column {
        response.reciters.forEach { reciterItem ->
            ExpandableCard(title = reciterItem.name) {
                ReciterCard(reciterItem)
            }

        }
    }
}

@Composable
fun ReciterCard(reciterItem: Reciters) {
    Column {
        reciterItem.moshaf.forEach { moshafItem ->
            Button(
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp),
                onClick = { /*TODO*/ }) {
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(modifier = Modifier.padding(start = 8.dp),text = moshafItem.name ?: "")
                    Icon(
                        modifier = Modifier.padding(end = 8.dp),
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "navigate to moshaf"
                    )
                }
            }
            Divider(modifier = Modifier.padding(horizontal = 16.dp), thickness = 1.dp)
        }
    }
}

@Preview
@Composable
fun ReciterCardPreview() {
    ReciterCard(
        Reciters(
        id = 123,
        name = "Ahmed",
        letter = "123",
        moshaf = arrayListOf(
            Moshaf(
                id = 23,
                name = "hafs",
                server = "123",

            )
        )
    )
    )
}