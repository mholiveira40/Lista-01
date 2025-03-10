fun main()  {
    println("Insira o valor do produto: ")
    val valor = readln().toFloat()

    val desc = valor * 0.05
    val proddesc = valor - desc

    print("O valor do produto pós desconto é de R$$proddesc, sendo aplicado R$$desc de desconto ")
}