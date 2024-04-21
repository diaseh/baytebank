package org.example
fun main() {
    println("Bem Vindo ao Bytebank")
    val conta01 = Conta()
    conta01.titular = "Alex"
    conta01.numero = 1000
    conta01.saldo = 200.00


    val conta02 = Conta()
    conta02.titular = "Fran"
    conta02.numero = 1001
    conta02.saldo = 300.00

    println(conta01.titular)
    println(conta01.numero)
    println(conta01.saldo)

    println(conta02.titular)
    println(conta02.numero)
    println(conta02.saldo)


    val conta3 = Conta()
    conta3.titular = "João"
    var contaMaria = conta3
    contaMaria.titular = "Maria"

    println(conta3.titular)
    println(contaMaria.titular)

}

class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0





}

fun testaConta(){

    val titular = "Alex"
    val numeroConta: Int = 10
    var saldo = (100 + 2.0)
    saldo += 200
    saldo -= 302.0
    saldo -= 50.00

    println("Titular:$titular")
    println("Número da Conta:$numeroConta")
    println("Saldo:$saldo")

//    testaCondiçõesComWhen(saldo)
//    geradorCWhile()
}

fun testaCondiçõesComWhen(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo Positivo")
        saldo == 0.0 -> println("Saldo Zerado")
        else -> println("Saldo Negativo")
    }
}


//fun geradorCWhile(){
//    val i =0
//    while(i<5)
//}

fun testaCondicaoComIf(saldo: Double) {
    if (saldo > 0.00) {
        println("Saldo")
    } else if (saldo == 0.00) {
        println("Saldo Zerado")
    } else {
        println("Saldo Negativo")
    }
}

fun geradorCFor() {
    var i = 0
    for (i in 1..3)
        println(i)
}


