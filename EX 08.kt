fun main()  {
    println("Insira um valor: ")
    val valor = readln().toFloat()

    val centimetros = valor * 100
    val milimetros = valor * 1000

    println("O valor inserido convertido em centímetros fica $centimetros cm e em milimetros $milimetros mm")
}