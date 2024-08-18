fun main() {
    val grades = mutableListOf<Double>()
    var continueInput = true

    while (continueInput) {
        grades.add(8.0)
        grades.add(4.5)
        grades.add(7.5)

        continueInput = false
    }

    val average = grades.sum()/3

 	val result = getStudentStatus(average)

    println("You had been $result")
    println("Your average grade is $average.")
}

fun getStudentStatus(average: Double): String {
    return when {
        average >= 7 -> "Aproved"
        average >= 5 -> "on Final exam."
        else -> "Reproved"
    }
}