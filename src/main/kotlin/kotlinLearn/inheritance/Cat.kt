package kotlinLearn.inheritance

class Cat(name: String, years:Int): AnimalParameter(name, years) {
    override fun vois() {
        println("myr")
    }
    override val name = "123"

}