
//How to use function arguments in kotlin

fun main(){
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

