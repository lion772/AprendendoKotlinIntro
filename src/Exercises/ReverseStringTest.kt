package Exercises

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {

    /*A notação teste indica que usaremos o junit para testar as nossas funções, nesse caso o "junit:junit:4.12" em file
    * > Project Structure > Libraries > New Project Library > From Maven...*/
    @Test
    fun reverseUsingSB(){
        Assert.assertEquals("bs niltok", reverseUsingSB("kotlin sb")) //Devemos escrever nos parâmetros o que esperamos e qual função queremos chamar
    }

    @Test
    fun reverseUsingLoop(){
        Assert.assertEquals("pool niltok", reverseUsingLoop("kotlin loop"))
    }
}