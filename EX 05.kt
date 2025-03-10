fun main()  {
    println("Insira o primeiro valor: ")
    val val1 = readln().toFloat()
    println("Insira o segundo valor para o cálculo da média: ")
    val val2 = readln().toFloat()
    val media = (val1 + val2) / 2
    print("A média entre $val1 e $val2 é $media")

}