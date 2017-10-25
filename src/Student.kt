/**
 * Created by Abhinav on 25/10/17.
 */

/**
 * init block is the first thing that calls when object is created
 * no matter invocation is through primary or secondary
 * */
open class Student(val name: String, var address: String) {

    constructor(name: String) : this(name, "NoAddress") {
        println("Secondary Constructor called for Student $name")
    }

    init {
        println("Student Object initialized")
        println("$name -- $address")
    }

    fun updateAddress(address: String){
        this.address = address
    }

    override fun toString(): String {
        return "Student(name='$name', address='$address')"
    }

    open fun method1() {
        println("Student method")
    }

    fun notOverriddingMethod() {
        println("Student method notOverridding")
    }
}