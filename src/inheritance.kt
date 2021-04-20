open class vehicles(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if(people<=capacity){
            println("carrying $people passengers")
        }
        else{
            println("over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color$make$model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        return hours * 20

    }
}
class Cars( make:String, model:String, color:String,capacity:Int):vehicles(make, model, color, capacity){


}
class Bus( make:String, model:String, color:String, capacity:Int):vehicles(make, model, color, capacity){

    fun maxTripFare(fare:Double):Double{
        return fare
    }
    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity
    }
}

fun main() {
    var car=Cars("Audi","new","blue",4)
    car.carry(12)
    car.carry(20)
    car.identity()
    println(car.calculateParkingFees(2))

    var bus=Bus("Toyota","old","green",16)
    bus. carry(16)
    bus.carry(20)
    bus.identity()
    println(bus.maxTripFare(20000.0000000000000))
    println(bus.calculateParkingFees(12))

}