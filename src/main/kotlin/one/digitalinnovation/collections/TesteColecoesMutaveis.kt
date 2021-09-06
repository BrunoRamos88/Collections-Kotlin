package one.digitalinnovation.collections

fun main() {
    val dolores = Funcionario("Dolores", 9000.0, "CLT")
    val bernard = Funcionario("Bernard", 8500.0, "PJ")
    val maeve = Funcionario("Maeve", 7000.0, "CLT")

    println("--------------LIST---------------------")
    val funcionarios = mutableListOf(dolores, maeve)
    funcionarios.forEach {println(it)}

    println("-----------------------------------------")
    funcionarios.add(bernard)
    funcionarios.forEach { println(it) }

    println("-----------------------------------------")
    funcionarios.remove(maeve)
    funcionarios.forEach { println(it) }

    println("--------------SET---------------------")
    val funcionariosSet = mutableSetOf(dolores)
    funcionariosSet.forEach { println(it) }

    println("-----------------------------------------")
    funcionariosSet.add(bernard)
    funcionariosSet.add(maeve)
    funcionariosSet.forEach { println(it) }

    println("-----------------------------------------")
    funcionariosSet.remove(maeve)
    funcionariosSet.forEach { println(it) }
}