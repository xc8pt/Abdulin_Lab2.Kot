fun main(){
    /*
    zad1
     */
//    print("Введите ваш уровень: ")
//    val level = readln().toInt()
//    if (level in 0..10) {
//        println("Новичок! вы получаете +10 HP.")
//    }
//    else if (level in 10..50){
//        println("Опытный! Вы получаете +30 HP.")
//    }
//    else if (level >= 50){
//        println("Легенда! Вы получаете +100 HP.")
//    } else{
//        println("Вы ввели не верный уровень!")
//    }
    /*
    zad2
     */
//    print("Сколько вам лет: ")
//    val age = readln().toInt()
//    if (age in 1..11){
//        println("Вы ребенок!")
//    }
//    else if (age in 12..17){
//        println("Вы подросток!")
//    }
//    else if (age >= 18){
//        println("Вы взрослый!")
//    } else{
//        println("Вы ввели некорректный возраст!")
//    }
    /*
    zad3
     */
//    print("Введите число(от 1 до 100): ")
//    val num = readln().toInt()
//    if (num in 10..50){
//        println("Ваше число $num входит в диапозон(от 10 до 50)!")
//    } else{
//        println("Ваше число $num не входит в диапозон!")
//    }
    /*
    zad4
     */
//    print("Введите один символ(Цифровой, Буква(Латинского алфавита)," +
//            "Пробел, Спецсимвол):")
//    val input = readln()
//    val ch = input[0]
//    when (ch){
//        in '0'..'9' -> println("Цифра!")
//        in 'a'..'z', in 'A'..'Z' -> println("Буква латинского алфавита!")
//        ' ' -> println("Пробел!")
//        else -> println("Спецсимвол!")
//    }
    /*
    zad5
     */
    var index = 0
    val num = 5
    repeat(times = 10){
        println("$num * ${index + 1} = ${num * (index + 1)}")
        index++
    }
}