import java.lang.Exception

fun main() {

    //A conversão ocorre com conversões de maiores tipos de dados para os menores tipos, onde: Double, Float, Long, Int, Short, Byte
    //Se houver uma multiplicação entre um Int e um Byte, não precisa converter caso a função esteja esperando um Int como retorno.


    val n1:Double = Double.MAX_VALUE
    val b1:Byte = 100

    println(b1.toDouble()) //Conversão de menor para maior não dá erro
    println(n1.toByte()) //Conversão de maior para o menor dá problema, pois o formato Byte não tem armazenamento para suportar um Double

    println("19".toInt()) //Não dará nenhum erro se converter string para qualquer desses formatos
    println("19".toFloat())
    println("19".toDouble())

    //Para tratar de erros inesperados que possam acontecer numa operação, usamos o try / catch
    try {
        println("dajoida".toInt())
    }catch (e: NumberFormatException){ //Essa excessão é mais específica e aponta exatamento a raiz do problema. Quando for montar as excessões, monte primeiro as mais específicas e deixe a mais genérica como última opção, caso contrário retornará a mais genérica primeiro
        println("Esse valor não é um número!")
    }catch (e: Exception){ //Esse tipo de excessão é o mais genérico, quando não se sabe ao certo o motivo para ter gerado esse problema
        println("Algo de errado aconteceu")
    }finally { //O finally é executado independente de ter dado erro ou não, serve como último recurso na utilização de banco de dados, por exemplo, onde se deve executar uma ação independente do resultado
        println("dajoida")
        println("dajoida")
    }
}