fun main() {

    val str = "William Lopes de Mello - Steinke"
    for (i in str) {
        println(i) //Printa na vertical
    }

    //for (i in 1..100) print(i) //...e esse na horizontal
    //for (i in 1..100 step 2) print("$i ")

    for (i in 0..100 step 5){
        if (i != 80) print("$i ")
    }

    for (j in 100 downTo 0) print("$j ") // 100..1 não existe, então use downTo para números decrescentes


}