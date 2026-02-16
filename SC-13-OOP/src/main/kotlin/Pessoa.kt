class Pessoa(var nome: String, var anoNascimento: Int = 0) {

    var doc: String? = null
    var abc: String = ""

    init {
        if(anoNascimento < 0) {
            throw Exception("Ano não pode ser menor que zero!")
        }
    }

    init {
        println("Classe criada!")
    }

    // Secundario
    constructor(nome: String, anoNascimento: Int, doc: String): this(nome, anoNascimento) {
        println("Construtor secundario!")
        if(doc == ""){
            throw Exception()
        }

        this.doc = doc
    }

    fun acordar() {

    }
    fun dormir(){

    }
}

class Pessoa2 private constructor()


fun main(){
    var p1: Pessoa = Pessoa("Fulano", 2000)
    var p2: Pessoa = Pessoa("Fulano", 2000, "541561685498")
    // var p2: Pessoa2 = Pessoa2()

    p1.nome
    println(p1.anoNascimento)
    p1.abc
    p1.acordar()

    println(p2.doc)
}
