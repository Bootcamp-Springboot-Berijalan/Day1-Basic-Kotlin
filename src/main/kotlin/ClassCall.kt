fun main(){
    val person: Person = Person()
    person.firstName = "Maulana"
    person.lastName = "Ardiansyah"
    println("First name = ${person.firstName}")
    println("Last name = ${person.lastName}")

    val person2: Person2 = Person2("Maulana", "", "Daffa")

//    val person3: Person3 = Person3("Maulana", "", "Daffa")
//    person3.greet("Helo", "How r u?")
}