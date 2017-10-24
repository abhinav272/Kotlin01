/**
 * Created by Abhinav
 */


/**
 * main method should be either top level or must be enclosed
 * within companion object along with @JvmStatic annotation
 * */

class HomeClass {


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World")
            println("Greater number out of 4 and 7 is ${findGreaterNumber(4, 7)}")
            findSum(y = null)
            findSum(y = 4)
            findSum(5, 6)
            getGradeFromAge(3)
            printPattern()
            println("Factorial of 5 is ${getFactorial(5)}")
            showArray(arrayOf(1,2,3,4,5,6,7,8))
        }
    }


}

/**
 * Inline function demo
 */
fun findGreaterNumber(x: Int, y: Int) = if (x > y) x else y

/**
 * Default value demo
 * Null safety demo
 * */
fun findSum(x: Int = 2, y: Int?) {
    if (y != null) println(x + y) else println("Null cant be added")
}

/**
 * when demo
 * */
fun getGradeFromAge(age: Int) {
    when (age) {
        in 0..5 -> println("Enjoy")
        5, 6, 7, 8 -> println("go to small")
        else -> println("go to large")
    }
}

/**
 * for loop
 * */
fun printPattern() {
    for (i in 1..5) {
        for (j in 1..i)
            print("*")
        println()
    }
}

/**
 * Factorial demo
 * */
fun getFactorial(i: Int) : Int{
    var fact = 1
    for (j in 1..i)
        fact *= j
    return fact
}

/**
 * for loop with array
 * */
fun showArray(arr: Array<Int>) {
    for (a in arr.indices) print(arr[a])
    println()
    for (a in arr) print(a)
    println()
    for ((index, value) in arr.withIndex())
        println("the element at $index is $value")

}