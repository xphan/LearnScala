// scala中，类构造器中的参数会定义字段和访问方法
class Car(val year: Int) {
	private var milesDriven: Int = 0

	def miles() = milesDriven

	def drive(distance: Int) {
		milesDriven += Math.abs(distance)
	}
}