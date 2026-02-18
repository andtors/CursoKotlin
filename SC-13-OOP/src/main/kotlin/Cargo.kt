enum class Cargo {
    DIRETOR, GERENTE
}

enum class Prioridade(val id: Int){
    BAIXA(1), MEDIA(2), ALTA(3)
}

fun main(){
    for(p in Prioridade.entries){
        println(p.id)
    }
}