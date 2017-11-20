/**
 * Created by Abhinav on 20/11/17.
 */

/** Sample for destructuring declarations
 * It only applies for data class
 * */
data class Developer(val name: String, val language: String, val organisation: String) {

    fun getDeveloper(): Developer{
        return Developer(name, language, organisation)
    }
}