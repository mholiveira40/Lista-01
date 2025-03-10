fun main()  {
    println("Qual seu nome?")
    val nome = readln()
    println("Qual o seu salário?")
    val salario = readln().toDouble()
    val salarioformatado = String.format("%.2f", salario.toString())
    print("O funcionário $nome tem um salário no valor de R$$salarioformatado")

}