package com.hfad.startproject

import junit.framework.TestCase.fail
import org.junit.Test
import com.hfad.startproject.SearchUrlTest.getSearchUrl

class getSearchUrlTest {

    @Test
    fun testGetSearchUrlWithNull() {
        // 4.1 Вызов функции с значением null
        val nullResult = getSearchUrl(null)
        // 4.2 Проверка
        if (nullResult == null) {
            println("success")
        } else {
            // 4.3
            fail("Ошибка: ожидался null, но был получен $nullResult")
        }
    }
}