fun hello(str: String){
    println("Olá, $str")
}

fun hello2(str: String) : String{
    return "Olá, $str"
}

fun hello3(str: String) = "Olá, $str"


fun main() {
    val nome = "Aron Ricardo"
    val idade = 29

    //Concatenação do Kotlin
    println("""Meu nome é $nome e
        |tenho $idade anos
        |de idade""".trimMargin())

    //Concatenação do Java
    println("\nMeu nome é: " + nome
            + "\ne tenho " + idade
            + "\nanos de idade")
    println("------------------------------------------")
    println(hello("Aron"))
    println(hello2("Kelly"))
    println(hello3("Cintia"))
}


