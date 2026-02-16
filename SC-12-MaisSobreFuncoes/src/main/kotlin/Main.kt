fun endereco(rua: String, cidade: String, estado: String, cep: String = ""){

}

fun media( vararg n: Float) : Float {
    var soma = 0F
    for(i in n){
        soma += i
    }

    return soma / n.size
}

fun calculaJuros(): Nothing{
    // logica - implementacao
    throw Exception()
}

fun anyExemplo(vararg abc: Any): Any {
    var soma = 0F
    for(i in abc){
        when(i) {
            is Int -> print("Int")
            is Float -> print("Float")
            is String -> print("String")
            is Boolean -> print("Boolean")
            is Char -> print("Char")
        }
    }

    return abc
}

fun main(){
    println(endereco("rua", estado = "estado", cidade = "cidade"))

    println(media( 8F, 10F, 5F, 5F, 6F, 78F))

    println(anyExemplo( 8F, 10F, 5F, 5F, 6F, 78F, "", false, 5, 'd'))

}