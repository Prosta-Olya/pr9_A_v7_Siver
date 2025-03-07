class Bulldog(
    name: String,
    height: Double,
    color: String,
    weight: Double,
    temperament: String,
    val stubbornness: Int // дополнительное поле для бульдога, уровень упрямства
) : Dog(name, "Бульдог", height, color, weight, temperament){
    fun Stubborn(){
        if (stubbornness<50){
            println("Собака $name не упрямая")
        }
        else if (stubbornness<150){
            println("Собака $name довольно упрямая")
        }
        else{
            println("Собака $name очень упрямая")
        }
    }
    fun Sleep(){
        println("Бульдог $name спит и громко храпит!")
    }
    fun ToLick(){
        println("Ой, бульдог $name облизал вас!")
        println("Так мило <3")
    }
}