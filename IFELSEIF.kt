import java.lang.System
import  java.util.Scanner




fun main(){

    val grade = readLine()!!
    print("Enter your grade: ")
    grade = readLine()!!.toInt()
    val lettore = Scanner(System.in)

    if(grade>= 90){

        println("A")

    } else if(grade in 80..89){
        println("B")
    }else if(grade in 70..79){
        println("C")
    }else {
        println("Fail")
    }


    println("End of App")


}