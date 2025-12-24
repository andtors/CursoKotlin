/* Calculo de bonus de funcionario baseado em tempo de empresa
*  Menos de um ano -> 500
*  1 a 3 anos -> 2000
*  4 anos ou mais -> 5000
*/

fun calculaBonus1(tempo: Int): Float{
    if(tempo == 0){
        return 500F
    } else if(tempo in 1 .. 3){
        return 2000F
    } else if(tempo >= 4){
        return 5000F
    }

    return 0F
}

fun calculaBonus2(tempo: Int): Float{

    var bonus = 0F

    if(tempo == 0){
        bonus =  500F
    } else if(tempo in 1 .. 3){
        bonus = 2000F
    } else if(tempo >= 4){
        bonus = 5000F
    }

    return bonus
}

fun calculaBonus3(tempo: Int, cargo: String): Float{

    if(cargo == "Diretor") {
        return 10000F
    }

    var bonus = 0F

    if(tempo == 0){
        bonus =  500F
    } else if(tempo in 1 .. 3){
        bonus = 2000F
    } else if(tempo >= 4){
        bonus = 5000F
    }

    return bonus
}

fun main() {
    println(calculaBonus1(4))
    println(calculaBonus1(-1))
    println(calculaBonus2(2))
    println(calculaBonus3(3, "Diretor"))
}