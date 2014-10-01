class Complex(val real: Int, val imaginary: Int) {
	def +(operand: Complex) : Complex = {
		new Complex(real + operand.real, imaginary + operand.imaginary)
	}
}