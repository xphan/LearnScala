# 函数式编程

## 方法返回类型推演
如果方法用`=`号定义，Scala就可以推演返回类型，否则，它就假设该方法是一个void方法

	def method1() {6} // void 方法
	def method2() = {6} // Int
	def method3() = 6 //Int
	def method4: Double = 6 // Double

## 传递变参

在类型信息之后使用特殊符号 *

	def max(values: Int*) = values.foldLeft(values(0)) {Math.max}

# 函数值和闭包
函数是函数式编程的一等公民：可以作为参数传递，可以从函数中返回，可以在函数中嵌套。这些高阶函数称为函数值。

闭包是一种特殊的函数值，在闭包中封闭或绑定了在另一个作用域或上下文中定义的变量。


	// 对范围内的值进行循环运算的代码
	def totalResultOverRange(number: Int, codeBlock: Int => Int) : Int = {
		var result = 0
		for(i <- 1 to number) result += codeBlock(i)
		result
	}

这里codeBlock是一个函数，将一个Int（无副作用的）转换为另一个Int

基于上面的函数，求和

	totalResultOverRange(11, i => i)
	
`=>`左边是参数列表，右边是实现

对偶数求和
	
	totalResultOverRange(11, i => if (i%2 == 0) i else 0)

## Curry化
Scala里的curry化可以把函数从接收多个参数转换成接收多个参数列表。

## 参数的位置记法
scala里面，`_`可以表示函数值的参数，如果某个参数在函数里仅仅使用一次，就可以用下划线表示。每次在函数里用下划线，都表示随后的参数。
