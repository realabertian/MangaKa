package acgn.app.domain

import acgn.app.R
import android.net.Uri
import androidx.annotation.StringRes
import java.time.LocalDate

data class Manga (
    val meta: MangaMeta,
    val chapters : List<Chapter>
)

data class MangaMeta (
    val name: String,
    val author: String,
    val createDate: LocalDate,
    val lastUpdateDate: LocalDate,
    val lastChapterIndex: Int,
    val lastReadIndex: Int,
    val authorArea: MangaArea
)

data class Chapter (
    val pages: List<Page>
)

data class Page (
    val index: Int,
    val uri: Uri
)

enum class MangaArea(@StringRes val id: Int) {
    Japan(R.string.manga_area_name_japan),
    USA(R.string.manga_area_name_usa),
    SouthKorea(R.string.manga_area_name_south_korea),
    China(R.string.manga_area_name_china),
    Others(R.string.manga_area_name_others)
}