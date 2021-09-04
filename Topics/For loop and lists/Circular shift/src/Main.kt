fun main() {
    // write your code here
    // write your code here
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        list.add(readLine()!!.toInt())
    }
    val tmp = list.last()
    for (i in list.lastIndex downTo 1) {
        list[i] = list[i - 1]
    }
    list[0] = tmp
    println(list.joinToString(" "))
}