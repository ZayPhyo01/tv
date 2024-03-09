package inheritance


//1 class inheritance and mutate function and override
//2 class init order

open class C {
    init {
        println("it is c")
    }
}

//super , parent
open class B : C() {
    init {
        println("it is b")
    }
}

class A : B() {
    init {
        println("it is a")
    }
}

fun main() {
    val a = A()
}