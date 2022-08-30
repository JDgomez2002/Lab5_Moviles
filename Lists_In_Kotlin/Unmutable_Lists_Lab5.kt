//Jose Daniel Gomez Cabrera 21429

fun main() {
   val my_numbers: List<Int> = listOf(1,2,3,4,5,6)
   println("Esta es la lista: ${my_numbers.size}")
   println("Primer elemento: ${my_numbers[0]}")
   println("Ultimo elemento: ${my_numbers.get(my_numbers.size - 1)}")
   println("Ultimo: ${my_numbers.last()}")
   println("Primero: ${my_numbers.first()}")
   println("Contiene 4? ${my_numbers.contains(4)}")
   println("Contiene 10? ${my_numbers.contains(10)}")
   println("Reserved: ${my_numbers.reversed()}")
   println("Sorted: ${my_numbers.sorted()}")
}