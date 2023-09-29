package KotlinLearn

fun main(args: Array<String>) {
//    print( KotlinLearn.sum(1,42))
//    KotlinLearn.printSum(12, 124)
//    KotlinLearn.infoVal()
//    KotlinLearn.incrementX()
//    println(KotlinLearn.getX)
//    val rectangle = KotlinLearn.Rectangle(2.2 ,2.3)
//    println(rectangle.perimeter)
//    KotlinLearn.infoFor()
//    KotlinLearn.infoWhile()

//    var sd = KotlinLearn.Customer("asd", "21")
//    print(sd.hashCode())

//    val list = listOf(1,23,4,5,734,7,6,4,41,3,6,2)
//    val positives = list.filter { KotlinLearn.getX -> KotlinLearn.getX > 10 }
//    print(positives)

//    val map = mapOf("KotlinLearn.getA" to 312, "KotlinLearn.getB" to "123", "c" to 3)
//    println("${map["KotlinLearn.getA"]} +${map["KotlinLearn.getB"]}")
//    KotlinLearn.info()
//    print(KotlinLearn.twoSum(intArrayOf(0, 4, 3, 0), 0).contentToString())

    print(twoSum2(intArrayOf(1, 4, 4, 3, 5, 6, 7), 8).contentToString())
}


fun sum(sum1: Int, sum2: Int): Int {
    return sum1 + sum2
}

fun printSum(sum1: Int, sum2: Int) {
    println("сумма $sum1 и $sum2 = ${sum1 + sum2}")
}

fun infoVal() {
    val c: Int = 4
    var a: Int = 2
    a = +1
//    c =+ 1  don`t work

    println(c)
    println(a)
}

val a: Int = 4
val b = 3
var e = 2

var x = 123
fun incrementX() {
    x += 1
}

class Rectangle(height: Double, length: Double) {
    var perimeter = (height + length) * 2
}

open class Shape
class sadad(height: Double, length: Double) : Shape() {
}

fun maxOfUnit(a: Int, b: Int): Unit {
    if (a > b) {
        print(a)
    } else {
        print(b)
    }
}

fun maxOfInt(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun infoFor() {
    val items = listOf("яблоко", "банан", "киви")
    for (index in items.indices) {
        println("$index это ${items[index]}")
    }
}

fun infoWhile() {
    var a = 1
    while (a <= 10) {
        print(a)
        a += 1
    }
}

fun info() {

}

data class Customer(val name: String, val email: String)


fun twoSum(nums: IntArray, target: Int): IntArray {
    val array = mutableListOf<Int>()
    var i = 1
    for (firsItem in nums) {
        val result = 0 + firsItem
        var target2: Int
        if (target < 0) {
            target2 = target * -1
        } else {
            target2 = target
        }
        if (result != target2) {
            val nums2 = nums.drop(i)
            for (twoItem in nums2) {
                val result2 = result + twoItem
                if (result2 == target) {
                    array.add(nums.indexOf(firsItem))
                    array.add(nums2.indexOf(twoItem) + i)
                    return array.toIntArray()
                }
            }
        } else {
            val nums2 = nums.drop(i - 1)
            array.add(nums2.indexOf(firsItem) + i - 1)
        }
        i++
    }
    return array.toIntArray()
}

fun twoSum2(nums: IntArray, target: Int): IntArray {
    val array = mutableListOf<Int>()
    var i = 1
    for (firstItem in nums) {
        val drop = nums.indexOf(firstItem)
        val nums2 = nums.drop(drop + 1)
        val twoItem = nums2.indexOf(target - firstItem)
        if (twoItem != -1) {
            array.add(drop)
            array.add(twoItem + i)
            return array.toIntArray()
        }
        i++
    }
    return array.toIntArray()
}
