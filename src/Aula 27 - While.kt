fun main() {

    var index: Int = 0
    while(index < 100) {
        print(index)
        index++

        if (index == 50) break //break funciona tanto para o while quanto para o for
    }

    var indice:Int = 10
    do {
        println(indice)
        indice += 5
    } while (indice <= 100)

    /* O while executa enquanto a condição for verdadeira
    * o do while executa mesmo se a condição for falsa, porém não executa de novo. Ele executa uma
    * vez antes de verificar  */


}