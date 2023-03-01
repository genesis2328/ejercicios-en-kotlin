fun main(){
    var num: Int = 0
    println("Dame un nuermo para calcular su factorial: ")
    num = readln()?.toInt()!!

    val fatcorial = calculaFact(num)

    println("El factorial del numero $num es $fatcorial")
}
fun calculaFact(num: Int): Int {
    if (num == 0){
        1
    }
    else{
        num * calculaFact(num - 1)
    }
    return 0
}
