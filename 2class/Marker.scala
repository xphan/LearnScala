class Marker(val color: String) extends Any {
	println("Creating " + this)

	override def toString() : String = "marker color " + color
}

object Marker extends Any {
	private val markers = Map(
		"red" -> new Marker("red"),
		"blue" -> new Marker("blue"),
		"green" -> new Marker("green")
	)

	def getMarker(color: String) = 
		if (markers.contains(color)) markers(color) else null
}

println(Marker getMarker "blue")
println(Marker getMarker "blue")
println(Marker getMarker "red")
println(Marker getMarker "red")
println(Marker getMarker "yellow")
