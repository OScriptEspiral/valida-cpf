

fun main(args : Array<String>) {

    val cpf = args[0]
    var algarismo : Int
    var soma = 0

    for ( i in 0..8 ) {

        algarismo = Character.getNumericValue(cpf.get(i))
        println("Posição $i Algarismo $algarismo Multiplicador ${10 - i}")

        soma += algarismo * (10 - i)
    }

    println(soma)
}