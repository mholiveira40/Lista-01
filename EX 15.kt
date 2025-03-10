fun main()  {
    println("Insira o número de dias trabalhados:")
    val dias =  readln().toInt()

    val dinporhora = 25 * 8
    val sal = dinporhora * dias

    println("Seu salário é de R$$sal")

}