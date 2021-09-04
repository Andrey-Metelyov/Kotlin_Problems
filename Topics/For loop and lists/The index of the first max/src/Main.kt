fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    var max = readLine()!!.toInt()
    var index = 0
    for (i in 1 until n) {
        val value = readLine()!!.toInt()
        if (value > max) {
            max = value
            index = i
        }
    }
    println(index)
}