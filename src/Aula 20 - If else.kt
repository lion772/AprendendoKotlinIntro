

fun calcularBonus(cargo: String, salario: Float): Float {

    //Ao invés de usar toda aquela estrura arcaica como vimos no Java, no Kotlin if/else é uma expressão que retorna ela mesma ou um valor, ou seja, consigo fazer atribuição dele logo de cara com uma variável ou código que existe dentro dele, quase um retorno

    return if (cargo == "coordenador"){
        salario * 0.2f
    }else if (cargo == "gerente junior"){
        salario * 0.5f
    }else {
        salario * 2
    }


    /*val bonus: Float
    if (cargo == "coordenador"){
        bonus = salario * 0.2f
    }else if (cargo == "gerente junior"){
        bonus = salario * 0.5f
    }else {
        bonus = salario * 2
    }
    return bonus*/
}

fun maiorDeIdade(nome: String, idade: Int): Boolean {
    return idade >= 18 /* Essa linha substitui toda aquela linha de código if / else:
                          if (idade >= 18){
                               return true
                          }else{
                               return false
                          }*/
}
/* O comando CTRL + ALT + L formata o código, que faz a identação  */
fun main() {

    println(maiorDeIdade("william", 17))

    println(calcularBonus("coordenador", 1000f))
    println(calcularBonus("gerente junior", 1000f))
    println(calcularBonus("gerente senior", 1000f))

    /* Diagrama ternário no Java e seu equivalento no Kotlin */
    val valor = 10
    //String str = valor == 10? "Sim" : "Não";
    val str = if(valor ==10) "Sim" else "Não"

}