package leetCodePrombems.easy

fun main(args: Array<String>) {
    print(isPalindrome(2133812))
}

fun isPalindrome(x: Int): Boolean {
    val number = x.toString()
    val length: Int = number.length
    var counter = 0
    while (counter < length / 2){
        if(number[counter] != number[length - counter - 1]){
            return false
        }
        counter++
    }
    return true
}