open class Dog (
    val name: String, // кличка
    val breed: String, // порода
    val height: Double, // рост по холке
    val color: String, // окрас шерсти
    val weight: Double, // вес
    val temperament: String // характер
){
    fun Info(){
        println("Кличка: $name, порода: $breed, рост по холке: $height см, окрас: $color, вес: $weight кг, характер: $temperament")
    }
    fun Play(){
        println("$name приносит мячик :) ")
    }
    fun Voice(){
        println("Собака $name издает лай!")
        println("$name: Гав!")
    }
}