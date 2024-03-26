fun main(){
    triangle(5)
    println()
    rectangle(3, 4)
}

fun triangle(height: Int){
    println("====== Triangle ======")
    for (i in 1..height){
        for (j in 1..i){
            print("* ")
        }
        println("")
    }
}

fun rectangle(height: Int, width: Int){
    println("====== Rectangle ======")
    for (i in 1..height){
        for (j in 1..width){
            print("* ")
        }
        println("")
    }
}