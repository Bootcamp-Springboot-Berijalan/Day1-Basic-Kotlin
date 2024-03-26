fun hello(){
    println("Hello world")
}

fun hello2(name: String){
    println("Hello, $name!")
}

fun hello3(greet: String = "Hey", name: String){
    println("$greet, $name!")
}

fun addition(x: Int, y: Int): Int{
    return x + y
}

fun additiion2(x: Int, y: Int): Int = x + y

fun main (){
    hello()
    hello2("Daffa")
    hello3("Hello", "Daffa")
    println("4 + 5 = ${addition(4,5)}" )
    println("3 + 7 = ${additiion2(3,7)}")
}