fun main(){
//    val months = listOf("Python", "Kotlin", "C#", "C++", "Java")
//    println(months[0])
//    println(months.size)
//    println("Kotlin" in months)
    val daysInMonth = listOf(31,28,31,30,31,30,31,31,30,31,30,31)
    print("Введите номер месяца(1-12): ")
    val number = readln().toInt()
    if (number in 1..12){
        val days = daysInMonth[number-1]
        println("В этом месяце $days дней.")
    } else{
        println("Некорректный номер месяца!")
    }
}
