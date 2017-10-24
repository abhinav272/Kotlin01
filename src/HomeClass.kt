/**
 * Created by Abhinav
 */


/**
 * main method should be either top level or must be enclosed
 * within companion object along with @JvmStatic annotation
 * */

class HomeClass {
    companion object {
        @JvmStatic fun main(args: Array<String>){
            print("Hello World")
        }
    }
}