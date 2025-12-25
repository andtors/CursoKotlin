fun main(){

    for(i in 1 .. 50){
        print("$i ")
    }

    println()

    for(i in 50 downTo 1){
        print("$i ")
    }

    println()

    for(i in 1 .. 50){
       if(i % 5 == 0){
           print("$i ")
       }
    }

    println()

    var sum = 0

    for(i in 1 .. 500){
        sum += i
    }
    println(sum)

    var baloesIndex = 0
    var baloes = 0

    while(baloesIndex < 2000) {
        baloesIndex += 7
        if(baloesIndex > 2000) {
            break
        }
        baloes++
    }

    println("Cabem $baloes baloes de agua na caixa de agua")

    var fizzBuzzIndex = 0

    while(fizzBuzzIndex <= 50) {

        if(fizzBuzzIndex % 3 == 0 && fizzBuzzIndex % 5 == 0){
            println("$fizzBuzzIndex: FizzBuzz")

        } else if(fizzBuzzIndex % 3 == 0) {
            println("$fizzBuzzIndex: Fizz")

        } else if(fizzBuzzIndex % 5 == 0) {
            println("$fizzBuzzIndex: Buzz")

        }
        println(fizzBuzzIndex)
        fizzBuzzIndex++
    }

    val inverterString = "Meu nome e Julius"
    var stringIndex = inverterString.length - 1

    while(stringIndex > 0) {
        stringIndex--
        print(inverterString[stringIndex])
    }

    println(contarXO("xxxooo"))

    println(investimento())
}

fun contarXO(palavra: String): String {
    var tamanhoPalavra = palavra.length - 1
    var palavraIndex = 0

    var xCount = 0
    var oCount = 0

    while(palavraIndex <= tamanhoPalavra) {

        if(palavra[palavraIndex] == 'x') {
            xCount++
        } else if(palavra[palavraIndex] == 'o') {
            oCount++
        }

        palavraIndex++
    }

    println(xCount)
    println(oCount)

    if(xCount == oCount){
        return "True"
    } else {
        return "False"
    }



}

fun investimento(): Int{
    var paulaInvest = 0.00
    var meses = 0
    var rendimentoMes: Double

    while(paulaInvest < 10000.00) {
        meses++
        paulaInvest += 500.00
        rendimentoMes = paulaInvest * 0.08
        paulaInvest += rendimentoMes
        println(paulaInvest)
    }

    return meses
}