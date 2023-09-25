fun main() {
    val age = 21*365
    val name = "Nala"
    val border = "==%"
    val timestoRepeat = 7
    
    printBorder(border, timestoRepeat)
    println("Happy Birthday! ${name}")
    printBorder(border, timestoRepeat) 
    
    print("I am ${age} days old \n") 
    print("${age} days is the best age to learn Kotlin! \n")
    print("${name} is already ${age} days old!\n")
    
    
    //lets print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
    
    
    
}
fun printBorder(border:String, timesToRepeat:Int){
    
    repeat(timesToRepeat){
        print(border)
       
    }
    println("")
}

