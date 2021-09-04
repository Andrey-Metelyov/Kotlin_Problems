
fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        list.add(readLine()!!.toInt())
    }
    var count = 0
    if (list.size >= 3) {
        var minusTwo = list[0]
        var minusOne = list[1]
        for (i in 2 until list.size) {
            System.err.println("$minusTwo $minusOne ${list[i]}")
            if (minusTwo + 1 == minusOne && minusOne + 1 == list[i]) {
                count++
            }
            minusTwo = minusOne
            minusOne = list[i]
        }
    }
    println(count)
}