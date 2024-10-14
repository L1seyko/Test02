package com.hfad.startproject

object SearchUrlTest {
    // Исходная функция, которую нужно протестировать
    fun getSearchUrl(query: String?): String? {
        return if (query.isNullOrEmpty()) {
            null
        } else {
            "https://www.google.com/search?q=$query"
        }
    }
}