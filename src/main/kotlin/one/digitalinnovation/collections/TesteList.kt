package one.digitalinnovation.collections

fun main() {
    val dexter = Funcionario("Dexter", 9000.0, "CLT")
    val debra = Funcionario("Debra", 8500.0, "PJ")
    val hannah = Funcionario("Hannah", 7000.0, "CLT")


    val funcionarios = listOf(dexter, debra, hannah)

    funcionarios.forEach{ println(it)}

    println("----------------------------------------")
    println(funcionarios.find { it.nome == "Hannah" })

    println("----------------------------------------")
    funcionarios.sortedBy {it.salario}.forEach { println(it) }

    println("----------------------------------------")
    funcionarios
        .groupBy {it.tipoContratacao}
        .forEach { println(it) }
}

