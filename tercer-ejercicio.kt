import java.util.*

fun main(){
    val numDec = Scanner(System.`in`)

    print("Introduzca un número entero: ")
    val decimal = numDec.nextInt()

    val binario = Integer.toBinaryString(decimal)
    val octal = Integer.toOctalString(decimal)
    val hexadecimal = Integer.toHexString(decimal)
    println("El número $decimal en binario es: $binario")
    println("El número $decimal en octal es: $octal")
    println("El número $decimal en hexadecimal es: $hexadecimal")
}