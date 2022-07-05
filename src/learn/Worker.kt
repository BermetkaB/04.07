package learn

import java.util.*

class Worker(val name:String, val profession: String, val startYear:Int) {
    val experience: Int
    get() = Calendar.getInstance().get(Calendar.YEAR)-startYear

    fun work(){
        println("I'm working")

    }
}