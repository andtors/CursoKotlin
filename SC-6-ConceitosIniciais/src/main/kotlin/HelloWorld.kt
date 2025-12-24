// Comentario de uma linha

/*
*
* Comentario de multiplas linhas
*
* */

fun main() {

    var teste: String = "Olá mundo!"
    print(teste)
    var b: Boolean = false
    var str: String = "Hello World!"
    var c: Char = 'a'
    var f: Float = 10.5F
    var d: Double = 10.328243
    var abc: Long = 150L
    var i: Int = 150
    var by: Byte = 100
    var s: Short = 15

    println("${Double.MIN_VALUE} - ${Double.MAX_VALUE}")
    println("${Float.MIN_VALUE} - ${Float.MAX_VALUE}")
    println("${Long.MIN_VALUE} - ${Long.MAX_VALUE}")
    println("${Integer.MIN_VALUE} - ${Integer.MAX_VALUE}")
    println("${Short.MIN_VALUE} - ${Short.MAX_VALUE}")
    println("${Byte.MIN_VALUE} - ${Byte.MAX_VALUE}")

    val str1: String = "abc"
    // str1 = "def"

    // val - Imutavel
    // var - Mutavel

    println(str1)

    val linguagem = "Kotlin"
    val caracteristica = "é show!"

    println("$linguagem $caracteristica")

    println(" ${Double.MAX_VALUE}")

    println(2 + 2)

    val soma = 2 + 2
    val subtracao = 2 - 2
    val multiplicacao = 2 * 10
    val divisao = 100 / 5
    val resto = 10 % 3

    var valor1 = 0

    // logica
    // logica
    // logica

    valor1 = valor1 + 15
    valor1 += 15

    valor1 = 10
    println(valor1++)
    println(valor1--)
    println(++valor1)
    println(--valor1)

    var result = (2 + 3) * 4
    println(result)

    // Ex
    var retangulo = 10 * 5

    println(retangulo)

    var nome = "André"
    var num_calcado = 42
    var brasilpop = 212500000

    println(nome)
    println(num_calcado)
    println(brasilpop)

    var soma_ex = 10 + 5
    var div_ex = 10 / 5
    var resto_ex = 10 % 5
    var inc_ex = soma_ex++
    var dec_ex = soma_ex++

    println(soma_ex)
    println(div_ex)
    println(resto_ex)
    println(inc_ex)
    println(dec_ex)
}
