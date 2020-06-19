
fun main(args : Array<String>) {

    val soma = List(9) { Character.getNumericValue(args[0].get(it)) }
        .mapIndexed { i, alg -> alg * (10 - i) }
        .sum()

    val primeiroDígitoCalculado =
        if ( soma % 11 < 2 ) 0 else 11 - soma % 11

    val primeiroDígitoFornecido = Character.getNumericValue(args[0].get(9))

    if ( primeiroDígitoCalculado != primeiroDígitoFornecido )
        println( "Inválido" )
    else
        println( "Válido" )
}