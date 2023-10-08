package kotlinLearn.classes

class Dog(val name: String, val breed: String, weight_param: Int = 123) {
    fun who() {
        print(name)
    }

    var weight = weight_param
        set(value) {
            if(value > 0) field = value
        }
        get() = field/2


}