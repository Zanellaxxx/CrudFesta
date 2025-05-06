//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
var convidado: Convidado = Convidado()
var listaConvidados: MutableList<Convidado> = mutableListOf<Convidado>()

fun main() {
    menu()


}

private fun menu() {
    do {

        println("---- MENU -----")
        println("1- CADASTRAR")
        println("2- LISTAR")
        println("3- EDITAR")
        println("4- EXCLUIR")
        println("0- SAIR")


        val opcao = readln().toInt()//validar


        when (opcao) {
            1 -> {
                print("Cadastrando....")
                cadastrar()
            }

            2 -> {
                print("Listando...")
                listar()
            }

            3 -> {
                print("Editando...")
                editar()
            }

            4 -> {
                print("Excluindo...")
                excluir()
            }

            0 -> print("Saindo")
        }
    } while (opcao != 0)
}

private fun cadastrar() {
    //Instancia
    var convidado = Convidado()

    print("Qual o seu nome? ")
    //val nome = readln()
    convidado.nome = readln()

    print("Qual vai ser o presente? ")
    //val presente = readln()
    convidado.presente = readln()

    print("Qual sua restrição alimentar? ")
    convidado.alimentar = readln()
    //val alimento = readln()
    listaConvidados.add(0, convidado)

}

private fun listar(): String {
    var i = 0
    if (listaConvidados.isEmpty()) {
        println("Não há convidados")
    } else {
        listaConvidados.forEach { convidado ->
            print(
                "posição ${i++}" +
                        "Nome: ${convidado.nome};" +
                        "Presente: ${convidado.presente};" +
                        "Restrição: ${convidado.alimentar};" +
                        "Vai ir a festa? ${convidado.presenca}"
            )
        }
    }
    return "Listagem com sucesso"
}

private fun editar(): Boolean {
    if (listaConvidados.isEmpty()){

    }

    listar()

    println("Digite a posição a ser Editada: ")
    val posicao = readln().toInt()


    println("O convidado vai? S/N")
    val resposta = readlnOrNull()
    when (resposta) {
        "S" -> listaConvidados[0].presenca = true
        "N" -> listaConvidados[0].presenca = false
    }
    return true
}

private fun excluir(): Boolean {
    if (listaConvidados.isEmpty()) {
        println("A lista está vazia")
        return false
    }
    listar()

    println("Qual posição você deseja remover")
    val posicao = readln().toInt()
    listaConvidados.removeAt(posicao)

    listaConvidados.removeAt(0)
    return true

}









