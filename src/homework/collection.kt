package homework

fun main() {

    var items:Array<Int> = arrayOf(2,5,6,78,45,9);
    val someArray:Array<String> = arrayOf("Daniel", "Adina", "Zhanybek")
    for (el in someArray)
        println(el)
    println(items[0])
    println(setOf(0,46))
    println(items.size)
    for (el in items)
        println(el)
   // for (i:Int in 100 until 102){
   //     println(i)
  //  }

   //val array= arrayOf(1,2,3,4,5,6)
   // for (i in array)
    //    println(i)

    val result= add(5,10)
    println(result)
    println(saySomething())
}

fun add(x:Int, y:Int):Int {

    return x+y
}
 fun saySomething():String{
     return "Hello world"

 }