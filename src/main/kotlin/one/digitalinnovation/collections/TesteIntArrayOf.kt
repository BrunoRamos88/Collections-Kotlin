package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(3, 12, 5, 78, 6, 1)

    values.forEach {
        println(it)
    }

    println("---------------------------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }
}