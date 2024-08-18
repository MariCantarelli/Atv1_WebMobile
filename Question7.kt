fun main() {
    val grades = arrayOf(
        doubleArrayOf(8.0, 7.5, 9.0),  
        doubleArrayOf(6.0, 5.5, 7.0),  
        doubleArrayOf(4.0, 3.5, 5.0)  
    )

    val averages = grades.map { it.average() }
    val classAverage = averages.average()

    averages.forEachIndexed { index, average ->
        println("Student ${index + 1}: $average - Status: ${getStudentStatus(average)}")
    }

    println("\nClass average: $classAverage")
}

fun getStudentStatus(average: Double): String {
    return when {
        average >= 7 -> "Aproved"
        average >= 5 -> "on Final Exam"
        else -> "Reproved"
    }
}
