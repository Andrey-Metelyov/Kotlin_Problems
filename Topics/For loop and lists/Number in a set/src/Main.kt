fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        list.add(readLine()!!.toInt())
    }
    val m = readLine()!!.toInt()
    if (list.contains(m)) {
        println("YES")
    } else {
        println("NO")
    }
}