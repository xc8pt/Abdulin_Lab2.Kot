fun main(){
    print("Введите порядковый номер месяца (1-12): ")
    val n = readln().toInt()
    var month = ""
    when (n) {
        1 -> month = "Январь"
        2 -> month = "Ферваль"
        3 -> month = "Март"
        4 -> month = "Апрель"
        5 -> month = "Май"
        6 -> month = "Июнь"
        7 -> month = "Июль"
        8 -> month = "Август"
        9 -> month = "Сентябрь"
        10 -> month = "Октябрь"
        11 -> month = "Ноябрь"
        12 -> month = "Декабрь"
        else -> "Некорректный номер"
    }

    println("Вы ввели порядковый номер $n, ему соответствует месяц $month.")
//    if (n == 1){
//        month = "Январь"
//    } else if (n == 2){
//        month = "Февраль"
//    } else if (n == 3){
//        month = "Март"
//    } else if (n == 4){
//        month = "Апрель"
//    } else if (n == 5){
//        month = "Май"
//    } else if (n == 6){
//        month = "Июнь"
//    } else if (n == 7){
//        month = "Июль"
//    } else if (n == 8){
//        month = "Август"
//    } else if (n == 9){
//        month = "Сентябрь"
//    } else if (n == 10){
//        month = "Октябрь"
//    } else if (n == 11){
//        month = "Ноябрь"
//    } else{
//        month = "Декабрь"
//    }
//    if (n in 1..12) {
//        println("Вы ввели порядковый номер $n, ему соответствует месяц $month.")
//    } else{
//        println("Введенное число $n не относится к диапозону!")
//         }

}
