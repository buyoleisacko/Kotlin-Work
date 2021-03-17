

//How to use named parameters in Kotlin functions.

fun main(){
    printUserInfo(age = 32, isSunburned = false, firstName = "Buyole", lastName = "Isako", likesMovies = true, lovesPopcorn = true)
}

fun printUserInfo(firstName: String, lastName: String, age: Int, isSunburned: Boolean, likesMovies: Boolean, lovesPopcorn: Boolean){
    println("$firstName $lastName is of age $age. Sunburned: $isSunburned, likes Movies: $likesMovies, loves Popcorn: $lovesPopcorn ")

}


