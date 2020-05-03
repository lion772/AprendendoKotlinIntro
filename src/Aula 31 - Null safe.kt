fun main() {

    /* O kotlin é considerado uma linguagem segura, pois em alguns momentos as variaveis podem
    * assumir um valor nulo, a fim de evitar ao máximo erros desse tipo no kotlin Exception. Para
    * permitir que uma variável POSSA ser nula, colocamos "?" após o formato do dado. Fazemos isso
    * pois precisa de um processamento antes de assumir o valor de uma variável.
      Para retornar uma variável que pode ser nula ou não, deve também colocar o "?" depois da
    *  variável. */

    val str:String? = null
    println(str?.length)

    //Outra maneira de de contornar esse problema é usando validação com If:
    if (str != null)
        println(str.length)

    //Caso você queira assumir o erro e arriscar, podendo dar erro, escreva:
    println(str!!.length)

    /* O NullPointerException é um dos erros mais comuns do Java, porém o Kotlin sabe lidar
    *  com erro que possa acontecer numa variável. Acontece esse erro quando você tenta acessar
    * propriedades ou métodos de uma variável nula, ou seja, não tem nada para ser acessado */
}