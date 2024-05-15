package Day1.Problem_3

class GradeManager {
    private val students = mutableListOf<Student>()

    fun addStudent(name: String){
        students.add(Student(name, mutableListOf()))
    }

    fun addGrade(name: String, grade: Int){
        val student = students.find { it.name == name}
        student?.grades?.add(grade)
    }

    fun getAverageGrade(name: String): Double?{
        val student =  students.find { it.name == name }
        return student?.grades?.average()
    }

    fun listStudents(): List<String>{

        return students.map {
        "${it.name}, ${"%.1f".format(it.grades.average())}"
        }
    }
}