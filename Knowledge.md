# Scala小笔记


## Scala的一些关键特性

- **在scala中，如果方法有0或1个参数，点和括号是可选的**

    def turn(direction: String) // ...
	调用可以是car.turn("right") 也可以是 car turn "right"
- **支持脚本运行**
- **return是可选的**：方法调用会自动的返回最后求值的表达式
- **；是可选的**：除非在一句话中要放入多行
- 类和方法默认是public
- 不会强制捕获一些不关心的异常
- 默认情况导入`java.lang`,`scala`, `scala.Predef` 包

## 一些小特性

- `val` 表示不变量，表示name不再bind到其他的变量上了
- `var` 表示变量
- `1 to 3` 表示 `(1, 2, 3)`的range，本质上是`1.to(3)`
- `1 until 3` 表示 `(1, 2)`的range，本质上是`1.until(3)`
- `_`表示默认值，例如var s : Double = _, 那么s会取double的默认值0.0
**循环的几种写法**

	for (i <- 1 to 3) { print(i) }
	for (i <- 1 until 4) { print(i) }
	(1 to 3).foreach( i => print(i) )

- `<-` 左边定义了一个val
- `=>` 将参数列表和右边的实现分离开来

**Scala将一切视为对象，JAVA将基本类型同对象区分对待**

**元组**
同python一样 (a, b, c, ...)

**String**
多行字符串可以用python的形式创建
"""..."""

**运算符重载**
从技术的角度看，scala没有运算符，+ - 这些实际上是方法名


## Scala一些需要注意的地方

1. 赋值的结果：在scala中，a=b的结果是unit，因此a=b=c这样的多重赋值不能出现在scala中(导致类型不匹配)
2. == : 在scala中，==都是基于值的表，基于对象地址的比较是eq（）方法
3. 分号是半可选的：在{之前要有个分号

# Class

## 类的定义

**Scala将主构造函数放到了类定义中**。如下类定义：

	class CreditCard(val number: Int, var creditLimit: Int)

上面是一个类的完整定义。

**放到类定义中的任意表达式或者可执行语句都会作为主构造函数的一部分执行**

	class Sample {
		println("You are constructing an instance of Sample")
	}
每次构造时，上面这句话都会打印出来

## 类继承
继承一个基类与java类似，多了两条限制：

1. 重写方法需要override关键字
2. 只有主构造函数才能往几类构造函数中传参数

## 单例对象
使用关键词`object`定义单例对象，单例对象没法往构造函数中传值

## 独立对象与伴生对象
Scala可以创建一个关联到类上的单例。这样的单例同类共享相同的名字，它称为`伴生对象`,对应的类就被称为`伴生类`。

在scala中，类和伴生对象之间没有界限，他们可以相互访问彼此的private自动和方法

## Scala中的static
Scala没有静态字段和静态方法。使用伴生对象实现类一级的属性和操作。


# 语法糖

## `apply函数`和`update函数`
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


# 自适应类型

Scala会在编译时推演类型。

`Nothing`是所有类的子类,是最底层的子类
`Any`是所有类型的基类型

scala坚持认为无参数化类型的容器是Nothing的容器（这样就无法往里面加入任何东西）

## Any类型

Any类型是所有scala类型的超类

Any类型的方法包括
`!=()` `==()`,`asInstanceOf()`,`equals()`,`hashCode()``isInstanceOf()`,`toString()`

## Nothing类型
Nothing类型的作用是帮助类型推演。

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



