fun main(){
    try {
        println("Введите данные собаки:")
        println("Кличка:")
        val name = readLine()!!.toString()
        println("Порода:")
        val breed = readLine()!!.toString()
        println("Рост по холке(см)")
        val height = readLine()!!.toDouble()
        println("Окрас шерсти:")
        val color = readLine()!!.toString()
        println("Вес(кг):")
        val weight = readLine()!!.toDouble()
        println("Характер:")
        val temperament = readLine()!!.toString()
        if(height<= 0 || weight <= 0){
            println("Ошибка")
            return
        }
        if (breed == "Овчарка" || breed == "овчарка") {
            println("Овчарка обучена охране? \n 1 - Да \n 2 - Нет")
            val trained = readLine()!!.toInt()
            val isTrainedGuard = when {
                trained == 1 -> true
                trained == 2 -> false
                else -> return
            }
            val dog = GermanShepherd(name, height, color, weight, temperament, isTrainedGuard)
            dog.Info()
            dog.Play()
            dog.Voice()
            dog.Guard()
            dog.Assist()
            dog.Training()
        } else if (breed == "Бульдог" || breed == "бульдог") {
            println("Введите число - уровень упрямства бульдога")
            val stubbornness = readLine()!!.toInt()
            val dog = Bulldog(name, height, color, weight, temperament, stubbornness)
            dog.Info()
            dog.Play()
            dog.Voice()
            dog.Stubborn()
            dog.Sleep()
            dog.ToLick()
        } else {
            val dog = Dog(name, breed, height, color, weight, temperament)
            dog.Info()
            dog.Play()
            dog.Voice()
        }
    }
    catch (e:Exception){
        println("Некорректный ввод")
    }
}