// 主构造函数
class Person(val firstName: String, val lastName: String) {
	private var position: String = _ // _ 代表该类型的默认值

	println("Creating " + toString())

	// 副构造函数
	def this(firstName: String, lastName: String, positionHeld: Stirng){
		this(firstName, lastName)
		position = positionHeld
	}

	override def toString(): String = {
		firstName +" " + lastName + " holds " + position + " position"
	}
}