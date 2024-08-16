import kotlin.random.Random

fun main() {
    println("Write your name: Marina")
   	val name = readLine()
   	val matricula = List(1) { Random.nextInt(0, 1000) }
   	
  println("Bem-vindo à escola $name! Você está matriculado. Sua matrícula é $matricula.")
  
}