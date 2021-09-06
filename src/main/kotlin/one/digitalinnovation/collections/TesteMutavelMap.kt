package one.digitalinnovation.collections

fun main() {
    val walter = Funcionario("Walter White", 9000.0, "CLT")
    val gus = Funcionario("Gus Fring", 8500.0, "PJ")
    val jesse = Funcionario("Jesse Pinkman", 7000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(walter.nome, walter)
    repositorio.create(gus.nome, gus)
    repositorio.create(jesse.nome, jesse)

    println(repositorio.findById(walter.nome))

    println("-------------------------------")
    repositorio.findAll().forEach { println(it) }

    println("-------------------------------")
    repositorio.remove(gus.nome)
    repositorio.findAll().forEach { println(it) }
}