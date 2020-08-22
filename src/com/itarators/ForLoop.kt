package com.itarators

class ForLoop {
    // in for Loop (Initialize -> Condition check -> Code Execute -> Increment)
    fun Loop(){
    for (i in 1..10){
        println(i)
    }
        // go to valur 2,4,6,8,....20 like that
        for (j in 1..20){
            if (j % 2 ==0){
                println(j)
            }
        }
    }
}
 class Whileloop{
     fun loop2() {
         var i:Int = 1
         while (i <= 10){
             println(i)
             i++
         if (i % 2 == 0){
             println(i)
         }
         }
     }

 }
class dowhileloop{
    var j:Int = 3
    fun loop3(){
    do{
        println(j)
        j++
    } while (j <= 10)
}
}
class loobBrake{
    fun brakest(){
        for (k in 1..10){
            println(k)
            if (k == 5)
                break
        }
    }
}
class loopbraker2{
    fun breakst2(){
        myloop@ for (l in 1..3){
            for (m in 1..3){
                println("$l $m" )
                if (l == 2 && m == 2)
                    break@myloop
            }
        }
    }
}
class contniuebrake{
    fun con1(){
        for (i in 1..10){
            if (i % 2 ==0){
                continue
            }
            println(i)
        }
    }
}