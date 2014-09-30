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