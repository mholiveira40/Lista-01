fun main()  {
    println("Insira a quantidade de km percorridos: ")
    val valor = readln().toFloat()
    println("Por quantos dias ele foi alugado?")
    val dias = readln().toInt()

    val kmrodado = valor * 0.20
    val diasperc = dias * 90
    val total = kmrodado + diasperc

    println("O valor total a pagar é de R$$total, sendo R$$kmrodado pela quilometragem e R$$diasperc pelos dias")

}