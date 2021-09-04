fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        list.add(readLine()!!.toInt())
    }
    val shift = readLine()!!.toInt()
    val result = list.slice(list.size - shift % list.size..list.lastIndex)
        .plus(list.slice(0 until list.size - shift % list.size))
    println(result.joinToString(" "))
}