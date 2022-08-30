//Jose Daniel Gomez Cabrera 21429

fun main() {
   val my_mutable_list = mutableListOf<String>()
   //val my_mutable_list: MutableList<String> = mutableListOf()
   my_mutable_list.add("Noodles!")
   my_mutable_list.add("Spaggetti!")
   my_mutable_list.add("Ravioli!")
   my_mutable_list.add("Fettuccine!")
   println(my_mutable_list)
   my_mutable_list.remove("Spaggetti!")
   println(my_mutable_list)
   my_mutable_list.removeAt(0)
   println(my_mutable_list)
   my_mutable_list.clear()
   println(my_mutable_list)
   println("Empty? ${my_mutable_list.isEmpty()}")
   
   
}