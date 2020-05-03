fun media(n1:Float, n2:Float, n3:Float, n4:Float = 0f, n5:Float = 0f){
    /*Se fosse para colocar inúmeras provas, gastaria muito tempo colocando uma por uma
    * mas podemos criar uma lista array para isso*/
}

fun media2(vararg notas:Float){

    if (notas.isNotEmpty()){
        var soma = 0f
        for(nota in notas){
            soma += nota
        }
        println("A média é: ${soma/notas.size}" )
    }
}

fun <T> media3(vararg valores: T){ //Com esse "T" na função nos indica que aceita qualquer tipo de formato
    for (valor in valores){        //varag aceita quantos elementos forem necessários
        println(valor)
    }
}

fun main() {

    media(8f,9f, 5f)
    media2(5f, 4f, 6f, 8f, 9f, 10f) //Assim posso adicionar quantos números quiser
    media3(5f, 4, 4.4, "", true)

    val str = "lorem ipsum"
    str.capitalize()
    str.decapitalize()
    str.contains("l")
    str.startsWith("1")
    str.startsWith("L")

    arrayOf(1,2,3,4,5,5,2,3)
}