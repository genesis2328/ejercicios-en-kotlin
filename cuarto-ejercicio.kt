fun main(){
    println("Ingrese una frase para ver si es un palindromo: ")
    val cadenaCar = readln()!!.toLowerCase()

    val cadenaLimpia = cadenaCar.replace("\\s+".toRegex(), "").replace("\\p{Punct}+".toRegex(), "")

    val esPalindromo = cadenaLimpia == cadenaLimpia.reversed()

    if (esPalindromo) {
        println("$cadenaCar es un palíndormo")
    } else {
        println("$cadenaCar no es un palíndormo")
    }
    return
}