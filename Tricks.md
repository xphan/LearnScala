# Scala小知识

## 1. 运行方式

1. 脚本运行
2. 解释器
3. 编译

## 2. Scala的一些特性

- **在scala中，如果方法有0或1个参数，点和括号是可选的**

    def turn(direction: String) // ...
	调用可以是car.turn("right") 也可以是 car turn "right"
- **return是可选的**：方法调用会自动的返回最后求值的表达式
- **；是可选的**：除非在一句话中要放入多行
- 类和方法默认是public
- 不会强制捕获一些不关心的异常
- **Scala将一切视为对象，JAVA将基本类型同对象区分对待**
- 默认情况导入`java.lang`,`scala`, `scala.Predef` 包
- `val` 表示不变量，表示name不再bind到其他的变量上了
- `var` 表示变量
- 赋值的结果：在scala中，a=b的结果是unit，因此a=b=c这样的多重赋值不能出现在scala中(导致类型不匹配)
-  == : 在scala中，==都是基于值的表，基于对象地址的比较是eq（）方法
-   分号是半可选的：在{之前要有个分号

## 3. 一些有用知识

### 3.1 Range
- `1 to 3` 表示 `(1, 2, 3)`的range，本质上是`1.to(3)`
- `1 until 3` 表示 `(1, 2)`的range，本质上是`1.until(3)`
- `_`表示默认值，例如var s : Double = _, 那么s会取double的默认值0.0

### 3.2 循环
**循环的几种写法**

	for (i <- 1 to 3) { print(i) }
	for (i <- 1 until 4) { print(i) }
	(1 to 3).foreach( i => print(i) )

- `<-` 左边定义了一个val
- `=>` 将参数列表和右边的实现分离开来

### 3.3 元组 Tuple

同python一样 (a, b, c, ...)

### 3.4 字符串
多行字符串可以用python的形式创建
	
	"""Original formate
	"String
	"""

### 3.5 运算符
**运算符重载**
从技术的角度看，scala没有运算符，+ - 这些实际上是方法名


### 3.6 `apply函数`和`update函数`
用括号传递给变量(对象)一个或多个参数时，Scala 会把它转换成对 apply 方法的调用；与此相似的，当对带有括号并包括一到若干参数的进行赋值时，编译器将使用对象的 update 方法对括号里的参数和等号右边的对象执行调用。

1. theArray(0), 取数组的第一个元素的操作会转换成 theArray.apply(0) 操作，这也能解释为什么 Scala 数组取值不用中括号括下标的方式，因为它也是一次方法调用

2. anyObject("key1") 会被转换成 anyObject.apply("key") 操作，这也会让我们想到 Map 的取值操作，的确如此。

3. 我们在构造 Array 或  Map 时，会简单的写成

	val numNames = Array.apply("one", "two", "three")

这里调用的是伴生对象的apply方法，即

	val numNames = Array.apply(

`update`方法的理解跟apply差不多：

	greetString(0) = "hello"
会被转变为：
	
	greetStrings.update(0, "hello")