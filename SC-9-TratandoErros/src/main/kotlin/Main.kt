fun main() {
    // null safety

    val str: String? = null

    println(str?.length)
    /*
    try {
        println(str!!.length)
    } catch (e: NullPointerException) {
        println("Erro - Null Pointer")
    }

    val abc = readLine()

    if(abc != null){
        abc.toShort()
    } else {
        println("Informe um valor valido.")
    }

    try {
        println(10 / 0)
    } catch (e: ArithmeticException) {
        println("Erro - Aritmetico")
    }
*/
    try {
        val abcd = "asdasda"

        println(str!!.length)

        println(10 / 0)

        print(abcd[100])
    } catch (e: IndexOutOfBoundsException){
        println("Erro = Index")
    } catch (e: NullPointerException){
        println("NullPointer")
    } catch (e: ArithmeticException) {
        println("Erro na divisão por 0")
    } catch (e: Exception) {
        println("Exceção generica")
    } finally {
        println("Finalmente")
    }

    try {
        divisao(10, 0)
    } catch (e: Exception){
        println(e.message)
    }

    val str2: String? = null

    /*
    if(str2 == null){
        println("Nulo")
    } else {
        print(str2)
    }
    */


    println(str2 ?: "Nulo")

    // verificaQuadrado()

    val str3: String? = "oashfwiufiq"

    /*
    str3?.lowercase()
    str3?.length
    str3?.contains("abc")
     */

    str3?.let{
        // Scope Function
        println(it.length)
        println(it.lowercase())
        println(it.contains("abc"))
    }
}

fun leituraValorInteiro(mensagem: String): Int{

    while(true) {
        print(mensagem)
        val input = readLine()
        if (input != null) {
            try {
                val numero = input.toInt()
                if (numero >= 0) {
                    return numero
                } else {
                    println("Informe um valor positivo!")
                }
            } catch (excp: Exception) {
                println("Informe um valor valido!")
            }
        } else {
            println("Informe um valor valido.")
        }
    }
}

fun verificaQuadrado(){
    val lado1 = leituraValorInteiro("Informe o lado 1: ")

    val lado2 = leituraValorInteiro("Informe o lado 2: ")

    if(lado1 == lado2) {
        println("É um quadrado!")
    } else {
        println("Não é um quadrado.")
    }
}

fun divisao(n1: Int, n2: Int): Int {
    if(n2 == 0){
        throw Exception("Divisor não pode ser zero.")
    }
    return n1/n2
}