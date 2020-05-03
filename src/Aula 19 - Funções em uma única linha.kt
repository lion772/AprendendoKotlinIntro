fun main() {

    fun hello(nome: String) = "Olá, $nome!" //Para função em uma única linha, é necessário que tenha somente uma instrução, ou seja, a menor parte do código que é executado
    fun soma(a: Int, b: Int) = a + b

    println("william")
    println(soma(10,5))

    var numero = 10
    var numero1 = 10
    var numero2 = 10

    println("numero ++ = ${numero ++}") //o duplo sinal positivo depois do número significa que este será usado primeiro e depois incrementado
    println(numero)
    println("++ numero1 = ${++numero1}") //o duplo sinal positivo antes do número significa que este será incrementado primeiro e depois usado

    numero2 += 2
    println("numero += 2 = ${numero}")
}