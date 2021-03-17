
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