fun main(){
    val arreglo = IntArray(10)

    for (i in 0 until 10) {
        print("Dame un numero entero: ")
        arreglo[i] = readln().toInt()
    }

    for (i in 0 until 10) {
        arreglo[i] = arreglo[i] * arreglo[i]
    }

    println("Su arreglo elvando cada numero al cuadrado es: ${arreglo.contentToString()}")
}