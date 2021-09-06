package one.digitalinnovation.collections

fun main() {
    val daenerys = Funcionario("Daenerys", 9000.0, "CLT")
    val jonsnow = Funcionario("Jon Snow", 8500.0, "PJ")
    val cersei = Funcionario("Cersei", 7000.0, "CLT")

    val funcionarios1 = setOf(daenerys, jonsnow)
    val funcionarios2 = setOf(cersei)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("-----------------------------------------")
    val funcionarios3 = setOf(daenerys, jonsnow, cersei)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("-----------------------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}