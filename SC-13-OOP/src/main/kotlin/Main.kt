import javax.xml.crypto.Data

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

fun calculaBonus(cargo: Cargo): Float {
    if(cargo == Cargo.DIRETOR) {
         5000F
    } else if(cargo == Cargo.GERENTE) {
         3000F
    } else {
        2000F
    }

    return 0F
}

class Database {
    fun openConnection(){

    }
}

class Server{
    lateinit var db: Database

    fun initServer(){
        if(!::db.isInitialized){
            db = Database()
        }

        db.openConnection()
    }
}

fun main(){
    // Animal().nome
    Animal().abc()

    calculaBonus(Cargo.DIRETOR)

    val pessoaCriadaParaExecucaoTestesUnitarios = Pessoa("Junior", 2029)
    with(pessoaCriadaParaExecucaoTestesUnitarios) {
        acordar()
        dormir()
        doc
    }

    with(Pessoa("Fulano", 2003)){
        acordar()
        dormir()
        doc
    }

    val p = Pessoa("Ciclano", 2005)

   p.apply {
       nome = "alteracao de nome"
       doc = "6516516"
       "apply"
       // Não retorna valores
   }

    val abc = with(p) {
        nome = "alterando denovo"
        doc = "5456165"
        false
        // Retorna valores
    }

    val server = Server()
    server.initServer()

}