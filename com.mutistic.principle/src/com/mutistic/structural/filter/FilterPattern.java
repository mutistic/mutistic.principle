package com.mutistic.structural.filter;

import com.mutistic.utils.PrintUtil;

/**
 * @program 过滤器模式[Filter Pattern]
 * @description 
 * @author mutisitic
 * @date 2018年9月11日
 */
public class FilterPattern {
	public static void main(String[] args) {
		PrintUtil.ln("过滤器模式[Filter Pattern]");
		PrintUtil.ln("一、定义、本质:\r\n" + 
				"\r\n" + 
				"定义: 使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。也称标准模式（Criteria Pattern）\r\n" + 
				"本质: 结合多个标准来获得单一标准\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"Criteria：过滤器接口。为所有的过滤器对象声明统一的过滤接口，用来返回匹配符合条件的Subject数据集合\r\n" + 
				"\r\n" + 
				"ConcreteCriteria：具体的过滤器。持有Subject数据集合，实现具体的过滤功能，通过匹配条件来达到过滤数据的目的\r\n" + 
				"\r\n" + 
				"Subject：具体的目标对象，提供过滤器按照条件匹配数据的对象\r\n" + 
				"\r\n" + 
				"Client：客户端，使用具体的标准匹配Subject对象集合，来过滤获得单一标准的数据集合\r\n" + 
				"\r\n" + 
				"三、理解:\r\n" + 
				"\r\n" + 
				"1、过滤器的功能：\r\n" + 
				"  在不改变目标对象结果或数据的情况下，通过事先定义好的不同的过滤器来匹配过滤出客户端需要的数据。\r\n" + 
				"  客户端需要明确知道每个过滤器的内部细节\r\n" + 
				"\r\n" + 
				"2、过滤器的平等性：\r\n" + 
				"  过滤器模式中对于一系列具体的过滤器，其地位是一样的，体现了过滤器的平等性\r\n" + 
				"  所有的过滤器在实现上也是相互独立的，相互之间是没有依赖的。\r\n" + 
				"  所以在客户端使用过滤器模式，可能需要多个过滤器才能匹配出需要的数据\r\n" + 
				"\r\n" + 
				"四、写法:\r\n" + 
				"\r\n" + 
				"五、优点:\r\n" + 
				"\r\n" + 
				"1、更好的扩展性\r\n" + 
				"2、更好的复用性\r\n" + 
				"3、逻辑运算和目标对象解耦\r\n" + 
				"\r\n" + 
				"六、缺点:\r\n" + 
				"\r\n" + 
				"1、所有过滤器都需要对外暴露，而且客户端必须了解每种条件的区别\r\n" + 
				"2、具体的过滤器会导致增加了对象数目\r\n" + 
				"3、过多的过滤器会导致一定程度上客户端使用的复杂度\r\n" + 
				"\r\n" + 
				"七、使用场景:\r\n" + 
				"\r\n" + 
				"1、如果需要将逻辑运算和目标对象解耦开来，可以使用过滤器模式\r\n" + 
				"2、如果需要通过结合多个标准来获得单一标准的数据，可以使用过滤器模式\r\n" + 
				"3、如果过滤数据，并且是通过多个if-else语句来选择数据，可以使用过滤器模式代替这些条件语句\r\n" + 
				"\r\n" + 
				"八、注意事项:\r\n" + 
				"\r\n" + 
				"1、Java 8的lambda表达式和流类库会帮我们非常方便的实现过滤器模式的功能。\r\n" + 
				"2、如果一个系统的过滤器类过多，需要考虑使用混合模式或其他模式，来解决过滤器膨胀的问题\r\n" + 
				"");
	}
}
