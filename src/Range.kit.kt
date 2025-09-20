fun main() {
//    val numbers = 1..100
//    val symbol = 'a'..'z'
    print("Введите ваш level: ")
    val level = readln().toInt()
    if (level in 1..50) {
        println("Уровень $level соответствует!")
    } else{
       println("Уровень $level не соответствует")
    }
}
