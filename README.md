# Valida CPF

Para experimentação do Github Classroom.

Faça um aplicação de linha de comando que recebe,
como primeiro parâmetro, 11 algarismos de um CPF,
e informa se o número é válido.

Existe um *branch* com a solução em Kotlin, 
chamado `kt`, e outro com a solução em C (`c`).
Construa a sua solução no `master`.

Exemplos de números válidos:
* 11144477735 ([site 1](https://www.geradorcpf.com/algoritmo_do_cpf.htm))
* 12345678909 ([site 2](http://simuladordecpf.com.br/algoritmo-de-cpf))

Informações complementares para os testes:
* Soma da validação do primeiro dígito nos exemplos: 162 e 210.
* Soma do segundo dígito: 204 e 255.
* O segundo caso é relevante pois recai no valor 0 para algum dígito.