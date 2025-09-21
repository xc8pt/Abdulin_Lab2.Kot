fun main(){
    print("Введите ваш уровень: ")
    val level = readln().toInt()
    if (level in 0..10) {
        println("Новичок! вы получаете +10 HP.")
    }
    else if (level in 10..50){
        println("Опытный! Вы получаете +30 HP.")
    }
    else if (level >= 50){
        println("Легенда! Вы получаете +100 HP.")
    } else{
        println("Вы ввели не верный уровень!")
    }

}