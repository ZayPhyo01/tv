package inheritance

/*circle is a shape
rect is a shape
triangle is a shape

concrete -- abstract class */


abstract class Sample {
    abstract fun display()

    fun sayHi (){
        print("Say Hi")
    }
}

class Child : Sample() {
    override fun display() {
        print("hello")
    }
}
