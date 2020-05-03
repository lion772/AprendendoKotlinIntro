fun operacao(a:Int, b: Int, c: String) { //Quando rodar essa função, tirar o retorno SE for para validar as variáveis

    /*when(c){ //When é um pouco parecido com Switch do Java
        "soma" -> return a + b
        "subtração" -> return a - b
        else -> { //Só consegue simplicar pra uma linha quando só tem uma instrução
            println("Operação incorreta")
            return 0
        }
    }*/

    /*return when(c){
        "soma" -> a + b
        "subtração" -> a - b
        else -> { //Só consegue simplicar pra uma linha quando só tem uma instrução
            println("Operação incorreta")
            return 0
        }
    }*/

    when { //É possível validar variáveis com When, se comportando de forma semelhante ao If
        //a > 0 && b > 0 -> println("Variáveis maiores que zero")
        a in 1..99 -> println("Século") //Mesma coisa que "a > 0 && a < 100"
    }
}

fun main() {

    println(operacao(20, 10, "soma"))
    println(operacao(20, 10, "subtração"))
    println(operacao(20, 10, "SoMa"))

}


