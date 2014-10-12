# 面向对象


## 1. 类的定义

**Scala将主构造函数放到了类定义中**。如下类定义：

	class CreditCard(val number: Int, var creditLimit: Int)

上面是一个类的完整定义。

**放到类定义中的任意表达式或者可执行语句都会作为主构造函数的一部分执行**

	class Sample {
		println("You are constructing an instance of Sample")
	}
每次构造时，上面这句话都会打印出来

## 2. 类继承
继承一个基类与java类似，多了两条限制：

1. 重写方法需要override关键字
2. 只有主构造函数才能往几类构造函数中传参数

## 3. 单例对象
使用关键词`object`定义单例对象，单例对象没法往构造函数中传值

## 4. 独立对象与伴生对象
Scala可以创建一个关联到类上的单例。这样的单例同类共享相同的名字，它称为`伴生对象`,对应的类就被称为`伴生类`。

在scala中，类和伴生对象之间没有界限，他们可以相互访问彼此的private自动和方法

## 5. Scala中的static
Scala没有静态字段和静态方法。使用伴生对象实现类一级的属性和操作。


## 6. 自适应类型

Scala会在编译时推演类型。

`Nothing`是所有类的子类,是最底层的子类
`Any`是所有类型的基类型

scala坚持认为无参数化类型的容器是Nothing的容器（这样就无法往里面加入任何东西）

## 7. Any类型

Any类型是所有scala类型的超类

Any类型的方法包括
`!=()` `==()`,`asInstanceOf()`,`equals()`,`hashCode()``isInstanceOf()`,`toString()`

## 8. Nothing类型
Nothing类型的作用是帮助类型推演。

## 9. Trait
Trait就像一个拥有部分实现的接口，提供了一个介于单一继承和多重继承的中间地带。
    
    trait Friend {
    	val name: String // 被当做abstract对待，其实际定义由混入这个trait的类提供
    	def listen() = println("Your friend " + name + " is listening")
    }

#### Trait与类的区别

1. Trait需要混入类去实现那些已声明的而未初始化的变量和值
2. Trait的构造器不能有任何参数
3. Trait会编译成java的接口，还有对应的实现类

#### Trait的混入方式
1. 实现一级的混入

    class Dog(val name: String) extends Animal with Friend {
    	override def listen = println(name +"'s listening quitely")
    }

2. 实例化时候的混入

	val snowy = new Cat("Snowy") with Friend

这里，虽然Cat实现里面没有Friend接口，但是初始化的时候也可以绑定