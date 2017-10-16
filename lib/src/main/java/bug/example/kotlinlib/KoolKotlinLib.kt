package bug.example.kotlinlib

/**
 * Created by MahramF.
 */
class KoolKotlinLib {
    companion object {
        val CONSTANT_ONE:Int = 123
        val CONSTANT_TWO:String = "OneTwoThree"
    }

    fun getOne () : Int = CONSTANT_ONE

    fun getTwo() : String = "Bleh" + CONSTANT_TWO
}