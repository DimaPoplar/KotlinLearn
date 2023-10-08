package kotlinLearn.inheritance

fun main(args: Array<String>) {
    val dog = Dog()
    dog.vois()
    println(dog.name)
    println(dog.years)

    val cat = Cat("goka", 12)
    println(cat.name)
    println(cat.years)
}

