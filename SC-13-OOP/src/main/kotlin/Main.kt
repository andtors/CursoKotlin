class Animal{
    private var nome: String = ""
        get(){
            print("")
            return field
        }
        set(value){
            print("")
            field = value
        }

    fun abc(){
        println(nome)
    }
}

fun main(){
    // Animal().nome
    Animal().abc()
}