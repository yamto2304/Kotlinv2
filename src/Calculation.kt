class Calculation{
    companion object {
        fun PI() : Float = 3.1416F
    }
}
//Extensions with companition
fun Calculation.Companion.doublePi() : Float{
    return 2 * Calculation.Companion.PI()
}