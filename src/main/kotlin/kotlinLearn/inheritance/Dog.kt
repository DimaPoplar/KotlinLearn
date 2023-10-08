package kotlinLearn.inheritance

class Dog: Animals() {

//    override val name: String
//        get() = super.name
    init {
        years = 12
    }
    override val name: String = super.name

    override fun vois() {
        println("Waf")
    }
}