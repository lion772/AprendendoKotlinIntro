
fun calcularBonus(a: Int, b: Int, c: Int){   //Quando você não especifica o retorno, o Kolin o define como Unit, ou seja, vazio, semelhante a void no Java
     println("O valor do bonus é: ${a + b - c}")
}

fun hello(nome: String) : String {
    return "hello, $nome !"

}

fun main() {

    val a = 10
    val b = 20
    val c = 30

    calcularBonus(a,b,c)

    println(hello("William"))
}