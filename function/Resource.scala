class Resource private() extends Any {
	println("Starting transaction...")

	private def cleanUp() {println("Ending transaction...")}

	def op1 = println("Operation 1")
	def op2 = println("Operation 2")
	
}