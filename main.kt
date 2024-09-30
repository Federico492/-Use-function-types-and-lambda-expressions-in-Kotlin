//STORE A FUNCTION IN A VARIABLE

//To store a function into another function 
fun main(){
  val trickFunction = ::trick
}

fun trick(){
  println("No treats!")
}

//To store a funciton into another function but with a lambda expression

fun main(){
  val trickFunction = trick
  trick()
}
val trick = { //instead of fun will be val
  println("No treats!")
}

//Use function types and lambda expressions in Kotlin

fun main(){
  val trickFunction = trick
  trick()
}
val trick = { //instead of fun will be val
  println("No treats!")
}

val treat: () -> Unit = {
  println("Have a treat!")
}

//////////////////////////////////

fun main() {
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?) : () -> Unit{
  if (isTrick){
    return trick
  } else {
    if(extraTreat != null) {
      println(extraTreat(5))
    }
    return treat
  }
}

val trick = { 
  println("No treats!")
}

val treat: () -> Unit = {
  println("Have a treat!")
}
