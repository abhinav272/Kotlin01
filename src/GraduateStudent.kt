/**
 * Created by Abhinav on 25/10/17.
 */
class GraduateStudent(name: String) : Student(name) {

    object StudentGrades{
        var subMarks = 20
        fun getAvgMarks(marks : Int) = (marks+ subMarks)/2
    }

    init {
        println("Graduate Student initialize for $name")
    }

    /**
     * same as Java Parent reference and child Object demo
     * only those child methods can be called by such reference
     * super.methodName to call parent implementation
     * */
    override fun method1() {
        println("Graduate method")
        super.method1()
    }

    fun printGrade(marks: Int){
        println("Final Marks $marks and SubMarks ${StudentGrades.subMarks}")
        println("Avg marks of $name is ${StudentGrades.getAvgMarks(marks)}")
    }

}