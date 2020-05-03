import java.lang.Exception
import java.lang.*

fun main() {

    /* Conforme o nosso programa cresce, a gente precisa começar a detalhar a especificar alguns
    *  comportamentos e separar responsabilidades. Quando existem funções iguais no mesmo pacote,
    *  dá erro porque elas não podem coexistir, porém se criar um novo Package, assim será possível
    *  separar códigos. Já fizemos isso com try / catch, toda vez que tentamos pegar uma excessão
    *  através do catch, uma classe é importada de outro pacote. Caso queira importar tudo de um
    *  determinado pacote, basta escreve "*" após o ponto.   */

    try {

    }catch (e: NumberFormatException){

    }catch (e: Exception){

    }

}