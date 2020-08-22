import com.itarators.*
import com.person.ControlStatment
import com.person.Person
import com.person.Person2
import com.person.Range

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


    // Tutorial 16

    var rect = Rectangle()
    rect.lenth = 10
    rect.breadht = 20

    println("lenth of rectange is ${rect.lenth} and breadht is ${rect.breadht} . The area is ${rect.lenth * rect.breadht}." )

    //call for Range file
    var RangeObject = Range()
    RangeObject.OutPut()

    // call ControlStatment class
    var Controll = ControlStatment()
    Controll.Control()

    //call to ForLoop
    println("for loop")
    var itarators = ForLoop()
    itarators.Loop()

    println("print While loop")
    var intoractor2 = Whileloop()
    intoractor2.loop2()

    println("print do while loop")
    var itarator3 = dowhileloop()
    itarator3.loop3()

    println("loop braking")
    var brakers1 = loobBrake()
    brakers1.brakest()

    println("loop braking next")
    var brakers2 = loopbraker2()
    brakers2.breakst2()

    println("continue statment")
    var brakers3 = contniuebrake()
    brakers3.con1()
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
// tutorial 16

class Rectangle{
    var lenth:Int = 0
    var breadht:Int = 0
}

