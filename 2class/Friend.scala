trait Friend {
	val name: String // 被当做abstract对待，其实际定义由混入这个trait的类提供
	def listen() = println("Your friend " + name + " is listening")
}