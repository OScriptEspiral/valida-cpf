
fun main(args : Array<String>) {

    val cpf = args[0].map { Character.getNumericValue(it) }

    fun soma (teto : Int) =
        List(9) { cpf.get(it) }
            .mapIndexed { i, alg -> alg * (teto - i) }
            .sum()
    fun digito (s : Int) = if (s % 11 < 2) 0 else 11 - s % 11

    val dig1 = digito(soma(10))
    val dig2 = digito(soma(11) + 2 * dig1)

    if ( dig1 == cpf[9] && dig2 == cpf[10] )
        println( "Válido" )
    else
        println( "Inválido" )
}