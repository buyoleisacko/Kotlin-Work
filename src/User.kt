class User(var firstName: String = "", var lastName: String = "Smithi"){

    fun printFullName(){
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix: String){
        println("$prefix $lastName")
    }

    fun updateName(newName: String){
        firstName = newName
    }

    fun firstNameLength(){
    println(firstName.length)
    }
}