fun main() {

    /* O operador Elvis verifica se uma variável é nula. Se a variável for nula
    * atribua o valor passado após o comando "?:" , mas caso não seja nula, use
    * o valor do test. Muito parecido com o diagrama ternário, mas só que trabalha
    * com valores nulos  */
    val test: Int? = null
    val op: Int = test ?: 100

    println(op)
}