fun main() {
    // write your code here
    val list = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    println(list.count { it == m })
}