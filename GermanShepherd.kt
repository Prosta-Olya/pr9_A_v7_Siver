class GermanShepherd(
    name: String,
    height: Double,
    color: String,
    weight: Double,
    temperament: String,
    val isTrainedGuard: Boolean // дополнительное поле для овчарки, обучена охране
) : Dog(name, "Овчарка", height, color, weight, temperament){
    fun Guard(){
        if(isTrainedGuard){
            println("Собака $name охраняет территорию")
        }
        else{
            println("Собака $name не обучена охране")
        }
    }
    fun Assist(){
        println("Собака $name помогает в служебной деятельности")
    }
    fun Training(){
        println("Овчарка $name теперь знает больше команд!")
    }
}