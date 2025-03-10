fun main()  {
    println("Insira o salário atual: ")
    val sal = readln().toFloat()

    val aum = sal * 0.15
    val salaum = sal + aum

    println("O valor pós reajuste de 15% (R$$aum) do salário fica de R$$salaum")
}