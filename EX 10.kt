fun main()  {
    println("Digite a altura: ")
    val altura = readln().toFloat()
    print("Agora digite a largura: ")
    val largura = readln().toFloat()

    val area = largura * altura
    val tinta = area / 2

    println("Para pintar uma área de $area, é necessário $tinta litros de tinta")
}