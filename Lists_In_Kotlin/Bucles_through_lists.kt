//Jose Daniel Gomez Cabrera 21429

fun main()
{
   val guests = listOf(2,4,1,3)
   var total_guests = 0
   var index = 0
    
   while(index<guests.size)
   {
        total_guests += guests[index]
        index++
   }
   
   println("Total Guests! ${total_guests}\n")
   
   val names = listOf("Jessica", "Henry", "Alicia", "Jose")
   
   for (name in names)
   {
       println("$name - Number of characters: ${name.length}")
   }

}