fun main(){
    println("Porfavor dame un numero entre el 1 y el 99999")
    var num = readln()?.toInt()

    if (num == null || num < 1 || num > 9999)
    {
        println("No ingresaste un numero valido dentro del rfango")
    }
    else{
        val millar = num / 1000
        val centenas = num / 100
        val decenas = num /10
        val unidad = num / 1

        println("Dentro del numero $num que usted ingreso se encuentran")
        println("$millar millares")
        println("$centenas centenas")
        println("$decenas decenas")
        println("$unidad unidades")
    }
}