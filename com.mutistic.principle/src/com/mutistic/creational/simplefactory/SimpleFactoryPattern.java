package com.mutistic.creational.simplefactory;

import com.mutistic.utils.PrintUtil;

/**
 * @program 简单工厂模式
 * @description 简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个子类（这些子类继承自一个父类或接口）的实例。
 * @author mutistic
 * @date 2018年5月8日
 */
public class SimpleFactoryPattern {
	
	public static void main(String[] args) {
		PrintUtil.printOne("简单工厂模式[Simple Factory Pattern]");
		PrintUtil.println("一、定义和本质:\r\n" + 
				"\r\n" + 
				"定义: 提供一个创建对象实例的功能，无需关心其具体的实现。被创建时间的类型可以是接口、抽象类，也可以是具体的类.\r\n" + 
				"本质: 选择实现\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"API: 定义客户所需要的功能接口。简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。\r\n" + 
				"\r\n" + 
				"Impl: 具体实现API的实现类，可能会有多个。简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例。\r\n" + 
				"\r\n" + 
				"Factory: 工厂，选择合适的实现类来创建API接口对象。简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。\r\n" + 
				"工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象\r\n" + 
				"\r\n" + 
				"Client: 客户端，通过Factory去获取API接口对象，然后面向API接口编程。由一个工厂类根据传入的参数，\r\n" + 
				"动态决定应该创建哪一个子类（这些子类继承自一个父类或接口）的实例\r\n" + 
				"\r\n" + 
				"三、理解:\r\n" + 
				"\r\n" + 
				"PS：简单工厂模式是属于创建型模式，又叫做静态工厂方法（Static Factory Method）模式，但不属于23种GOF设计模式之一\r\n" + 
				"\r\n" + 
				"1、简单工厂的功能: 可用来创建的接口、抽象类或者是普通类的实例，\r\n" + 
				"2、静态工厂: 	通常把简单工厂类实现成一个工具类，直接使用静态方法，也就是说简单工厂的方法通常都是静态的，所以也称为静态工厂\r\n" + 
				"3、万能工厂: 一个简单工厂理论上可以用来构造任何对象，所以又称之为万能工厂\r\n" + 
				"4、简单工厂创建对象的范围: 建议控制在一个独立的组建级别或者一个模块级别\r\n" + 
				"5、简单工厂模式是工厂模式家族中最简单实用的模式，可以理解为是不同工厂模式的一个特殊实现\r\n" + 
				"\r\n" + 
				"四、写法:\r\n" + 
				"\r\n" + 
				"简单工厂方法的内部主要实现的功能是“选择合适的实现类”来创建实例对象\r\n" + 
				"PS: 客户端在调用工厂的时候，传入选择的参数，这就说明客户端必须知道每个参数的含义，也需要理解参数对应的功能处理，\r\n" + 
				"这就要求在一定程度上，想客户端暴露一定的内部实现细节\r\n" + 
				"\r\n" + 
				"可配置的简单工厂: 使用反射和配置文件，来实现添加新的实现类后，无需修改代码就可以把新的实现类加入到应用中\r\n" + 
				"\r\n" + 
				"五、优点:\r\n" + 
				"\r\n" + 
				"帮助封装、解耦\r\n" + 
				"1、工厂类是整个模式的关键.包含了必要的逻辑判断,根据外界给定的信息,决定究竟应该创建哪个具体类的对象.\r\n" + 
				"2、通过使用工厂类,外界可以从直接创建具体产品对象的尴尬局面摆脱出来,仅仅需要负责“消费”对象就可以了。而不必管这些对象究竟如何创建及如何组织的．\r\n" + 
				"3、明确了各自的职责和权利，有利于整个软件体系结构的优化。\r\n" + 
				"\r\n" + 
				"六、缺点:\r\n" + 
				"\r\n" + 
				"一定程度上暴露了实现细节、增加客户端的复杂度、不方便扩展子工厂\r\n" + 
				"1、由于工厂类集中了所有实例的创建逻辑，违反了高内聚责任分配原则，将全部创建逻辑集中到了一个工厂类中；\r\n" + 
				"它所能创建的类只能是事先考虑到的，如果需要添加新的类，则就需要改变工厂类了。\r\n" + 
				"\r\n" + 
				"2、当系统中的具体产品类不断增多时候，可能会出现要求工厂类根据不同条件创建不同实例的需求．\r\n" + 
				"这种对条件的判断和对具体产品类型的判断交错在一起，很难避免模块功能的蔓延，对系统的维护和扩展非常不利；\r\n" + 
				"\r\n" + 
				"3、简单工厂模式的扩展是违背了开闭原则[OCP: Open Closed Principle]的\r\n" + 
				"\r\n" + 
				"PS、这些缺点在工厂方法模式中得到了一定的克服\r\n" + 
				"\r\n" + 
				"七、使用场景:\r\n" + 
				"\r\n" + 
				"1、工厂类负责创建的对象比较少；\r\n" + 
				"2、客户只知道传入工厂类的参数，对于如何创建对象（逻辑）不关心；\r\n" + 
				"3、由于简单工厂很容易违反高内聚责任分配原则，因此一般只在很简单的情况下应用。\r\n" + 
				"");
	}

}
