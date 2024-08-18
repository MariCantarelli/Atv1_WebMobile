fun main() {
    val grades = mutableListOf<Double>()
    var continueInput = true
​
    while (continueInput) {
        grades.add(8.0)
        grades.add(4.5)
        grades.add(7.5)
​
        continueInput = false
    }
​
    val average = grades.sum()/3
​
    if (average >= 7) {
        println("Congratulations, you have been approved!")
    } else if (average >= 5) {
        println("You have to do the final exam to be approved.")
    } else {
        println("You were reproved.")
    }
​
    println("Your average grade is $average.")
}
​
