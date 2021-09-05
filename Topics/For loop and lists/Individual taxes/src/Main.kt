fun main() {
    val income = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    val taxeRates = List(income.size) { readLine()!!.toInt() }
    var max = 0
    for (i in income.indices) {
        if (income[i] * taxeRates[i] > income[max] * taxeRates[max]) {
            max = i
        }
    }
    println(max + 1)
}