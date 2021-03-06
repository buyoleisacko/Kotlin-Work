//How to use function arguments in kotlin
fun main1(){
    doWork(21, "Buyole", false)
    doWork(32, "Arbe", true)
}
fun doWork(age: Int, name:String, isHappy: Boolean){
    if (age < 21){
        println("$name, you are not old enough, you are $age.")
    }else{
        println("$name, you are old enough, you are $age")
    }
    println("You are happy? $isHappy")
}


//How to use named parameters in Kotlin functions.

fun main(){
    printUserInfo(age = 32, isSunburned = false, firstName = "Buyole", lastName = "Isako", likesMovies = true, lovesPopcorn = true)
}

fun printUserInfo(firstName: String, lastName: String, age: Int, isSunburned: Boolean, likesMovies: Boolean, lovesPopcorn: Boolean){
    println("$firstName $lastName is of age $age. Sunburned: $isSunburned, likes Movies: $likesMovies, loves Popcorn: $lovesPopcorn ")

}

//How to use Default Argument Values in Kotlin

fun main2(){
    printUserInfo2(firstName = "Buyole", lastName = "Isako", age = 32)
    printUserInfo2(firstName = "Arbe", lastName = "Sharamo", age = 33)
    printUserInfo2(firstName = "Buyole", lastName = "Ahmed", age = 34)
}
fun printUserInfo2(firstName: String, lastName: String, age: Int, isSunburned: Boolean = false, likesMovies: Boolean = true, lovesPopcorn: Boolean = true){
    println("$firstName $lastName is of age $age. Sunburned: $isSunburned, likes Movies: $likesMovies, loves Popcorn: $lovesPopcorn")

}
//function refactoring to new lines and named arguments in intellij

fun main3(){
    printUserInfo3(
        age = 32,
        isSunburned = false,
        firstName = "Buyole",
        lastName = "Isako",
        likesMovies = true,
        lovesPopcorn = true
    )
}

fun printUserInfo3(firstName: String, lastName: String, age: Int, isSunburned: Boolean = false, likesMovies: Boolean = true, lovesPopcorn: Boolean = true){
    println("$firstName $lastName is of age $age. Sunburned: $isSunburned, likes Movies: $likesMovies, loves Popcorn: $lovesPopcorn")

}

//How to provide multiple arguments of the same type with vararg
fun main4(){
    printBookInfo("The Alchemist", "Paulo Coelho","Margaret Ogolla","Abdisalam Osman", "Najma Swaleh")
}

fun printBookInfo(title: String, vararg authors: String){
    println("$title - Authors: ")
    authors.forEach { println(it) }

}
//How to overload a function in Kotlin

fun main5(){
    printUserInfo4("John")
    printUserInfo4("Walker", 37)
    printUserInfo4("Allan", 22, "Purple")
}

fun printUserInfo4(name: String, age: Int = 0, favColor: String = "") {
    println("Name: $name, Age: $age, fav Color: $favColor" )
}

//How to create a class in Kotlin

fun main6(){
    var user = User()
    user.printFullName()
    user.updateName("Bob")
    user.printFullName()
    user.printWithPrefix("Mr.")




    var friend = User()
    friend.firstName = "Ali"
    friend.lastName = "Hassan"
    friend.printFullName()
    friend.printWithPrefix("Ms.")
    friend.firstNameLength()

}

//primary class constructors in kotlin

fun main7(){
    var user = User(firstName = "Donn" , lastName = "Allan")
    user.printFullName()
    user.updateName("Bob")
    user.printFullName()
    user.printWithPrefix("Mr.")




    var friend = User(firstName = "Ali" , lastName = "Hassan")
    friend.printFullName()
    friend.printWithPrefix("Ms.")
    friend.firstNameLength()

}



