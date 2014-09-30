class Vehicle(val id: Int, val year: Int) extends Any {
	override def toString( ) : String = "ID: " + id + " Year: " + year
}

class Car(override val id: Int, override val year: Int, var fuelLevel: Int) 
extends Vehicle(id, year) {
	override def toString() : String = super.toString() + " Fuel Level: " + fuelLevel
}