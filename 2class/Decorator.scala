abstract class Check() {
	def check() : String = "Checked Application Details..."
}

trait CreditCheck extends Check {
	override def check() : String = "Checked Credit..." + super.check()
}

