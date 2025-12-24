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


}

