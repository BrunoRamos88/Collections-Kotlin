package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Elena"
    nomes[1] = "Caroline"
    nomes[2] = "Stefan"

    for (nome in nomes) {
        println(nome)
    }

    println("-------------------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("-------------------------------")
    val nomes2 = arrayOf("Damon", "Bonnie", "Alaric")
    nomes2.sort()
    nomes2.forEach { println(it) }
}