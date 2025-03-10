import kotlin.math.pow

fun main()  {
    print("Digite o valor de A: ")
    val A = readln().toFloat()
    print("Digite o valor de B: ")
    val B = readln().toFloat()
    print("Digite o valor de C: ")
    val C = readln().toFloat()

    val delta = B.pow(2) - 4 * A * C

    println("O valor de delta é $delta")
}