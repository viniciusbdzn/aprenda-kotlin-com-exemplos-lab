// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val name: String, val email: String, val id: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
    
    fun getUsuarios() {
        for(usuario in inscritos) {
            println("$usuario")
        } 
    }
    
    fun getConteudos() {
        for(cont in conteudos) {
            println("$cont")
        } 
    }
   
}
	

 

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
 
    val usuario1 = Usuario("João", "joao@yahoo.com", 1)
    val usuario2 = Usuario("Maria", "maria@gmail.com", 2)
    val usuario3 = Usuario("Carlos", "carlos@hotmail.com", 3)
   
   	val conteudo1 = ConteudoEducacional("Sistemas Operacionais", 60, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 90, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Programação Orientada a Objetos", 120, Nivel.DIFICIL)
    
    val listaDeConteudo = mutableListOf<ConteudoEducacional>()
  		listaDeConteudo.add(conteudo1)
  		listaDeConteudo.add(conteudo2)
    	listaDeConteudo.add(conteudo3)
  		
    
    val formacaoADS = Formacao("Formação Análise de Sistemas", listaDeConteudo, Nivel.BASICO)
    
    formacaoADS.matricular(usuario1)
	formacaoADS.matricular(usuario2)
	formacaoADS.matricular(usuario3)
  
   
    
    println("Usuarios cadastrados no curso de ${formacaoADS.nome}")
    println(formacaoADS.getUsuarios())
    
    println("Conteudos da formação:")
    println(formacaoADS.getConteudos())
    
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}