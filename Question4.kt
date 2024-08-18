fun main() {
   	val firstGrade = 8.toDouble()
    val secondGrade = 4.5.toDouble()
    val thirdGrade = 7.5.toDouble()
    
    val average = (firstGrade + secondGrade + thirdGrade)/3
	
    if(average >= 7){
        println("Congratulations, you had been aproved!")
    } else if(average >= 5){
        println("You had to do the final exam for been aproved.")
    } else {
        println("You were reproved")
    }
    
    
  println("Your average in this grade is $average.")
  
}