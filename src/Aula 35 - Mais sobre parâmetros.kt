
fun endereco(rua:String = "", cidade:String = "", estado:String = "", cep:Int = -1){
    println("Rua: $rua, Cidade: $cidade, Estado: $estado, Cep: $cep")
}


fun main() {

    /* Quando simplesmente coloca os valores dos parâmetros sucessivamente, cada valor
    * será devidamento encaixado, onde o primeiro é rua, segundo é cidade, assim por diante.
    * Mas podemos escrever os parâmetros de forma aleatória quando damos nomes a eles, pois
    * especificamos qual posição a variável ocupará no parâmetro. */

    endereco("Jaguatirica", "RJ", "RJ", 23093145)
    endereco(cidade = "RJ", estado = "RJ", rua = "Jaguatirica")
    endereco(estado = "RJ", rua = "Jaguatirica")
}