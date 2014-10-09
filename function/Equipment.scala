// 可以将函数值传入作为构造函数
class Equipment(val routine : Int => Int) {
	def simulate(input: Int) = 
	{
		print("Running simulation...")
		routine(input)
	}
}

val euqipment1 = new Equipment({input => println("calc with " + input)})
