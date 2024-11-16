package it.vfsfitvnm.vimusic.enums

import androidx.annotation.StringRes
import it.vfsfitvnm.vimusic.R

enum class QuickPicksSource(
    @StringRes val resourceId: Int
) {
    Trending(
        resourceId = R.string.most_played,
    ),
    LastPlayed(
        resourceId = R.string.last_played,
    ),
    Random(
        resourceId = R.string.random,
    )
}