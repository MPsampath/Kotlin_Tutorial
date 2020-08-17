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