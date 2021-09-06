package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 7
    values[1] = 5
    values[2] = 9
    values[3] = 1
    values[4] = 6

    for (valor in values)
        println(valor)

    println("-------------------------------")
    values.forEach {     valor ->
        println(valor)
    }

    println("-------------------------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("-------------------------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }

}