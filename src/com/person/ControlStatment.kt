package com.person

class ControlStatment {
    // if condison . IF as Exprasion
    val a = 10
    val b = 5
    val c = 20
    val d = 10

    fun Control(){
        var maxval:Int

        if(a>b){
        maxval = a
    }else
            maxval = b
    println(maxval)
        // another method
        var maxval2:Int = if(c>d)
                        c
                        else
                        d
                    println(maxval2)

        // WHEN as expresion

        var x = 6
        when(x){
            1 ->{
                println("x is 1")
            }
            2 ->{
                println("x is 2")
            }
            3,5 ->{
                println("x is 3 or 5")
            }
            in 1..6 ->{
                println("x is range of 1 to 6")
            }
            else -> {
            println("x value is unknown")
        }
        }
    }

}