fun ehManha(manha: Boolean) {
    if(manha){
        println("Acorde!")
    }
}

fun maiorDeIdadeLonga(idade: Int): Boolean{

    return (idade >= 18)

    /*
    if(idade >= 18) {

        return true
    } else {
        return false
    }
    */

}

fun maiorDeIdadeCurta(idade: Int) = (idade >= 18)

fun mensalidadeCurso(curso: String): Double {

    var mensalidade = -1.0

    if(curso == "informatica"){
        mensalidade = 500.00
    } else if(curso == "geografia"){
        mensalidade = 600.00
    }

    return mensalidade
}

fun bonus(cargo: String): Float {
    return when(cargo) {
        "Gerente" -> {
            2000F
        }
        "Coordenador" -> {
            1500F
        }
        "Engenheiro de Software" -> {
            1000F
        }
        "Estagiario" -> {
            500F
        }
        else -> {
            0F
        }
    }
}

fun whenExemplo(num: Int){

    when(num) {
        1 -> {
            println("Valor é 1")
        }
        in 2..9 -> {
            println("Valor está entre 2 e 9")
        }
        else -> {

        }
    }
}


fun main() {

    ehManha(true)
    ehManha(false)

    val str = "Programação Kotlin"
    if(str.contains("Kotlin")){
      println("Contém Kotlin!")
    }

    println(maiorDeIdadeLonga(15))
    println(maiorDeIdadeCurta(18))

    println(mensalidadeCurso("informatica"))
    println(mensalidadeCurso("geografia"))
    println(mensalidadeCurso("direito"))

    println(bonus("Estagiario"))
    whenExemplo(7)

    for(i in 0 .. 20 step 5){
        print("$i ")
    }

    println(" ")

    for(i in 20 downTo 0 step 5){
        print("$i ")
    }

    println(" ")

    for(i in 0 .. 20){

        if(i == 5){
            // break
            continue
        }

        print("$i")
    }

    println(" ")

    for(i in 0 .. 20){
        for(j in 0 .. 5){
           if(j == 1){
               break
           }
        }

        println()
        print("i:  $i")
    }

    println(" ")

    val str2 = "Programação Kotlin!"
    for(j in str2){
        print(j)
    }

    var indice = 0

    while(indice < 10){
        println("$indice: olá while")
        indice++
    }

    var index = 0

    do{
        println("$index: olá dowhile")
        index++
    }while(index < 10)
}

