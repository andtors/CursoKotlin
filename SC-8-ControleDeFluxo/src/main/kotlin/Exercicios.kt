fun main(){

    print("Insira seu cargo: ")
    var cargo = readLine().toString()
    print("Insira seus anos de exp: ")
    var exp = readln().toInt()

    println("$ " + bonus(cargo, exp))

    print("Insira o primeiro lado: ")
    var lado1 = readln().toInt()
    print("Insira o segundo lado: ")
    var lado2 = readln().toInt()

    eQuadrado(lado1,lado2)

    print("Insira o primeiro lado: ")
    var ladoTriangulo1 = readln().toInt()
    print("Insira o segundo lado: ")
    var ladoTriangulo2 = readln().toInt()
    print("Insira o terceiro lado: ")
    var ladoTriangulo3 = readln().toInt()

    eTriangulo(ladoTriangulo1,ladoTriangulo2, ladoTriangulo3)

    println(convite(19, "luxo", "XT19319238192"))

}

fun bonus(cargo: String, exp: Int): Int{
    var bonus = 0
    if(cargo == "Gerente"){
        bonus = if(exp < 2) {2000} else {3000}
    } else if (cargo == "Coordenador") {
        bonus = if(exp < 1) {1500} else {1800}
    } else if (cargo == "Eng.Software") {
        bonus = 1000
    } else if (cargo == "Estagiario"){
        bonus = 500
    }

    return bonus
}

// false, true, false, true

fun eQuadrado(lado1: Int, lado2: Int) {
    if(lado1 == lado2){
        println("É um quadrado!")
    } else {
        println("Não é um quadrado.")
    }
}

fun eTriangulo(lado1: Int, lado2: Int, lado3: Int) {
    if(lado1 == lado2 && lado1 == lado3){
        println("É um triangulo!")
    } else {
        println("Não é um triangulo.")
    }
}

// Segunda String e Terceira String

fun convite(idade: Int, convite: String, codigo: String): String {
    if(idade <= 18) {
        return "Negado, Menores de idade não são permitidos."
    }

    if(convite == "comum" && codigo.startsWith("XL")) {
        return "Welcome"
    } else if (convite == "premium" || convite == "luxo" && codigo.startsWith("XT")){
        return "Welcome"
    }

    return "Negado, covite invalido"
}