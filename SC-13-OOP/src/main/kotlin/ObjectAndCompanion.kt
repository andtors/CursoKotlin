class Matematica {
    var id: Int = 10

    companion object {
        val PI = 3.1415

        fun abc() {
            println("Sou a classe Matematica")
        }

        init {
            println("Fui chamado!")
        }
    }

    object OBJ1 {
        fun abc(){

        }

        init {
            println("Fui camado ! OBJ1")
        }
    }

    object OBJ2 {

    }
}

fun main() {
    // object
    // companion object

    Math.PI
    Math.random()

    Matematica().id // escopo do objeto
    Matematica().id
    Matematica().id

    Matematica.PI
    Matematica.abc()

    println(Matematica.PI)

    Matematica.OBJ1.abc()
}