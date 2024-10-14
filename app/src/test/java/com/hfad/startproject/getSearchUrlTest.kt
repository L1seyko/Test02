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

    // Тест п.8
    @Test
    fun testGetSearchUrlWithString() {
        // 8.1 вызываем функцию с непустой строкой
        val result = getSearchUrl("example")

        // 8.2 проверка
        if (result != null) {
            println("success")
        } else {
            // 8.3 если результат равен null
            fail("Ошибка: результат не должен быть null для строкового значения")
        }
    }





}