fun main() {
    val list = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    val (n, m) = readLine()!!.split(" ").map { it -> it.toInt() }
    var prev = list.first()
    for (i in 1..list.lastIndex) {
        if (prev == n && list[i] == m || prev == m && list[i] == n) {
            println("NO")
            return
        }
        prev = list[i]
    }
    println("YES")
}