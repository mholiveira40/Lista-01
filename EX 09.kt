fun main()  {
    println("Insira um valor em real: ")
    val real = readln().toFloat()

    val dolar = real / 5.69

    println("O valor em dolar fica ${"%.2f".format(dolar)} USD")
}