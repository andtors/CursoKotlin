import java.util.Locale

fun helloWorld(nome: String) = println("Ola, $nome!")

fun media(num1: Int, num2: Int): Int = (num1 + num2) / 2
fun soma(num1: Int, num2: Int) = num1 + num2

fun main() {
    helloWorld("Andre")

    println(media(10, 8))

    val str  = "25"
    val bool = "true"

    println(str.toByte())
    println(str.toShort())
    println(str.toInt())
    println(str.toLong())
    println(str.toFloat())
    println(str.toDouble())
    println(bool.toBoolean())

    val a: Byte = 0
    val b: Short = 5
    val c: Int = 10
    val d: Long = 15L
    val e: Float = 20F
    val f: Double = 250000.1234

    println(f.toInt()) // conveter de um valor maior para um menor, perde-se a precisão
    println(f.toInt().toByte())
    println(f.toInt().toShort())

    println(soma(10, 85))

    val str1 = "Programacao Kotlin!"

    println(str1[0])
    println(str1.length)
    println(str1.startsWith("Progra"))
    println(str1.endsWith("."))
    println(str1.substring(6))
    println(str1.substring(6, 8))
    println(str1.replace("o", "a"))
    println(str1.uppercase())
    println(str1.lowercase())
    println(str1.contains("Kotlin"))
    println(str1.isEmpty())
    println("      sefwerfwe          ".trim())

    val nome = "John"
    println("Ola, $nome")

    println("Ola, %s %s".format(nome, nome))
    // %s placeholder string
    // %d - Int
    // %f - Float
    // %c - Char
    // %b - Boolean

    val value = 5
    val salario = 16855.95

    println("Valor: %d - Salario: %f".format(value, salario))
    println("Valor: %02d - Salario: %.2f".format(value, salario))
    println("Valor: %02d - Salario: %.2f".format(Locale.US, value, salario))

    print("Informe um valor: ")
    val valor = readLine()

    valor.toString().toShort()
    valor.toString().toLong()

    println(valor)

    // Ex
    fun converterAno(anos: Int): String {

        var meses = anos * 12
        var dias = anos * 365
        var horas = dias * 24
        var minutos = horas * 60
        var segundos = minutos * 60

        return "$anos ano(s) corresponde(m) a: $meses meses, $dias dias, $horas horas, $minutos minutos, $segundos segundos"
    }

    println(converterAno(2))


    fun contaCarac(frase: String) = frase.length

    println(contaCarac("O rato roeu a roupa do rei de roma"))

    fun aoCubo(num1: Int) = num1 * num1 * num1

    println(aoCubo(9))

    fun converterMilhaEmKm(milha: Int) = milha * 1.6

    println(converterMilhaEmKm(3))

    fun converterCEmFh(temp: Int) = (temp * 9 / 5) + 32

    println(converterCEmFh(30))

    print("Digite uma palavra: ")
    val palavra = readLine().toString()

    fun converterChar(palavra: String): String{
        var novaPalavra = palavra
        novaPalavra = palavra.replace("a", "X").replace("A", "X")
        return novaPalavra
    }
    println(converterChar(palavra))


}

