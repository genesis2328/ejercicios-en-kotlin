fun main(){
    var primer_lado: Int = 0
    var segundo_lado: Int = 0
    var tercer_lado: Int = 0

    println("Dame los tres lados de un triangulo para determinar de que triangulo se trata")

    print("Primer lado: ")
    primer_lado = readln()?.toInt()!!

    print("Segundo lado: ")
    segundo_lado = readln()?.toInt()!!

    print("Tercer lado: ")
    tercer_lado = readln()?.toInt()!!

    if (primer_lado == 0 || segundo_lado == 0 || tercer_lado == 0){
        println("Usted ingreso algun dato no valido")
        return
    }
    else{
        if (primer_lado == segundo_lado && segundo_lado == tercer_lado){
            println("El triangulo que describe es un triangulo EQUILATERO")
        }
        else if (primer_lado == segundo_lado || primer_lado == tercer_lado || segundo_lado == tercer_lado)
        {
            println("El triangulo que describe es un triangulo ISOSCELES")
        }
        else
        {
            println("El triangulo que describe es un triangulo ESCALENO")
        }
    }
    return
}