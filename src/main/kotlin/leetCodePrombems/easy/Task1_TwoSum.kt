package leetCodePrombems.easy


fun main(args: Array<String>) {
    print(twoSum2(intArrayOf(1, 4, 4, 3, 5, 6, 7), 8).contentToString())
    print(twoSum(intArrayOf(1, 4, 4, 3, 5, 6, 7), 8).contentToString())
}

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

