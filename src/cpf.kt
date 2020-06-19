

fun main(args : Array<String>) {

    val lista = List(9) { Character.getNumericValue(args[0].get(it)) }

    println( lista.mapIndexed { i, algarismo -> algarismo * (10 - i) }.sum() )

}