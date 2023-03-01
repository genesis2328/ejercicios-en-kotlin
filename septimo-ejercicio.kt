fun main(){
    val cadenas = mutableListOf<String>()
    for (i in 1..5) {
        print("Introduce una cadena de caracteres: ")
        cadenas.add(readLine()!!)
    }
    cadenas.sortBy {
        it.length
    }
    cadenas.forEach {
        println(it)
    }
}