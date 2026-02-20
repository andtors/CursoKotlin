fun main() {
    val mic = Microfone("xpto", 500F)
    mic.ligar()

    val pc = Computador("dell", 5000F, "Azul")
    pc.instalarSoftware()


}

class Computador(marca: String, preco: Float, var cor: String): Eletronico(marca, preco){
    fun instalarSoftware(){
        super.ligar()
        println("Instalando...")
        println("Instalado!")
        super.desligar()
    }
}

class Microfone(marca: String, preco: Float): Eletronico(marca, preco){
    fun gravar(){}
}


open class Eletronico(var marca:String, var preco: Float){
    fun ligar(){}
    fun desligar(){}
}