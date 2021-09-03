fun main() {
    val string = readLine()!!
    val n = string.length
    println("$n repetitions of the word $string: ${string.repeat(n)}")
}