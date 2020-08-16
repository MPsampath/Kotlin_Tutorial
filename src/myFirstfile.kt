import com.person.Person
import com.person.Person2

fun main(args: Array<String>){

    var myString = "Kotlin is a Programin Language"
    var myNumber = 10 // int
    var myNUmber2 = 1.25 //float
    var myName: String // data type of myName is String (Mutable String)
    myName = "Prasanna" // this is first value of myName
    myName = "Sampath" // final output of myName
    val myschool = "A.C.C" //this is Constant value we can't change it (Immutable String)
    println("Hello world")
    println(10/3)
    println(10*10)
    println(true)
    print("Hey kotlin.")
    println(" Kotlin is best")
    println(myString)
    println(myNumber)
    println(myNUmber2)
    println(myName)
    println(myschool)


    Display(myString)

    var myClassObject = myClass() // create object for myClass
    myClassObject.DisplayInClass(myName) // call DisplayInClass function in myClass
    myClassObject.Lastname = "Weerasinghe"
    myClassObject.DisplayInClass(myClassObject.Lastname)

    println("my last name is " + myClassObject.Lastname)
    println("my last name is ${myClassObject.Lastname}")
    println("my last name is $myClassObject.Lastname")

    var PersonObject = Person()
    PersonObject.name = "no Name"
    println(PersonObject.name)

    var Person2Object = Person2("Sampaa")
    Person2Object.DIsplay2()


}

class myClass(){
    var Lastname:String = ""
    fun DisplayInClass(myName:String){
        println(myName)
    }
}
fun Display(myString: String){
        println(myString)
}

