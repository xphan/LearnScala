/*
There are many ways to create and use funcion-like values in scala
*/

// Implicit funcio:
def id(x : Int) : Int = x

// Anonymous funcion:
val anonId = (x : Int) => x

// class with apply method
class Identity {
	def apply(x: Int) = x
}
val myId = new Identity

// f(x) => f.apply(x)
// f是类名的时候，调用的是object f的apply方法
// f是变量名的时候，调用的是class f的apply方法

// object with apply method:
object Id {
	def apply(x: Int) = x
}

// Anonymous class with apply method
val myOtherId = new {
	def apply(x : Int) = x
}

// case blocks also act as functions:
val  myCaseID : Int => Int = {
	case x => x
}

println(id(3))
// prints:
// 3

println(anonId(3))
// prints:
// 3

// Multi-argument functions
def h(x: Int, y: Int) : Int = x + y

// A curried multi-argument function:
def hC(x: Int)(y : Int) : Int = x + y

// Wrong: hC 3 4
// Right: hC (3) (4)

// Wrong: hC (3)
// Right: hC (3) _

// Wrong: hC _ (4)
// Right: hC (_ : Int) (4)

val plus3 = hC (_: Int) (3)
val plus_3 = hC (3) _

// A procedure
def proc(a: Int) { // Implicitly: Unit
	println("I'm a procedure.")
}

proc(10)
// prints:
// I'm a procedure

// An argument-less function:
def argless : Unit = println("argless got called!")

argless
argless

// Lazy fields are argless functions that cache their results:
class LazyClass {
	lazy val x = {println("Evaluating x"); 3}
}

val lc = new LazyClass
println(lc.x)
println(lc.x)
println(lc.x)
// prints:
// Evaluating x
// 3
// 3
// 3

//parameters can be evaluated lazily by-name:
def lazyId(x: => Int) : Int = {
	x
	x
	x
	return x;
}

println(lazyId {println("used!"); 3}
// prints:
// used!
// used!
// used!
// 3



