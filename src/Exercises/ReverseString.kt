package Exercises

import java.lang.StringBuilder

/* Utilizar junit facilita muito nossos teste unitários e se a verificação da nossa implementação está funcionando.
*  Para isso, criamos uma classe "teste" e será a partir dela que chamaremos a função que queremos testar. */

fun reverseUsingSB(str: String): String {
    //return StringBuilder(str).reverse().toString()
    //Jeito mais simples possível para resolver esse exercício usando o StringBuilder
    return str.reversed();
}

fun reverseUsingLoop(str: String): String {

   /* var sbPhrase = StringBuilder()
    var i = str.length - 1  //Queremos iniciar em zero, por isso botamos "-1"

    while (i >= 0) {
        sbPhrase.append(str[i])
        i--
    }
    return sbPhrase.toString()*/

    val stringSize = str.length - 1
    var output:String = ""
    for (i in stringSize downTo 0){
        output += str[i]
    }
    return output
}