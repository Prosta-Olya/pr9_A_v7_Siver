fun main(){
    try {
        println("Введите породу собаки:")
        val breed = readLine()!!.toString()
        if (breed == "Овчарка" || breed == "овчарка") {

            println("Овчарка обучена охране? \n 1 - Да \n 2 - Нет")
            val trained = readLine()!!.toInt()
            val isTrainedGuard = when {
                trained == 1 -> true
                trained == 2 -> false
                else -> return
            }
            println("Введите данные собаки (имя, рост по холке, окрас шерсти, вес, характер, возраст):")
            var dog:GermanShepherd = GermanShepherd(readln(), readLine()!!.toDouble(), readln(),readLine()!!.toDouble(), readln(), isTrainedGuard, readLine()!!.toInt())
            dog.Info()
            dog.Food()
            dog.IdealWeight()
            dog.Play()
            dog.Voice()
            dog.Guard()
            dog.Assist()
            dog.Training()
            dog.HumanAge()
            dog.HeightAndAge()
        } else if (breed == "Бульдог" || breed == "бульдог") {
            println("Введите данные собаки (имя, рост по холке, окрас шерсти, вес, характер, число - уровень упрямства бульдога, возраст):")
            var dog:Bulldog = Bulldog(readln(), readLine()!!.toDouble(), readln(),readLine()!!.toDouble(), readln(), readLine()!!.toInt(), readLine()!!.toInt())
            dog.Info()
            dog.Food()
            dog.IdealWeight()
            dog.Play()
            dog.Voice()
            dog.Stubborn()
            dog.Sleep()
            dog.ToLick()
            dog.HumanAge()
            dog.HeightAndAge()
        } else {
            println("Введите данные собаки (имя, рост по холке, окрас шерсти, вес, характер, возраст):")
            var dog:Dog = Dog(readln(), breed, readLine()!!.toDouble(), readln(),readLine()!!.toDouble(), readln(), readLine()!!.toInt())
            dog.Info()
            dog.Food()
            dog.IdealWeight()
            dog.Play()
            dog.Voice()
        }
    }
    catch (e:Exception){
        println("Некорректный ввод")
    }
}