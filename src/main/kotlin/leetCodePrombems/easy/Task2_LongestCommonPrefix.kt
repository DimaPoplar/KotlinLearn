package leetCodePrombems.easy

fun main(args: Array<String>) {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
}

fun longestCommonPrefix(strs: Array<String>): String { // ["flower","flow","flight"]
    var result = ""
    var min = 2001
    val firsWord = strs[0]
    for (item in strs){
        if (min > item.length)
            min = item.length
    }
    for (item in 0 until min) {
        val word = firsWord[item]
        result += word
        for (element in strs) {
            if (word != element[item]) {
                result = result.removeSuffix(result.drop(result.lastIndex))
                return result
            }
        }
    }
    return result
}
