package com.mutistic.structural.facade;

import com.mutistic.utils.PrintUtil;

/**
 * @program 外观模式[Facade Pattern]
 * @description 
 * @author mutisitic
 * @date 2018年8月21日
 */
public class FacadePattern {
	public static void main(String[] args) {
		PrintUtil.ln("外观模式[Facade Pattern]");
		PrintUtil.one("一、定义和本质:\r\n" + 
				"\r\n" + 
				"定义: 为系统中的一组接口提供一个一致的界面。Facade模式定义高层接口，这个接口使得客户端容易使用这一系统。\r\n" + 
				"本质: 封装交互、简化调用\r\n" + 
				"原则：外观模式体现了迪米特法则[LoD: Law of Demeter，最少知识原则: LKP: Least Knowledge Principle]\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"Facade: 定义系统的多个模块对外的高层接口，通常是需要调用内部多个模块，从而把客户的请求代理给适当的系统对象\r\n" + 
				"\r\n" + 
				"模块(Mode): 接受Facade对象的委派，真正实现功能，各个模块之前按可能有交互，注意，Facade对象知道各个模块，但是各个模块不应该知道Facade对象\r\n" + 
				"\r\n" + 
				"三、理解:\r\n" + 
				"\r\n" + 
				"主要解决: 降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。\r\n" + 
				"如何解决: 客户端不与系统耦合，外观类与系统耦合\r\n" + 
				"\r\n" + 
				"1、外观模式的目的: 外观模式的目的不是给系统添加新的功能接口，而是减少客户端和系统内的模块的交互，松散耦合，\r\n" + 
				"	从而让客户端能够更简单的使用系统\r\n" + 
				"2、使用外观模式区别: Facade翻遍了客户端的调用、封装了系统内部的实现细节、实现功能的共享和复用\r\n" + 
				"3、外观模式不是强制要求使用的。\r\n" + 
				"4、外观模式提供了默认的功能实现。\r\n" + 
				"\r\n" + 
				"四、写法:\r\n" + 
				"\r\n" + 
				"1、把外观类作为一个辅助工具类实现\r\n" + 
				"2、Facade可以实现为接口，组合其他设计模式，比如工厂模式。如果实现为interface可以有选择性的暴露接口方法，减少模块对子系统提供的接口方法。\r\n" + 
				"3、Facade的方法实现: 	Facade的方法实现中，一般是转发客户端的请求给到具体模块进行处理。\r\n" + 
				"	Facade本身不建议进行功能处理，只是实现了一个功能的组合调用。\r\n" + 
				"\r\n" + 
				"五、优点:\r\n" + 
				"\r\n" + 
				"1、松散耦合\r\n" + 
				"2、简单易用\r\n" + 
				"3、更好的划分访问层次\r\n" + 
				"\r\n" + 
				"六、缺点:\r\n" + 
				"\r\n" + 
				"1、过多的或者不太合理的Facade会降低易读性，容易让人迷惑。\r\n" + 
				"2、Facade声明过的接口会造成客户端调用时的一定复杂度。\r\n" + 
				"3、不符合开闭原则[OCP: Open Closed Principle]，如果要改东西很麻烦，继承重写都不合适\r\n" + 
				"\r\n" + 
				"七、使用场景:\r\n" + 
				"\r\n" + 
				"1、如果为一个调用复杂的子系统提供一个简单接口的时候，可以考虑使用外观模式，使用外观对象来实现大部分客户端需要的功能，从而简化客户端的使用\r\n" + 
				"2、如果需要客户端和抽象类实现部分松散耦合，可以考虑使用外观模式，使用外观对象来将这个系统与客户端分离开来，从而提高系统的独立性和可移植性\r\n" + 
				"3、如果构建多层结构的系统，可以考虑使用外观模式，使用外观对象作为每层的入口，这样可以简单层间的调用，也可以松散层次之间的依赖关系。\r\n" + 
				"\r\n" + 
				"八、注意事项:\r\n" + 
				"\r\n" + 
				"在层次化结构中，可以使用外观模式定义系统中每一层的入口。\r\n" + 
				"");
	}
}
