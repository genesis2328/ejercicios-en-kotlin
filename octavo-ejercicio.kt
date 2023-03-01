fun main(){
    print("Introduce una cadena de caracteres: ")
    val cadena = readLine()!!

    val vocales = mutableMapOf('a' to 0, 'e' to 0, 'i' to 0, 'o' to 0, 'u' to 0)
    var total_vocal = 0

    for (char in cadena.toLowerCase()) {
        if (char in vocales.keys) {
            vocales[char] = vocales[char]!! + 1
            total_vocal++
        }
    }

    println("La cadena ingresada tiene un total de $total_vocal vocales")
    vocales.forEach {
            (key, value) -> println("Cantidad de '$key': $value")
    }
}