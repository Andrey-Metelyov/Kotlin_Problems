fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        list.add(readLine()!!.toInt())
    }
    val (p, m) = readLine()!!.split(" ").map { it.toInt() }
    var containsP = false
    var containsM = false
    for (el in list) {
        if (el == p) {
            containsP = true
        } else if (el == m) {
            containsM = true
        }
        if (containsP && containsM) {
            break
        }
    }
    if (containsP && containsM) {
        println("YES")
    } else {
        println("NO")
    }
}