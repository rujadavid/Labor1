import java.util.*
import kotlin.random.Random


fun ossz(x: Int, y: Int):Int {
    var z=x+y
    return z
}

fun prim(x: Int):Boolean {
    if(x<=1){
        return false
    }
    for(i in 2..x/2){
        if(x%i==0) {
            return false
        }
    }
    return true
}


fun evenNumbersList(lst: List<Int>)=lst.filter{it.mod(2)==0}.forEach{print("$it"+" ")}
// it%2



fun main(args: Array<String>) {

    var x = ossz(2, 3)
    println("1)")
    println("2+3=$x")

    println()
    println("2)")
    val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    for (day: String in daysOfWeek) {
        print(day + " ")
    }
    println()

    println("Days starts with T: ")
    daysOfWeek.filter { it.startsWith('T') }.forEach() {
        print(it + " ")
    }
    println()

    println("Days containing the letter e: ")
    daysOfWeek.filter { it.contains('e') }.forEach() {
        print(it + " ")
    }
    println()

    println("Days of length 6: ")
    daysOfWeek.filter { it.length == 6 }.forEach() {
        print(it + " ")
    }
    println("\n")


    println("3)")
    val y = prim(11)
    println("$y")
    println("\n")


    println("5)")
    print("Parosak : ")
    var lst2 = mutableListOf<Int>()
    for (i in 1..20) {
        lst2.add(i)
    }
    evenNumbersList(lst2)
    println("\n")


    println("6)")
    var L = mutableListOf<Int>()
    for (i in 1..10){
        L.add((1..10).random())
    }
    print("List: $L")
    println()
    print("List elemets double: ")
    print(L.map{it * it})
    println()

    print("Days of week capitalized: ")
    print(daysOfWeek.map{it.uppercase()})
    println()

    print("First character of each day capitalized: ")
    print(daysOfWeek.map{it.first().uppercase()})
    println()

    print("Length of days: ")
    print(daysOfWeek.map{it.length})
    println()

    print("The average length of days: ")
    print(Math.round(daysOfWeek.map{it.length}.average()))
    println("\n")


    println("7)")
    var daysOfWeekMut = daysOfWeek.toMutableList()
    daysOfWeekMut.removeIf{it.contains('n')}
    for(i in daysOfWeekMut){
        print(i+" ")
    }
    println("\n")

    var listIndex=daysOfWeekMut.withIndex()
    for(i in listIndex){
        println("Item at ${i.index} is ${i.value}")
    }
    println("\n")

    daysOfWeekMut.sort()
    for(i in daysOfWeekMut){
        print(i+" ")
    }
    println("\n")


    println("8)")
    val randomValues = List(10) { Random.nextInt(0, 100) }
    println(randomValues)
    println()


}