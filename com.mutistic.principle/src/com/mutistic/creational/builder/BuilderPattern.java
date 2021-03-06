package com.mutistic.creational.builder;

import com.mutistic.utils.PrintUtil;

/**
 * @program 建造者模式[Builder Pattern]
 * @description 
 * @author mutisitic
 * @date 2018年8月21日
 */
public class BuilderPattern {
	public static void main(String[] args) {
		PrintUtil.ln("建造者模式[Builder Pattern]");
		PrintUtil.one("一、定义:\r\n" + 
				"\r\n" + 
				"定义: 将一个复杂对象的构建与它的表示分离，是的同样的构建过程可以创建不同的表示\r\n" + 
				"本质: 分离整体构建算法和组件构造\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"Builder: 建造者接口，定义创建一个Product对象所需要的各个组件的操作\r\n" + 
				"\r\n" + 
				"ConcreteBuilder: 具体的建造者实现，实现各个组件的创建，并负责组装Product对象的各个组件，\r\n" + 
				"	同时还提供一个让客户端获取组装完成后的产品对象的方法\r\n" + 
				"\r\n" + 
				"Director: 指导者，也称为导向者，主要用来使用Builder接口，以一个统一的过程来构建所需要的Product对象\r\n" + 
				"\r\n" + 
				"Product: 产品，表示被建造者构建的复杂对象，包含多个组件\r\n" + 
				"\r\n" + 
				"三、理解:\r\n" + 
				"\r\n" + 
				"主要解决: 主要解决在软件系统中，有时候面临着\"一个复杂对象\"的创建工作，其通常由各个部分的子对象用一定的算法构成；\r\n" + 
				"	由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。\r\n" + 
				"如何解决: 将变与不变分离开。 \r\n" + 
				"\r\n" + 
				"1、建造者模式: 其中心在于分离构建算法和具体的构造实现，从而使得构建算法可以重用，\r\n" + 
				"	具体的构造实现可以方便扩展和切换，从而可以灵活的组合来构造出不同的产品对象\r\n" + 
				"\r\n" + 
				"2、建造者模式的构成：\r\n" + 
				"	Builder接口: 定义了如果构建各个组件，也就是知道每个组件功能如何实现，以及如何装配这些组件到产品中\r\n" + 
				"	Director: 知道如何组合来构建产品，也就是说Director负责整体的构建算法，而且通常是分步骤来执行。\r\n" + 
				"	不管如何变化，建造者模式都存在着两部分：一部分是组件构造和产品装配，另一个部分是整体构建的算法。\r\n" + 
				"\r\n" + 
				"四、写法:\r\n" + 
				"\r\n" + 
				"1、实际应用建造者模式时，可以由客户端创造Director，在Director里面封装整体构建算法，\r\n" + 
				"	然后让Director去调用Builder，让Builder来封装具体组件的构造功能\r\n" + 
				"\r\n" + 
				"2、建造者的实现：\r\n" + 
				"	2.1、实际上在Builder接门的实现中，每个组件构建的方法里面，除了组件装配外，也可以实现如何具体的创建各个组件对象，\r\n" + 
				"也就是说每个方法都可以有两部分功能，一个是创建溺件对象，一个是组装组件。\r\n" + 
				"	2.2、在构建组件的方法里曲可以实现选择并创建具体的组件对象，然后再把这个组件对象组装到产品对象中去，\r\n" + 
				"这样一来，Builder就可以和工厂方法配合使用了\r\n" + 
				"	2.3、再进一步，如果在实现Builder的时候，只有创建对象的功能，而没有组装的功能，\r\n" + 
				"那么这个时候的Builder实现跟抽象工厂的实现是类似的\r\n" + 
				"	2.4、这种懦况下，Builder接冂就类似于抽象工厂的接口，Builder的具体实现就类似于具体的工厂，\r\n" + 
				"而且Builder接口里面定义的创建各个邮件方法也是有关联的，这些方法是构建一个复杂对象所需要的组件对象\r\n" + 
				"\r\n" + 
				"3、指导者的实现：\r\n" + 
				"	3.1、在建造者模式里面，指导者承担的是整体构建算法部分，是相对不变的部分。\r\n" + 
				"因此在实现指导者的时候，把变化的部分分离出去是很重要的。\r\n" + 
				"	3.2、其实指导者分离以去的变化部分，就到了建造者那边，指导者知道整体的构建算法，\r\n" + 
				"但是不知道如何具体的创建和装配部件对象。\r\n" + 
				"	3.3、因此真正的指导者实现，并不仅仅是简单的按照一定顺序调用建造者的方法来生成对象。\r\n" + 
				"应该是有较为复杂的算法和运算过程，在运算过程中根据需要，才会调用建造者的方法来生成部件对象。\r\n" + 
				"\r\n" + 
				"4、指导者和建造者的交互\r\n" + 
				"	在建造者模式里面，指导者和建造者的交互，是通过建造者的那些buildPart方法来完成的。\r\n" + 
				"指导者通常会实现比较复杂的算法或者是运算过程，\r\n" + 
				"\r\n" + 
				"在实际中很可能会有以下的情况：\r\n" + 
				"	4.1、在运行指导者的时候，会按照整体构建算法的步骤进行运算，可能先运行前几步运算，\r\n" + 
				"到了某一步骤，需要具体创建某个组件对象了，然后就调用Bui1der的创建相应组件的方法来创建具体的组件。\r\n" + 
				"同时，把前里面运算得到的数据传递给Builder，因为在Builder内部实现创建和组装组件的时候，可能会需要这些数据\r\n" + 
				"	4.2、Builder创建完具体的组件对象后，会把创建好的组件对象返回给指导者，\r\n" + 
				"指导者继续后续的算法运算，可能会用到己经创建好的对象\r\n" + 
				"	4.3、如此反复下去，直到整个构建算法运行完成，那么最终的产品对象也就创建好了\r\n" + 
				"\r\n" + 
				"	通过上而的描述，可以看出指导者和建造者是需要交互的，方式就是通过建造者方法的参数和返回值，\r\n" + 
				"来回的专递数据。事实上，指导者是通过委托的方式来把功能交给建造者去完成。\r\n" + 
				"\r\n" + 
				"五、优点:\r\n" + 
				"\r\n" + 
				"1、松散耦合\r\n" + 
				"2、可以很容易的改变产品的内部表示\r\n" + 
				"3、更好的复用性\r\n" + 
				"4、便于控制细节风险\r\n" + 
				"\r\n" + 
				"六、缺点:\r\n" + 
				"\r\n" + 
				"1、产品必须有共同点，范围有限制（如果没有共同点，则可以用JSON数据结构或Map或不返回或Builder本身）。\r\n" + 
				"2、如内部变化复杂，会有很多的建造类。 \r\n" + 
				"\r\n" + 
				"七、使用场景:\r\n" + 
				"\r\n" + 
				"1、如果创建对象的算法，应该独立于该对象的组成部分以及它们的装配方式时。\r\n" + 
				"2、如果同一个构建过程有着不同的表示时\r\n" + 
				"3、需要生成的对象具有复杂的内部结构或对象内部属性本身相互依赖。 \r\n" + 
				"\r\n" + 
				"八、注意事项:\r\n" + 
				"\r\n" + 
				"与工厂模式的区别是：建造者模式更加关注与零件装配的顺序\r\n" + 
				"");
	}
}
