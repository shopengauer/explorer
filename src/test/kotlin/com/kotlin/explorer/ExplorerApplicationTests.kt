package com.kotlin.explorer

import com.kotlin.explorer.functions.combine
import com.kotlin.explorer.functions.cool
import jdk.swing.interop.SwingInterOpUtils
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.BootstrapWith
import java.math.BigDecimal
import java.time.LocalDate

//@SpringBootTest
//@BootstrapWith(JUnit)
class ExplorerApplicationTests {

    @Test
    @DisplayName("Context loads fdgdfgadf")
    fun contex() {
        val list = listOf(1, 2, 3, 4, 5)
        print(list.cool("0", ::combine))
        list.cool("", fun(acc: String, el: Int): String = acc.plus(el.toString()))
        Assertions.assertAll({ Assertions.assertEquals(1, 1) },
                { Assertions.assertEquals(3, 3) })
    }

    @Test
    fun listOfTest() {
        var bd: BigDecimal? = null

        var d = bd?.toStringFormat()
        println(d)
    }

    private fun BigDecimal.toStringFormat(): String {
        return "this"
    }


    @Test
    internal fun scopeFunction() {
        val list = mutableListOf<String>("1","2","3")
        if(LocalDate.now() < LocalDate.now()) {
            println("OK")
        } else {
            println("FALSE")
        }

    }
}


