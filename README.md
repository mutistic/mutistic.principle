# <a id="a_top">Java设计模式</a> <a href="#a_catalogue">Catalogue</a> <a href="#a_down">Down</a>
[Wiki Page for Design Patterns：设计模式](https://en.wikipedia.org/wiki/Software_design_pattern)<br/>
[The JavaTM Tutorials：Java教程实用指南](https://docs.oracle.com/javase/tutorial/index.html)<br/>
[JDK 10文档](https://docs.oracle.com/javase/10/index.html)
[Java SE 10 & JDK 10：API](https://docs.oracle.com/javase/10/docs/api/overview-summary.html)<br/>
[JVM工具接口](https://docs.oracle.com/javase/10/docs/specs/jvmti.html)<br/>
[JNI：Java本机接口规范](https://docs.oracle.com/javase/10/docs/specs/jni/index.html)<br/>

|作者|Mutistic|
|---|---|
|邮箱|mutistic@qq.com|

## <a href="#a_design">设计原则</a>
[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle)<br/>
面向对象设计原则: SOLID<br/>
单一职责原则[SRP: Single Responsibility Principle]<br/>
开闭原则[OCP: Open Closed Principle]<br/>
里氏替换原则[LSP: Liskov Substitution Principle]<br/>
接口隔离原则[ISP: Interface Segregation Principle]<br/>
依赖倒置原则[DIP: Dependence Inversion Principle]<br/>
迪米特法则[LoD: Law of Demeter，最少知识原则: LKP: Least Knowledge Principle]<br/>

## <a href="#a_creational">设计模式[Design Pattern]</a>
[EA图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode)<br/>
[设计模式关系图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/MO_DesignPatterDiagrams.jpg)<br/>

设计模式是在软件开发中，经过验证的，用于解决在特定环境下、重复出现的、特定问题的解决方案<br/>
```
设计模式[Design pattern] 代表了最佳的实践，通常被有经验的面向对象的软件开发人员所采用。

设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。
这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。

设计模式是一套被反复使用的、多数人知晓的、经过分类编目的、代码设计经验的总结。
使用设计模式是为了重用代码、让代码更容易被他人理解、保证代码可靠性。 

毫无疑问，设计模式于己于他人于系统都是多赢的，设计模式使代码编制真正工程化，设计模式是软件工程的基石。
项目中合理地运用设计模式可以完美地解决很多问题，每种模式在现实中都有相应的原理来与之对应，
每种模式都描述了一个在周围不断重复发生的问题，以及该问题的核心解决方案，这也是设计模式能被广泛应用的原因
```

设计模式和面向对象设计原则: 
```
	面向对象的分析设计有很多原则，这些原则大多从思想成眠，指出了面向对象分析设计的正确方向，
是进行面向对象分析设计的应该遵守的准则。
	设计模式已经是针对某个场景下某些问题的某个解决方案。也就是说这些设计原则是思想上的指导，
而设计模式是实现上的手段，因此设计模式也应该准守这些原则。
即: 设计模式就是这些设计原则的一些具体体现
```

设计模式的三种类型: <br/>
一、<a href="#a_creational">创建型模式[Creational Patterns]: </a><br/>
抽象了对象实例化的过程，用来帮助创建对象的实例
```
简单工厂模式[Simple Factory Pattern]、单例模式[Singleton Pattern]、工厂模式[Factory Pattern]、
抽象工厂模式[Abstract Factory Pattern]、建造者模式[Builder Pattern]、原型模式[Prototype Pattern]
```

二、<a href="#a_structural">结构型模式[Structural Patterns]: </a><br/>
描述如何组合类和对对象以获得更大的结构
```
外观模式[Facade Pattern]、适配器模式[Adapter Pattern]、代理模式[Proxy Pattern]、
组合模式[Composite Pattern]、装饰模式[Decorator Pattern]、享元模式[Flyweight Pattern]、
桥接模式[Bridge Pattern]、过滤器模式[Filter Pattern]、
```

三、<a href="#a_behavioral">行为型模式[Behavioral Patterns]: </a><br/>
描述算法和对象间的职责的分配
```
中介者模式[Mediator Pattern]、观察者模式[Observer Pattern]、命令模式[Command Pattern]、
迭代器模式[Iterator Pattern]、模板模式[Template Pattern]、策略模式[Strategy Pattern]、
状态模式[State Pattern]、备忘录模式[Memento Pattern]、解释器模式[Interpreter Pattern]、
职责链模式[Chain of Responsibility Pattern]、访问者模式[Visitor Pattern]、空对象模式[Null Object Pattern]、
```

<a href="#a_j2ee">J2EE设计模式: </a><br/>
这些设计模式特别关注表示层。这些模式是由 Sun Java Center鉴定
```
MVC 模式[MVC Pattern]、业务代表模式[Business Delegate Pattern]、
组合实体模式[Composite Entity Pattern]、数据访问对象模式[Data Access Object Pattern]、
前端控制器模式[Front Controller Pattern]、拦截过滤器模式[Intercepting Filter Pattern]、
服务定位器模式[Service Locator Pattern]、传输对象模式[Transfer Object Pattern]
```

---
### <a id="a_catalogue">目录</a>: 
1. <a href="#a_design">#设计原则#</a>
2. <a href="#a_SOLID">面向对象设计原则: SOLID</a>
3. <a href="#a_SRP">单一职责原则[SRP: Single Responsibility Principle]</a>
4. <a href="#a_OCP">开闭原则[OCP: Open Closed Principle]</a>
5. <a href="#a_LSP">里氏替换原则[LSP: Liskov Substitution Principle]</a>
6. <a href="#a_ISP">接口隔离原则[ISP: Interface Segregation Principle]</a>
7. <a href="#a_DIP">依赖倒置原则[DIP: Dependence Inversion Principle]</a>
8. <a href="#a_Lod">迪米特法则[LoD: Law of Demeter，最少知识原则: LKP: Least Knowledge Principle]</a>
9. <a href="#a_creational">#创建型模式[Creational Patterns]#</a>
10. <a href="#a_simple">简单工厂模式[Simple Factory Pattern]</a>
11. <a href="#a_signleton">单例模式[Signleton Pattern]</a>
12. <a href="#a_factory">工厂模式[Factory Pattern]</a>
13. <a href="#a_abstract">抽象工厂模式[Abstract Factory Pattern]</a>
14. <a href="#a_builder">建造者模式[Builder Pattern]</a>
15. <a href="#a_prototype">原型模式[Prototype Pattern]</a>
16. <a href="#a_structural">#结构型模式[Structural Patterns]#</a>
17. <a href="#a_facade">外观模式[Facade Pattern]</a>
18. <a href="#a_adapter">适配器模式[Adapter Pattern]</a>
19. <a href="#a_proxy">代理模式[Proxy Pattern]</a>
20. <a href="#a_composite">组合模式[Composite Pattern]</a>
21. <a href="#a_decorator">装饰模式[Decorator Pattern]</a>
22. <a href="#a_flyweight">享元模式[Flyweight Pattern]</a>
23. <a href="#a_bridge">桥接模式[Bridge Pattern]</a>
24. <a href="#a_filter">过滤器模式[Filter Pattern]</a>
25. <a href="#a_behavioral">#行为型模式[Behavioral Patterns]#</a>
26. <a href="#a_mediator">中介者模式[Mediator Pattern]</a>
27. <a href="#a_observer">观察者模式[Observer Pattern]</a>
28. <a href="#a_command">命令模式[Command Pattern]</a>
29. <a href="#a_iterator">迭代器模式[Iterator Pattern]</a>
30. <a href="#a_template">模板模式[Template Pattern]</a>
31. <a href="#a_strategy">策略模式[Strategy Pattern]</a>
32. <a href="#a_state">状态模式[State Pattern]</a>
33. <a href="#a_memento">备忘录模式[Memento Pattern]</a>
34. <a href="#a_interpreter">解释器模式[Interpreter Pattern]</a>
35. <a href="#a_responsibility">职责链模式[Chain of Responsibility Pattern]</a>
36. <a href="#a_visitor">访问者模式[Visitor Pattern]</a>
37.	<a href="#a_object">空对象模式[Null Object Pattern]</a>
38. <a href="#a_j2ee">#J2EE设计模式#</a>
39. <a href="#a_mvc">MVC 模式[MVC Pattern]</a>
40. <a href="#a_business">业务代表模式[Business Delegate Pattern]</a>
41. <a href="#a_entity">组合实体模式[Composite Entity Pattern]</a>
42. <a href="#a_data">数据访问对象模式[Data Access Object Pattern]</a>
43. <a href="#a_front">前端控制器模式[Front Controller Pattern]</a>
44. <a href="#a_intercepting">拦截过滤器模式[Intercepting Filter Pattern]</a>
45. <a href="#a_service">服务定位器模式[Service Locator Pattern]</a>
46. <a href="#a_transfer">传输对象模式[Transfer Object Pattern]</a>
47. <a href="#a_summary">模式相关总结</a>
97. <a href="#a_xmind">思维导图</a>
98. <a href="#a_ea">EA模型</a>
99. <a href="#a_down">down</a>


## <a id="a_design">设计原则</a> <a href="#a_catalogue">目录</a> <a href="#a_creational">设计模式</a>
### <a id="a_SOLID">一、面向对象设计原则: SOLID</a> <a href="#a_catalogue">last</a> <a href="#a_SRP">next</a>
1.1、[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P0_SOLID.xmind)<br/>

1.2、面对对象编程[Object Oriented Programming，OOP，面向对象程序设计]: 
```
万物皆对象。
本质：以建立模型体现出来的抽象思维过程和面向对象的方法。
```

1.3、产生原因: 
```
Q: 在OOP设计过程中，将万物抽象成对象。那么这么多对象怎么去有效的管理？怎么样去重复利用？
怎么去科学合理的组合使其能够融为一体并且可以顺利的工作？这是在面向对象设计中着重需要考虑的问题！

A: 面向对象设计原则由此而来，其规范了设计一个对象因遵守的一些约束和规则，合理的运用这些原则去设计每一个对象，
那么设计的对象才符合一个对象应该具有的样子，那么将这些对象按照面向对象设计的原则组装得到的系统才能顺利运行，易于维护，易于扩展
```
1.4、设计原则: 
```
面向对象有诸多的设计原则，但是通常提到的设计原则是其中最重要的五个设计原则，
也是公认的面向对象设计的五大原则，也是通常所说的“S.O.L.I.D ”: 
	1、单一职责原则告诉实现类要职责单一
	2、里氏替换原则告诉不要破坏继承关系
	3、依赖倒置原则告诉要面向接口编程
	4、接口隔离原则告诉在设计接口的时候要精简单一
	5、开闭原则告诉要对扩展开发，对修改关闭
	6、迪米特法则告诉要降低耦合
```

---
### <a id="a_SRP">二、单一职责原则[SRP: Single Responsibility Principle]</a> <a href="#a_SOLID">last</a> <a href="#a_OCP">next</a>
[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P1_SRP.xmind)<br/>
一、定义: 单一职责原则（SRP: Single responsibility principle，单一功能原则]: 
```
定义: 规定一个类应该只有一个发生变化的原因。或者说一个类只负责一个功能领域中的相应职责。
```

二、由来: 
```
该原则由罗伯特·C·马丁（Robert C. Martin）于《敏捷软件开发: 原则、模式和实践》一书中给出的。
马丁表示此原则是基于汤姆·狄马克(Tom DeMarco)和Meilir Page-Jones的著作中的内聚性原则发展出的。所谓职责是指类变化的原因。
如果一个类有多于一个的动机被改变，那么这个类就具有多于一个的职责。而单一职责原则就是指一个类或者模块应该有且只有一个改变的原因。

产生原因: 程序设计人员都清楚高内聚低耦合的重要性，但是很多耦合常常发生在不经意之间，
其原因就是职责扩散: 因为某种原因，某一职责被分化为颗粒度更细的多个职责了。
解决办法: 遵守单一职责原则，将不同的职责封装到不同的类或方法中。
```

三、描述: 
```
1、一个类，只有一个引起它变化的原因。应该只有一个职责。
2、每一个职责都是变化的一个轴线，如果一个类有一个以上的职责，这些职责就耦合在了一起。这会导致脆弱的设计。
3、当一个职责发生变化时，可能会影响其它的职责。另外，多个职责耦合在一起，会影响复用性，提高修改导致的风险。
```

四、原理: 
```
1、如果一个类承担的职责过多，就等于把这些职责耦合在一起了。一个职责的变化可能会削弱或者抑制这个类完成其他职责的能力。
2、这种耦合会导致脆弱的设计，当发生变化时，设计会遭受到意想不到的破坏。而如果想要避免这种现象的发生，就要尽可能的遵守单一职责原则。
3、此原则的核心就是解耦和增强内聚性。
```

五、优点: 
```
1、降低类的复杂度，遵循单一职责原则的类其逻辑和职责都是单一的。
2、降低由修改导致的风险，也会降低对其它的职责的产生的影响。
3、提高代码的可读性，提高系统的可维护性。
```

六、缺点: 
```
1、类的数量会明显提高。
2、方法调用链的长度、顺序、复杂度会随着的类数量的提高而增加。
```

七、开发经验: 
```
1、使用单一职责原则不是放弃类之间所有的耦合: 如果一个项目的所有职责都独立的话，
则项目就无法继续进行，其类的数量则会非常多，而且维护的复杂度也会变高。

2、鉴别职责: 每一个系统中的功能都表示了一个职责，这些职责可以映射到软件模块（类）中，
且应该尽可能的保证这些模块之间没有功能上的重复。设计中每次应只关注一个职责。
但这并不是说讲其他的职责都抛之脑后，而是说当决定用某个模块来实现某个职责之后，只需全神贯注与该职责就可以了。
从这个模块的角度出发，其他的职责都是不相关的。

3、信息隐藏: 模块（类）拥有自己公开的接口，可以和其他模块通信，同时模块也包含大量内部信息供自身使用。
模块中只有接口暴露出的成员才能供其他模块使用。内部数据不是被彻底隐藏，就应是被筛选后才能暴露给外部。
这样，每个模块仍可以使用固定的接口来通信，而同时不会受到修改具体实现的影响。

4、持久化: 将持久、稳定的数据功能和频频变化的业务规则分离。这样持久化的方式就不会因业务层的变化而频繁变化了。
最常见应用此思想的就是三层架构和MVC架构。
```

八、适用场景: 
```
如果能够想到多个动作去改变一个类，那么这个类就具有不止一个的职责，就应该发现类的职责并把那些职责相互分离。
```

九、相关知识: 
```
1、单一职责原则并不是一个孤立的面向对象设计原则，它是面向对象设计五个基本原则（SOLID）之一。
2、这些原则是: 单一职责原则、开闭原则、接口隔离原则、里氏替换原则和依赖倒置原则。
3、这些原则被一起应用时可以使一个软件系统更易被维护和扩展。
4、这些原则被典型的应用在测试驱动开发上，并且是敏捷开发以及自适应软件开发等指导思想的重要组成部
```

---
### <a id="a_OCP">三、开闭原则[OCP: Open Closed Principle]</a> <a href="#a_SRP">last</a> <a href="#a_LSP">next</a>
[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P2_OCP.xmind)<br/>
一、定义: 开闭原则[OCP: Open Closed Principle]: 
```
定义: 对于扩展是开放的（Open for extension），对于修改是关闭的（Closed for modification），意味着模块的行为是可以扩展的。
```

二、由来: 
```
1988年，Bertrand Meyer在他的著作《Object Oriented Software Construction》中提出了开闭原则，
它的原文是这样: “Software entities should be open for extension,but closed for modification”。
翻译过来就是: “软件实体应当对扩展开放，对修改关闭”。

OCP是面向对象设计中“可复用设计”的基石，是面向对象设计中最重要的原则之一，其它很多的设计原则都是实现开闭原则的一种手段。
```

三、描述: 
```
遵循开闭原则设计出的模块具有两个主要特征: 
1、对于扩展是开放的（Open for extension）。这意味着模块的行为是可以扩展的。
当应用的需求改变时，可以对模块进行扩展，使其具有满足那些改变的新行为。也就是说，可以改变模块的功能。

2、对于修改是关闭的（Closed for modification）。对模块行为进行扩展时，不必改动模块的源代码或者二进制代码。
模块的二进制可执行版本，无论是可链接的库、DLL或者.EXE文件，都无需改动。
```

四、原理: 
```
实现开闭原则的关键就在于“抽象”。
1、把系统的所有可能的行为抽象成一个抽象底层，这个抽象底层规定出所有的具体实现必须提供的方法的特征。
作为系统设计的抽象层，要预见所有可能的扩展，从而使得在任何扩展情况下，系统的抽象底层不需修改；
同时，由于可以从抽象底层导出一个或多个新的具体实现，可以改变系统的行为，因此系统设计对扩展是开放的。

2、在软件开发的过程中，一直都是提倡需求导向的。这就要求在设计的时候，要非常清楚地了解用户需求，
判断需求中包含的可能的变化，从而明确在什么情况下使用开闭原则。

3、关于系统可变的部分，还有一个更具体的对可变性封装原则（Principle of Encapsulation of Variation, EVP），
它从软件工程实现的角度对开闭原则进行了进一步的解释。
EVP要求在做系统设计的时候，对系统所有可能发生变化的部分进行评估和分类，每一个可变的因素都单独进行封装。

4、在实际开发过程的设计开始阶段，就要罗列出来系统所有可能的行为，并把这些行为加入到抽象底层，根本就是不可能的，
这么去做也是不经济的。因此应该现实的接受修改拥抱变化，使的代码可以对扩展开放，对修改关闭
```

五、优点: 
```
如果一个软件系统符合开闭原则的，那么从软件工程的角度来看，它至少具有这样的好处: 
1、可复用性好: 可以在软件完成以后，仍然可以对软件进行扩展，加入新的功能，非常灵活。
因此，这个软件系统就可以通过不断地增加新的组件，来满足不断变化的需求。

2、可维护性好: 由于对于已有的软件系统的组件，特别是它的抽象底层不去修改，
因此，不用担心软件系统中原有组件的稳定性，这就使变化中的软件系统有一定的稳定性和延续性。
```

六、缺点: 
```
1、开闭原则具有理想主义的色彩，它是面向对象设计的终极目标。
2、无论模块是多么封闭，都会存在一些无法对之封闭的变化。
```

七、开发经验: 
```
1、无论模块是多么封闭，都会存在一些无法对之封闭的变化。既然不可能完全封闭，
设计人员必须对于他设计的模块应该对那种变化封闭做出选择。必须先猜测出最有可能发生的变化种类，然后构造抽象来隔离那些变化。

2、面对需求，对程序的改动是通过增加新代码进行的，而不是更改现有的代码。这就是开闭原则的精神所在。

3、查明可能发生的变化所等待的时间越长，要创建正确的抽象就越困难。
```

八、相关知识: 
```
1、开闭原则具有理想主义的色彩，它是面向对象设计的终极目标: 因此，针对开闭原则的实现方法，
一直都有面向对象设计的大师费尽心机，研究开闭原则的实现方式。
后面要提到的里氏替换原则（LSP）、依赖倒转原则（DIP）、接口隔离原则（ISP）以及抽象类（Abstract Class）、接口(Interface)等等，
都可以看作是开闭原则的实现方法。

2、梅耶原则: 
勃兰特·梅耶一般被认为一旦完成，一个类的实现只应该因错误而修改，新的或者改变的特性应该通过新建不同的类实现。
新建的类可以通过继承的方式来重用原类的代码。衍生的子类可以或不可以拥有和原类相同的接口。
梅耶的定义提倡实现继承。具体实现可以通过继承方式来重用，但是接口规格不必如此。已存在的实现对于修改是封闭的，但是新的实现不必实现原有的接口。

3、多态原则: 
在20世纪90年代，开闭原则被广泛的重新定义由于抽象化接口的使用，在这中间实现可以被改变，多种实现可以被创建，并且多态化的替换不同的实现。
相比梅耶的使用方式，多态开闭原则的定义倡导对抽象基类的继承。接口规约可以通过继承来重用，但是实现不必重用。
已存在的接口对于修改是封闭的，并且新的实现必须实现那个接口。
```

---
### <a id="a_LSP">四、里氏替换原则[LSP: Liskov Substitution Principle]</a> <a href="#a_OCP">last</a> <a href="#a_ISP">next</a>
[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P3_LSP.xmind)<br/>
一、定义: 里氏替换原则[LSP: Liskov Substitution Principle]: 
```
定义: 继承必须确保超类所拥有的性质在子类中仍然成立。或者说任何超类可以出现的地方，子类一定可以出现。
```

二、由来: 
```
Liskov于1987年提出了一个关于继承的原则
Inheritance should ensure that any property proved about supertype objects also holds for subtype objects.

继承必须确保超类所拥有的性质在子类中仍然成立。”也就是说，当一个子类的实例应该能够替换任何其超类的实例时，它们之间才具有is-A关系
```

三、描述: 
```
1、OOP描述的是一个对象是一组状态和一系列行为的组合体。状态是对象的内在特性，行为是对象的外在特性。
2、LSP所表述的就是在同一个继承体系中的对象应该有共同的行为特征。
```

四、原理: 
```
1、子类必须完全实现父类的方法: 如果子类不能完整地实现父类的方法，或者父类的一些方法在子类中已经发生畸变，
则建议断开继承关系，采用依赖，聚集，组合等关系代替继承

2、子类可以有自己的个性: 子类当然可以有自己的行为和外观，也就是方法和属性。
但是里氏替换原则可以正着用，但是不能反着用。在子类出现的地方，父类未必就可以胜任

3、覆盖或实现父类的方法时输入参数可以被放大: 子类中方法的前置条件（即方法的形参）必须与超类中被覆写的方法的前置条件相同或更宽松

4、覆盖或实现父类的方法时输出结果可以被缩小: 父类的一个方法的返回值是一个类型T，子类的相同方法的返回值为S，
那么里氏替换原则就要求S必须小于等于T，当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格
```

五、继承优点: 
```
1、代码共享，减少创建类的工作量，每个子类都拥有父类的方法和属性
2、提高代码的重用性
3、子类可以形似父类，但是又异于父类。
4、提高代码的可扩展性，实现父类的方法就可以了。许多开源框架的扩展接口都是通过继承父类来完成。
5、提高产品或项目的开放性
```

六、继承缺点: 
```
1、继承是侵入性的，只要继承，就必须拥有父类的所有方法和属性
2、降低了代码的灵活性，子类必须拥有父类的属性和方法，让子类有了一些约束
3、增加了耦合性，当父类的常量，变量和方法被修改了，需要考虑子类的修改，这种修改可能带来非常糟糕的结果，要重构大量的代码
```

七、开发经验: 
```
在项目中，采用里氏替换原则时，尽量避免子类的“个性”，一旦子类有了“个性”，这个子类和父类之间的关系就难调和，
把子类当做父类使用，子类的“个性”被抺杀了，把子类单独作为一个业务来使用，则会让代码间的耦合关系变得扑朔迷离，缺乏类替换的标准
```

八、适用场景: 
```
LSP的主要作用就是规范继承时子类的一些书写规则。其主要目的就是保持父类方法不被覆盖
```

九、相关知识: 
```
1、LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，
而衍生类也能够在基类的基础上增加新的行为。

9.2、对于一个不符合常理的例子: 正方形不是一个长方形。LSP并没有提供解决这个问题的方案，而只是提出了这么一个问题。
于是，工程师们开始关注如何确保对象的行为。1988年，B. Meyer提出了Design by Contract（契约式设计）理论。
DbC从形式化方法中借鉴了一套确保对象行为和自身状态的方法，其基本概念很简单: 
	1、Pre-condition: 每个方法调用之前，该方法应该校验传入参数的正确性，只有正确才能执行该方法，否则认为调用方违反契约，不予执行。
		这称为前置条件(Pre-condition)。
	2、Post-Condition: 一旦通过前置条件的校验，方法必须执行，并且必须确保执行结果符合契约，这称之为后置条件(Post-condition)。
	3、Invariant: 对象本身有一套对自身状态进行校验的检查条件，以确保该对象的本质不发生改变，这称之为不变式(Invariant)。
以上是单个对象的约束条件。为了满足LSP，当存在继承关系时，子类中方法的前置条件必须与超类中被覆盖的方法的前置条件相同或者更宽松；
而子类中方法的后置条件必须与超类中被覆盖的方法的后置条件相同或者更为严格
```

---
### <a id="a_ISP">五、接口隔离原则[ISP: Interface Segregation Principle]</a> <a href="#a_LSP">last</a> <a href="#a_DIP">next</a>
[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P4_ISP.xmind)<br/>

一、定义: 接口隔离原则[ISP: Interface Segregation Principle]: 
```
定义: 客户端不应该依赖它不需要的接口；一个类对另一个类的依赖应该建立在最小的接口上。或者说使用多个专口的接口，而不使用单一的总接口
```

三、描述: 
```
接口隔离有两种定义: 
1、 客户端不应该依赖它不需要的接口: 那依赖什么呢？依赖它需要的接口，客户端需要什么接口就提供什么接口，
把不需要的接口剔除，那就需要对接口进行细化，保证其纯洁性。

2、类间的依赖关系应该建立在最小的接口上: 它要求是最小的接口，也是要求接口细化，接口纯洁。

建立单一接口，不要建立臃肿庞大的接口。再通俗的说就是接口尽量细化，同时接口中的方法尽量少。
接口分为两类: 
	1、实例接口(Object Interface): 在java中声明一个类，类也是一种接口。
	2、类接口(Class Interface): java中经常使用Interface来定义
```

四、原理: 
```
1、保证接口的纯洁性: 接口隔离原则是对接口进行规范约束

2、接口要尽量小: 这是接口隔离原则的核心定义，接口要尽量小，不要出现臃肿的接口，但是小也是有限度的，不能违背单一职责原则。

3、接口要高内聚: 高内聚就是提高接口，类，模块的处理能力，减少对外的交互。
具体到接口隔离原则就是要求在接口中尽量减少公布public方法，接口是对外的承诺，承诺越少对系统开发越有利，变更的风险就越少。

4、接口设计是有限度的: 接口的设计粒度越小，系统越灵活。但是灵活的同时也带来了结构复杂，开发难度大，可维护性降低。所以接口设计是注意度。
```

五、优点: 
```
1、降低耦合性，提高内聚性。
2、提高代码的可读性，保证接口的纯洁性。
3、隐藏实现细节，减少变更的风险。
```

六、缺点: 
```
1、类的数量和方法数量会明显增加。
2、方法调用链的长度、顺序、复杂度会随着的接口隔离的程度的增加而增加。
```

七、开发经验: 
```
1、一个接口只服务于一个子模块或业务逻辑
2、通过业务逻辑压缩接口中的public方法，接口要不断的精简，以达到接口不断完善
3、已经被污染的接口，尽量去修改，若变更的风险较大，则采用适配器进行转化处理

4、在使用接口时要注意控制接口的粒度，接口定义的粒度不能太细，也不能太粗。
接口粒度太细，系统中就会出现接口泛滥，接口和实现类急剧膨胀，反而不易维护；
接口粒度太粗，就会违背ISP，系统的灵活性就会降低，不易维护和扩展。
```

八、适用场景: 
```
接口隔离原则是对接口的定义，同时也是对类的定义，接口和类尽量使用原子接口或原子类来组装。
```

九、相关知识: 
```
1、接口隔离原则与单一职责原则区别: 
接口隔离原则与单一职责原则的审视角度不相同。
单一职责原则要求是类和接口的职责单一，注重的昌职责，这是业务逻辑上的划分。
接口隔离原则要求接口的方法尽量少。

9.2、从接口隔离原则的定义可以看出，他似乎跟SRP有许多相似之处。 
是的其实ISP和SRP都是强调职责的单一性， 接口隔离原则告诉在定义接口的时候要根据职责定义“较小”的接口，
不要定义“高大全”的接口。

也就是说接口要尽可能的职责单一，这样更容易复用，暴露给客户端的方法更具有“针对性”， 比如定义一个接口包括一堆访问数据库的方法， 有
包括一堆访问网络的方法，还包括一些权限认证的方法。 把一些不相及的方法封装到一个接口里面，显然是不合适的， 
如果客户程序只想用到数据访问的一些功能，但是调用接口的时候你把访问网络的方法和权限认证的方法暴露给客户，
这使得客户程序感到“疑惑”，那么这个接口就不ISP，它很显然的构成了接口污染
```

---
### <a id="a_DIP">六、依赖倒置原则[DIP: Dependence Inversion Principle]</a> <a href="#a_ISP">last</a> <a href="#a_Lod">next</a>
[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P5_DIP.xmind)<br/>

一、定义: 依赖倒转原则[DIP: Dependence Inversion Principle，依赖倒置原则]: 
```
定义: 抽象不应该依赖于细节，细节应该依赖于抽象
```

三、描述: 
```
1、高层模块不应该依赖低层模块，两者都应该依赖抽象
2、抽象不应该依赖细节
3、细节应该依赖抽象
依赖倒置原则在java语言中，表现是: 
1、模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或抽象类产生的。
2、接口或抽象类不依赖实现类
3、实现类依赖接口或抽象类
更加精简的定义就是“面向接口编程”—OOD(Object-Oriented Design，面向对象设计)的精髓之一
```

四、原理: 
```
依赖倒置原则的本质就是通过抽象(接口或抽象类)使各个类或模块的实现彼此独立，不互相影响，实现模块间的松耦合。
在项目中使用这个原则要遵循下面的规则: 
1、每个类尽量都有接口或者抽象类，或者抽象类和接口两都具备
2、变量的表面类型尽量是接口或者抽象类
3、任何类都不应该从具体类派生
4、尽量不要覆写基类的方法
5、如果基类是一个抽象类，而这个方法已经实现了，子类尽量不要覆写。类间依赖的是抽象，覆写了抽象方法，对依赖的稳定性会有一定的影响。
```

五、优点: 
```
采用依赖倒置原则可以减少类间的耦合性，提高系统的稳定，降低并行开发引起的风险，提高代码的可读性和可维护性。
```

六、缺点: 
```
依赖倒置原则是六个设计原则中最难以实现的原则，它是实现开闭原则的重要方法
```

七、开发经验: 
```
依赖的三种方法
依赖是可以传递，A对象依赖B对象，B又依赖C，C又依赖D，……，依赖不止。只要做到抽象依赖，即使是多层的依赖传递也无所谓惧。
对象的依赖关系有三种方式来传递: 
构造函数传递依赖对象: 在类中通过构造函数声明依赖对象，按照依赖注入的说法，这种方式叫做构造函数注入
Setter方法传递依赖对象: 在类中通过Setter方法声明依赖关系，依照依赖注入的说法，这是Setter依赖注入
接口声明依赖: 在接口的方法中声明依赖对象，在为什么要符合依赖倒置原则的例子中，采用了接口声明依赖的方式，该方法也叫做接口注入
```

八、适用场景: 
```
1、依赖倒置原则是六个设计原则中最难以实现的原则，它是实现开闭原则的重要方法，
在项目中，只要记住是”面向接口编程”就基本上是抓住了依赖倒置原则的核心了

2、结合里氏替换原则使用
里氏替换原则: 父类出现的地方子类就能出现。
通俗的规则: 接口负责定义public属性和方法，并且声明与其他对象的依赖关系。抽象类负责公共构造部分的实现，
实现类准确的实现业务逻辑，同时在适当的时候对父类进行细化
```

九、相关知识: 
```
每一个逻辑的实现都是由颗粒原子逻辑组成的，颗粒原子逻辑就是低层模块，而颗粒原子逻辑组成的模块就是高层模块。
在java语言中，抽象就是接口或抽象类，两都都是不能直接被实例化的，细节就是实现类，
实现接口或继承抽象类而产生的类就是细节，两者都可以直接被实例化
```

---
### <a id="a_Lod">七、迪米特法则[LoD: Law of Demeter，最少知识原则: LKP: Least Knowledge Principle]</a> <a href="#a_DIP">last</a> <a href="#a_simple">next</a>
[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P6_LoD.xmind)

一、定义: 
```
定义: 就是说一个对象应当对其他对象有尽可能少的了解,不和陌生人说话

对于面向OOD来说，又被解释为下面几种方式:  
1、一个软件实体应当尽可能少的与其他实体发生相互作用。
2、每一个软件单位对其他的单位都只有最少的知识，而且局限于那些与本单位密切相关的软件单位
```

二、由来:  
```
1987年秋天由美国Northeastern University的Ian Holland提出，被UML的创始者之一Booch等普及。
后来，因为在经典著作《 The Pragmatic Programmer》而广为人知。 　　
值得一提的是，虽然Ian Holland对计算机科学的贡献也仅限于这一条法则，其他方面的建树不多，
但是，这一法则却不仅仅局限于计算机领域，在其他领域也同样适用。比如，美国人就在航天系统的设计中采用这一法则
```

三、描述:  
```
1、迪米特法则可以简单说成: talk only to your immediate friends。 

2、对于OOD来说，又被解释为下面几种方式: 一个软件实体应当尽可能少的与其他实体发生相互作用。
每一个软件单位对其他的单位都只有最少的知识，而且局限于那些与本单位密切相关的软件单位。

3、迪米特法则的初衷（或根本思想）在于降低类之间的耦合。由于每个类尽量减少对其他类的依赖，
因此，很容易使得系统的功能模块功能独立，相互之间不存在（或很少有）依赖关系。
迪米特法则不希望类之间建立直接的联系。如果真的有需要建立联系，也希望能通过它的友元类来转达。
因此，应用迪米特法则有可能造成的一个后果就是: 
系统中存在大量的中介类，这些类之所以存在完全是为了传递类之间的相互调用关系——这在一定程度上增加了系统的复杂度。
```

四、原理:  
```
狭义的迪米特法则: 
如果两个类不必彼此直接通信，那么这两个类就不应当发生直接的相互作用。
如果其中的一个类需要调用另一个类的某一个方法的话，可以通过第三者转发这个调用，朋友圈的确定: “朋友”条件: 
1、当前对象本身（this）。
2、以参量形式传入到当前对象方法中的对象。
3、当前对象的实例变量直接引用的对象。
4、当前对象的实例变量如果是一个聚集，那么聚集中的元素也都是朋友。5、当前对象所创建的对象
任何一个对象，如果满足上面的条件之一，就是当前对象的“朋友”；否则就是“陌生人”。
```

五、优点: 
```
降低类之间的耦合。减少类之间的依赖。
```

六、缺点: 
```
狭义的迪米特法则的缺点: 
1、在系统里造出大量的小方法，这些方法仅仅是传递间接的调用，与系统的商务逻辑无关。
2、遵循类之间的迪米特法则会是一个系统的局部设计简化，因为每一个局部都不会和远距离的对象有直接的关联。
但是，这也会造成系统的不同模块之间的通信效率降低，也会使系统的不同模块之间不容易协调
```

七、开发经验:  
```
广义的迪米特法则在类的设计上的体现: 
1、优先考虑将一个类设置成不变类。2、尽量降低一个类的访问权限。3、谨慎使用Serializable。4、尽量降低成员的访问权限
```

八、适用场景: 
```
设计模式中: 外观模式[Facade]、调停者模式[Mediator]实际上就是迪米特法则的应用
```

## [设计模式[Design Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode)
## <a id="a_creational">创建型模式[Creational Patterns]</a> <a href="#a_design">设计原则</a> <a href="#a_structural">结构型模式</a>
### <a id="a_simple">八、简单工厂模式[Simple Factory Pattern]</a> <a href="#a_Lod">last</a> <a href="#a_signleton">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M1_SimpleFactoryPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M1_SimpleFactoryPattern.png)<br/>

一、定义、本质: 
```
定义: 提供一个创建对象实例的功能，无需关心其具体的实现。被创建时间的类型可以是接口、抽象类，也可以是具体的类.
本质: 选择实现
```

二、结构和说明: 
```
API: 定义客户所需要的功能接口。简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。

Impl: 具体实现API的实现类，可能会有多个。简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例。

Factory: 工厂，选择合适的实现类来创建API接口对象。简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。
工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象

Client: 客户端，通过Factory去获取API接口对象，然后面向API接口编程。由一个工厂类根据传入的参数，
动态决定应该创建哪一个子类（这些子类继承自一个父类或接口）的实例
```

三、理解: 
```
PS：简单工厂模式是属于创建型模式，又叫做静态工厂方法（Static Factory Method）模式，但不属于23种GOF设计模式之一

1、简单工厂的功能: 可用来创建的接口、抽象类或者是普通类的实例，
2、静态工厂: 	通常把简单工厂类实现成一个工具类，直接使用静态方法，也就是说简单工厂的方法通常都是静态的，所以也称为静态工厂
3、万能工厂: 一个简单工厂理论上可以用来构造任何对象，所以又称之为万能工厂
4、简单工厂创建对象的范围: 建议控制在一个独立的组建级别或者一个模块级别
5、简单工厂模式是工厂模式家族中最简单实用的模式，可以理解为是不同工厂模式的一个特殊实现
```

四、写法: 
```
简单工厂方法的内部主要实现的功能是“选择合适的实现类”来创建实例对象
PS: 客户端在调用工厂的时候，传入选择的参数，这就说明客户端必须知道每个参数的含义，也需要理解参数对应的功能处理，
这就要求在一定程度上，想客户端暴露一定的内部实现细节

可配置的简单工厂: 使用反射和配置文件，来实现添加新的实现类后，无需修改代码就可以把新的实现类加入到应用中
```

五、优点: 
```
帮助封装、解耦
1、工厂类是整个模式的关键.包含了必要的逻辑判断,根据外界给定的信息,决定究竟应该创建哪个具体类的对象.
2、通过使用工厂类,外界可以从直接创建具体产品对象的尴尬局面摆脱出来,仅仅需要负责“消费”对象就可以了。而不必管这些对象究竟如何创建及如何组织的．
3、明确了各自的职责和权利，有利于整个软件体系结构的优化。
```

六、缺点: 
```
一定程度上暴露了实现细节、增加客户端的复杂度、不方便扩展子工厂
1、由于工厂类集中了所有实例的创建逻辑，违反了高内聚责任分配原则，将全部创建逻辑集中到了一个工厂类中；
它所能创建的类只能是事先考虑到的，如果需要添加新的类，则就需要改变工厂类了。

2、当系统中的具体产品类不断增多时候，可能会出现要求工厂类根据不同条件创建不同实例的需求．
这种对条件的判断和对具体产品类型的判断交错在一起，很难避免模块功能的蔓延，对系统的维护和扩展非常不利；

3、简单工厂模式的扩展是违背了开闭原则[OCP: Open Closed Principle]的

PS、这些缺点在工厂方法模式中得到了一定的克服
```

七、使用场景: 
```
1、工厂类负责创建的对象比较少；
2、客户只知道传入工厂类的参数，对于如何创建对象（逻辑）不关心；
3、由于简单工厂很容易违反高内聚责任分配原则，因此一般只在很简单的情况下应用。
```

Client.java: 
```Java
package com.mutistic.creational.simplefactory.structure;
// Client客户端 
public class Client {
	public static void main(String[] args) {
		Factory.createrAPI(1);
		Factory.createrAPI(2);
	}
}
```
Factory.java: 
```Java
package com.mutistic.creational.simplefactory.structure;
// 简单工厂模式核心类，工厂类
// 负责实现创建所有实例的内部逻辑
public class Factory {
	/**
	 * 根据条件创建所需的产品对象 
	 * @param condition 条件
	 * @return 具体API的实例
	 */
	public static API createrAPI(int condition) {
		switch (condition) {
		case 1:
			return new ImplA();
		case 2:
			return new ImplB();
		default:
			return null;
		}
	}
}
```
API.java: 
```Java
package com.mutistic.creational.simplefactory.structure;
// API-简单工厂模式所创建的所有对象的父类或接口
public abstract class API {
	// 定义所有具体实例所共有的公共接口
	public abstract void operation();
}
```
ImplA.java: 
```Java
package com.mutistic.creational.simplefactory.structure;
import com.mutistic.utils.PrintUtil;
// 具体实现API的实现类
// 是简单工厂模式的创建目标
public class ImplA extends API {
	// 具体实现方法
	@Override
	public void operation() {
		PrintUtil.printTwo("ImplA", "具体实现API的实现类，可能会有多个。简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例");
	}
}
```
ImplB.java: 
```Java
package com.mutistic.creational.simplefactory.structure;
import com.mutistic.utils.PrintUtil;
// 具体实现API的实现类
// 是简单工厂模式的创建目标
public class ImplB extends API {
	// 具体实现方法
	@Override
	public void operation() {
		PrintUtil.printTwo("ImplB", "具体实现API的实现类，可能会有多个。简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例");
	}
}
```

---
### <a id="a_signleton">九、单例模式[Signleton Pattern]</a> <a href="#a_simple">last</a> <a href="#a_factory">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M2_SignletonPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M2_SignletonPattern.png)<br/>

一、定义、本质: 
```
定义: 保证一个类仅有一个实例，并提供一个访问该类的全局访问接口。
本质: 控制实例的数目
```

二、结构和说明: 
```
Singleton: 负责创建Singleton类自己的唯一实例，并提供一个getInstance方法，让外部来访问这个类的唯一实例。
```

三、理解: 
```
主要解决: 一个全局使用的类频繁地创建与销毁。
如何解决: 判断系统是否已经有这个单例，如果有则返回，如果没有则创建。

1、单例模式的功能: 保证这个类在运行期间自会被创建一个类实例，并提供一个全局唯一访问这个类实例的访问点。
2、单例模式的范围: 是一个ClassLoader（类转载）及其子ClassLoader的范围（也可以认为是一个jvm的范围）
3、单例模式-懒汉式: 体现了延迟加载思想: 一开始不要加载资源或者数据，当是要到这个资源或者数据才进行加载，
	也称Lazy Load，其目的是为了尽可能的节约资源
4、单例模式-懒汉式: 提现了缓存的实现: 也就是说某些资源或者数据被频繁的使用，可以吧这些数据缓存到内存里面，
	当操作时，先从内从查找，如果存在就直接使用，如果不存在就先创建，然后设置到缓存中。
	下一次访问可以直接从内存中获取。缓存是一种空间换时间的方案。
```

四、写法: 
```
1、单例模式-懒汉式: 以时间换空间的方案，使用延迟加载和缓存的思想。

2、单例模式-饿汉式: 以空间换时间的方案，使用JVM装载实现。
2.1、饿汉式还可以在Java中通过 Lazy initialization holder class模式来实现。
2.2、饿汉式还可以使用单元素枚举的方式来实现

3、保证懒汉式的线程安全;
3.1、在getInstance方法上添加同步锁synchronized，但是效率稍低
3.2、使用双重检查枷锁的机制: 具体是指: 
	并不是每次进入getInstance方法都需要同步，而是先进入方法，检查实例是否存在，如果不存在才进入下面的同步代码块、这是第一重检查。
	进入同步块后，再次检查视力是否存在，如果不存在就在同步的情况下创建一个实例，这第二重检查。
	双重检查枷锁机制的实现会使用volatile: 被volatile修饰的变量的值，将不会被本地线程缓存，
	所有对该变量的读写都是直接操作共享内存，从而确保多线程能正确处理该变量。
	
	private static volatile SignletonByVolatile uniqueIntance = null;
	
	public static SignletonByVolatile getIntance() {
		if(uniqueIntance == null) {
			synchronized (SignletonByVolatile.class) {
				if(uniqueIntance == null) {
					uniqueIntance = new SignletonByVolatile();
				}
			}
		}
		return uniqueIntance;
	}

3.3、在Java中通过 Lazy initialization holder class模式: 
	该模式综合使用了Java的类级内部类和多线程默认同步锁的方法，实现了延迟加载和线程安全

	private static class SignletonHolder {
		public final static SignletonByLazzClass uniqueIntance = new SignletonByLazzClass();
	}
	
	public static SignletonByLazzClass getIntance() {
		return SignletonHolder.uniqueIntance;
	}

3.4、通过枚举的方式: 单元素的枚举类型已经成为实现Singleton的最佳方法: 
	public enum SignletonByEnum { uniqueIntance; }
```

五、优点: 
```
1、时间和空间: 懒汉式是典型的时间换空间的方案。饿汉式是典型的空间换时间的方案。
2、线程安全: 
2.1、不加同步锁synchronized的懒汉式是线程不安全的。
2.2、饿汉式是线程安全的，因为虚拟机JVM保证了自会装载一次。
```

六、缺点: 
```
1、不加同步锁synchronized的懒汉式是线程不安全的
```

七、使用场景: 
```
当需要控制一个类的实例只能有一个，而客户端只能从一个全局访问接口访问它时，可以选用单例模式，这些功能恰好是单例模式的问题。

具体场景: 
1、要求生产唯一序列号。
2、WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。 
3、创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等
```

八、注意事项: 
```
懒汉式的单例模式的getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 
防止多线程同时进入造成 instance 被多次实例化
```

Client.java: 
```Java
package com.mutistic.creational.signleton.structure;
import com.mutistic.utils.PrintUtil;
// Client客户端 
public class Client {
	public static void main(String[] args) {
		PrintUtil.printOne("演示单例模式[Signleton Pattern]: ");
		PrintUtil.printTwo("单例模式-饿汉式", SignletonByHungry.getIntance());
		PrintUtil.printTwo("单例模式-懒汉式（线程不安全）", Signleton.getIntance());
		PrintUtil.printTwo("单例模式-懒汉式（使用synchronized保证线程安全）", SignletonBySynchronized.getIntance());
		PrintUtil.printTwo("单例模式-懒汉式（通过双重检查枷锁的方式实现线程安全）", SignletonByVolatile.getIntance());
		PrintUtil.printTwo("单例模式-懒汉式（通过 Lazy initialization holder class模式）", SignletonByLazzClass.getIntance());
		PrintUtil.printTwo("单例模式-懒汉式（（通过单元素枚举））", SignletonByEnum.uniqueIntance);
	}
}
```
SignletonByHungry.java - 单例模式-饿汉式: 
```Java
package com.mutistic.creational.signleton.structure;
//  单例模式: 饿汉式
public class SignletonByHungry {
	// 1、声明 Signleton 成员变量- 直接创建好实例完成初始化
	private final static SignletonByHungry uniqueIntance = new SignletonByHungry();
	// 2、私有化 默认构造函数，不提供其他构造函数
	private SignletonByHungry () { }
	// 3、提供单例对象全局访问点-线程安全 
	public static SignletonByHungry getIntance() {
		return uniqueIntance;
	}
	// 其他业务功能 
	public void signletonOpeartion() { }
}

```
Signleton.java - 单例模式: 懒汉式（线程不安全）: 
```Java
package com.mutistic.creational.signleton.structure;
// 单例模式: 懒汉式（线程不安全）
public class Signleton {
	// 1、声明 Signleton 成员变量
	private static Signleton uniqueIntance = null;
	// 2、私有化 默认构造函数，不提供其他构造函数
	private Signleton () { }
	// 3、提供单例对象全局访问点-线程不安全 
	public static Signleton getIntance() {
		if(uniqueIntance == null) {
			uniqueIntance = new Signleton();
		}
		return uniqueIntance;
	}
	// 其他业务功能
	public void signletonOpeartion() { }
}

```
SignletonBySynchronized.java - 单例模式-懒汉式（使用synchronized保证线程安全）: 
```Java
package com.mutistic.creational.signleton.structure;
// 单例模式: 懒汉式（使用synchronized保证线程安全）
public class SignletonBySynchronized {
	// 1、声明 Signleton 成员变量
	private static SignletonBySynchronized uniqueIntance = null;
	// 2、私有化 默认构造函数，不提供其他构造函数
	private SignletonBySynchronized () { }
	
	// 3、提供单例对象全局访问点- 通过 synchronized对getIntance()方法添加同步锁保证线程安全
	public static synchronized SignletonBySynchronized getIntance() {
		if(uniqueIntance == null) {
			uniqueIntance = new SignletonBySynchronized();
		}
		return uniqueIntance;
	}
	
	// 其他业务功能
	public void signletonOpeartion() { }
}
```
SignletonByVolatile.java - 单例模式-懒汉式（通过双重检查枷锁的方式实现线程安全）: 
```Java
package com.mutistic.creational.signleton.structure;
// 单例模式: 懒汉式（通过双重检查枷锁的方式实现线程安全）
public class SignletonByVolatile {
	// 1、声明 Signleton 成员变量
	private static volatile SignletonByVolatile uniqueIntance = null;
	
	// 2、私有化 默认构造函数，不提供其他构造函数
	private SignletonByVolatile () { }
	
	// 3、提供单例对象全局访问点- 通过双重检查枷锁的方式实现线程安全
	public static SignletonByVolatile getIntance() {
		if(uniqueIntance == null) {
			synchronized (SignletonByVolatile.class) {
				if(uniqueIntance == null) {
					uniqueIntance = new SignletonByVolatile();
				}
			}
		}
		return uniqueIntance;
	}
	// 其他业务功能 
	public void signletonOpeartion() { }
}
```
SignletonByLazzClass.java - 单例模式-懒汉式（通过 Lazy initialization holder class模式）: 
```Java
package com.mutistic.creational.signleton.structure;
// 单例模式: 懒汉式（通过 Lazy initialization holder class模式）
public class SignletonByLazzClass {
	// 1、在私有内部类中SignletonHead 声明 Signleton 静态成员变量，且在调用时，完成初始化
	private static class SignletonHolder {
		public final static SignletonByLazzClass uniqueIntance = new SignletonByLazzClass();
	}
	
	//  2、私有化 默认构造函数，不提供其他构造函数
	private SignletonByLazzClass () { }
	// 3、提供单例对象全局访问点
	public static SignletonByLazzClass getIntance() {
		return SignletonHolder.uniqueIntance;
	}
	// 其他业务功能 
	public void signletonOpeartion() { }
}
```
SignletonByEnum.java - 单例模式-懒汉式（通过单元素枚举）: 
```Java
package com.mutistic.creational.signleton.structure;
// 单例模式: 懒汉式（通过单元素枚举）
public enum SignletonByEnum {
	// 1、声明 Signleton 单元素枚举，实现单例模式
	uniqueIntance;
	// 其他业务功能 
	public void signletonOpeartion() { }
}
```

---
### <a id="a_factory">十、工厂模式[Factory Pattern]</a> <a href="#a_signleton">last</a> <a href="#a_abstract">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M3_FactoryPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M3_FactoryPattern.png)<br/>

一、定义: 
```
定义: 定义一个用于创建对象的接口，让子类决定实例化哪一个类，Factory Method使一个类的实例化延迟到子类
本质: 延迟到子类来选择实现
原则：工厂模式体现了依赖倒置原则[DIP: Dependence Inversion Principle]
```

二、结构和说明: 
```
Product: 定义工厂方法所创建的对象的接口，也就是实际需要使用的对象的接口。

ConcreteProduce: 具体的Product接口的实现对象

Creator: 创建器，声明工厂的抽象方法

ConcreteCreator: 具体的创建对象，覆盖实现Creator定义的工厂方法，返回具体的Product实例
```

三、理解: 
```
主要解决: 主要解决接口选择的问题。
如何解决: 让其子类实现工厂接口，返回的也是一个抽象的产品。

1、工厂模式的功能：让父类在不知道具体实现的情况下，完成自身的功能调用，而具体的实现延迟到子类来实现
2、实现成抽象类：工厂方法的实现中，通常父类会死一个抽象类，里面包含创建所需对象的抽象方法，
	这些抽象方法就是工厂方法。

3、实现成具体类：可以把父类是县城一个具体的类，这种情况下，通常是在父类中提供获取所需要对象的默认实现方法，
	这样就算没有具体的子类，也能运行

4、工厂方法的实现中：可能需要参数，以便于决定选用哪一种具体的实现。（此时也简单工厂模式的核心是重合的）
	一般工厂方法返回的是被创建对象的接口对象，当然也可以是抽象类或者一个具体的类。

PS: 简单工厂模式的最大优点在于工厂类包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，
对于客户端来说，去除了与具体产品的依赖
```

四、写法: 
```
1、在工厂方法模式里面：应该是由Creator中的其他业务方法，使用工厂方法facaotryMethod创建的对象
2、客户端应该 使用Creator对象，或者是使用由Creator创建出来的对象，这时工厂方法创建的对象，是Creator中的某些方法使用
3、在某些情况下，客户端可能会使用由Creator创建出来的对象，这个时候工厂方法创建的对象，是构成客户端需要的对象的一部分。

在工厂方法模式中，客户端要么使用Creator对象，要么使用Creator创建的对象，一般不直接使用工厂方法factoryMethod。
虽然可以吧工厂方法暴露给客户端操作，但是一般不这么做
```

五、优点: 
```
1、屏蔽产品的具体实现，调用者只关心产品的接口
2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以
3、连接平行的类层次
```

六、缺点: 
```
1、具体产品对象和工厂方法的耦合性
2、次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，
在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖
```

七、使用场景: 
```
1、如果一个类需要创建某个接口的对象，但又不知道具体的实现，可以选用工厂模式把创建对象的工作延迟到子类去实现。
2、如果一个类本身就需要由它的子类来创建所需要的对象，就应该使用工厂模式

具体场景：
1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。 2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。 3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口
```

八、注意事项: 
```
作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。
有一点需要注意的地方就是复杂对象适合使用工厂模式，
而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。
如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度
```

Client.java: 
```Java
package com.mutistic.creational.factory.structure;
// Client客户端
public class Client {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		creator.operation();
	}
}
```
Product.java: 
```Java
package com.mutistic.creational.factory.structure;
// Product: 定义工厂方法所创建的对象的接口，也就是实际需要使用的对象的接口
public interface Product {
	// Product具体业务接口 
	void operation();
}
```
ConcreteProduce.java: 
```Java
package com.mutistic.creational.factory.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteProduce: 具体的Product接口的实现对象
public class ConcreteProduce implements Product {
	// Product具体业务实现
	@Override
	public void operation() {
		PrintUtil.printTwo("ConcreteProduce-operation", "Product具体业务实现");
	}
}
```
Creator.java: 
```Java
package com.mutistic.creational.factory.structure;
import com.mutistic.utils.PrintUtil;
// Creator: 创建器，声明工厂的抽象方法
public abstract class Creator {
	// 创建Product的抽象工厂方法
	public abstract Product factoryMethod();
	// 具体业务逻辑 
	public void operation() {
		PrintUtil.printTwo("Creator-operation", "具体业务逻辑 ");
		Product product = factoryMethod();
		product.operation();
	}
}
```
ConcreteCreator.java: 
```Java
package com.mutistic.creational.factory.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteCreator: 具体的创建对象，覆盖实现Creator定义的工厂方法，返回具体的Product实例
public class ConcreteCreator extends Creator {
	/**
	 * 创建Product的工厂方法的具体实现（创建Product的具体实例ConcreteProduce）
	 * @return
	 * @see com.mutistic.creational.factory.Creator#factoryMethod()
	 */
	@Override
	public Product factoryMethod() {
		PrintUtil.printTwo("ConcreteCreator-factoryMethod()", "创建Product的具体实例ConcreteProduce");
		return new ConcreteProduce();
	}
}
```

---
### <a id="a_abstract">十一、抽象工厂模式[Abstract Factory Pattern]</a> <a href="#a_factory">last</a> <a href="#a_builder">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M4_AbstractFactoryPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M4_AbstractFactoryPattern.png)<br/>

一、定义: 
```
定义: 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
本质: 选择产品簇的实现
```

二、结构和说明: 
```
AbstractFactory: 抽象工厂，定义创建一系列产品对象的操作接口

ConcreteFactory: 具体的工厂，实现抽象工厂定义的方法，具体实现一系列产品对象的创建

AbstractProduct: 定义一类产品对象的接口

ConcreteProduct: 具体的产品实现对象，通过在具体工厂里面，
	会选择具体的产品实现对象来创建符合抽象工厂定义的方法返回的产品的对象。

Clien: 客户端，主要使用抽象工厂来获取一些列所需要的产品对象，
	然后面对这些产品对象的接口变成，以实现需要的功能
```

三、理解: 
```
主要解决: 主要解决接口选择的问题。
如何解决: 在一个产品族里面，定义多个产品。 

1、抽象工厂模式: 是为了一系列相关对象或相互依赖的对象创建的一个接口。
	从某种意义上看，抽象工厂其实是一个产品系列，或者产品簇

2、实现成接口: AbstractFactory在Java中通常实现成为接口。当然也可以实现成为抽象类。

3、使用工厂方法: AbstractFactory定义了创建产品所需要的接口，具体的实现是在实现类中。
	通常在实现类里面就需要选择多种更具体的实现，所以AbstractFactory定义的创建产品的方法可以看成是工厂方法
	而这些工厂方法的具体实现就延迟到了具体的工厂里面。也就是说使用工厂方法来实现抽象工厂

4、切换产品簇: 抽象工厂定义了一个产品簇，因此切换产品簇的时候提供不同的抽象工厂即可。
```

四、写法: 
```
1、定义可扩展的工厂: 抽象工厂里面不是通过定义很多创建产品的方法。而是定义一个方法，
	通过参数的方式来判断具体创建什么产品对象（简单工厂模式）。由于只有一个方法，
	返回类型只能定义成所有产品都实现的某个接口或Object，会存在类型转换错误的问题。

2、J2EE中的数据访问对象模式[Data Access Object Pattern]的设计思想是采用了抽象工厂模式
```

五、优点: 
```
1、分离接口和实现
2、是的切换产品簇变得容易
3、当一个产品簇中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品簇中的对象
```

六、缺点: 
```
1、不太容易扩展新的产品: 添加新的产品会导致所有的ConcreteFactory都要重新实现该产品。
2、容易造成类层次复杂
```

七、使用场景: 
```
1、系统独立于它的产品的创建、组合和表示的时候，即：系统只知道产品的接口，而不关心具体实现
2、系统要由多个产品系统中的一个来配置时，即：可以动态切换产品簇时
3、强调一些列相关产品的接口，以便联合使用它们时

具体场景：
1、生成不同操作系统的程序
2、J2EE中的数据访问对象模式[Data Access Object Pattern]
```

八、注意事项: 
```
产品簇难扩展，产品等级易扩展
```

Client.java: 
```Java
package com.mutistic.creational.abstractfactory.structure;
import com.mutistic.utils.PrintUtil;
// Clien: 客户端
// 主要使用抽象工厂来获取一些列所需要的产品对象，然后面对这些产品对象的接口变成，以实现需要的功能
public class Client {
	public static void main(String[] args) {
		AbstractFactory factory1 = new ConcreteFactory1();
		factory1.ceraterProductA().operationA();
		factory1.ceraterProductB().operationB();
		
		PrintUtil.println();
		
		AbstractFactory factory2 = new ConcreteFactory2();
		factory2.ceraterProductA().operationA();
		factory2.ceraterProductB().operationB();
	}
}
```
AbstractProductA.java: 
```Java
package com.mutistic.creational.abstractfactory.structure;
// AbstractProduct: 定义一类产品对象的接口
public interface AbstractProductA {
	// Product具体业务接口
	void operationA();
}
```
ProductA1.java: 
```Java
package com.mutistic.creational.abstractfactory.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteProduct: 具体的产品实现对象，
// 通过在具体工厂里面，会选择具体的产品实现对象来创建符合抽象工厂定义的方法返回的产品的对象。
public class ProductA1 implements AbstractProductA {
	/** 
	 * 具体的产品实现对象的功能
	 * @see com.mutistic.creational.abstractfactory.structure.AbstractProductA#operationA()
	 */
	@Override
	public void operationA() {
		PrintUtil.printThree("ProductA1", "operationA");
	}
}
```
ProductA2.java: 
```Java
package com.mutistic.creational.abstractfactory.structure;
import com.mutistic.utils.PrintUtil;
public class ProductA2 implements AbstractProductA { 
	@Override public void operationA() { PrintUtil.printThree("ProductA2", "operationA"); } 
}
```
AbstractProductB.java: 
```Java
package com.mutistic.creational.abstractfactory.structure;
public interface AbstractProductB { void operationB(); }
```
ProductB1.java: 
```Java
package com.mutistic.creational.abstractfactory.structure;
import com.mutistic.utils.PrintUtil;
public class ProductB1 implements AbstractProductB { 
	@Override public void operationB() { PrintUtil.printThree("ProductB1", "operationB"); } 
}
```
ProductB2.java: 
```Java
package com.mutistic.creational.abstractfactory.structure;
import com.mutistic.utils.PrintUtil;
public class ProductB2 implements AbstractProductB { 
	@Override public void operationB() { PrintUtil.printThree("ProductB2", "operationB"); } 
}
```
AbstractFactory.java: 
```Java
package com.mutistic.creational.abstractfactory.structure;
// AbstractFactory: 抽象工厂，定义创建一系列产品对象的操作接口
public interface AbstractFactory {
	// 定义创建一系列产品对象的操作接口:AbstractProductA
	AbstractProductA ceraterProductA();
	// 定义创建一系列产品对象的操作接口:AbstractProductA
	AbstractProductB ceraterProductB();
}
```
ConcreteFactory1.java: 
```Java
package com.mutistic.creational.abstractfactory.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteFactory: 具体的工厂，实现抽象工厂定义的方法，具体实现一系列产品对象的创建
public class ConcreteFactory1 implements AbstractFactory {

	/**
	 * 具体实现一系列产品对象的创建:ProductA1
	 * @return
	 * @see com.mutistic.creational.abstractfactory.structure.AbstractFactory#ceraterProductA()
	 */
	@Override
	public AbstractProductA ceraterProductA() {
		PrintUtil.printThree("ConcreteFactoryA", "ceraterProductA");
		return new ProductA1();
	}
	/**
	 * 具体实现一系列产品对象的创建:ProductB1
	 * @return
	 * @see com.mutistic.creational.abstractfactory.structure.AbstractFactory#ceraterProductB()
	 */
	@Override
	public AbstractProductB ceraterProductB() {
		PrintUtil.printThree("ConcreteFactoryA", "ceraterProductB");
		return new ProductB1();
	}
}
```
ConcreteFactory2.java: 
```Java
package com.mutistic.creational.abstractfactory.structure;
import com.mutistic.utils.PrintUtil;
public class ConcreteFactory2 implements AbstractFactory {
	@Override
	public AbstractProductA ceraterProductA() {
		PrintUtil.printThree("ConcreteFactoryB", "ceraterProductA");
		return new ProductA2();
	}
	@Override
	public AbstractProductB ceraterProductB() {
		PrintUtil.printThree("ConcreteFactoryB", "ceraterProductB");
		return new ProductB2();
	}
}
```

---
### <a id="a_builder">十二、建造者模式[Builder Pattern]</a> <a href="#a_abstract">last</a> <a href="#a_prototype">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M5_BuilderPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M5_BuilderPattern.png)<br/>

一、定义: 
```
定义: 将一个复杂对象的构建与它的表示分离，是的同样的构建过程可以创建不同的表示
本质: 分离整体构建算法和组件构造
```

二、结构和说明: 
```
Builder: 建造者接口，定义创建一个Product对象所需要的各个组件的操作

ConcreteBuilder: 具体的建造者实现，实现各个组件的创建，并负责组装Product对象的各个组件，
	同时还提供一个让客户端获取组装完成后的产品对象的方法

Director: 指导者，也称为导向者，主要用来使用Builder接口，以一个统一的过程来构建所需要的Product对象

Product: 产品，表示被建造者构建的复杂对象，包含多个组件
```

三、理解: 
```
主要解决: 主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；
	由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
如何解决: 将变与不变分离开。 

1、建造者模式: 又称生成器模式，其中心在于分离构建算法和具体的构造实现，从而使得构建算法可以重用，
	具体的构造实现可以方便扩展和切换，从而可以灵活的组合来构造出不同的产品对象

2、建造者模式的构成：
	Builder接口: 定义了如果构建各个组件，也就是知道每个组件功能如何实现，以及如何装配这些组件到产品中
	Director: 知道如何组合来构建产品，也就是说Director负责整体的构建算法，而且通常是分步骤来执行。
	不管如何变化，建造者模式都存在着两部分：一部分是组件构造和产品装配，另一个部分是整体构建的算法。
```

四、写法: 
```
1、实际应用建造者模式时，可以由客户端创造Director，在Director里面封装整体构建算法，
	然后让Director去调用Builder，让Builder来封装具体组件的构造功能

2、建造者的实现：
	2.1、实际上在Builder接口的实现中，每个组件构建的方法里面，除了组件装配外，也可以实现如何具体的创建各个组件对象，
也就是说每个方法都可以有两部分功能，一个是创建溺件对象，一个是组装组件。
	2.2、在构建组件的方法里面可以实现选择并创建具体的组件对象，然后再把这个组件对象组装到产品对象中去，
这样一来，Builder就可以和工厂方法配合使用了
	2.3、再进一步，如果在实现Builder的时候，只有创建对象的功能，而没有组装的功能，
那么这个时候的Builder实现跟抽象工厂的实现是类似的
	2.4、这种懦况下，Builder接冂就类似于抽象工厂的接口，Builder的具体实现就类似于具体的工厂，
而且Builder接口里面定义的创建各个邮件方法也是有关联的，这些方法是构建一个复杂对象所需要的组件对象

3、指导者的实现：
	3.1、在建造者模式里面，指导者承担的是整体构建算法部分，是相对不变的部分。
因此在实现指导者的时候，把变化的部分分离出去是很重要的。
	3.2、其实指导者分离以去的变化部分，就到了建造者那边，指导者知道整体的构建算法，
但是不知道如何具体的创建和装配部件对象。
	3.3、因此真正的指导者实现，并不仅仅是简单的按照一定顺序调用建造者的方法来生成对象。
应该是有较为复杂的算法和运算过程，在运算过程中根据需要，才会调用建造者的方法来生成部件对象。

4、指导者和建造者的交互
	在建造者模式里面，指导者和建造者的交互，是通过建造者的那些buildPart方法来完成的。
指导者通常会实现比较复杂的算法或者是运算过程，

在实际中很可能会有以下的情况：
	4.1、在运行指导者的时候，会按照整体构建算法的步骤进行运算，可能先运行前几步运算，
到了某一步骤，需要具体创建某个组件对象了，然后就调用Bui1der的创建相应组件的方法来创建具体的组件。
同时，把前里面运算得到的数据传递给Builder，因为在Builder内部实现创建和组装组件的时候，可能会需要这些数据
	4.2、Builder创建完具体的组件对象后，会把创建好的组件对象返回给指导者，
指导者继续后续的算法运算，可能会用到己经创建好的对象
	4.3、如此反复下去，直到整个构建算法运行完成，那么最终的产品对象也就创建好了

	通过上而的描述，可以看出指导者和建造者是需要交互的，方式就是通过建造者方法的参数和返回值，
来回的专递数据。事实上，指导者是通过委托的方式来把功能交给建造者去完成。
```

五、优点: 
```
1、松散耦合
2、可以很容易的改变产品的内部表示
3、更好的复用性
4、便于控制细节风险
```

六、缺点: 
```
1、产品必须有共同点，范围有限制（如果没有共同点，则可以用JSON数据结构或Map或不返回或Builder本身）。
2、如内部变化复杂，会有很多的建造类。 
```

七、使用场景: 
```
1、如果创建对象的算法，应该独立于该对象的组成部分以及它们的装配方式时。
2、如果同一个构建过程有着不同的表示时
3、需要生成的对象具有复杂的内部结构或对象内部属性本身相互依赖。 
```

八、注意事项: 
```
与工厂模式的区别是：建造者模式更加关注与零件装配的顺序
```

Builder.java: 
```Java
package com.mutistic.creational.builder.strutrue;
// Client 客户端
public class Clinet {
	public static void main(String[] args) {
		PrintUtil.printOne("创建具体建造者实例");
		ConcreteBuilder builder = new ConcreteBuilder();
		
		PrintUtil.printOne("创建指导者传入建造者实例");
		Director dire = new Director(builder);
		
		PrintUtil.printOne("指导者开始构建");
		dire.construct();
		
		PrintUtil.printOne("从建造者获取构建后的产品对象");
		Product product = builder.getResultProduct();
		
		PrintUtil.printOne("处理产品的其他业务逻辑");
		product.getClass();
	}
}
```
Builder.java: 
```Java
package com.mutistic.creational.builder.strutrue;
// Builder
// 建造者接口，定义创建一个Product对象所需要的各个组件的操作
public interface Builder {
	// 定义创建一个Product对象所需要的各个组件的操作的统一接口
	void builderPart();
}
```
ConcreteBuilder.java: 
```Java
package com.mutistic.creational.builder.strutrue;
// ConcreteBuilder
// 具体的建造者实现，实现各个组件的创建，并负责组装Product对象的各个组件，同时还提供一个让客户端获取组装完成后的产品对象的方法
public class ConcreteBuilder implements Builder {
	// 声明产品对象私有成员
	private Product resultProduct;
	/**
	 * 创建一个Product对象所需要的各个组件的操作的具体实现
	 * @see com.mutistic.creational.builder.strutrue.Builder#builderPart()
	 */
	@Override
	public void builderPart() {
		resultProduct = new Product() { }; // 测试
	}
	// 返回构建后的具体产品对象
	public Product getResultProduct() { return resultProduct; }
}
```
Director.java: 
```Java
package com.mutistic.creational.builder.strutrue;
// Director
// 指导者，也称为导向者，主要用来使用Builder接口，以一个统一的过程来构建所需要的Product对象
public class Director {
	// 建造者接口私有成员变量
	private Builder builder;
	// 构造函数，传入Builder建造者的具体实例
	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	// 指导建造者构建最终的产品对象的方法
	public void construct() {
		this.builder.builderPart();
	}
}
```
Product.java: 
```Java
package com.mutistic.creational.builder.strutrue;
// Product: 产品，表示被建造者构建的复杂对象，包含多个组件
public interface Product { }
```

---
### <a id="a_prototype">十三、原型模式[Prototype Pattern]</a> <a href="#a_builder">last</a> <a href="#a_facade">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M6_PrototypePattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M6_PrototypePattern.png)<br/>

一、定义: 
```
定义: 用原型实例执行创建对象的种类，并通过拷贝这些原型创建新的对象
本质: 克隆生成对象
```

二、结构和说明: 
```
Prototype: 声明一个克隆自身的接口，用来约束想要克隆自己的类，要求他们都要实现这里定义的克隆方法

ConcretePrototype: 实现Prototype接口的类，这些类真正实现克隆自身的功能

Client: 使用原型的客户端，首先要获取到原型实例对象，然后通过原型实例克隆自身来创建新的对象实例
```

三、理解: 
```
主要解决: 在运行期建立和删除原型。
如何解决: 利用已有的一个原型对象，快速地生成和原型对象一样的实例。

1、原型模式的功能: 包含两个方面: 
	一个是通过克隆来创建新的对象实例。
	一个是为克隆出来的新的对象实例赋值原型实例属性的值
原型模式要实现的就是: 通过克隆来创建新的对象实例，一般情况下，新创建出来的实例的数据和原型实例是一样的。
但是具体如何实现克隆，需要由程序自行实现，原型模式并没有统一的要求和实现算法。

2、原型与new: 原型模式从某种意义说，类似new操作，但不是new。
	因为使用原型模式要克隆原型的属性值，而通过new出来的属性一般是null或默认值。

3、原型实例和克隆实例: 原型实例和克隆出来的实例，本质上市不同的实例，克隆完成后，它们之间是没有关联的，
	如果克隆后，克隆实例的属性值发生改变，是不会影响到原型实例的，包括引用对象，应该是深度克隆。

4、Java中的克隆方法: 
	在Java中已经提供了clone方法，定义在Object类中。需要克隆功能需要实现 java.lang.Cloneable接口，
	这个接口只是一个表示接口，没有需要实现的方法，注意此刻克隆是浅度克隆。

5、浅度克隆和深度克隆: 
	浅度克隆: 自负责克隆按值传递的数据（基本数据类型、String类型）
	深度克隆: 除了浅度克隆要克隆的值外，还负责克隆引用类型数据，基本上就是克隆所有的属性的数据。
		深度克隆如果要克隆的属性数据是引用类型，那么需要一直递归的克隆下去。
		这意味着想要深度克隆成功，必须要整个恐龙所设计的对象都要正确实现克隆方法，
		如果其中有一个没有正确实现克隆，那么就不是严格意义上的深度克隆
```

四、写法: 
```
1、原型管理器: 如果系統中原型的数目不固定，比如系统中的原型可以被动态的创建和销毁，那么就需要在系统中维护
一个当前可用的原型的注册表，这个注册表就被成为原型管理器。
	如果把原型当成一个资源的话，原型管理器就相当于一个资源管理器，在系统开始运行的时候初始化，
然后运行期间可以动态的添加资源和销毁资源。从这个角度看，原型管理器就可以相当于一个缓存资源的实现，
值不够里面的缓存和管理的是原型实例。
	在原型管理器，一般情况下添加原型对象是通过new来创造对象，其他操作通过通过克隆方法来获取新的对象实例。
这样就可以实现动态管理、或者动态切换具体的实现对象实例。

```

五、优点: 
```
1、性能提高、逃避构造函数的约束
2、对客户算隐藏具体的实现类型
3、在运行时动态改变具体的实现类型
```

六、缺点: 
```
1、深度克隆方法实现会比较复杂
1、配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，
特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
2、使用Object的clone方法必须实现 java.lang.Cloneable 接口
```

七、使用场景: 
```
1、如果系统要独立于它想要使用的对象时，使用原型模式，让系统只面向接口编成，
在系统需要新的对象的时候，可以用克隆原型来得到

2、如果需要实例化的类时在运行时动态指定时，使用原型模式，通过克隆原型来得到需要的实例

具体场景：
1、资源优化场景。 
2、类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。 
3、性能和安全要求的场景。 
4、通过 new 产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。 
5、一个对象多个修改者的场景。 
6、一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。 7、在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone 的方法创建一个对象，然后由工厂方法提供给调用者
```

八、注意事项: 
```
与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。
浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流。
```

Client.java: 
```Java
package com.mutistic.creational.prototype.structrue;
import com.mutistic.utils.PrintUtil;
// Client
// 使用原型的客户端，首先要获取到原型实例对象，然后通过原型实例克隆自身来创建新的对象实例
public class Client {
	// 声明需要使用的原型接口对象
	private Prototype prototype;
	
	/**
	 * 构造函数：传入需要使用的具体原型对象实例
	 * @param prototype
	 */
	public Client(Prototype prototype) {
		super();
		this.prototype = prototype;
	}
	// 其他业务功能
	public Prototype operation() {
		Prototype clone = this.prototype.clone();
		return clone;
	}
	public static void main(String[] args) {
		PrintUtil.printOne("原型模式[Prototype Pattern]");
	
		ConcretePrototype prototye = new ConcretePrototype();
		Client client = new Client(prototye);
		PrintUtil.printThree("创建原型本身的实例对象: ", "hashCode=" + prototye.hashCode());

		ConcretePrototype clone = (ConcretePrototype) client.operation();
		PrintUtil.printThree("克隆原型的实例对象: ", "hashCode=" + clone.hashCode());
	}
}
```
Prototype.java: 
```Java
package com.mutistic.creational.prototype.structrue;
// Prototype
// 声明一个克隆自身的接口，用来约束想要克隆自己的类，要求他们都要实现这里定义的克隆方法
public interface Prototype {
	// 克隆自身的接口
	Prototype clone();
}
```
ConcretePrototype.java: 
```Java
package com.mutistic.creational.prototype.structrue;
// ConcretePrototype
// 实现Prototype接口的类，这些类真正实现克隆自身的功能
public class ConcretePrototype implements Prototype {
	/**
	 * 克隆自身的具体实现
	 * @return
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Prototype clone() {
		// 创建新的实例对象
		ConcretePrototype clone = new ConcretePrototype();
		// 如果还有属性，这拷贝原属性
		return clone;
	}
}
```


---
## <a id="a_structural">结构型模式[Structural Patterns]</a> <a href="#a_creational">创建型模式</a> <a href="#a_behavioral">行为型模式</a>
### <a id="a_facade">十四、外观模式[Facade Pattern]</a> <a href="#a_prototype">last</a> <a href="#a_adapter">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M7_FacadePattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M7_FacadePattern.png)<br/>

一、定义、本质、原则: 
```
定义: 为系统中的一组接口提供一个一致的界面。Facade模式定义高层接口，这个接口使得客户端容易使用这一系统。
本质: 封装交互、简化调用
原则：外观模式体现了迪米特法则[LoD: Law of Demeter，最少知识原则: LKP: Least Knowledge Principle]
```

二、结构和说明: 
```
Facade: 定义系统的多个模块对外的高层接口，通常是需要调用内部多个模块，从而把客户的请求代理给适当的系统对象

模块(Mode): 接受Facade对象的委派，真正实现功能，各个模块之前按可能有交互，注意，Facade对象知道各个模块，但是各个模块不应该知道Facade对象
```

三、理解: 
```
主要解决: 降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
如何解决: 客户端不与系统耦合，外观类与系统耦合

1、外观模式的目的: 外观模式的目的不是给系统添加新的功能接口，而是减少客户端和系统内的模块的交互，松散耦合，
	从而让客户端能够更简单的使用系统
2、使用外观模式区别: Facade翻遍了客户端的调用、封装了系统内部的实现细节、实现功能的共享和复用
3、外观模式不是强制要求使用的。
4、外观模式提供了默认的功能实现。
```

四、写法: 
```
1、把外观类作为一个辅助工具类实现
2、Facade可以实现为接口，组合其他设计模式，比如工厂模式。如果实现为interface可以有选择性的暴露接口方法，减少模块对子系统提供的接口方法。
3、Facade的方法实现: 	Facade的方法实现中，一般是转发客户端的请求给到具体模块进行处理。
	Facade本身不建议进行功能处理，只是实现了一个功能的组合调用。
```

五、优点: 
```
1、松散耦合
2、简单易用
3、更好的划分访问层次
```

六、缺点: 
```
1、过多的或者不太合理的Facade会降低易读性，容易让人迷惑。
2、Facade声明过的接口会造成客户端调用时的一定复杂度。
3、不符合开闭原则[OCP: Open Closed Principle]，如果要改东西很麻烦，继承重写都不合适
```

七、使用场景: 
```
1、如果为一个调用复杂的子系统提供一个简单接口的时候，可以考虑使用外观模式，使用外观对象来实现大部分客户端需要的功能，从而简化客户端的使用
2、如果需要客户端和抽象类实现部分松散耦合，可以考虑使用外观模式，使用外观对象来将这个系统与客户端分离开来，从而提高系统的独立性和可移植性
3、如果构建多层结构的系统，可以考虑使用外观模式，使用外观对象作为每层的入口，这样可以简单层间的调用，也可以松散层次之间的依赖关系。
```

八、注意事项: 
```
在层次化结构中，可以使用外观模式定义系统中每一层的入口。
```

Client.java: 
```Java
package com.mutistic.structural.facade.structure;
import com.mutistic.utils.PrintUtil;
// Client客户端 
public class Client {
	public static void main(String[] args) {
		PrintUtil.printOne("外观模式: Facade Pattern: 本质: 选择实现。");
		PrintUtil.printTwo("定义", "为系统中的一组接口提供一个一致的界面。Facade模式定义高层接口，这个接口使得客户端容易使用这一系统。");
		
		Facade.test();
	}
}
```
Facade.java: 
```Java
package com.mutistic.structural.facade.structure;
import com.mutistic.utils.PrintUtil;
// 外观模式-核心类
public class Facade {
	// Facade模式定义的高层接口 （不一定要声明为static）
	public static void test() {
		PrintUtil.printTwo("Facade-test", "Facade: 定义系统的多个模块对外的高层接口，通常是需要调用内部多个模块，从而把客户的请求代理给适当的系统对象");
		
		new ModeA().testA();
		new ModeB().testB();
		new ModeC().testC();
	}
}
```
ModeA.java: 
```Java
package com.mutistic.structural.facade.structure;
import com.mutistic.utils.PrintUtil;
// 具体模块
public class Modea {
	// 具体模块具体业务
	public void testa() {
		PrintUtil.printTwo("ModeA-testA", "模块: 接受Facade对象的委派，真正实现功能，各个模块之前按可能有交互，注意，Facade对象知道各个模块，但是各个模块不应该知道Facade对象");
	}
}
```
ModeB.java: 
```Java
package com.mutistic.structural.facade.structure;
import com.mutistic.utils.PrintUtil;
// 具体模块
public class ModeB {
	// 具体模块具体业务
	public void testB() {
		PrintUtil.printTwo("ModeB-testB", "模块: 接受Facade对象的委派，真正实现功能，各个模块之前按可能有交互，注意，Facade对象知道各个模块，但是各个模块不应该知道Facade对象");
	}
}
```
ModeC.java: 
```Java
package com.mutistic.structural.facade.structure;
import com.mutistic.utils.PrintUtil;
// 具体模块
public class ModeC {
	// 具体模块具体业务
	public void testC() {
		PrintUtil.printTwo("ModeC-testC", "模块: 接受Facade对象的委派，真正实现功能，各个模块之前按可能有交互，注意，Facade对象知道各个模块，但是各个模块不应该知道Facade对象");
	}
}
```

---
### <a id="a_adapter">十五、适配器模式[Adapter Pattern]</a> <a href="#a_facade">last</a> <a href="#a_proxy">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M8_AdapterPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M8_AdapterPattern.png)<br/>

一、定义、本质: 
```
定义: 将一个类的接口转换客户端希望的另外一个接口。适配器模式使得原本由于接口不兼容而能一起工作的那些类可以一起工作。
本质: 转换匹配，复用功能
```

二、结构和说明: 
```
Client: 客户端，调用自己需要的领域接口Target

Target: 定义客户端需要的跟特定领域相关的接口(或类或子类或抽象类)

Existing: 已经存在的接口(或类或子类或抽象类)，但与客户端要求的特定领域接口不一致，需要被适配目标

Adapter: 适配器，把Existing适配成Client需要的Target，本身是实现或基层Target
```

三、理解: 
```
主要解决: 主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
如何解决: 继承或依赖（推荐）。

1、适配器模式的功能: 
	适配器模式的主要功能是进行转换匹配，目的是复用已有的功能，而不是来实现新的接口
	适配器里面也可以实现功能，称这种适配器为智能适配器

2、Existing和Target的关系: 适配器模式中被适配的接口Existing和适配成为的接口Target是没有任何关联的

3、对象适配器: 其实现依赖于对象组合。

4、类适配器: 其实现采用多重继承对一个接口与另一个接口进行匹配。由于Java不支持多重继承，所以不涉及类适配器。
	但是可以通过继承类，实现接口的方式来实现类似 类适配器

5、类适配器和对象适配器的权衡: 
5.1、从实现上: 
	类适配器: 使用对象继承的方式，是静态的定义方式。
	对象适配器: 使用对象组合的方式，是动态组合的方式。
5.2、从处理子类上: 
	类适配器: 由于适配器直接继承了Existing，使得适配器不能和Existing的子类一起工作，因为继承是个静态关系，
		当适配器继承了Existing后，就不能去处理Existing的子类了。
	对象适配器: 允许一个Existing和多个Existing，包括Existing和她所有的子类一起工作。因为对象适配器采用对象组合的关系。
		只要对象类型正确，是不是子类都无所谓。
5.3、从方法覆盖上: 
	类适配器: 适配器可以重新定义Existing的部分行为，相当于子类覆盖父类的部分实现方法。
	对象适配器: 要重定义Existing的行为比较困难，这种情况下，需要定义Existing的子类来实现重定义，然后让适配器组合子类。
5.4、从引用上: 
	类适配器: 仅仅引入了一个对象，不需要额外的引用来间接得到Existing
	对象适配器: 需要额外的引用来间接得到Existing
```

四、写法: 
```
1、适配器的常见实现: 适配器通常是一个类，一般会让适配器类去实现或继承Target接口，然后在适配器的具体实现类里面去调用Existing
2、智能适配器: 可以在适配器的实现里面，加入新功能的实现
3、适配多个Existing
4、适配器Adapter实现的复杂程度，取决于Target和Existing的相似度，相似度越低复杂度越高
5、默认适配: 为一个接口提供默认实现
6、双向适配: 适配器也可以实现双向的适配，适配器可以同时适配Target和Existing
```

五、优点: 
```
1、更好的复用性
2、更好的可扩展性
```

六、缺点: 
```
1、过多的使用适配器，会导致系统非常凌乱、不容易整体进行把握。
2、Target和Existing的相似度非常低，如果仍然采用适配器模式，会导致复杂度过高。建议重构而且适配器模式。
```

七、使用场景: 
```
1、如果需要使用一个已经存在的类，但接口并不符合需求，可以使用适配器模式，来吧已有的实现转成需要的接口。
2、如果需要创建一个可复用的类，这个类可能和一些不兼容的类一起工作，可以使用适配器模式，按需适配。
3、如果需要使用一些存在的子类，不能采用对每个子类适配，可以使用对象适配器，直接适配这些子类的父类。

具体场景: 
1、JAVA JDK 1.1 提供了 Enumeration 接口，而在 1.2 中提供了 Iterator 接口，
想要使用 1.2 的 JDK，则要将以前系统的 Enumeration 接口转化为 Iterator 接口，这时就需要适配器模式。 
2、在 LINUX 上运行 WINDOWS 程序。 
3、JAVA 中的 jdbc
```

八、注意事项: 
```
适配器不是在详细设计时添加的，而是解决正在服役的项目的问题。
```

Client.java: 
```Java
package com.mutistic.structural.adapter.structure;
import com.mutistic.utils.PrintUtil;
// Client: 客户端，调用自己需要的领域接口Target 
public class Client {
	public static void main(String[] args) {
		PrintUtil.printOne("适配器模式 Adapter Pattern: 本质: ");
		PrintUtil.printTwo("定义", "将一个类的接口转换客户端希望的另外一个接口。适配器模式使得原本由于接口不兼容而能一起工作的那些类可以一起工作。");
		
		Existing existing = new Existing();
		PrintUtil.printOne("Client: 客户端，调用Target接口信息");
		Target target = new Adapter(existing);
		target.test();
		
		PrintUtil.printOne("Client: 客户端，调用适配类接口信息");
		Adapter adapter = new Adapter(existing);
		adapter.test();
		adapter.testExisting();
	}
}
```
Adapter.java: 
```Java
package com.mutistic.structural.adapter.structure;
import com.mutistic.utils.PrintUtil;
// 适配器: 核心类: (对象适配器) 
// Adapter: 适配器，把Existing适配成Client需要的Target，本身是实现或基层Target
public class Adapter implements Target {
	// 被适配目标类
	private Existing existing;
	// 构造器（传入被适配目标实例）
	public Adapter(Existing existing) {
		super();
		this.existing = existing;
		PrintUtil.printTwo("Adapter(Existing)", "构造器（传入被适配目标Existing实例）");
	}

	/**
	 * Target特定领域的业务功能，根据Target类型是否重写
	 * @see com.mutistic.structural.adapter.structure.Target#test()
	 */
	@Override
	public void test() {
		PrintUtil.printTwo("Adapter-test()", "Target特定领域的业务功能，根据Target类型是否重写");
	}
	
	// Existing接口功能，非必须项，根据实际需要是否添加
	public void testExisting() {
		PrintUtil.printTwo("Adapter-testExisting()", "Existing接口功能，非必须项，根据实际需要是否添加");
		
		this.existing.testExisting();
	}
}
```
Target.java: 
```Java
package com.mutistic.structural.adapter.structure;
// Target: 定义客户端需要的跟特定领域相关的接口或类
public interface Target {
	// 特定领域的业务功能
	void test();
}

```
Existing.java: 
```Java
package com.mutistic.structural.adapter.structure;
import com.mutistic.utils.PrintUtil;
// Existing: 已经存在的接口，但与客户端要求的特定领域接口不一致，需要被适配目标 
public class Existing {
	/// Existing的具体业务
	public void testExisting() {
		PrintUtil.printTwo("Existing-testExisting", "已经存在的接口，但与客户端要求的特定领域接口不一致，需要被适配目标 ");
	}
}
```

---
### <a id="a_proxy">十六、代理模式[Proxy Pattern]</a> <a href="#a_adapter">last</a> <a href="#a_composite">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M9_ProxyPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M9_ProxyPattern.png)<br/>
一、定义、本质: 
```
定义: 为其他对象提供一种代理以控制对这个对象的访问
本质: 控制对象访问
```

二、结构和说明: 
```
Proxy：代理对象，通常有一下功能：
1、实现与具体的目标对象一样的接口，可以使用代理来替代具体的目标对象
2、保存一个指向具体目标对象的引用，可以在需要的时候调用具体的目标对象
3、可以控制对具体目标对象的访问，并可能负责创建和删除它

Subject：目标接口，定义代理额具体目标对象的接口，可在任何使用具体目标对象的地方使用代理对象

RealSubject：具体的目标对象，真正实现目标接口要求的功能
```

三、理解: 
```
主要解决：在直接访问对象时带来的问题，比
	如说：要访问的对象在远程的机器上。在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），
	直接访问会给使用者或者系统结构带来很多麻烦，可以在访问此对象时加上一个对此对象的访问层。
如何解决：增加中间层。

1、代理模式的功能：代理模式是通过创建一个代理对象，用这个代理对象去代表真实的对象，客户端得到这个代理对象过后，
对客户端没有什么影响，就跟得到了真实对象一样来使用。
	当客户端操作这个代理对象时，实际上功能最终还是会由真实的对象来完成，只不过是通过代理操作的，也就是客户端操作代理，
代理操作真正的对象。
	正是因为有代理对象加载客户端和被代理的正式对象中间，相当于一个中转，那么在中转的时候就有很多花招可以玩，
比如：权限验证，引用计数等

2、具体目标和代理的关系：
	从代理模式的结构图来看，好像是有一个具体目标内就有一个代理类，其实不是这样的。如果代理类能完全通过接口来操作它
所代理的目标对象，那么代理对象就不需要知道具体的目标对象，这样就无需为每一个具体目标类都创建一个代理类。

```

四、写法: 
```
4.1、代理的分类
1、虚拟代理：根据需要来创建开销很大的对象，该对象只有在需要的时候才会被真正创建
2、远程代理：用来在不同的底子控件上代理同一个对象，这个不同的地址空间可以是在本机，也可以在其他机器，
	在Java里面最典型的就是RMI技术
3、copy-on-write代理：在客户端操作的时候，只有对象确实改变了，才会真的拷贝一个目标对象，算是虚拟代理的一个分支
	拷贝一个大的对象是很小号资源的，如果这个被拷贝的对象从上次操作过来，没有被修改过，那么再拷贝这个对象是没有必要的。
可以使用代理来延迟拷贝的过程，可以等到对象被修改的时候才真的对他进行拷贝。
	copy-on-write可以大大降低拷贝大对象的开销，因此算是一种优化方式，可以根据需要来拷贝或者克隆对象。

4、保护(Protect or Access)代理：控制对原始对象的访问，如果有需要，可以给不同的用户提供不同的访问权限，以控制用户对原始对象的访问
	保护代理是一种控制对原始对象访问的代理，多用于对象应该有不同的访问权限的时候。保护代理会检查调用者是否具有
请求所必须的访问权限，如果没有相应的权限，那么就不会调用目标对象，从而实现对目标对象的保护。

5、Cache代理：为那些昂贵的操作的结果提供临时的存储空间，一遍多个客户端可以共享这些结果
6、防火墙(Firewall)代理：保证对象不被恶意用户访问和操作
7、同步化(Synchronization)代理：使多个用户能够同时访问苗木表对象而没有冲突
8、智能引用(Smart Reference)代理：在访问对象时执行一些附加操作，比如：对指向实际对象的引用计数、第一次引用一个持久对象时，讲其装入内存等

这些代理类型中，最常见的是：虚拟代理、保护代理、远程代理、智能引用代理这几种。

4.2、Java中的代理
1、Java的静态代理：
	通常把前面自己实现的代理模式，称为Java的静态代理。这种实现方式有一个较大的缺点，就是如果Subject接口发生变化，
那么代理类和具体的目标实现都要变化，不是很灵活，而且也和OCP原则有冲突

2、Java的动态代理：
	通常把使用Java内建的对代理模式支持的功能来实现的代理称为Java的动态代理。动态代理与静态代理相比，
明显的变化是：静态代理实现的时候，在Subject接口上定义很多的方法，但是动态代理类始终只有invoke方法。
这样当Subject接口发生变化的时候，动态代理的接口就不需要跟着变化了。
```

五、优点: 
```
1、职责清晰
2、高扩展性
3、智能化
	
	代理模式在客户端和被客户端访问的对象之间，引入了一定程度间接性，即中间件。客户是直接使用代理，
让代理来与被访问的对象进行交互。
	不同的代理类型，这种附加的间接性有不同的用途，也就是有不同的优点：
1、远程代理：隐藏了一个对象存在于不同的地址空间的事实，也即是客户通过远程代理访问一个对象，
根本就不关心个对象在哪里，也不关心如何通过网络去访问到这个对象，从客户的角度来讲，它只是在使用代理对象而已
2、虚拟代理：可以根据需要来创建“大”对象，只有到必须创建对象的时候，虚拟代理才会创建对象，
从而大大加快程序运行速度并节省资源。通过虚拟代理可以对系统进行优化。
3、保护代理：可以在访问一个对象的前后，执行很多附加的操作，除了进行权限控制之外，还可以进行很多跟业务相关的处理，
而不需要修改被代理的对象。也就是说，可以通过代理来给目标对象增加功能。
4、智能引用代理：跟保护代理类似，也是允许在访问一个对象的前后，执行很多附加的操作，这样一来就可以做很多额外的事情，比如．引用计数等。
```

六、缺点: 
```
1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。 2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂
```

七、使用场景: 
```
1、远程代理：需要为一个对象在不同的地址空间提供局部代表的时候，可以使用远程代理
2、虚拟代理：需要按照需要创建开销很大的对象的时候，可以使用虚拟代理
3、保护代理：需要控制对原始对象的访问权限的时候，可以使用保护代理
4、智能引用代理：需要在访问对象的时候执行一些附加操作的时候，可以使用智能引用代理


具体场景：
1、Windows 里面的快捷方式
2、spring aop
```

八、注意事项: 
```
1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。 2、和装饰模式的区别：装饰模式为了增强功能，而代理模式是为了加以控制
```

Client.java: 
```Java
package com.mutistic.structural.proxy.structure;
import com.mutistic.utils.PrintUtil;
// Client客户端
public class Client {
	public static void main(String[] args) {
		
		PrintUtil.printOne("代理模式[Proxy Pattern]");
		
		RealSubject real = new RealSubject();
		PrintUtil.printTwo("创建RealSubject具体对象实例：", real);
		
		Proxy proxy = new Proxy(real);
		PrintUtil.printTwo("创建Proxy代理对象实例：", proxy);
		
		proxy.request();
	}
}
```
Proxy.java: 
```Java
package com.mutistic.structural.proxy.structure;
import com.mutistic.utils.PrintUtil;
// Proxy：代理对象，通常有一下功能
// 1、实现与具体的目标对象一样的接口，可以使用代理来替代具体的目标对象
// 2、保存一个指向具体目标对象的引用，可以在需要的时候调用具体的目标对象
// 3、可以控制对具体目标对象的访问，并可能负责创建和删除它
public class Proxy implements Subject {
	/** 持有具体目标对象RealSubject */
	private RealSubject realSubject;
	/**
	 * 构造函数：传入具体目标对象RealSubject（可以通过set方法）
	 * @param realSubject 具体目标对象
	 */
	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	/**
	 * 转调真正的业务功能：realSubject.request()
	 * @see com.mutistic.structural.proxy.structure.Subject#request()
	 */
	@Override
	public void request() {
		PrintUtil.printTwo("Proxy代理对象开始转调：", "realSubject.request()");
		realSubject.request();
		PrintUtil.printThree("Proxy代理对象转调结束：", "realSubject.request()");
	}
}
```
Subject.java: 
```Java
package com.mutistic.structural.proxy.structure;
// Subject
// 目标接口，定义代理额具体目标对象的接口，可在任何使用具体目标对象的地方使用代理对象 
public interface Subject {
	// 声明业务功能接口
	void request();
}
```
RealSubject.java: 
```Java
package com.mutistic.structural.proxy.structure;
import com.mutistic.utils.PrintUtil;
// RealSubject：具体的目标对象，真正实现目标接口要求的功能
public class RealSubject implements Subject {
	/**
	 * 业务功能实现
	 * @see com.mutistic.structural.proxy.structure.Subject#request()
	 */
	@Override
	public void request() {
		PrintUtil.printThree("RealSubject具体的目标对象开始执行业务：", "realSubject.request()");
	}
}
```

---
### <a id="a_composite">十七、组合模式[Composite Pattern]</a> <a href="#a_proxy">last</a> <a href="#a_decorator">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M10_CompositePattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M10_CompositePattern.png)<br/>

一、定义、本质: 
```
定义: 将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性
本质: 统一叶子对象和组合对象
```

二、结构和说明: 
```
Component：抽象的组件对象，为组合中的对象什么接口，让客户端可以通过这个接口来访问和管理整个对象结构，
可以在内部为定义的功能提供默认的实现

Leaf：叶子节点对象，定义和实现叶子对象的行为，不再包含其他的子节点对象

Composite：组合对象，通常会存储子组件即叶子节点，定义包含子组件的那些组件的行为，
并实现在组件接口中定义的与子组件有关的操作

Client：客户端，通过组件接口来操作组合结果里面的组件对象
```

三、理解: 
```
主要解决：它在树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以向处理简单元素一样来处理复杂元素，
从而使得客户程序与复杂元素的内部结构解耦。
如何解决：树枝和叶子实现统一接口，树枝内部组合该接口。

1、组合模式的目的：
  让客户端不在区分操作的是组合对象还是叶子对象，而是以一个统一的方式来操作。实现这个功能关键是设计一个抽象的组件类，让它可以代表组合对象和叶子对象，

2、对象树：
  通常，组合模式会组合出树形结构，组成这个属性结构所使用的多个组件对象没救自然的形成了对象树
  这意味着方式可以使用对象树来描述或者操作的功能，都可以考虑使用组合模式，比如XML或HTML文件格式

3、组合模式中递归：
  组合模式中的递归，指的是对象递归组合，不是递归算法
  组合模式中的递归，是对象本身的递归，是对象的组合方式，是从设计上来讲的。在设计模式成为递归关联，是对象关联关系的一种

4、Component中是否应该实现一个Component集合：
  大多数情况下，一个Composite对象会持有子节点的集合。不声明在Component中的原因是，在父类来存放子类的实例对象，
对于Composite节点来说是没什么问题的，Composite本身就要存放子节点。但是对于叶子节点来说会导致空间浪费，因为叶子节点是最小单位

5、最大化Component定义：
  由于要统一两种对象的操作，所以Component里面的方法主要是两种对象方法的和。这种实现是与类单一职责设计原则是冲突的
一个父类应该只定义那些对它的之类有意义的操作。所以在Component中对组合对象的操作方法是对叶子对象没有意义的这种方法，
提供默认的实现或是默认抛出不支持该功能的异常。组合对象按需覆盖该功能
```

四、写法: 
```
1、子组件排序：
  在某些应用中，实用组合模式的时候，需要按照一定的顺序来使用子组件对象，比如进行语法分析的时候，
使用组合模式构建的抽象语法是，在解析执行的时候，是需要按照顺序执行的。此时可以考虑结合迭代器模式来实现顺序访问组件对象

2、透明性实现方式、安全性实现方式：
  针对在Compoent声明定义管理子组件的操作还是在Composite中，在不同的实现中，要进行安全性和透明性的权衡选择
  安全性是指：从客户使用组合模式上看是否更安全。如果安全，那么不会有发生无操作的可能，能访问的防范都是被支持的功能
  透明性是指：从客户使用组合模式上，是否需要区分到底是组合对象还是叶子对象。如果是透明的，那就不再区分，对客户端而言，
都是组件对象，具体的类型对于客户而言是透明的，是客户无需关心的。

2.1、透明性的实现：
  如果把管理子组件的操作定义在Component中，那么客户端只需要面对Component，而无需关心具体的组件类型，这种实现方式
就是透明性的实现。也是标准的组合模式的定义。
  但是透明性的实现是以安全性为代价的，因为Component中管理子组件的操作对客户是透明的，当客户使用叶子对象使用管理
子组件的操作就会出现异常，这样操作是不安全的。

2.2、透明性和安全性实现方式的选择：
  对于组合模式而言，在安全性和透明性上，会更看重透明性，毕竟组合模式的功能就是要让客户端对叶子对象和组合对象的使用具有一致性
  而且对于安全性的实现，需要区分是组合对象还是叶子对象，但是有的时候在强制类型转换，强制类型转换反而是不够安全的，
针对这种问题，需要在Component额外声明判断是组合对象还是叶子对象的方法，根据判断结果在强制转换
  因此在使用组合模式时，建议多采用透明性的实现方式，Component提供默认实现，少采用安全性的实现方式

3、父组件引用：
  父组件引用指的是：子组件对象到父组件对象的引用
  简单的方案：在保持父组件到子组件引用的基础上，在增加保持从子组件到父组件的引用，这样在删除或调整一个组件对象时，
可以通过调整父组件的引用来实现。通常在组合对象添加、删除、调整子组件对象时，为子组件对象重新父组件的方式来维护父组件引用。

4、环状引用：
  环状引用指的是：在对象结构中，某个对象包含的子对象，或者子对象的子对象，或是子对象的子对象的子对象，经过N层后，
出现所包含的子对象中有这个对象本身，从而在组合模式中的树形结构出现了环状引用。
  简单来说就是A包含B，B包含C，C包含A，这种组合关系形成了环状引用，这是要避免的。
  检测是否有环状引用的情况：简单方案是：记录每个组件从根节点开始的路径，环状引用的标志是在一条路由中，
某个对象出现两次。因此通过这个特性来判断是否存在环状引用。
```

五、优点: 
```
1、定义了包含基本对象和组合对象的类层次结构
2、统一了组合对象和叶子对象
3、简化了客户端调用
4、更容易扩展，节点自有增加
```

六、缺点: 
```
1、很难限制组合中的组件类型
2、在使用组合模式时，组合对象和叶子对象的声明都是实现类，而不是接口，违反了依赖倒置原则
```

七、使用场景: 
```
1、需要表示对象的部分-整体层次结构，可以选用组合模式，把整体和部分的操作统一起来，是的层次结构实现更简单，
简化客户端的调用
2、需要统一使用组合结构中所有对象

具体场景：
1、Java中Awt和Swing
2、数据字典、树形菜单、文件夹
```

八、注意事项: 
```
Component一般定义时为具体类、抽象类，而不是接口
```

Client.java: 
```Java
package com.mutistic.structural.composite.structure;
import com.mutistic.utils.PrintUtil;
// Client：
// 客户端，通过组件接口来操作组合结果里面的组件对象
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("组合模式[Composite Pattern]");
		// 定义多个Composite对象
		Component root = new Composite();
		Component c1 = new Composite();
		Component c2 = new Composite();
		PrintUtil.two("定义多个Composite对象", "root，c1，c2");
		// 创建多个叶子对象
		Component l1 = new Leaf();
		Component l2 = new Leaf();
		Component l3 = new Leaf();
		PrintUtil.two("创建多个叶子对象", "l1，l2，l3");
		// 组合成树形结构
		root.addChild(c1);
		root.addChild(c2);
		root.addChild(l1);
		c1.addChild(l2);
		c2.addChild(l3);
		PrintUtil.two("组合成树形结构", "root包含c1,c2,l1。c1包含l2，c2包含l3");
		// 操作Component对象
		PrintUtil.two("操作Root Component对象", root);
		root.opeartion();
		Component comp = root.getChildrend(1);
		PrintUtil.two("操作root.getChildrend(1)", comp);
		comp.opeartion();
	}
}
```
Component.java: 
```Java
package com.mutistic.structural.composite.structure;
// Component：
// 抽象的组件对象，为组合中的对象什么接口，让客户端可以通过这个接口来访问和管理整个对象结构，可以在内部为定义的功能提供默认的实现
public abstract class Component {
	/**
	 * 示意方法，子组件对象可能有的功能方法 
	 */
	public abstract void opeartion();
	/**
	 * 向组合对象中加入组件对象
	 * @param child 被加入组合对象中的组件对象
	 */
	public void addChild(Component child) {
		// 默认的实现，抛出异常，叶子对象或子组件未重写该方法时，Component对象本身不支持该方法
		throw new UnsupportedOperationException("Component对象不支持addChild()方法");
	}
	/**
	 * 从组合对象中移除组件对象
	 * @param child 被移除组件对象
	 */
	public void removeChild(Component child) {
		// 默认的实现，抛出异常，叶子对象或子组件未重写该方法时，Component对象本身不支持该方法
		throw new UnsupportedOperationException("Component对象不支持removeChild()方法");
	}
	/**
	 * 获取某个索引对应的组件对象
	 * @param index 索引
	 * @return 索引对应的组件对象
	 */
	public Component getChildrend(int index) {
		// 默认的实现，抛出异常，叶子对象或子组件未重写该方法时，Component对象本身不支持该方法
		throw new UnsupportedOperationException("Component对象不支持getChildrend()方法");
	}
}
```
Composite.java: 
```Java
package com.mutistic.structural.composite.structure;
import java.util.ArrayList;
import java.util.List;
import com.mutistic.utils.PrintUtil;
// Composite：
// 组合对象，通常会存储子组件即叶子节点，定义包含子组件的那些组件的行为，并实现在组件接口中定义的与子组件有关的操作
public class Composite extends Component {
	/** 用来存储组合对象中包含的子组件对象集合 */
	private List<Component> childComps;
	/**
	 * 示意方法，组合对象中通里面需要实现递归的调用
	 * @see com.mutistic.structural.composite.structure.Component#opeartion()
	 */
	@Override
	public void opeartion() {
		if (childComps == null) {
			return;
		}
		for (Component comp : childComps) {
			// 递归的进行子组件相应方法的调用
			PrintUtil.three("递归的进行子组件相应方法的调用", comp);
			comp.opeartion();
		}
		PrintUtil.println();
	}
	/**
	 * 向组合对象中加入组件对象
	 * @param child 被加入组合对象中的组件对象
	 * @see com.mutistic.structural.composite.structure.Component#addChild(com.mutistic.structural.composite.structure.Component)
	 */
	@Override
	public void addChild(Component child) {
		if(childComps == null) {
			childComps = new ArrayList<Component>();
		}
		childComps.add(child);
	}
	/**
	 * 从组合对象中移除组件对象
	 * @param child 被移除组件对象
	 * @see com.mutistic.structural.composite.structure.Component#removeChild(com.mutistic.structural.composite.structure.Component)
	 */
	@Override
	public void removeChild(Component child) {
		if(child != null && childComps != null) {
			childComps.remove(child);
		}
	}
	/**
	 * 获取某个索引对应的组件对象
	 * @param index 索引
	 * @return 索引对应的组件对象
	 * @see com.mutistic.structural.composite.structure.Component#getChildrend(int)
	 */
	@Override
	public Component getChildrend(int index) {
		if(childComps == null) {
			return null;
		}
		return childComps.get(index);
	}
}
```
Leaf.java: 
```Java
package com.mutistic.structural.composite.structure;
import com.mutistic.utils.PrintUtil;
// Leaf：
// 叶子节点对象，定义和实现叶子对象的行为，不再包含其他的子节点对象
public class Leaf extends Component {
	/**
	 * 示意方法，叶子对象可能有的方法
	 * @see com.mutistic.structural.composite.structure.Component#opeartion()
	 */
	@Override
	public void opeartion() {
		PrintUtil.three("叶子对象可能有的方法", this);
	}
}
```

---
### <a id="a_decorator">十八、装饰模式[Decorator Pattern]</a> <a href="#a_composite">last</a> <a href="#a_flyweight">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M11_DecoratorPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M11_DecoratorPattern.png)<br/>

一、定义、本质: 
```
定义: 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式比生成子类更为灵活
本质: 动态组合
```

二、结构和说明: 
```
Component：组件对象的接口，可以给这对象动态的添加职责。

ConcreteComponent：具体的组件对象，实现组件对象接口，通常就是被装饰器装的原始对象，也就是可以给这个对象添加职责。

Decorator：所有装饰器的抽象父类，需要定义一个与组件接口一致的接口，并持有一个Component对象，其实就是持有一个被装饰的对象。
  注意这个被装饰的对象不一定是最原始的那个对象了，也可能是被其它装饰器装饰过后的对象，实现的同一个接口，也就是同一类型。

ConcreteDecorator：实际的装饰器对象，实现具体要向被装饰对象添加的功能。
```

三、理解: 
```
主要解决：一般的，为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
如何解决：将具体功能职责划分，同时继承装饰者模式。

1、装饰模式的功能：
  装饰模式能够实现动态的为对象添加功能，是从一个对象外部来给对象增加功能，相当于是改变了对象的外观。
当装饰过后，从外部使用系统的角度看就不再是，使用原始的那个对象了，而是使用被一系列的装饰器装饰过后的对象。
  这样就能够灵活的改变一个对象的功能，只要动态组合的装器发生了改变，那么最终所得到的对象的功能也就发生了改变
  变相的还得到了另外一个好处，那就是装饰器功能的复用，可以给一个对象多次增加同一个装饰器，也可以用同一个装饰器装饰不同的对象。

2、对象组合：
  在面向对象设计中，有一条很基本的规则就是“尽量使用对象组合，而不是对象继承”来扩展和复用功能，装饰模式的思考起点就是这个规则

3、装饰器：
  装饰器实现了对被装饰对象的某些装饰功能，可以在装饰器里调用被装饰对象的功能，获取相应的值，这其实是一种递归。
  在装饰器里不仅仅是可以给被装饰对象增加功能，还可以根需要选择是否调用被装饰对象的功能，
如果不调用被装饰对象的功能，那就变成完全重新实现了，相当于动态修改了被装饰对象的功能。 
  另外，各个装饰器之间最好是完个独立的功能，不要有依赖，这样在进行装饰组合的时候，才没有先后顺序的限制，
也就是先装饰谁和后装饰谁都应该是一样的，否则会降低装饰器组合的灵活性。

4、装饰器和组件类的关系：
  装饰器是用来装饰组件的，装饰器一定要实现和组件类一致的接口，保证它们是同一个类型，并具有同一个外观，
这样组合完成的装饰才能够递归的调用下去。
  组件类是不知道装饰器的存在的，装饰器给组件添加功能是一种透明的包装，组件类毫不知情。
需要改变的是外部使用组件类的地方，现在需要使用包装后的类，接口是一样的，但是具体的实现类发生了改变。
```

四、写法: 
```
1、退化形式：
  如果仅仅只是想要添加一个功能，就没有必要再设计装饰器的抽象类了，
直接在装饰器里面实现跟组件一样的接口，然后实现相应的装饰功能就可以了。
  但是建议最好还是设计上装饰器的抽象类，这样有利于程序的扩展。

2、Java中的装饰模式应用：I/O流
  I/0流结构和装饰模式的结构几乎是一致的：
  2.1、InputStream就相当于装饰模式中的Component
  2.2、其实FileInputStream、ObjectInputStream、StringBufferInputStream这几个对象是
直接接继承了InputStream，还有几个直接继承InputStream的对象，比如：ByteArrayInputStream、PipedInputStream等。
这些对象相当于装饰模式中的Concretecomponent，是可以被装饰器装饰的对象。
  2.3、那么FilterInputStream就相当于装饰模式中的Decorator，而它的子类
  DataInputStream、BfferedInputStrearm、LineNumberInputStream、PushbackInputStream 就相当于装饰模式中的ConcreteDecorator了。
另外FilterInputStream和它的子类对象的构造器，都是传入组件Inputstrealll类型，
  这打就完个符合装饰器的结构了。

3、装饰模式和AOP：
  AOP：Aspect Oriented Programming的缩写，意为：面向切面编程。
  通过预编译方式和运行期动态代理实现程序功能的统一维护的一种技术。
AOP是OOP的延续，是软件开发中的一个热点，也是Spring框架中的一个重要内容，是函数式编程的一种衍生范型。
利用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各部分之间的耦合度降低，
提高程序的可重用性，同时提高了开发的效率

  可以使用装饰模式实现类似AOP的功能
```

五、优点: 
```
1、比继承更灵活
2、更容易复用功能
3、简化高层定义
4、更好的扩展性，装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能
```

六、缺点: 
```
1、会产生很多细粒度对象
2、多层装饰比较复杂
```

七、使用场景: 
```
1、如果需要在不影响其它对象的情况下，以动态、透明的方式给对象添加职责，可以使用装饰模式，这几乎就是装饰模式的主要功能
2、如果不合适使用子类来进行扩展的时候，可以考虑使用装饰模式，因为装饰模式是使用的“对象组合"的方式。
所谓不适合用子类扩展的方式，比如：扩展功能需要的子类太多，造成子数目呈爆炸性增长。
3、动态增加功能，动态撤销

具体场景：
1、Java中的I/O流
2、Spring AOP功能
```

八、注意事项: 
```
可代替继承
```

Client.java: 
```Java
package com.mutistic.structural.decorator.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Client：客户端 
 * 演示 装饰模式[Decorator Pattern]-结构
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("装饰模式[Decorator Pattern]-结构");
		
		Component component = new ConcreteComponent();
		PrintUtil.two("创建具体组件对象：", component);
		
		Decorator decorator1 = new ConcreteDecoratorA(component);
		PrintUtil.two("创建具体的装饰对象：", decorator1);
		decorator1.operation();
		
		Decorator decorator2 = new ConcreteDecoratorB(component);
		PrintUtil.two("创建具体的装饰对象：", decorator2);
		decorator2.operation();
	}
}
```
Component.java: 
```Java
package com.mutistic.structural.decorator.structure;
/**
 * Component：
 * 组件对象的接口，可以给这对象动态的添加职责。
 */
public abstract class Component {
	/**
	 * 定义：示意组件对象的通用方法
	 */
	public abstract void operation();
}
```
ConcreteComponent.java: 
```Java
package com.mutistic.structural.decorator.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteDecorator：
 * 实际的装饰器对象，实现具体要向被装饰对象添加的功能。
 */
public class ConcreteComponent extends Component {
	/**
	 * 示意组件对象的通用方法的具体实现
	 * @see com.mutistic.structural.decorator.structure.Component#operation()
	 */
	@Override
	public void operation() {
		PrintUtil.three("ConcreteComponent.operation()", "示意组件对象的通用方法的具体实现");
	}

}
```
Decorator.java: 
```Java
package com.mutistic.structural.decorator.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Decorator：
 * 所有装饰器的抽象父类，需要定义一个与组件接口一致的接口，并持有一个Component对象，其实就是持有一个被装饰的对象。
 * 注意这个被装饰的对象不一定是最原始的那个对象了，也可能是被其它装饰器装饰过后的对象，实现的同一个接口，也就是同一类型。
 */
public class Decorator extends Component {
	/** 持有组件对象 */
	private Component component;
	/**
	 * 构造函数：传入具体的组件对象
	 * @param component 具体的组件对象
	 */
	public Decorator(Component component) {
		super();
		this.component = component;
	}
	/**
	 * 负责转发给具体的组件对象，可以在转发前后添加附加功能 
	 * @see com.mutistic.structural.decorator.structure.Component#operation()
	 */
	@Override
	public void operation() {
		PrintUtil.three("Decorator.operation()", "负责转发给具体的组件对象，可以在转发前后添加附加功能 ");
		component.operation();
		PrintUtil.three("Decorator.operation()", "转发结束");
	}
}
```
ConcreteDecoratorA.java: 
```Java
package com.mutistic.structural.decorator.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteDecorator：
 * 实际的装饰器对象，实现具体要向被装饰对象添加的功能。
 */
public class ConcreteDecoratorA extends Decorator{
	/**
	 * 构造函数：传入具体的组件对象
	 * @param component 具体的组件对象
	 */
	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	/**
	 * 重写Decorator的operation，实现具体的装饰功能
	 * @see com.mutistic.structural.decorator.structure.Decorator#operation()
	 */
	@Override
	public void operation() {
		// 调用父类的方法，可以在调用前后添加附加动作
		super.operation(); 
		this.assedState = "SUCCESS";
		PrintUtil.three("ConcreteDecoratorA.assedState", assedState);
	}
	/** 添加的状态 */
	private String assedState;
	/**
	 * 获取：添加的状态 
	 * @return 添加的状态
	 */
	public String getAssedState() {
		return assedState;
	}
	/**
	 * 设置：添加的状态
	 * @param assedState 添加的状态
	 */
	public void setAssedState(String assedState) {
		this.assedState = assedState;
	}
}
```
ConcreteDecoratorB.java: 
```Java
package com.mutistic.structural.decorator.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteDecorator：
 * 实际的装饰器对象，实现具体要向被装饰对象添加的功能。
 */
public class ConcreteDecoratorB  extends Decorator {
	/**
	 * 构造函数：传入具体的组件对象
	 * @param component 具体的组件对象
	 */
	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	/**
	 * 重写Decorator的operation，实现具体的装饰功能
	 * @see com.mutistic.structural.decorator.structure.Decorator#operation()
	 */
	@Override
	public void operation() {
		// 调用父类的方法，可以在调用前后添加附加动作
		super.operation(); 
		addedBehavior();
	}
	/**
	 * 添加的职责
	 */
	private void addedBehavior() {
		PrintUtil.three("ConcreteDecoratorB.addedBehavior()", "添加的职责");
	}
}
```


---
### <a id="a_flyweight">十九、享元模式[Flyweight Pattern]</a> <a href="#a_decorator">last</a> <a href="#a_bridge">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M12_FlyweightPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M12_FlyweightPattern.png)<br/>

一、定义、本质: 
```
定义: 运用共享技术有效地支持大量细粒度的对象
本质: 分离与共享
```

二、结构和说明: 
```
Flyweight：享元接口，通这个接口flyweight可以接受并作用于外部状态。通过这个接口传入外部的状态，
在享元对象的方法处理中可能会使用这些外部的数据

ConcreteFlyweight：具体的享元实现对象，必须是可共享的，需要封装flweight的内部状态

UnsharedConcreteFlywelght：非共享的享元实现对象，并不是所有的Flyweight实现对象都需要共享。
非共享的享元实现对象通常是对共享享元对象的组合对象。

FlyweightFactory：享元工厂，主要用来创建并管理共享的相关对象，并对外提供访问共享享元的接口。

Client：享元客户端，主要的作是维持一个对flweight的引用，计算或存储享元对象的外部状态，
当然这里可以访问共享和不共享的flyweight对象。
```

三、理解: 
```
主要解决：在有大量对象时，有可能会造成内存溢出，把其中共同的部分抽象出来，如果有相同的业务请求，
直接返回在内存中已有的对象，避免重新创建。
如何解决：用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象。

1、变与不变：
  享元模式设计的重点就在于分离变与不变，把一个对象的状态分成内部状态和外部状态，内部状态是不变的，外部状态是可变的。
然后通过共享不变的部分，达到减少对象数量并节约内存的目的。在享元对象需要的时候，可以从外部传入外部状态给共享的对象，
共享对象会在功能处理的时候，使用自己内部的状态和这些外部的状态。

2、共享与不共享：
  在享元模式中，享元对象又有共享与不共享之分，这种情况通常出现在跟组合模式合用的情况，通共享的是叶子对象，
一般不共享的部分是由共享部分组合而成的，由于所有细粒度的叶子对象都己经缓存了，那么缓存组合对象就没有什么意义了

3、内部状态和外部状态：
  享元模式的内部状态，通指的是包含在享元对象内部的、对象本身的状态，通是独立于使用享元的场景的信息，
一般创建过后就不再变化的状态，因此可以共享。
  外部状态指的是享元对象之外的状态，取决于使用享元的场景，会根据使用场景而变化，因此不可共享。
如果享元对象需要这些外部状态的话，可以从外部传递到享元对象里面，比如通过方法的参数来传递。
  也就是说享元模式真正缓存和共享的数据是享元的内部状态，而外部状态是不应该被缓存共享的。
  另外，内部状态和外部状态是独立的，外部状态的变化不应该影响到内部状态。

4、实例池：
  在享元模式中，为了创建和管理共享的享元部分，引入了享元工厂，享元工厂中一般都包含有享元对象的实例池，
享元对象就是缓存在这个实例池中的
  所谓实例池：指的是缓存和管理对象实例的程序，通常实例池会提供对象实例的运行环境，并控制对象实例的生命周期
  工业级的实例池实现上有两个最基本的难点：
  一个就是动态控制实例数量，
  一个就是动态分配实例来提供给外部使用这些都是需要算法来做保证的。

  回到享元模式中来，享元工厂中的实例池可没有这么复杂，因为共享的享元对象基本上都是一个实例，
一般不会现同一个享元对象有多个实例的情况，这样就不用去考虑动态创建和销毁享元对象实例的功能。
另外只有一个实例，也就不存在动态调度的麻烦，反正就是它了。
  这也主要是因为享元对象封装的多半是对象的内状态，这状态通常是不变的有一个实例就够了，
不需要动态控制生命周期，也不需要动态调度，它只需要做一个缓存而已，没有上升到真上的实例池的高度。

5、初始化共享对象：
  在享元模式中，通是在第一次向享元工厂请求获取共享对象的时候，进行共享对象的初始化，而且多半都是在享元工厂内部实现，
不会从外部传入共享对象。当然可以从外部传入一些创建共享对象需要的值，享元工厂可以按照这些值去初始化需要共享的对象，
然后就把创建好的共享对象的实例放入享元工厂内部的缓存中，以后再请求这个共享对象的时候就不用再创建了。
```
```
扩展1：权限管理：
  几乎所有的权限系统都分成两个部分，一个是授权部分，一个是验证部分，为了解它们，首先解释两个基本的名词，安全实体和权限。
  安全实体：就是被权限系统检测的对象。
  权限：就是需要被校验的权限对象，比如查看、修改等。
  
  安全实体和权限通要一起描述才有意义，比如有这么个描述：“现在要检测登录人员对工资数据是否有查看的权限"
  “工资数据”这个安全实体和“查看"这个权限一定要起描述。如果只出现安全实体描述，那就变成这样：“现在要检测登录人员对工资数据"，
对工资数据做什么操作，没有后面的操作，就不完成。当然只有权限描述也不行，那就变成这样：“现在要检测登录人员是对工资数据”
，对谁的查看权限啊，也不完整。所以安全实体和权限通要一起描述

扩展2：授权和验证：
  所谓授权是指：把对某安全实体的某些权限分配给某人员的过程。
  所谓验证是指：判断某个人员对某个安全实体是否拥有某个或某些权限的过程。
  
  也就是说，授权过程即是权限的分配过程，而验证过程则是权限的匹配过程在目前应用系统的开发中，
多数是利用数据库来存放授权过程产生的数据，也就是说，授权是向数据库里面添加数据、或是维护数据的过程，
而匹配过程就变成了从数据中获取相应数进行匹配的过程了。
  
扩展3：权限的两个特征：
  特征1：权限的继承性：指的是：如果多个安全实体存在包含关系，而某个安全实体没有相应的权限限制，
那么它会继承包含它的安全实体的相应权限。

  特征2：权限的最近匹配原则：指的是，如果多个安全实体存在包含关系，而某个安全买体没有相应的权限限制，
那么它会向上寻找并匹配相应权限限制，直到找到一个离这个安全实体最近的拥有相应权限限制的安全实体为止。
如果把整个层次结构都寻找完了都没有匹配到相应权限制的诩，那就说明所有人对这个安全实体都拥有这个相应的权限限制。
```

四、写法: 
```
1、复合享元：不需要共享的享元实现
  在实际开发中，存在不需要共享的享元实现，这种情况多出现在组合结构中，对于使用已经缓存的享元组合出来的对象，
就没有必要再缓存了，也就是把已经缓存的享元当做叶子节点，组合出来的组合对象就不需要再被缓存了。
也把这种享元称为复合享元。
  比如要给某人分配“薪资数据”这个安全实体的“修改”权限，那么一定会把“薪资数据”的“查看权限”也分配给这个人，
如果按照前面的做法，这就需要分配两个对象，为了方便，干脆把这两个描述组合起来，打包成一个对象，
命名成为“操作薪资数据”，那么分配权限的时候，可以这么描述：
     把 “操作薪资数据” 分配给 张三
  这句话的意思就相当于:
     把 “薪资数据” 的 “查看”权限 分配给 张三
     把 “薪资数据” 的 “修改”权限 分配给 张三
  这样一来，“操作薪资数据”就相当于是一个不需要共享的享元，它实际由享元“薪资数据的查看权限”，
和享元“薪资数据的修改权限”这两个享元组合而成，因此“操作薪资数据”本身也就不需要再共享了。

2、对享元对象的管理：
  虽然享元模式对于共享的享元对象实例的管理要求，没有实例池对实例管理的要求那么高，
但是也还是有很多自身的特点功能，比如：引用计数、垃圾清除等。
  所谓引用计数：就是享元工厂能够记录每个享元被使用的次数。
  所谓垃圾：就是在缓存中存在，但是不再需要被使用的缓存中的对象。而垃圾清除，就是在不需要这些数据的时候，
应该把这些数据从缓存中清除，释放相应的内存空间，以节省资源

  2.1、实现引用计数的基本思路：
  要实现引用计数，就在享元工厂里面定义一个Map，它的key值跟缓存享元对象的key是一样的，
  而value就是被引用的次数，这样当外部每次获取该享元的时候，就把对应的引用计数取出来加1，然后再记录回去。

  2.2、实现垃圾回收的基本思路：
  要实现垃圾回收，首先要能确定哪些是垃圾？其次是何时回收？由谁来回收？如何回收？
  解决了这些问题，也就能实现垃圾回收了。
  确定哪些是垃圾的一个简单方案是这样的，定义一个缓存对象的配置对象，在这个对象中描述了缓存的开始时间和最长不被使用的时间，
这个时候判断是垃圾的计算公式如下：当前的时间_缓存的开始时间 >= 最长不被使用的时间。
当然，每次这个对象被使用的时候，就把那个缓存开始的时间更新为使用时的当前时间，也就是说如果一直有人用的话，这个对象是不会被判断为垃圾的。
  何时回收的问题，当然是判断出来是垃圾了就可以回收了。
  关键是谁来判断垃圾，还有谁来回收垃圾的问题。一个简单的方案是定义一个内部的线程，这个线程在享元工厂被创建的时候就启动运行。
由这个线程每隔一定的时间来循环缓存中所有对象的缓存配置，看看是否是垃圾，如果是垃圾，那就可以启动回收了。
  如何回收，这个就是直接从缓存的map对象中删除掉相应的对象，让这些对象没有一用的地方，那么这些对象就可以等着被虚拟机的垃圾回收来回收掉了。
```

五、优点: 
```
1、减少对象的数量和创建，节省内存空间
```

六、缺点: 
```
1、维护共享对象，需要额外开销
2、提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，
不应该随着内部状态的变化而变化，否则会造成系统的混乱
```

七、使用场景: 
```
1、如果一个应用程序使用了大量的细粒度对象，可以使用享元模式来减少对象数量
2、如果由于使用大量的对象，造成很大的存储开销，可以使用享元模式来减少对象数量，并兯约内存
3、如果对象的大多数状态都可以转变为外状态，比如通过计算得到，或是外部传入等，可以使用享元模式来实现内部状态和外部状态的分离
4、如果不考虑的外部状态，可以用相对较少的共享对象取代很多组合对象，可以使用享元模式来共享对象，然后组合对象来使用这些共享对象

具体场景：
1、JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。
2、数据库的数据池
```

八、注意事项: 
```
1、注意划分外部状态和内部状态，否则可能会引起线程安全问题。
2、这些类必须有一个工厂对象加以控制。 
```

Client.java: 
```Java
package com.mutistic.structural.flyweight.structure;
import com.mutistic.utils.PrintUtil;
// Client：
// 享元模式[Flyweight Pattern]-结构
// 享元客户端，主要的作是维持一个对flweight的引用，计算或存储享元对象的外部状态，当然这里可以访问共享和不共享的flyweight对象。
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("享元模式[Flyweight Pattern]-结构");
		
		FlyweightFactory factory = new FlyweightFactory();
		PrintUtil.two("Client创建享元工厂实例： ", factory);
		
		Flyweight f1 = factory.getFlyweight("Concrete1");
		f1.opeartion("ConcreteFlyweight");
		
		Flyweight f2 = factory.getFlyweight("Unshared1");
		f2.opeartion("UnsharedConcreteFlywelght");
	}
}
```
Flyweight.java: 
```Java
package com.mutistic.structural.flyweight.structure;
// Flyweight：
// 享元接口，通这个接口flyweight可以接受并作用于外部状态。通过这个接口传入外部的状态，在享元对象的方法处理中可能会使用这些外部的数据
public interface Flyweight {
	/**
	 * 定义：示例操作方法，传入外部状态 
	 * @param extrinsicState 示例参数：外部状态 
	 */
	void opeartion(String extrinsicState);
}
```
ConcreteFlyweight.java: 
```Java
package com.mutistic.structural.flyweight.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteFlyweight：
// 具体的享元实现对象，必须是可共享的，需要封装flweight的内部状态
public class ConcreteFlyweight implements Flyweight {
	/** 描述：享元对象的内部状态的数据 */
	private String state;
	/**
	 * 构造函数：传入享元对象的内部状态的数据
	 * @param state 享元对象的内部状态的数据
	 */ 
	public ConcreteFlyweight(String state) {
		this.state = state;
		PrintUtil.two("ConcreteFlyweight()：构造函数：传入享元对象的内部状态的数据: ", this.state);
	}
	/**
	 * 示例具体的操作方法，传入外部状态 
	 * @param extrinsicState 外部状态 
	 * @see com.mutistic.structural.flyweight.structure.Flyweight#opeartion(java.lang.String)
	 */
	@Override
	public void opeartion(String extrinsicState) {
		PrintUtil.three("ConcreteFlyweight.opeartion()：示例具体的操作方法，传入外部状态: ", extrinsicState);
	}
}
```
UnsharedConcreteFlywelght.java: 
```Java
package com.mutistic.structural.flyweight.structure;
import com.mutistic.utils.PrintUtil;
// UnsharedConcreteFlywelght：
// 非共享的享元实现对象，并不是所有的Flyweight实现对象都需要共享。非共享的享元实现对象通常是对共享享元对象的组合对象。
public class UnsharedConcreteFlywelght implements Flyweight {
	/** 描述：非享元对象的内部状态的数据 */
	private String allState;
	/**
	 * 设置 非享元对象的内部状态的数据
	 * @param allState 非享元对象的内部状态的数据
	 */
	public void setAllState(String allState) {
		this.allState = allState;
		PrintUtil.two("UnsharedConcreteFlywelght.setAllState()：设置 传入非享元对象的内部状态的数据: ", this.allState);
	}
	/**
	 * 示例具体的操作方法，传入外部状态 
	 * @param extrinsicState 外部状态 
	 * @see com.mutistic.structural.flyweight.structure.Flyweight#opeartion(java.lang.String)
	 */
	@Override
	public void opeartion(String extrinsicState) {
		PrintUtil.three("UnsharedConcreteFlywelght.opeartion()：示例具体的操作方法，传入外部状态: ", extrinsicState);
	}
}
```
FlyweightFactory.java: 
```Java
package com.mutistic.structural.flyweight.structure;
import java.util.HashMap;
import java.util.Map;
import com.mutistic.utils.PrintUtil;
// FlyweightFactory：
// 享元工厂，主要用来创建并管理共享的相关对象，并对外提供访问共享享元的接口。
public class FlyweightFactory {
	/** 缓存多个Flyweight对象 */
	private Map<String, Flyweight> flyMap = new HashMap<String, Flyweight>();
	/**
	 * 获取key对应的享元对象 
	 * @param key
	 * @return
	 */
	public Flyweight getFlyweight(String key) {
		Flyweight fly = flyMap.get(key);
		if(fly == null) {
			if(key.contains("Unshared")) {
				UnsharedConcreteFlywelght unshared = new UnsharedConcreteFlywelght();
				unshared.setAllState(key);
				fly = unshared;
			} else {
				fly = new ConcreteFlyweight(key);
			}
			
			flyMap.put(key, fly);
			PrintUtil.three("key="+ key +"对应的享元对象，不存在创建一个享元对象存放在缓存集合中", fly);
		}
		return fly;
	}
}
```

---
### <a id="a_bridge">二十、桥接模式[Bridge Pattern]</a> <a href="#a_flyweight">last</a> <a href="#a_filter">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M13_BridgePattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M13_BridgePattern.png)<br/>

一、定义、本质、原则: 
```
定义: 将抽象部分与它的实现部分分离，使它们都可以独立地变化
本质: 分离抽象和实现
原则: 体现了开闭原则：
  体现开闭原则：通常引用桥接模式的地方，抽象部分和实现部分都是可以变化的，也就是应用会有两个变化维度，
桥接模式就是找到这两个变化，并分别封装起来，从而合理的实现OCP
  桥接模式很好的体现了：多用对象组合，少用对象继承
```

二、结构和说明: 
```
Abstraction：抽象部分的接口。通常在这个对象里面，要维护一个实现部分的对象引用，在抽象对象里面的方法，
需要调用实现部分的对象来完成。这个对象里面的方法，通常都是具体的业务相关的方法

RefinedAbstraction：扩展抽象部分的接口，通常在这些对象里面，定义跟实际业务相关的方法，
这些方法的实现通常会使用Abstraction中定义的方法，也可能需要调用实现部分的对象来完成

Implementor：定义实现部分的接口，这个接口不用和Abstraction里面的方法一致，
通常是由Implementor接口提供基本的操作，而Abstraction而定义的是基于这些基本操作的务方法，
也就是说Abstraction定义了基于这些基本操作的较高层次的操作

ConcreteImplementor：真正实现Implementor接口的对象
```

三、理解: 
```
主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
如何解决：把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。

1、什么是桥接：
  所谓桥接，通俗点说就是在不同的东西之间搭一个桥，让他们能够连接起来，可以相互通讯和使用。
那么在桥接模式中到底是给什么东西来搭桥呢？就是为被分离了的抽象部分和实现部分来搭桥。
  在桥接模式中的桥接是单向的，也就是只能是抽象部分的对象去使用具体实现部分的对象，而不能反过来，也就是个单向桥。

2、为何需要桥接：
  为了达到让抽象部分和实现部分都可以独立变化的目的，在桥接模式中，是把抽象部分和实现分分离开来的，
虽然从程序结构上是分开了，但是在抽象部分实现的时候，还是需要使用具体的实现的，抽象部分如何才能调用到
具体实现部分的功能呢？很简单，搭个桥，让抽象部分通过这个桥就可以调用到实现分的功能了，因此需要桥接。

3、如何桥接：
  只要让抽象部分拥有实现部分的接口对象，这就桥接上了，在抽象部分就可以通过这个接口来调用具体实现部分的功能。
也就是说，桥接在程序上就体现成在抽象部分拥有实现部分的接口对象，维护桥接就是维护这个关系。

4、独立变化：
  桥接模式的意图：使得抽象和实现可以独变化，都可以分别扩充。也就是说抽象部分和实现部分是一种非常松散的关系，
从某个角度来讲，抽象部分和实现部分是可以完全分开的，独立的，抽象部分不过是一个使用实现部分对外接口的程序
  如果这么看桥接模式的话，就类似于策略模式了，抽象部分需要根据某个策略，来选择真实的实现，
也就是说桥接模式的抽象部分相当于策略模式的上下文。更原始的就直接类似于面向接口编程，通过接口分离的两个部分而己。
但是桥接模式的抽象部分，是可以继续扩展和变化的，而策略模式只有上下文，是不存在所谓抽象部分的。
  那抽象和实现为何还要组合在一起呢？原因是在抽象部分和实现部分还是存在内部联系的，
抽象部分的实现通是需要调用实现部分的功能来实现的

5、谁来桥接：
  所谓谁来桥接，就是谁来负责创建抽象部分和实现部分的关系，说得更直白点，就是谁来负责创建Implementor的对象，
并把它设置到抽象部分的对象里面去，这点对于使用桥接模式来说，是十分重要的一点。
  大致有如下几种实现方式：
  5.1、由客户端负责创建Implementor的对象，并在创建抽象部分的对象的时候，把它设置到抽象部分的对象里面去
  
  5.2、可以在抽象部分的对象构建的时候，由抽象部分的对象自己来创建相应的Implementor的对象，
当然可以给他传递参数，它可以根据参数来选择并创建具体的Implementor的对象
  两种情况：一种是需要外部传入参数，一种是不需要外部传入参数
  
  5.3、可以在Abstraction中选择并创建一个缺省的Implementor的对象，然后子类可以根据需要改变这个实现
  直接在Abstraction的构造方法中，创建一个缺省的Implementor对象，然后子类根据需要，看是直接使用还是覆盖掉。
  
  5.4、也可以使用抽象工厂或者简单工厂来选择并创建具体的Implementor的对象，
抽象部分的类可以诵过调用工厂的方法来获取Implementor的对象
  对于这种方式，根据具体需要来选择，如果是想要创建一系列实现对象，那就使用抽象工厂，
如果是创建单个的实现对象，那就使用简单工厂。
  这种方法的优点是Abstraction类不用和任何一个Implementor类直接耦合。

  5.5、如果使用Ioc/DI容器的话，还以通过Ioc/DI容器来创建具体的Implementor的对象，并注入回到Abstraction中
  对于这种方式，Abstraction的实现就更简单了，只需要实现注入Implementor对象的方法就可以了，其它的Abstraction就不管了。
  Ioc/DI容器会负责创建Implementor对象，并设置回到Abstraction对象中，使用Ioc/DI的方式，
并不会改变Abstraction和Implementor的关系，Abstraction同样需要持有相应的Implementor对象，同样会把功能委托给Implementor对象去实现。
```

四、写法: 
```
1、动态变换功能：
  由于桥接模式中的抽象部分和实现部分是完全分离的，因此可以在运行时动态组合具体的真实实现，从而达到动态变换功能的目的。
  从另外一个角度看，抽象部分和实现部分没有固定的绑定关系了，因此同一个真实实现可以被不同的抽象对象使用，
反过来，同一个抽象也可以有多个不同的实现。

2、退化的桥接模式：
  如果Implementor只有一个实现，那么就没有必要创建Implementor接口了，这是一种桥接模式退化的情况。
这个时候Abstraction和Implementor是一对一的关系，虽然如此，也还是要保持它们的分离状态，这样的话，
它们才不会相互影响，才可以分别扩展。
  也就是说，就算不要Implementor接口，也要保持Abstraction和Implementor是分离的，模式的分离机制仍然是非常有用的

3、桥接模式和继承：
  继承：是扩展对象功能的一种常见手段，通常情况下，继承扩展的功能变化纬度都是一纬的，
也就是变化的因素只有一类。
对于出现变化因素有两类的，也就是有两个变化纬度的情况，继承实现就会比较复杂。
从理论上来说，如果用继承的方式来实现这种有两个变化纬度的情况，
最后实际的实现类应该是两个纬度上可变数量的乘积。
如果要在任何一个纬度上进行扩展，都需要实现另外一个纬度卜的可变数量那么个实现类，
这也是为何会感到扩展起来很困难。而随着程序规模的加大，会越来越难以扩展和维护。
  
  桥接模式：就是用来解决这种有两个变化纬度的情况下，如何灵活的扩展功能的一个很好的方案。
其实，桥接模式主要是把继承改成了使用对象组合，从而把两个纬度分开，让每一个纬度单独去变化，
最后通过对象组合的方式，把两个纬度组合起来，每一种组合的方式就相当于原来继承中的一种实现，
这样就有效的减少了实际实现的类的个数。
从理论上来说，如果用桥接模式的方式来实现这种有两个变化纬度的情况，
最后实际的实现类应该是两个纬度上可变数量的和
  
  从侧面体现了，使用对象组合的方式比继承来的更灵活

4、典型的实现-JDBC：
  在Java应用中，对于桥接模式有一个非常典型的例子，就是：应用程序使用JDBC驱动程序过行开发的方式。
  所谓驱动程序，指的是按照预先约定好的接口来操作计算机系统或者是外围设备的程序。
  基于JDBC的应用程序，使用JDBC的API相当于是对数据库茶瓯做的抽象的扩展，算作桥接模式的抽象部分；
而具体的接口实现是由驱动来完成的，驱动这边自然就相当于桥接模式的实现部分了。
而桥接的方式，不再是让抽象部分持有实现部分，而是采用了类似于工厂的做法，
通过DriverManager来把抽象部分和实现部分对接起来，从而实现抽象部分和实现部分解耦
  JDBC的这种架构，把抽象和具体分离开来，从而使得抽象和具体邮分都可以独立扩展。
对于应用程而言，只要选用不同的驱动，就可以让程序操作不同的数据库，而无需更改应用程序，
从而实现在不同的数库上移植。对于驱动程序而言，为数据库实现不同的驱动程序，并不会影响应用程序。
  而且，JDBC的这种架构，还合理的划分了应用程序开发人员和驱动程序开发人员的边界。 

5、广义桥接-Java中无处不桥接：
  使用Java编写程序，一个很重要的原则就是“面向接口编程”，说得准确点应该是“面向抽象编程”，
由于在Java丌发中，更多的使用接口而非抽象类，因此通就说成“面向接口编程”了。
  接口把具体的实现和使用接口的客服程序分离开来，从而使得具体的实现和使用接口的客户程序可以分别扩展，而不会相互影响
  
  桥接模式中的抽象部分持有具体实现部分的接口，最终目的是需要通过调用具体实现部分的接口中的方法，
来完成一定的功能，这跟直接使用接口没有什么不同，只是表现形式有点不一样。
再说，使用接口的客户程序也可以持有相应的接口对象，这样从形式上就一样了。
  也就是说，从某个角度来讲，桥接模式不过就是对“而向抽象编程”这个设计原则的扩展。
正是通过具体实现的接口，把抽象部分和具体的实现分离开来抽象部分相当于是使用实现部分接口的客户程序，
这样抽象部分和实现部分就松散耦合了，从而可以实现相互独立的变化。
  这样一来，几乎可以把所有面向抽象编写的程序，都视作是桥接模式的体现，至少算是简化的桥接模式，
就算是广义的桥接吧。而Java编程很强调“面向抽象编程”，因此，广义的桥接，在Java中可以说是无处不在。

  从广义桥接模式的角度来看，熟悉的三层架构其实就是组合使用桥接模式。
桥接模式是可以连续组合使用的，一个桥接模式的实现部分，可以作为下一个桥接模式的抽象部分此类推，
可以从三层架构扩展到四层、五层、百到N层架构，都可以使用桥接模式来组合。
  如果从本质的角度来看，基本上只要是面向抽象编写的Java程序，都可以视为是桥接模式的应用，
都是让抽象和实现相分离，从而，使它们能独立的变化不过只要分离的目的达到了，叫不叫桥接模式就无所谓了。

```

五、优点: 
```
1、分离抽象和实现部分
2、更好的扩展性
3、可动态切换实现
4、可减少子类的个数
```

六、缺点: 
```
1、桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程
```

七、使用场景: 
```
1、如果不希望在抽象和实现部分采用固定的绑定关系，可以采用桥接模式，来把抽象和实现部分分开，
然后在程序运行期间来动态的设置抽象部分需要用到的具体的实现，还可以动态切换具体的实现

2、如果出现抽象部分和实现部分都应该可以扩展的情况，可以采用桥接模式，让抽象部分和实现部分可以独立的变化，
从而可以灵活的进行单独扩展，而不是耦合在一起，扩展一方会影响到另一方

3、如果希望实现部分的修改，不会对客户产生影响，可以采用桥接模式，客户是面向抽象的接口在运行，
实现部分的修改，可以独立抽象部分，也就不会对客户产生影晌了，也可以说对客户是透明的

4、如果采用继承的实现方案，会导致产生很多子类，对于这种情况，可以考虑采用桥接模式，
分析功能变化的原因，是否能分离成不同的纬度，然后通过桥接模式来分离它们，从而减少了类的数目

具体场景：
1、Java中的JDBC
```

八、注意事项: 
```
对于两个独立变化的维度，使用桥接模式再适合不过了
```

Client.java: 
```Java
package com.mutistic.structural.bridge.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Client：客户端
 * 桥接模式[Bridge Pattern]-结构
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("桥接模式[Bridge Pattern]-结构");
		
		Implementor implA = new ConcreteImplementorA();
		Abstraction refined = new RefinedAbstraction(implA);
		PrintUtil.println();
		refined.operation();
		
		Implementor implB = new ConcreteImplementorB();
		RefinedAbstraction refinedB = new RefinedAbstraction(implB);
		refinedB.otherOperation();
	}
}
```
Abstraction.java: 
```Java
package com.mutistic.structural.bridge.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Abstraction：
 * 抽象部分的接口。通常在这个对象里面，要维护一个实现部分的对象引用，在抽象对象里面的方法，
 * 需要调用实现部分的对象来完成。这个对象里面的方法，通常都是具体的业务相关的方法
 */
public abstract class Abstraction {
	/** 持有：一个实现部分的对象 */
	protected Implementor impl;
	/**
	 * 构造函数：注入实现部分的对象
	 * @param impl 实现部分的对象
	 */
	public Abstraction(Implementor impl) {
		super();
		this.impl = impl;
		PrintUtil.two("Abstraction 构造函数：注入实现部分的对象", impl);
	}
	/**
	 * 实现一定的功能，可能需要转调实现部分的具体实现方法
	 */
	public void operation() {
		PrintUtil.three("Abstraction.operation()", "实现一定的功能，可能需要转调实现部分的具体实现方法，开始转调");
		impl.operationImpl();
	}
}
```
RefinedAbstraction.java: 
```Java
package com.mutistic.structural.bridge.structure;
import com.mutistic.utils.PrintUtil;
/**
 * RefinedAbstraction：
 * 扩展抽象部分的接口，通常在这些对象里面，定义跟实际业务相关的方法，
 * 这些方法的实现通常会使用Abstraction中定义的方法，也可能需要调用实现部分的对象来完成
 * @author mutisitic
 * @date 2018年9月7日
 */
public class RefinedAbstraction extends Abstraction {
	/**
	 * 构造函数：注入实现部分的对象
	 * @param impl
	 */
	public RefinedAbstraction(Implementor impl) {
		super(impl);
	}
	/**
	 * 示意：实现一定的功能，可能会由具体实现部分的实现方法，也可能会转调抽象父类的功能
	 */
	public void otherOperation() {
		PrintUtil.two("RefinedAbstraction.otherOperation()", "实现一定的功能，可能会由具体实现部分的实现方法，也可能会转调抽象父类的功能");
		operation();
	}
}
```
Implementor.java: 
```Java
package com.mutistic.structural.bridge.structure;
/**
 * Implementor：
 * 定义实现部分的接口，这个接口不用和Abstraction里面的方法一致，
 * 通常是由Implementor接口提供基本的操作，而Abstraction而定义的是基于这些基本操作的务方法，
 * 也就是说Abstraction定义了基于这些基本操作的较高层次的操作
 */
public interface Implementor {
	/**
	 * 定义：示意实现抽象部分需要的某些功能
	 */
	void operationImpl();
}
```
ConcreteImplementorA.java: 
```Java
package com.mutistic.structural.bridge.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteImplementor：
 * 真实实现Implementor接口的对象
 */
public class ConcreteImplementorA implements Implementor {
	/**
	 * 实现抽象部分需要的某些功能的具体实现
	 * @see com.mutistic.structural.bridge.structure.Implementor#operationImpl()
	 */
	@Override
	public void operationImpl() {
		PrintUtil.three("ConcreteImplementorA.operationImpl()", "实现抽象部分需要的某些功能的具体实现");
	}
}
```
ConcreteImplementorB.java: 
```Java
package com.mutistic.structural.bridge.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteImplementor：
 * 真实实现Implementor接口的对象
 */
public class ConcreteImplementorB implements Implementor {
	/**
	 * 实现抽象部分需要的某些功能的具体实现
	 * @see com.mutistic.structural.bridge.structure.Implementor#operationImpl()
	 */
	@Override
	public void operationImpl() {
		PrintUtil.three("ConcreteImplementorB.operationImpl()", "实现抽象部分需要的某些功能的具体实现");
	}
}
```

---
### <a id="a_filter">二十一、过滤器模式[Filter Pattern]</a> <a href="#a_bridge">last</a> <a href="#a_mediator">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M14_FilterPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M14_FilterPattern.png)<br/>

一、定义、本质: 
```
定义: 使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。也称标准模式（Criteria Pattern）
本质: 结合多个标准来获得单一标准
```

二、结构和说明: 
```
Criteria：过滤器接口。为所有的过滤器对象声明统一的过滤接口，用来返回匹配符合条件的Subject数据集合

ConcreteCriteria：具体的过滤器。持有Subject数据集合，实现具体的过滤功能，通过匹配条件来达到过滤数据的目的

Subject：具体的目标对象，提供过滤器按照条件匹配数据的对象

Client：客户端，使用具体的标准匹配Subject对象集合，来过滤获得单一标准的数据集合
```

三、理解: 
```
1、过滤器的功能：
  在不改变目标对象结果或数据的情况下，通过事先定义好的不同的过滤器来匹配过滤出客户端需要的数据。
  客户端需要明确知道每个过滤器的内部细节

2、过滤器的平等性：
  过滤器模式中对于一系列具体的过滤器，其地位是一样的，体现了过滤器的平等性
  所有的过滤器在实现上也是相互独立的，相互之间是没有依赖的。
  所以在客户端使用过滤器模式，可能需要多个过滤器才能匹配出需要的数据
```

四、写法: 
```
```

五、优点: 
```
1、更好的扩展性
2、更好的复用性
3、逻辑运算和目标对象解耦
```

六、缺点: 
```
1、所有过滤器都需要对外暴露，而且客户端必须了解每种条件的区别
2、具体的过滤器会导致增加了对象数目
3、过多的过滤器会导致一定程度上客户端使用的复杂度
```

七、使用场景: 
```
1、如果需要将逻辑运算和目标对象解耦开来，可以使用过滤器模式
2、如果需要通过结合多个标准来获得单一标准的数据，可以使用过滤器模式
3、如果过滤数据，并且是通过多个if-else语句来选择数据，可以使用过滤器模式代替这些条件语句
```

八、注意事项: 
```
1、Java 8的lambda表达式和流类库会帮我们非常方便的实现过滤器模式的功能。
2、如果一个系统的过滤器类过多，需要考虑使用混合模式或其他模式，来解决过滤器膨胀的问题
```

Client.java: 
```Java
package com.mutistic.structural.filter.structure;
import java.util.ArrayList;
import java.util.List;
import com.mutistic.utils.PrintUtil;
/**
 * Client：
 * 客户端，结合具体的标准匹配Subject对象集合，来过滤获得单一标准的数据集合，
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("过滤器模式[Filter Pattern]-结构");
		// 添加Subject数据
		List<Subject> subList = new ArrayList<Subject>();
		subList.add(new Subject("AAA", 0));
		subList.add(new Subject("BBB", 1));
		subList.add(new Subject("CCC", 2));
		subList.add(new Subject("DDD", 0));
		// 创建具体的过滤器
		Criteria criteriaA = new ConcreteCriteriaA();
		PrintUtil.three("ConcreteCriteriaA过滤器过滤后的数据：", criteriaA.mettCriteria(subList));
		// 创建具体的过滤器
		Criteria criteriaB = new ConcreteCriteriaB();
		PrintUtil.three("ConcreteCriteriaB过滤器过滤后的数据：", criteriaB.mettCriteria(subList));
	}
}
```
Subject.java: 
```Java
package com.mutistic.structural.filter.structure;
/**
 * Subject：
 * 具体的目标对象，提供过滤器按照条件匹配数据的对象
 */
public class Subject {
	/** 示意：属性A  */
	private String propertyA;
	/** 示意：属性B  */
	private int propertyB;
	public String getPropertyA() {
		return propertyA;
	}
	public void setPropertyA(String propertyA) {
		this.propertyA = propertyA;
	}
	public int getPropertyB() {
		return propertyB;
	}
	public void setPropertyB(int propertyB) {
		this.propertyB = propertyB;
	}
	public Subject(String propertyA, int propertyB) {
		super();
		this.propertyA = propertyA;
		this.propertyB = propertyB;
	}
	@Override
	public String toString() {
		return "Subject [propertyA=" + propertyA + ", propertyB=" + propertyB + "]";
	}
}
```
Criteria.java: 
```Java
package com.mutistic.structural.filter.structure;
import java.util.List;
/**
 * Criteria：
 * 过滤器接口。为所有的过滤器对象声明统一的过滤接口，用来返回匹配符合条件的Subject数据集合
 */
public interface Criteria {
	/**
	 * 定义： 过滤器对象声明统一的过滤接口 
	 * @param subList 需要过滤的数据
	 * @return 根据条件过滤后的数据
	 */
	List<Subject> mettCriteria(List<Subject> subList);
}
```
ConcreteCriteriaA.java: 
```Java
package com.mutistic.structural.filter.structure;
import java.util.ArrayList;
import java.util.List;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteCriteria：
 * 具体的过滤器。持有Subject数据集合，实现具体的过滤功能，通过匹配条件来达到过滤数据的目的
 */
public class ConcreteCriteriaA implements Criteria {
	/**
	 * 实现具体的过滤功能，通过匹配条件来达到过滤数据的目的 
	 * @param subList 需要过滤的数据
	 * @return 根据条件过滤后的数据
	 */
	@Override
	public List<Subject> mettCriteria(List<Subject> subList) {
		PrintUtil.two("ConcreteCriteriaA.mettCriteria()", "实现具体的过滤功能，通过匹配条件来达到过滤数据的目的");
		
		List<Subject> remove = new ArrayList<Subject>();
		for (Subject subject : subList) {
			if("AAA".equals(subject.getPropertyA())) {
				remove.add(subject);
			}
		}
		subList.removeAll(remove);
		return subList;
	}
}
```
ConcreteCriteriaB.java: 
```Java
package com.mutistic.structural.filter.structure;
import java.util.ArrayList;
import java.util.List;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteCriteria：
 * 具体的过滤器。持有Subject数据集合，实现具体的过滤功能，通过匹配条件来达到过滤数据的目的
 */
public class ConcreteCriteriaB implements Criteria {
	/**
	 * 实现具体的过滤功能，通过匹配条件来达到过滤数据的目的 
	 * @param subList 需要过滤的数据
	 * @return 根据条件过滤后的数据
	 */
	@Override
	public List<Subject> mettCriteria(List<Subject> subList) {
		PrintUtil.two("ConcreteCriteriaB.mettCriteria()", "实现具体的过滤功能，通过匹配条件来达到过滤数据的目的");

		List<Subject> remove = new ArrayList<Subject>();
		for (Subject subject : subList) {
			if(subject.getPropertyB() <= 0) {
				remove.add(subject);
			}
		}
		subList.removeAll(remove);
		return subList;
	}
}
```



---
## <a id="a_behavioral">行为型模式[Behavioral Patterns]</a> <a href="#a_structural">结构型模式</a> <a href="#a_j2ee">J2EE 设计模式</a>
### <a id="a_mediator">二十二、中介者模式[Mediator Pattern]</a> <a href="#a_filter">last</a> <a href="#a_observer">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M15_MediatorPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M15_MediatorPattern.png)<br/>
一、定义、本质: 
```
定义: 用一个中介对象来封装一系列的对象交付。终结者是的各对象不需要显式地相互引用，
	从而使其耦合松散，而且可以独立的改变他们之间的交互
本质: 封装交互
原则：符合迪米特原则
```

二、结构和说明: 
```
Mediator: 
	中介者接口。在内部定义各个同事之间交付需要的方法，可以是公共的通讯方法，比如changed方法。也可以是小范围的交互方法。

ConcreteMediator: 
	具体中介者实现对象。需要了解并维护各个同事对象，并负责具体的协调各同事对象的交互关系

Colleague: 
	同事类的定义，通常实现为抽象类，主要负责约束同事对象的类型，并实现一些具体同事内类之间的公共功能，
	比如: 每个具体同事类都应该知道中介者对象，也及时具体同事类都会持有中介者对象，就可以定义到这个类中

ConcreteColleague: 
	具体的同事类，实现自己的业务，在需要与其他同事通讯的时候，就与自由的中介者通信，中介者会负责与其他的同事交互。
```

三、理解: 
```
主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，也需要跟踪与之相关联的对象，同时做出相应的处理。
如何解决：将多个类相互耦合形成的网状结构分离为星型结构(局域网就是星型结构)。

1、中介者的功能: 就是封装对象之间的交互。如果一个对象的操作会引起其它相关对象的变化，或者是某个操作需要引起其它对象的后续或连带操作，
而这个对象又不希望自己来处理这些关系，那么就可以委托给中介者，需要的时候通知中介者，由中介者完成与其他对象的交互。
	反之亦然，所有的对象都是和中介者对象进行通信，相互之间不再交互。这样能够集中的控制这些对象的交互关系，
这样有什么变化的时候，修改起来就很方便。

2、Mediator中介者接口: Mediator接口的使用取决于时候回提供多个不同的中介者实现。如果明确只有一个ConcreteMediator中介者实现的话，
	并且预计中也没有需要扩展的要求，那么就可以不定义Mediator，让同事对象直接使用中介者对象。
	反之就需要定义Mediator，各个同事对象来面向中介者接口编程，而无需关心具体的中介者实现。

3、Colleague关系：在中介者模式中，要求这些内都要继承相同的类，也就是说，这些对象从某个角度讲是同一个类型，算是兄弟对象。
	正式因为这些对象之间的交互关系复杂，才产生了把这些交互关系分离出去，单独做成中介者对象。这些对象在中介者对象中就被称之为同事对象

4、Mediator和Colleague的关系：中介者对象和同事对象之间是相互依赖的。

5、如果实现同事和中介者的通信：
	实现方式一：在Mediator接口中定义一个特殊的通知接口，作为一个通用的方法，各个同事类调用这个方法。
	实现方式二：不拘泥于中介者模式，可以采用观察者模式，把Mediator实现为观察者Observer，把Colleague实现成为Subject。
这样同事类发生了改变，会通知Mediator。Mediator在接到通知后，会与相应的同事对象进行交互。观察者模式称Mediator为。
```

四、写法: 
```
1、标准的中介者模式在实际使用中的困难：
1.1、是否有必要为同事对象定义一个公共的父类？
	大家都知道，Java是单继承的，为了使用中介者模式，就让这些同事对象继承一个父类，这是很不好的：
再说了，这个父类目前也没有什么特别的公共功能，也就是说继承它也得不到多少好处。
	在实际开发中，很多相互交互的对象本身是没有公共父类的，强行加上一个父类，会让这些对象实现起来特别别扭。
	
1.2、同事类有必要持有中介者对象吗？
	同事类需要知道中介者对象，以便当它们发生改变的时候，能够通知中介者对象，但是否需要作为属性，并通过构造方法传入，这么强的依赖关系呢？
	也可以有简单的方式去通知中介对象，比如把中介对象做成单例，直接在同事类的方法里面去调用中介者对象。

1.3、是否需要中介者接口？
	在实际开发中，很常见的情况是不需要中介者接口的，而且中介者对象也不需要创建很多个实例，
因为中介者是用来封装和处理同事对象的关系的，它一般是没有状态需要护的，因此中介者涌常可以实现成单例。
1.4、中介者对象是否需要持有所有的同事？
	虽说中介者对象需要知道所有的同事类，这样中介者才能与它们交互。但是是否需要做为属性这么强烈的依赖关系，
而且中介者对象在不同的关系维护上，可能会需要不同的同事对象的实例，因此可以在中介者处理的方法里面去创建、
或者获取、或者从参数传入需要的同事对象。

1.5、中介者对象只是提供一个公共的方法，来接受同事对象的通知吗？
	在公共方法里，还是要去区分到底是谁调过来，这还是简单的，还没有去区分到底是什么样的业务触发调用过来的，
因为不同的业务，引起的与其它对象的交互是不一样的。
	因此在实际开发中，通常会提供具体的业务通知方法，这样就不用再去判断到底是什么对象，具体是什么业务了。


2、对标准的中介者模式在实际使用中的改进：广义中介者
基于上面的考虑，在实际应用开发中，经常会简化中介者模式，来使开发变得简单，比如有如下的简化：
2.1、通常会去掉同事对象的父类，这样可以让任意的对象，只要需要相互交互，就可以成为同事
2.2、通常不定义Mediator接口，把具体的中介者对象实现成为单例；
2.3、同事对象不再持有中介者，而是在需要的时候直接获取中介者对象并调用。中介者也不再持有同事对象，
而是在具体处方法里面去创建、或者获取、或者从参数传入需要的同事对象

把这样经过简化、变形使用的情况称为广义中介者。
```

五、优点: 
```
1、松散耦合，各个类之间的解耦
2、集中控制交互
3、降低了类的复杂度，多对多变成一对多，网状结构分离为星型结构
```

六、缺点: 
```
1、过度集中化
2、中介者会庞大，变得复杂难以维护
```

七、使用场景: 
```
1、如果一组对象之间的通信方式比较复杂，导致相互依赖、结构混乱，可以采用中介者模式，把这些对象相互的交互管理起来，
各个对象都只要需要和中介者交互，从而使得各个对象松散耦合，结构也更清晰易懂。
2、如果一个对象引用很多对象，并直接跟这些对象交互，导致难以复用该对象，可以采用中介者模式，
把这个对象跟其他对象的交互封装到中介者对象里面，这个对象就只要中介者对象交互就可以了

具体场景：
1、WTO之前是各个国家相互贸易，结构复杂，现在是各个国家通过WTO来互相贸易。 
2、机场调度系统。 
3、MVC 框架，其中Controller（控制器）就是 Mode（模型）和 View（视图）的中介者
```

八、注意事项: 
```
1、不应当在职责混乱的时候使用
2、注意使用中介者模式不要产生循环调用，这样会造成死循环
```

Client.java: 
```Java
package com.mutistic.behavioral.mediator.structure;
import com.mutistic.utils.PrintUtil;
// 客户端-演示中介者模式 
public class Client {
	public static void main(String[] args) {
		PrintUtil.printOne("中介者模式：");
		
		ConcreteMediator mediator = new ConcreteMediator();
		PrintUtil.printThree("创建中介者实例：", mediator);
		
		ConcreteColleagueA ca = new ConcreteColleagueA(mediator);
		PrintUtil.printTwo("创建同事A实例：", ca);
		mediator.setColleagueA(ca);
		
		ConcreteColleagueB cb = new ConcreteColleagueB(mediator);
		PrintUtil.printTwo("创建同事B实例：", cb);
		mediator.setColleagueB(cb);
		
		ca.operation();
		cb.operationB();
	}
}
```
Mediator.java: 
```Java
package com.mutistic.behavioral.mediator.structure;
// Mediator
// 中介者接口。在内部定义各个同事之间交付需要的方法，可以是公共的通讯方法，比如changed方法。也可以是小范围的交互方法。
public interface Mediator {
	/**
	 * 同事对象在自身改变的时候通知中介者的方法，负责与其他同事之间的交互
	 * @param colleague 同事对象实例
	 */
	void changed(Colleague colleague);
}
```
ConcreteMediator.java: 
```Java
package com.mutistic.behavioral.mediator.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteMediator
// 具体中介者实现对象。需要了解并维护各个同事对象，并负责具体的协调各同事对象的交互关系
public class ConcreteMediator implements Mediator {
	// 持有并维护同事A
	private ConcreteColleagueA colleagueA;
	// 持有并维护同事B
	private ConcreteColleagueB colleagueB;
	/**
	 * 同事对象在自身改变的时候通知中介者的方法，负责与其他同事之间的交互
	 * @param colleague  同事对象实例
	 */
	@Override
	public void changed(Colleague colleague) {
		PrintUtil.printOne("注意使用中介者模式不要产生循环调用，这样会造成死循环");
		
		if (null == colleague) {
			PrintUtil.printOne("传入的同事为空，changed结束");
		}

		PrintUtil.printThree("某个同事类发生了变化，通常需要与其他同事交互", colleague);
		// colleagueA 转调  colleagueB.operation()业务
		if (colleague.getClass() == colleagueA.getClass()) {
			if (null != colleagueB) {
				PrintUtil.printThree("具体协调相应的同事对象来实现协作", colleagueB);
				this.colleagueB.operation();
			}
		} 
		// colleagueB 转调  colleagueA.operationA()业务
		else if (colleague.getClass() == colleagueB.getClass()) {
			if (null != colleagueA) {
				PrintUtil.printThree("具体协调相应的同事对象来实现协作", colleagueA);
				this.colleagueA.operationA();
			}
		}
	}
	/**
	 * 设置中介者需要了解并维护的同事A实例
	 * @param colleagueA  同事A对象实例
	 */
	public void setColleagueA(ConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
		PrintUtil.printThree("设置中介者需要了解并维护的同事A实例 ", colleagueA);
	}
	/**
	 * 设置中介者需要了解并维护的同事B实例
	 * @param colleagueB 同事B对象实例
	 */
	public void setColleagueB(ConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
		PrintUtil.printThree("设置中介者需要了解并维护的同事B实例 ", colleagueB);
	}
}
```
Colleague.java: 
```Java
package com.mutistic.behavioral.mediator.structure;
// Colleague
// 同事类的定义，通常实现为抽象类，主要负责约束同事对象的类型，并实现一些具体同事内类之间的公共功能，
// 比如: 每个具体同事类都应该知道中介者对象，也及时具体同事类都会持有中介者对象，就可以定义到这个类中
public abstract class Colleague {
	// 持有中介者对象，每一个同事类都应该知道它的中介者对象
	private Mediator mediator;

	/**
	 * 构造函数：传入中介者对象（也可以使用set方法）
	 * @param mediator 中介者对象实例
	 */
	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	// get方法获得中介者对象 
	public Mediator getMediator() { return mediator; }
}
```
ConcreteColleagueA.java: 
```Java
package com.mutistic.behavioral.mediator.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteColleague
// 具体的同事类，实现自己的业务，在需要与其他同事通讯的时候，就与自由的中介者通信，中介者会负责与其他的同事交互
public class ConcreteColleagueA extends Colleague {
	/**
	 * 构造函数：传入中介者对象（也可以使用set方法）
	 * @param mediator 中介者对象实例
	 */
	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}
	// 业务逻辑
	public void operation() {
		PrintUtil.printTwo("执行ConcreteColleagueA.operation()", "业务逻辑");
		this.getMediator().changed(this);
	}
	// 业务逻辑
	public void operationA() {
		PrintUtil.printTwo("执行ConcreteColleagueA.operationA()", "业务逻辑");
	}
}
```
ConcreteColleagueB.java: 
```Java
package com.mutistic.behavioral.mediator.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteColleague 
// 具体的同事类，实现自己的业务，在需要与其他同事通讯的时候，就与自由的中介者通信，中介者会负责与其他的同事交互
public class ConcreteColleagueB extends Colleague {
	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}
	public void operation() {
		PrintUtil.printTwo("执行ConcreteColleagueB.operation()", "其他业务逻辑");
	}
	public void operationB() {
		PrintUtil.printTwo("执行ConcreteColleagueB.operationB()", "其他业务逻辑");
		this.getMediator().changed(this);
	}
}
```

---
### <a id="a_observer">二十三、观察者模式[Observer Pattern]</a> <a href="#a_mediator">last</a> <a href="#a_command">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M16_ObserverPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M16_ObserverPattern.png)<br/>

一、定义、本质: 
```
定义: 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
本质: 触发联动
```

二、结构和说明: 
```
Subject：目标对象，通常具有以下功能：
	1、一个目标可以被多个观察者观察
	2、目标提供对观察者注册和退订的维护
	3、当目标的状态发生变化时，目标负责通知所有的注册的、有效的观察者

ConcreteSubject：具体的目标实现对象，用来维护目标状态，当目标对象的状态发生改变时，通知所有注册有效的观察者，
	让观察者执行相应的处理

Observer：定义观察者的接口，提供目标通知时对应的更新方法，这个更新方法进行相应的业务处理，
	可以在这个方法里面回调目标对象，以获取目标对象的数据

ConcreteObserver：观察者的具体实现对象，用来接收目标的通知，并进行相应的后续处理，
	比如更新自身的状态以保持和目标的相应对状态一致
```

三、理解: 
```
主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
如何解决：使用面向对象技术，可以将这种依赖关系弱化。

1、目标和观察者之间的关系：
  按照模式的定义，目标和观察者之间是典型的一对多的关系。
  但如果只有一个观察者，也是可以的，这样就变相实现了目标和观察者之间一对一的关系
  同样，一个观察者也可以观察多个目标，如果观察者为多个目标定义的通知更新方法都是update方法时，且是同一个updae发放
如果不区分接收目标的话，会导致死循环等问题。需要在方法内部区分接收目标，不同的目标有不同的后续操作。
  一般情况下，观察者应该为不同的观察者目标，实现不同的回调方法，这样实现是最简单的，不要在update方法内部区分

2、单向依赖：
  在观察者模式中，观察者和目标是单向依赖的，只有观察者依赖于目标，而目标是不会依赖于观察者的。
  它们之间的联系取决于目标，只有目标知道什么时候需要通知观察者，在整个过程中，观察者是被动等待目标通知。
  对目标而言，所有的观察者都是同一级别的。但也可以通过在目标里面进行控制，实现有区别对待观测者
这是在标准的、原始的观察者模式的稍微变形用法。

3、基本的实现说明：
  具体的目标实现对象要能维护观察者的注册信息，最简单的实现方案就是采用一个集合来保存观察者的注册信息。
  具体的目标实现对象需要维护引起通知的状态，一般情况下是目标自身的状态，变形使用的情况下，也可以是别的对象的状态。
  具体的观察者实现对象需要能接收目标的通知，能够接收目标传递的数据或者是能够主动去获取目标的数据，并进行后续处理。
  如果是一个观察者观察多个目标，那么在观察者的更新方法里面，需要去判断是来自哪一个目标的通知。
简单的解决方案就是扩展update方法，比如在方法里面多传递一个参数过行区分。还有一种简单的方法，比如定义不同的回调方法。

4、观察者模式又被称为发布-订阅模式

5、触发通知的时机：一般情况下，是在完成了状态维护后触发，因为通知会传递数据，不能够先通知后改数据，否则会导致观察者和目标对象的状态不一致

6、相互观察：A对象的状态变化会引起C对象的联动操作，反过来，C对象的变化也会引起A对象的联动操作。对于这种状况，要小心处理，避免循环通知
否则会引起死循环的情况（中介者模式不处理好循环调用也可能导致死循环）

7、通知顺序：从理论上说，当目标对象的状态变化后通知所有观察者的时候，顺序是不确定的，因此观察者实现的功能，不要依赖于通知的顺序，
也就是说，多个观察者之间的功能是平行的，相互不应该有先后的依赖关系。如果需要顺序可以采用职责链模式
```

四、写法: 
```
1、推模型：目标对象主动向观察者推动目标的详细信息，不管观察者是否需要，推送的信息通常识目标对象的全部或部分数据，相当于是在广播通信

2、拉模型：木料对象在通知观察者的时候值传递少量信息，如果观察者需要更具体的信息，由观察者主动到目标对象中获取，
相当于是观察者从目标对象中那数据，一般这种模型的实现，会把目标对象自身通过update方法传递给观察者，这样在观察者
需要获取数据的时候，就可以通过这个应用来获取了。标准的、原始的观察者模式是拉模型。

3、推模型和拉模型的比较：
  推模型是假定目标对象知道观察者需要的数据：而拉模型是目标对象不知道观察者具体需要什么数据，
没有办法的情况下，直接把自身传给观察者，让观察者按需取值
  推模型可能会使得观察者对象难以复用，因为观察者定义的update方法是按需而定义的，可能无法兼顾没有考到的使用情况。
这就意味着出现新情况的时候，就可能需要提供新的update方法，或者是重新实现观察者。
  而拉模型就不会造成这样的情况，因为拉模型下，update方法的参数是目标对象本身，这基本上是目标对象能传递的最大数据集合了，
基本上可以适应各种情况的需要。

4、Java中的观察者模式：java.util.Observable 实现了大部分需要的目标的功能，还有一个java.util.Observer接口，
里面定义了一个update的方法，就是观察者的接口

5、Swing中的观察者模式： 
  Swing中到处都是观察者模式的身影，比如事件处理（早期的Swing事件处理用的是职责链）
  Swing组件是被观察的目标，而每个实现监听器的类就是观察者，监听器的就扣就是观察者的接口，在调用addListener方法
的时候就相当于注册观察者。
  当组件被点击，状态发生改变的时候，就会产生相应的通知，会调用注册的观察者的方法，就是说实现实现的监听器的方法

6、区别对待观察者：
  当目标通知观察者的时候是全部都通知，区别对待观察者解决的方式通常有两种：
  一种是目标可以通知，但是观察者不做任何操作
  另外一种是在目标里面进行判断，干脆不通知，这种方式能够统一逻辑控制，并进行观察者的统一分派，有利于业务控制和扩展
```

五、优点: 
```
1、观察者模式实现了观察者和目标之间的抽象耦合
2、观察者模式实现了动态联动，建立一套触发机制。 
3、观察者模式支持广播通信
```

六、缺点: 
```
1、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。 2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。 3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化
4、观察者模式可能会引起无谓的操作
```

七、使用场景: 
```
1、当一个抽象模型有两个方面，其中一个方面的操作依赖于另一个方面的状态变化，可以选用观察者模式
2、如果在更改一个对象的时候，需要同时连带改变其他的对象，而且不知道究竟应该有多少对象需要被连带改变，
可以选用观察者模式，被更改的对象相当于目标对象，需要连带修改的其他对象相当于观察者对象
3、当一个对象必须通知其他的对象，当不希望这个对象和其他被其通知的对象是松散耦合的，也就是说这个对象
无需知道具体被通知的对象，可以选用观察者模式，这个对象相当于目标对象，被通知的对象相当于观察者对象

具体场景：
```

八、注意事项: 
```
1、JAVA 中已经有了对观察者模式的支持类。 
2、避免循环通知，否则会引起死循环。 
3、如果同步执行，某一观察者错误会导致后续的观察者通知失败，一般采用异步方式。
4、通知观察者不建议依赖于通知的顺序。如果无法避免建议采用职责链模式
```

Client.java: 
```Java
package com.mutistic.behavioral.observer.structure;
import com.mutistic.utils.PrintUtil;
// Client 客户端
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("观察者模式[Observer Pattern]");
		// 创建观察者实例
		ConcreteObserver ob1 = new ConcreteObserver();
		ConcreteObserver ob2 = new ConcreteObserver();
		// 注册观察者
		ConcreteSubject sb1 = new ConcreteSubject();
		sb1.attach(ob1);
		sb1.attach(ob2);
		// 具体的目标改变状态
		sb1.setSubjectStatus("AAA");
		// 删除观察者
		sb1.detach(ob2);
		// 具体的目标改变状态
		sb1.setSubjectStatus("BBB");
	}
}
```
Subject.java: 
```Java
package com.mutistic.behavioral.observer.structure;
import java.util.HashSet;
import java.util.Set;
import com.mutistic.utils.PrintUtil;
// Subject：目标对象，知道具体的观察者，并提供注册和删除观察的接口
public class Subject {
	/** 有效的观察者集合 */
	private Set<Observer> observerSet = new HashSet<Observer>();
	// 注册观察者
	public void attach(Observer observer) {
		if(null != observer) {
			observerSet.add(observer);
			PrintUtil.two("注册观察者", observer);
		}
	}
	// 删除观察者
	public void detach(Observer observer) {
		if(null != observer) {
			observerSet.remove(observer);
			PrintUtil.two("删除观察者", observer);
		}
	}
	// 通知所有的观察者
	protected void notifyObserver() {
		for (Observer observer : observerSet) {
			PrintUtil.two("正在通知观察者", observer);
			observer.update(this);
		}
	}
}
```
ConcreteSubject.java: 
```Java
package com.mutistic.behavioral.observer.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteSubject：
// 具体的目标实现对象，用来维护目标状态，当目标对象的状态发生改变时，通知所有注册有效的观察者，让观察者执行相应的处理
public class ConcreteSubject extends Subject {
	/** 目标对象状态 */
	private String subjectStatus;
	public String getSubjectStatus() {
		return subjectStatus;
	}
	// 目标状态发生变化时，通知所有的观察者
	public void setSubjectStatus(String subjectStatus) {
		this.subjectStatus = subjectStatus;

		PrintUtil.two("目标状态发生变化时，通知所有的观察者", subjectStatus);
		this.notifyObserver();
	}
}
```
Observer.java: 
```Java
package com.mutistic.behavioral.observer.structure;
// Observer
// 定义观察者的接口，提供目标通知时对应的更新方法，这个更新方法进行相应的业务处理，可以在这个方法里面回调目标对象，以获取目标对象的数据
public interface Observer {
	/**
	 * 定义更新功能接口
	 * @param subject 传入目标对象，获取对应的状态值
	 */
	void update(Subject subject);
}

```
ConcreteObserver.java: 
```Java
package com.mutistic.behavioral.observer.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteObserver：
// 观察者的具体实现对象，用来接收目标的通知，并进行相应的后续处理，比如更新自身的状态以保持和目标的相应对状态一致
public class ConcreteObserver implements Observer {
	/** 观察者状态 */
	private String observerState;
	/**
	 * 更新功能具体实现
	 * @param subject 传入目标对象，获取对应的状态值
	 * @see com.mutistic.behavioral.observer.structure.Observer#update(com.mutistic.behavioral.observer.structure.Subject)
	 */
	@Override
	public void update(Subject subject) {
		if (subject != null && subject.getClass() == ConcreteSubject.class) {
			this.observerState = ((ConcreteSubject) subject).getSubjectStatus();
		}
		PrintUtil.three("更新功能：设置观察者状态", observerState);
	}
}
```


---
### <a id="a_command">二十四、命令模式[Command Pattern]</a> <a href="#a_observer">last</a> <a href="#a_iterator">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M17_CommandPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M17_CommandPattern.png)<br/>

一、定义、本质: 
```
定义: 将一个请求封装为一个对象，从而使得可用不同的请求对客户进行参数化。对请求排队或记录请求日志，以及支持可撤销的操作
本质: 封装请求
```

二、结构和说明: 
```
Command：定义命令的接口，声明执行的方法

ConcreteCommand：命令接口的实现对象，是“虚”的实现：通常会持有接收者，并调用接收者的功能来完成命令要执行的操作

Receiver：接收者。真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能

Invoker：调用者，要求命令对象执行请求，通常会持有命令对象，可以持有很多个命令对象。这个是客户端真正触发命令并要求
命令执行相应操作的地方，也就是说相当于使用命令对象的入口

Client：创建具体的命令对象，并且设置命令对象的接收者。注意这个不是常规意义上的客户端，而是在组装命令对象和接收者，
把这个Client成为装配者（组装者）会更合适，因为真正使用命令的客户端是从Invoker来触发执行。
```

三、理解: 
```
主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、
	事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
如何解决：通过调用者调用接收者执行命令，顺序：调用者→接收者→命令。

1、命令模式的关键：
  命令模式的关键之处就是把请求封装成为对象，也就是命令对象，并定义了统一的执行操作的接口，
这个命令对象可以被存储、转发、记录、处理、撤销等，整个命令模式都是围绕这个对象在进行。

2、命令模式式的组装和调用：
  在命令模式中经常会有一个命令的组装若，用它来维护命令的”‘虚”实现和真实实现之间的关系。
如果是超级智能的命令，也就是说命令对象自己完全实现好了，不需要接收者，那就命令模式的退化，不需要接收者，自然也不需要组装者
  而真正的客户端就是具体化请求的内容，然后提交请求进行触发就好了。真正的用户会通过Invoker来触发命令
  在实际开发中，Client和Invoker可以融合在一起，有客户端在使用命令模式时，先进群命令对象和接收者的组装，组装完成后，在调用命令执行

3、命令模式的接收者：
  接收者可以是任意的类．对它没有什么特殊要求．这个对象知道如何真正执行命令的操作，执行时是从Command的实现类里面转调过来
  一个接收者对象可以处理多个命令，接收者和命令之间没有约定的对应关系。接收若提供的方法个数、名称、功能和命令中的可以不一样，
只要能够通过调用接收者的方法来实现命令对应的功能就可以了。

4、发起请求的对象和真正实现的对象是完全解耦的：
  请求究竟是由谁处理，如何处理，发起请求的对象是不知道的，也就是发起请求的对象和真正实现的对象是解耦的。
发起请求的对象只关系自己发出的命令，真正的实现是不关注的。

5、命令模式提供了对事务进行建模的方法，命令模式又称为Transaction
```

四、写法: 
```
1、智能命令
  在标准的命令模式里面，命令的实现类是没有真正实现命令要求的功能的，真正执行命令的功能的是接收者
  如果命令的实现对象比较智能，自己就能真实地实现命令要求的功能，而不再需要调用接收者，那么这种情况就称为智能命令 或 退化的命令模式
  也可以有半智能的命令，命令对象知道部分实现，其他的还是需要调用接收者来完成，也就是说命令的功能由命令对象和接收者共同来完成

2、参数化配置：所谓命令模式的参数化配置指的是：可以用不同的命令对象，去参数化配置客户端的请求

3、可撤销的操作：
  可撤销操作的意思是：放弃该操作，回到未执行该操作前的状态。这是一个非常重要的功能，
几乎所有GUI应用都有撤消操作的功能。GUI的菜单是命令模式的最典型的应用之一。菜单项基本上都有撤销这个菜单
  实现撤销操作的思路：
  一种是补偿式，又称为反操作式：比如被撤销的操作时加的功能，那撤销的实现就是减操作
  一种是存储恢复式：把操作前的状态记录下来，然后要撤销操作的时候就直接恢复回去

4、宏命令：
  包含多个命令的命令，是一个命令的组合
  如何实现宏命令：宏命令的杯子上将类似于一个命令，基本上是把它当命令对象进行处理。
区别就是，宏命令对象包含多个普通命令对象。执行一个宏命令就是执行宏命令里面包含的所有命令对象

5、队列请求：
	所谓队列请求，就是对命令对象进行排队，组成工作队列，然后依次去除命令对象来执行。
	一般采用多线程或者线程池来进行命令队列的处理。

6、日志请求：
  所谓日志请求，就是把请求的历史记录保存下来，一般是采用物理存储的方式。如果运行请求的过程中，
那么在系统再次运行时，就可以从保存的历史记录里面获取日志请求，并重新执行命令
  日志请求的实现有两种方案：
  一种是直接使用Java的序列化方法
  一种是在命令对象里面添加存储和装载的方法。其实就是让命令对象自己实现类似序列化的功能 
```

五、优点: 
```
1、更松散的耦合，客户端请求和接收者完全解耦
2、更动态的控制
3、能很自然的复合命令，就是宏命令
4、更好的扩展性
```

六、缺点: 
```
使用命令模式可能会导致某些系统有过多的具体命令类
```

七、使用场景: 
```
1、如果需要抽象出需要执行的动作，并参数化这些对象，可以选用命令模式，把需要执行的动作抽象成命令，然后实现凌乱的参数化配置
2、如果需要在不同的时刻执行、排列和执行请求，可以选用命令模式，把这些请求封装成为命令对象，然后实现把请求对你恶化
3、如果需要支持撤销操作，可以选用命令模式，通过管理命令对象，能很容易的实现命令的恢复和重做的功能
4、如果需要支持单系统崩溃时，能把对系统的操作功能重新执行一遍，可以选用命令模式，把这些操作功能的请求封装成命令对象，
然后实现日志命令，就可以在系统恢复回来后，通过日志获取命令列表，从而重新执行功能
5、在需要事务的系统中，可以选用命令模式，命令模式提供了对事务进行建模的方法，命令模式又称为Transaction

具体场景：
1、GUI 中每一个按钮都是一条命令。 
2、模拟 CMD
```

八、注意事项: 
```
系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式
```

Client.java: 
```Java
package com.mutistic.behavioral.command.structure;
import com.mutistic.utils.PrintUtil;
// Client：
// 创建具体的命令对象，并且设置命令对象的接收者。注意这个不是常规意义上的客户端，而是在组装命令对象和接收者，把这个Client成为装配置会更合适，因为真正使用命令的客户端是从Invoker来触发执行。
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("命令模式[Command Pattern]");
		Invoker invoker = new Client().assemble();
		invoker.runCommand();
	}
	// 组装命令对象和接收者
	public Invoker assemble() {
		Receiver receiver = new Receiver();
		PrintUtil.two("创建接收者对象实例", receiver);

		Command cmd = new ConcreteCommand(receiver);
		PrintUtil.three("创建命令对象实例，注入接收者对象实例", cmd);

		Invoker invoker = new Invoker();
		invoker.setCommand(cmd);
		PrintUtil.two("创建调用者对象实例，注入命令对象实例", invoker);

		return invoker;
	}
}
```
Receiver.java: 
```Java
package com.mutistic.behavioral.command.structure;
import com.mutistic.utils.PrintUtil;
// Receiver：
// 接收者。真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能
public class Receiver {
	// 真正执行命令的方法
	public void action() {
		PrintUtil.two("接收者开始真正执行命令", "Receiver.action()");
	}
}
```
Command.java: 
```Java
package com.mutistic.behavioral.command.structure;
// Command：
// 定义命令的接口，声明执行的操作方法
public interface Command {
	// 定义命令的接口，声明执行的操作方法
	void execute();
}
```
ConcreteCommand.java: 
```Java
package com.mutistic.behavioral.command.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteCommand：
// 命令接口的实现对象，是“虚”的实现：通常会持有接收者，并调用接收者的功能来完成命令要执行的操作
public class ConcreteCommand implements Command {
	/** 持有相应的接收者对象 */
	private Receiver receiver;
	/** 命令对象可有自己的状态 */
	private String state;
	/**
	 * 命令接口的具体实现
	 * @see com.mutistic.behavioral.command.structure.Command#execute()
	 */
	@Override
	public void execute() {
		PrintUtil.two("命令的具体对象开始转调接收者对象的对应方法", "ConcreteCommand.execute()");
		// 转调接收者对象的对应方法，接收者来真正执行功能。所以称其ConcreteCommand是虚的实现
		receiver.action();
		// 设置命令对象的状态
		state = "SUCCESS";
		PrintUtil.two("命令的具体对象转调接收者对象的对应方法结束，命令状态", state);
	}
	/**
	 * 构造函数：注入接收者对象实例
	 * @param receiver 接收者对象实例
	 */
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
		PrintUtil.two("命令的具体对象注入接收者对象实例", receiver);
	}
}
```
Invoker.java: 
```Java
package com.mutistic.behavioral.command.structure;
import com.mutistic.utils.PrintUtil;
// Invoker：
// 调用者，要求命令对象执行请求，通常会持有命令对象，可以持有很多个命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口
public class Invoker {
	/** 持有命令对象 */
	private Command command;
	/**
	 * 要求命令对象执行的具体操作
	 */
	public void runCommand() {
		PrintUtil.two("要求命令对象执行的具体操作", "Invoker.runCommand()");
		command.execute();
	}
	// 获取命令对象实例
	public Command getCommand() { return command; }
	/**
	 * 注入命令对象实例
	 * @param command 命令对象实例
	 */
	public void setCommand(Command command) { this.command = command; }
}
```

---
### <a id="a_iterator">二十五、迭代器模式[Iterator Pattern]</a> <a href="#a_command">last</a> <a href="#a_template">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M18_IteratorPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M18_IteratorPattern.png)<br/>

一、定义、本质: 
```
定义: 提供一种方法顺序访问一个聚合对象中各个元素，而又不需暴露该对象的内部表示
本质: 控制访问聚合对象中的元素
```

二、结构和说明: 
```
Iterator：迭代器接口。定义访问和遍历元素的接口

ConcreteIterator：具体迭代器实现对象。定义对聚合对象的遍历，并跟踪遍历时的当前位置

Aggregate：聚合对象。定义创建相应迭代器对象的接口

ConcreteAggregate：具体聚合对象。实现创建相应的迭代器对象。
```

三、理解: 
```
何时使用：遍历一个聚合对象。
关键代码：定义接口：hasNext, next。

1、迭代器模式功能：
  迭代器模式的功能主要是在于提供对聚合对象的迭代访问。迭代器就是围绕这个访问延伸出来很多功能。比如：
  以不同的方式遍历聚合对象，比如向前、向后等
  对同一个聚合同事进行多个遍历
  以不同的遍历策略来遍历聚个，比如是否需要过滤等
  多态迭代：为不同的聚合结构，提供统一的迭代接口，也就是说通过一个迭代接口可以访问不同的聚合结构。
标准的迭代模式实现基本上都是支持多态迭代的。多态迭代可能会带来类型安全的问题，可以考虑使用泛型

2、迭代器模式的关键思想：
  聚合对象的类型很多，如果对聚合对象的迭代访问跟聚合对象本身融合在一起的话，会严重影响到聚合对象的可扩展性和可维护性。
  因此迭代器模式的关键思想就是把对聚合对象的遍历和访问从聚合对象中分离出来，放入到单独的迭代器中，
这样聚合对象会变得简单一些。而且迭代器和聚合对象可以独立的变化和发展，会大大加强系统的灵活性。

3、Java中最简单的统一访问集合的方式：
  如果只是想要使用一种统一的访问来访问聚合对象，在Java中有更简单的方式，利用Java 5以上版本特性即可。java.util.Iterator
  注意：这种只是从访问形式上一致了，但是暴露了聚合的内部实现，因此不算标准迭代器模式的实现，从某种意义上说，
可以算是隐含的实现了部分迭代器模式的功能

4、遍历算法：
  在迭代器模式的实现中，常见有两个地方可以来定义遍历算法，一个就是聚合对象本身，另外一个就是迭代器负责遍历算法
  在聚合对象本身定义遍历的算法这种情况下，通常会在遍历过程中，用迭代器来存储当前迭代的状态，这种迭代器被称为游标，
因为它仅用来指示当前的位置
  在迭代器里面定义遍历算法，会易于在相同的聚合上使用不同的迭代算法，同事也易于在不同的聚合上重用相同的算法
```

四、写法: 
```
1、内部迭代器和外部迭代器：
  内部迭代器：指的是由迭代器自己来控制迭代下一个元素的步骤，客户端无法干预，因此，如果想要在迭代的过程中
完成工作的话，客户端就需要把操作传给迭代器，迭代器在迭代的时候会在每个元素上执行这个操作，类似于Java的回调机制
  外部迭代器：指的是由客户端来控制迭代下一个元素的步骤，即显示调用next方法来迭代下一个元素
  总体来说外部迭代器比内部迭代器要灵活一些，因此常见的实现大多属于外部迭代器

2、使用Java的迭代器：
  在Java中实现地等待期模式是非常简单的，只要实现java.util.Iterator接口即可。而且java的集合框架中的聚合对象，基本上都是提供了迭代器的。
  具体写法：
  不需要在实现Iterator接口，直接实现java.util.Iterator接口即可。
  Java中Iterator接口和标准结构中，需要实现的方法时不一样的。
  集合已经提供了Iterator，那么CollectionIteratorImpl类就不需要实现了

3、带迭代策略的迭代器：
  由于迭代器模式把聚合对象和访问聚合的机制实现了分离，所以可以在迭代器上实现不同的迭代策略，最为典型的就足实现过滤功能迭代器。
  在实际开发，对于经常被访问的一些数据可以使用缓存，把这些数据存放在内存中。但是不同的业务功能需要访问的数据是不同的，
还有不同的业务访问权限能访问的数据也是不同的，对于这种情况，就可以使用实现过滤功能的迭代器，让不同功能使用不同的迭代器来访问。
当然，这种情况也可以解决策略模式来实现
  在实现过滤功能的迭代器，有两种常见的需要过滤的情况，一种是对数据进行整条过滤，一种是对数据进行部分过滤

4、双向迭代器：
  所谓双向迭代器的意思就是：可以同事向前和向后遍历数据的迭代器
  在Java util包中的ListIterator接口就是一个双向迭代器。
  自己实现的话只需要在Iterator接口中添加向前和判断和向前获取值的方法，然后在实现类中实现即可。

5、翻页迭代：
  常见的翻页功能有以下几种：
  纯数据库实现：依靠SQL提供的功能实现翻页，根据用户每次请求翻页的数据，从数据库中查询相应的数据，以时间换空间
  纯内存实现：从数据库中把需要的所有数据取出放在内存中，根据用户的请求翻页数据，从内容中获取相应的数据，以空间换时间
  数据库+内存实现：比如每页显示10条记录，根据判断用户翻页频率，第一次访问从数据库获取前几页数据，然后放在内存中，这样
前几页就可以从内存中后去数据。后几页的数据根据访问统计进行衰减访问，如此操作知道一次冲数据库中获取一页数据

```

五、优点: 
```
1、更好的封装性
2、可以以不同的遍历方式来遍历一个聚合
3、迭代器简化了聚合的接口
4、简化客户端调用
5、在同一个聚合上可以有多个遍历
```

六、缺点: 
```
由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性
```

七、使用场景: 
```
1、希望提供访问一个聚合对象的内容，但又不想暴露其内部表示时，可以使用迭代器模式来提供迭代接口，从而让客户端只是通过迭代器
的接口来访问聚合对象，而无需关心聚合对象的内部实现
2、希望有多重遍历方式可以访问聚合对象
3、希望为遍历不同的聚合对象提供一个统一的接口

具体场景：
1、Java中的java.util.Collection集合类和java.util.Iterator迭代器
```

八、注意事项: 
```
迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据
```

Client.java: 
```Java
package com.mutistic.behavioral.iterator.structrue;
import com.mutistic.utils.PrintUtil;
// Client：客户端 
// 演示：迭代器模式[Iterator Pattern]
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("迭代器模式[Iterator Pattern]（外部迭代器）");
		
		String[] ss = new String[] {"111", "222", "333"};
		// 创建聚合对象
		Aggregate aggregate = new ConcreteAggregate(ss);
		PrintUtil.two("创建聚合对象，注入聚合数据", aggregate);
		
		// 创建迭代器
		Iterator it = aggregate.createrIterator();
		PrintUtil.two("创建迭代器，注入聚合数据", it);

		// 从迭代器获取元素
		while(!it.isDone()) {
			PrintUtil.three("从迭代器中获取元素", it.currentItem());
			it.next();
		}
	}
}
```
Iterator.java: 
```Java
package com.mutistic.behavioral.iterator.structrue;
// Iterator：
// 迭代器接口。定义访问和遍历元素的接口
public interface Iterator {
	/**
	 * 定义：移动到聚合对象的第一个位置接口
	 */
	void first();
	
	/**
	 * 定义：移动到聚合对象的下一个位置接口
	 */
	void next();
	/**
	 * 定义：判断是否已经移动移动聚合对象的最后一个位置接口
	 * @return true：最后一个位置，false：不是最后一个位置
	 */
	boolean isDone();
	/**
	 * 定义：获取迭代当前元素接口
	 * @return 迭代的当前元素
	 */
	Object currentItem();
}
```
ConcreteIterator.java: 
```Java
package com.mutistic.behavioral.iterator.structrue;
import com.mutistic.utils.PrintUtil;
// ConcreteIterator：
// 具体迭代器实现对象。定义对聚合对象的遍历，并跟踪遍历时的当前位置（外部迭代器）（游标）
public class ConcreteIterator implements Iterator {
	/** 持有被迭代的具体的聚合对象 */
	private ConcreteAggregate aggregate;
	/**
	 * 内部索引，记录当前迭代到的索引位置 
	 * -1：表示刚开始时，迭代器指向聚合对象第一个对象之前
	 */
	private int index = -1;
	/**
	 * 构造函数：注入被迭代的具体的聚合对象
	 * @param aggregate 被迭代的具体的聚合对象
	 */
	public ConcreteIterator(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
		PrintUtil.two("构造函数：注入被迭代的具体的聚合对象", "ConcreteIterator()");
	}
	/**
	 * 移动到聚合对象的第一个位置
	 * @see com.mutistic.behavioral.iterator.structrue.Iterator#first()
	 */
	@Override
	public void first() {
		index = 0;
		PrintUtil.three("移动到聚合对象的第一个位置", "ConcreteIterator.first()");
	}
	/**
	 * 移动到聚合对象的下一个位置
	 * @see com.mutistic.behavioral.iterator.structrue.Iterator#next()
	 */
	@Override
	public void next() {
		if (index < aggregate.size()) {
			index++;
		}
		PrintUtil.three("移动到聚合对象的第一个位置", "ConcreteIterator.next()");
	}
	/**
	 * 判断是否已经移动移动聚合对象的最后一个位置
	 * @return true：最后一个位置，false：不是最后一个位置
	 * @see com.mutistic.behavioral.iterator.structrue.Iterator#isDone()
	 */
	@Override
	public boolean isDone() {
		PrintUtil.two("判断是否已经移动移动聚合对象的最后一个位置", "ConcreteIterator.isDone()");
		return index == aggregate.size();
	}

	/**
	 * 获取迭代当前元素
	 * @return 迭代的当前元素
	 * @see com.mutistic.behavioral.iterator.structrue.Iterator#currentItem()
	 */
	@Override
	public Object currentItem() {
		PrintUtil.three("（外部迭代器）获取迭代当前元素，转调聚合对象的get方法", "ConcreteIterator.currentItem()");
		if (index < 0) {
			first();
		}
		return aggregate.get(index);
	}
}
```
Aggregate.java: 
```Java
package com.mutistic.behavioral.iterator.structrue;
// Aggregate：
// 聚合对象。定义创建相应迭代器对象的接口
public abstract class Aggregate {
	/**
	 * 定义：工厂方法，创建相应迭代器对象的抽象方法接口
	 * @return 创建相应迭代器对象
	 */
	abstract Iterator createrIterator();
}
```
ConcreteAggregate.java: 
```Java
package com.mutistic.behavioral.iterator.structrue;
import com.mutistic.utils.PrintUtil;
// ConcreteAggregate：
// 具体聚合对象。实现创建相应的迭代器对象。
public class ConcreteAggregate extends Aggregate {
	/** 表示聚合对象具体的内容 */
	private String[] ss;
	/**
	 * 构造函数：传入聚合对象具体的内容
	 * @param ss 聚合对象具体的内容
	 */
	public ConcreteAggregate(String[] ss) {
		super();
		this.ss = ss;
	}
	/**
	 * 工厂方法，创建相应迭代器对象的具体方法
	 * @return 创建相应迭代器对象
	 */
	@Override
	public Iterator createrIterator() {
		PrintUtil.two("工厂方法，创建相应迭代器对象的具体方法", "ConcreteAggregate.createrIterator()");
		return new ConcreteIterator(this);
	}
	/**
	 * 获取索引所对应的元素
	 * @param index 索引
	 * @return 索引所对应的元素
	 */
	public Object get(int index) {
		if(index > ss.length) {
			return null;
		}
		return ss[index];
	}
	/**
	 * 获取聚合对象的大小 
	 * @return 聚合对象的大小
	 */
	public int size() {
		return ss == null ? 0 : ss.length;
	}
}
```

---
### <a id="a_template">二十六、模板模式[Template Pattern]</a> <a href="#a_iterator">next</a> <a href="#a_strategy">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M19_TemplatePattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M19_TemplatePattern.png)<br/>

一、定义、本质、原则: 
```
定义: 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法是的子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
本质: 固定算法骨架
原则: 体现了开闭原则和里氏替换原则：
  体现开闭原则：先分离变与不变，然后把不变的部分抽取出来，定义到父类里面，比如算法骨架，比一些公共的、固定的实现等。
这些不变的部分被封起来，尽量不去修改它了，要扩展新的功能，那就使用子类来扩展，
通过类来实现可变化的步骤，对于这种新增功能的做法是开放
  体现里氏替换原则：能够实现统一的算法骨架，通过切换不同的具体实现来切换不同的功能，一个根本原因就是里氏替换原则，
遵循这个原则，保证所有的子类实现的是同一个算法模板，并能在使用模板的地方，根据需要，切换不同的具体实现。
```

二、结构和说明: 
```
AbstractClass：抽象类。用来定义算法骨架和原语操作，在这类里面，还可以提供算法的通用的实现

ConcreteClass：具体实现类。用来实现算法骨架中的某些步骤，完成跟特定子类相关的功能
```

三、理解: 
```
主要解决：一些方法通用，却在每一个子类都重新写了这一方法。
如何解决：将这些通用算法抽象出来。

1、模板模式的功能：
  模板模式的功能在于固定算法骨架，而然具体算法实现可扩展
  模板模式可以控制子类的扩展。因为在抽象父类中定义了算法的步骤，只是在某几个固定的方法才回调用到被子类实现的方法，
因此只允许子类针对这几个方法来扩展，这个可以被子类覆盖以扩展的方法通常被称为 钩子方法。

2、模板类为什么是抽象类而非接口：
  首先要区分抽象类和接口的区别。
  其次要知道，通常在 既要约束子类的行为，又要为子类提供通用功能的时候 使用抽象类
  模板模式的定义恰好符合抽象类的原则。

3、模板模式中的变与不变：
  程序设计的一个很重要的思考点就是“变与不变”，也就是分析程序中那些功能是可变的，那些功能是不变的，把不变的部分抽象出来
进行公共的实现，把变化的部分分离出去，用接口来封装隔离，或用抽象类约束子类行为。
  模板模式很好的提现了这一点。模板类实现的就是不变的方法和算法骨架，而需要变化的地方，都通过抽象方法，
把具体实现延迟到子类，还通过父类的定义来约束子类的行为，从而使系统能有更好的复用性和扩展性

4、好莱坞原则：
  好莱坞原则：不要给打电话，会给你打电话(don‘t call us, we‘ll call you)
  模板模式很好的体现了这一点，作为父类的模板会在需要的时候，调用子类相应的方法，也就是由父类来找子类，而不是让子类找父类
  这是一种反向的控制结构，依赖倒置

5、在Java里能实现模板模式的原理：
  能够实现的原理就在于Java的动态绑定采用的是“后期绑定”技术，对于出现子类覆盖父类方法的情况，在编译时是通过数据类型。
运行时看实际的对象类型（new 出来的具体类），一句话：new谁就调用谁的方法
  因此在使用模板模式的时候，虽然用的数据类型是模板类型，但是在创建类实例的时候是创建的具体的子类的实例，因此调用的时候，
会被动态绑定到子类的方法上去，从而实现控制反转。其实在写父类的时候，它调用的方法是父类自己的抽象方法，只是在运行的
时候被动态绑定到子类的方法上
```

四、写法: 
```
4.1、通常在模板里面包含如下操作类型：
1、模板方法：就是定义算法骨架的方法

2、具体操作：
  在模板中直接实现某些步骤的方法，通常这些步骤的实现算法是固定的，而且是不怎么变化的，因此就可以当做公共功能实现在模板里面。
  如果不需要提供给子类访问这些方法的话，还可以是private的，这样一来，子类的实现就相对简单些。
  如果是子类需要访问，可以把这些方法定义为protected final的，因为通常情况下，这些实现不能够被子类覆盖和改变了

3、具体的AbstractClass操作：
  在模板中实现某些公共功能，可以提供给子类使用，一般不是具体的算法步骤的实现，只是一些辅助的公共功能

4、原语操作：
  就是在模板中定义的抽象操作，通常是模板方法需要调用的操作，是必须的操作，而且在弗雷中还没有办法确定下来如何实现，
需要子类来真正实现的方法

5、钩子操作：
  在模板中定义，并提供默认实现的操作。这些方法通常被视为可扩展点，但不是必须的，子类可以有选择的覆盖这些方法，
以提供新的实现来扩展功能

6、Factory Method：
  在模板方法中，如果需要得到某些对象实例的话，可以考虑通过工厂模式来获取，吧具体的构建对象的实现延迟到子类中去
```
```
4.2、Java回调机制与模板模式：
  模板模式的一个目的，就是于让其他类来扩展或具体实现在模板中固定的算法骨架重的某些算法步骤。在标准的模板模式实现中。
主要是使用继承的方法，来让父类在运行期间可以调用到子类的方法。
  在Java开发中，可以通过Java回调技术，通过回调在接口中定义的方法，调用到具体的实现类中的方法，其本质同样是利用Java的
动态绑定技术，在这种实现中，可以不把实现类写成单独的类，而是使用匿名内部类来实现回调方法。

Java回调机制与模板模式比较：
1、运行关系：
  使用继承的方式：抽象方法和具体的关系，是在编译期间静态决定的，是类级关系。
  使用Java回调机制：抽象发放和具体实现的关系是在运行期间动态决定的，是对象级的关系

2、灵活性：
  使用继承的方式：对于子类而言，就不能继承其他对象了，因为Java是单继承的
  使用Java回调机制：是基于接口的，相较于继承方式更灵活一些。
  从另外一方面话说，回调机制是通过委托的方式来组合功能，它的耦合强度要比继承低一点，这回提供更多的灵活性。
比如某些模板实现的方法，在回调实现的时候可以不调用模板的方法，而是调用其他实现中的某些功能，也就是说功能
不再局限在模板和回调实现上了，可以更灵活组织功能

3、实现方式：
  使用继承方式：相对Java回调机制更简单点，因为父类提供了实现的方法，子类如果不需要扩展，就不同具体实现了
  使用Java回调机制：回调的接口需要把所有可能被扩展的方法都定义进去，这就导致实现的时候，不管是否需要扩展，
都要实现这个方法，哪怕没有任何操作，只是转调模板中已有的实现，也都要写出来。
  事实上，命令模式的时候Java回调，通过退化命令模式来实现了Java回调的功能，所以也有这样的说法：命令模式可以作为
模板模式的一种替代实现，那就是因为可以使用Java回调来实现模板模式
```
```
4.3、典型应用：排序：
  模板模式的一个非常典型的应用，就是实现排序的功能
  java.util.Collections类，里面实现了对列表排序的功能，它提供了一个静态的sort方法，接受一个列表和一个Comparator接口的实例，
  这个方法实现的大致步骤：
  1、想把列表转换成对象数组
  2、通过Arrays的sort方法来对数组进行排序，传入Comparator接口的实例
  3、然后再把排序号的数组的数据设置回到原来的列表对象中
  这其中的算法步骤是固定的，也就是算法骨架是固定的了，只是其中具体比较数据大小的步骤，需要由外部来提供，也就是传入的
Comparator接口的实例，就是用来实现数据比较的，在算法内部会通过这个接口来回调具体的实现

排序到底是模板模式还是策略模式：
1、认为是策略模式的实例：
  首先排序实现，并没有如同标准的模板模式那样，使用子类来扩展父类，从表面上不太像模板模式
  其实排序使用的Comparator的实例，可以看成是不同的算法实现，在具体排序时，会选择使用不同的Comparator实现，相当于是在切换算法的实现
2、认为是模板模式的实例：
  首先，模板模式的本事是固定算法骨架，虽然标准结构使用的继承方式，当时通过回调来实现，也不能说不是模板模式
  其次，从整体程序上看，排序的算法并没有改变，不过是某些步骤的实现发生了变化，也就是说通过Comparator来切换的是不同的
比较大小的实现，相对于整个排序算法而言，Comparator不过是其中的一个步骤而已。
```

五、优点: 
```
1、封装不变部分，扩展可变部分。 
2、提取公共代码，便于维护，实现代码复用。 
3、行为由父类控制，子类实现
```

六、缺点: 
```
1、算法骨架不容易升级
2、每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大
```

七、使用场景: 
```
1、需要固定算法骨架，实现一个算法的不变部分，并把可变的行为留给子类来实现
2、各个子类中具有公共行为，应该抽取出来，集中在一个公共类中去实现，从而避免代码重复
3、需要控制子类扩展的情况。模板模式会在特定的点来调用子类的方法，这样只允许在这些点进行扩展

具体场景：
1、spring 中对 Hibernate 的支持
2、java.util.Collections的排序功能
```

八、注意事项: 
```
为防止恶意操作，除钩子方法、原语操作外，一般模板方法都加上 final 关键词。
```

Client.java: 
```Java
package com.mutistic.behavioral.template.structure;
import com.mutistic.utils.PrintUtil;
//  Client：客户端
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("模板模式[Template Pattern]");
		AbstractClass abs = new ConcreteClass();
		abs.templateMethod();
	}
}
```
AbstractClass.java: 
```Java
package com.mutistic.behavioral.template.structure;
import com.mutistic.utils.PrintUtil;
// AbstractClass：
// 抽象类。用来定义算法骨架和原语操作，在这类里面，还可以提供算法的通用的实现
public abstract class AbstractClass {
	// 原语操作1：所谓原语操作就是抽象操作，必须要由子类提供实现
	public abstract void doPrimitiveOpeartion1();
	// 原语操作2：所谓原语操作就是抽象操作，必须要由子类提供实现
	public abstract void doPrimitiveOpeartion2();
	// 模板方法：定义算法骨架：声明为final不支持重写
	public final void templateMethod() {
		PrintUtil.three("AbstractClass", "通用的实现1");
		doPrimitiveOpeartion1();
		doPrimitiveOpeartion2();
		PrintUtil.three("AbstractClass", "通用的实现2");
	}
}
```
ConcreteClass.java: 
```Java
package com.mutistic.behavioral.template.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteClass：
// 具体实现类。用来实现算法骨架中的某些步骤，完成跟特定子类相关的功能
public class ConcreteClass extends AbstractClass {
	/**
	 * 原语操作1：具体实现
	 * @see com.mutistic.behavioral.template.structure.AbstractClass#doPrimitiveOpeartion1()
	 */
	@Override
	public void doPrimitiveOpeartion1() {
		PrintUtil.three("ConcreteClass", "原语操作1：具体实现");
	}
	/**
	 * 原语操作2：具体实现
	 * @see com.mutistic.behavioral.template.structure.AbstractClass#doPrimitiveOpeartion2()
	 */
	@Override
	public void doPrimitiveOpeartion2() {
		PrintUtil.three("ConcreteClass", "原语操作2：具体实现");
	}
}
```

---
### <a id="a_strategy">二十七、策略模式[Strategy Pattern]</a> <a href="#a_template">last</a> <a href="#a_state">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M20_StrategyPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M20_StrategyPattern.png)<br/>

一、定义、本质、原则: 
```
定义: 定义一系列的算法，把它们封装起来，并且使它们可以相互替换。策略模式使得算法可独立于使用它的客户而变化
本质: 分离算法，选择实现
原则：体现了开闭原则和里氏替换原则
  体现开闭原则：策略模式通过把一系列可变的算法进行封装，并定义出合理的使用结构，使得在系统出现新算法的时候，
能很容易把新的算法加入到已有的系统中，而已有的实现不需要修改。
  体现里氏替换原则：策略模式是一个扁平结构，一系列的实现算法的地位是平等的，都是实现同一个接口或者继承的同一个父类。
这样只要使用策略的客户端保持面向抽象类型变成，就能够使用不同的策略的具体实现对象来配置它，从而实现一系列算法可以相互替换，
```

二、结构和说明: 
```
Strategy：策略接口。用来约束一系列具体的策略算法。Context使用这个接口来调用具体的策略实现定义的算法

ConcreteStrategy：具体的策略实现，也就是具体的算法实现

Context：上下文。负责和具体的策略类交互，通常上下文会持有一个真正的策略实现，上下文可以让具体的策略类来获取上下文数据，
甚至让具体的策略类来回调上下文的方法
```

三、理解: 
```
主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
如何解决：将这些算法封装成一个一个的类，任意地替换。

1、策略模式的功能：
  策略模式的功能是把具体的算法实现，从具体的业务处理里面独立出来，实现成为单独的算法类，从而形成一系列的算法，并让这些算法可以相互替换。
  策略模式的重心不是如何来实现算法，而是处何组织、调用这些算法，从而让程序结构更灵活、具有更好的维护性和扩展性

2、策略模式和if-else语句：
  每个策略算法具体实现的功能，就是在if-else结构中的具体实现。
  其实多个if-else语句表达的就是一个平等的功能结构，要么执行if，要么执行else，或者是elseif，这个时候，
if块里面的实现和else块里面的实现从运行地位上来讲就是平等的
  而策略模式就是把各个平等具体实现封装到单独的策略实现类了，然后通过上下文来与具体的策略类进行交互。
  因此多个if-else语句可以考虑使用策略模式

3、算法的平等性：
  策略模式一个很大的特点就是各个策略算法的平等性。对于一系列具体的策略算法，其地位是完个一样的，
正是因为这个平等性，才能实现算法之闻可以相互替换
  所有的策略算法在实现上也是相互独立的，相互之间是没有依赖的。
  所以可以这样描述这一系列策略算法：策略算法是相同行为的不同实现

4、准来选择具体的策略算法：
  在策略模式中，可以在两个地方来进行具体策略的选择：
  一个是在客户端，在使用上下文的时候，由客户端来选择具体的策略算法，然后把这个策略算法没置给上下文。
  一个是客户端不用关心，由上下文来选择具体的策略算法，比如容错恢复机制

5、Strategy的实现方式：
  Strategy都是使用的接口来定义的，这也是常见的实现方式。但是如果有多个算法具有公共功能，可以把Strategy实现成抽象类，
然后把多个算法的功能功能实现到Strategy里面。结合模板模式

6、运行时策略的唯一性：
  运行期间，策略模式在每一个时刻只能使用一个具体的策略实现对象，虽然可以动态的在不同的策略实现中切换，但是同时只能使用一个。

7、增加新的策略：
  策略模式可以很灵活的扩展新的算法。具体的做法是：
  先写一个策略算法类来实现新的要求，然后在客户端使用的时候指定，使用新的策略算法类就可以了。

8、Context和Strategy的关系：
  在策略模式中，通是上下文使用具体的策略实现对象，反过来，策略实现对象也可以从上下文获取所需要的数据，
因此可以将上下文当参数传递给策略实现对象，这种情况下上下文和策略实现对象是紧密耦合的。
  在这种情况下，上下文封装着具体策略对象进行算法运算所需要的数据，具体策略对象通过回调上下文的方法来获取这些数据。
  甚至在某些情况下，策略实现对象还可以回调上下文的方法来实现一定的功能，这种使用场景下，上下文变相充当了多个策略算法
实现的公共接口，在上下文定义的方法可以当做是所有或者是部分策略算法，使用的公共功能。
  但是请注意，由于所有的策略实现对象都实现同一个策略接传入同个上下文，可能会造成传入的上下文数据的浪费，
因为有的算法会使用这些数据，而有的算法不会使用，但是上下文和策略对象之间交互的开销是存在的了。
```

四、写法: 
```
1、策略模式扩展的实现方式：
1.1、对于扩展上下文的方式：
  这样实现，所有策略的实现风格更统一，策略需要的数据都统一从上下文来获取，这样在使用方法上也很统一。
  另外，在上下文中添加新的数据：别的相应算法也可以用得上，可以视为公共的数据。
  但缺点也很明显，如果这些数据只有一个特定的算法来使用，那么这些数据有些浪费。
  另外每次添加新的算法都去扩展上下文，容易形成复杂的上下文对象层次，也未见得有必要。

1.2、对于在策略算法的实现上添加自己需要的数据的方式：
  这样实现，比较简单。但是缺点也很明显，跟其它策略实现的风格不一致，其它策略都是从上下文中来获取数据，
而这个策略的实现一部分数据来自上下文，一部分数据来自自己，有些不统一。
  另外，这样一来，外部使用这些策略算法的时候也不一样了，不太好以一个统一的方式来动态切换策略算法。

2、容错恢复机制：
  容错恢复机制是应用程序开发中非常常见的功能。容错恢复就是：程序运行的时候，正常情况下应该按照某种方式来做，
如果按照某种方式来做发生错误的话，系统并不会崩溃，也不会就此不能继续向下运行了，而是有容忍出错的能力，
不但能容忍程序运行出现错误，还提供以现错误后的备用方案，也就是恢复机制，来代替正常执行的功能，
使程序继续向下运行。

3、策略模式结合模板模式：
  在实际应用策略模式的过程中，经常会出现一系列算法的实现上存在公共功能，甚至这一系列算法的实现步骤都是一样的，
只是在某些局步骤上有所不同，这个时候，就需要对策略模式进行些许的变化使用了。
  对于一系列算法的实现上存在公共功能的情况，策略模式可以有如下三种实现方式：
  3.1、在上下文当中实现公共功能，让所有具体的策略算法回'周这些方法。
  3.2、把策略的接口改成抽象类，然后在里面实现具体算法的公共功能。
  3.3、给所有的策略算法定义、个抽象的父类，计这个父类去实现策略的接口，然后这个父类里面去实现公共的功能
  3.4、针对上述情况，就可以在这个抽象类里面定义算法实现的骨架，然后让具体的策略算法去实现变化的部分。
这样的一个结构自然就变成了策略模式来结合模板模式了。抽象类等同于模板类，具体策略类等同于具体模板实现类。
```

五、优点: 
```
1、定义一系列算法，算法之间可以自由切换
2、避免多重条件语句
3、更好的扩展性
```

六、缺点: 
```
1、所有策略类都需要对外暴露，而且客户端必须了解每种策略的区别
2、具体的策略类会导致增加了对象数目
3、由于策略模式要求算法地位的平等性，所以策略模式只适合扁平的算法结构，
```

七、使用场景: 
```
1、出现有许多相关的类，仅仅是行为有差别的情况下，可以使用策略模式来使用多行为中的一个来配置一个类的方法，实现算法动态切换
2、出现同一个算法，有很多不同的实现的情况，可以使用策略模式来把这些“不同的实现”实现成为一个算法的类层次
3、需要封装算法中，与算法相关的数据的情况，可以使用策略模式来避免暴露这些跟算法相关的数据结构
4、出现抽象一个定义了很多行为的类，并且是通过多个if-else语句来选择这些行为的情况，可以使用策略模式来代替这些条件语句

具体场景：
JAVA AWT 中的 LayoutManager
```

八、注意事项: 
```
如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题
```

Client.java: 
```Java
package com.mutistic.behavioral.strategy.structure;
import com.mutistic.utils.PrintUtil;
// Client：客户端
// 演示：策略模式[Strategy Pattern]结构图
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("策略模式[Strategy Pattern]");
		
		PrintUtil.two("通过context转调具体策略算法", "ConcreteStrategyA");
		Context context = new Context(new ConcreteStrategyA());
		context.contextInterface();

		PrintUtil.two("通过context转调具体策略算法", "ConcreteStrategyB");
		Context context2 = new Context(new ConcreteStrategyB());
		context2.contextInterface();

		PrintUtil.two("通过context转调具体策略算法", "ConcreteStrategyC");
		Context context3 = new Context(new ConcreteStrategyC());
		context3.contextInterface();
	}
}
```
Strategy.java: 
```Java
package com.mutistic.behavioral.strategy.structure;
// Strategy：
// 策略接口。用来约束一系列具体的策略算法。Context使用这个接口来调用具体的策略实现定义的算法
public interface Strategy {
	// 定义：某个算法的接口，参数或返回值根据具体的需求
	void algorithmInterface();
	
}
```
ConcreteStrategyA.java: 
```Java
package com.mutistic.behavioral.strategy.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteStrategy：
// 具体的策略实现，也就是具体的算法实现
public class ConcreteStrategyA implements Strategy {
	/**
	 * 算法的具体实现
	 * @see com.mutistic.behavioral.strategy.structure.Strategy#algorithmInterface()
	 */
	@Override
	public void algorithmInterface() {
		PrintUtil.three("ConcreteStrategyA.algorithmInterface()", "算法的具体实现");
	}
}
```
ConcreteStrategyB.java: 
```Java
package com.mutistic.behavioral.strategy.structure;
import com.mutistic.utils.PrintUtil;
public class ConcreteStrategyB implements Strategy {
	@Override
	public void algorithmInterface() {
		PrintUtil.three("ConcreteStrategyB.algorithmInterface()", "算法的具体实现");
	}
}
```
ConcreteStrategyC.java: 
```Java
package com.mutistic.behavioral.strategy.structure;
import com.mutistic.utils.PrintUtil;
public class ConcreteStrategyC implements Strategy {
	@Override
	public void algorithmInterface() {
		PrintUtil.three("ConcreteStrategyC.algorithmInterface()", "算法的具体实现");
	}
}
```
Context.java: 
```Java
package com.mutistic.behavioral.strategy.structure;
import com.mutistic.utils.PrintUtil;
// Context：
// 上下文。负责和具体的策略类交互，通常上下文会持有一个真正的策略实现，上下文可以让具体的策略类来获取上下文数据，甚至让具体的策略类来回调上下文的方法
public class Context {
	/** 持有一个具体的策略对象 */
	private Strategy strategy;

	/**
	 * 构造函数：传入具体的策略对象
	 * @param strategy 具体的策略对象
	 */
	public Context(Strategy strategy) {
		super();
		if (null != strategy) {
			this.strategy = strategy;
		}
	}

	// 上下文对客户端提供的操作接口，转调策略算法接口
	public void contextInterface() {
		PrintUtil.three("Context.contextInterface()", "上下文对客户端提供的操作接口，转调策略算法接口");
		this.strategy.algorithmInterface();
	}
}
```

---
### <a id="a_state">二十八、状态模式[State Pattern]</a> <a href="#a_strategy">last</a> <a href="#a_memento">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M21_StatePattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M21_StatePattern.png)<br/>

一、定义、本质: 
```
定义: 允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类
本质: 根据状态来分离和选择行为
```

二、结构和说明: 
```
Context：环境，也称上下文。通常用来定义客户端需要的接口，同时维护一个具体处理当前状态的实例对象

State：状态接口。用来封装于上下文的一个特定状态所对应的行为

ConcreteState：具体实现状态处理的类，每个类实现一个状态的具体处理
```

三、理解: 
```
主要解决：对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
如何解决：将各种具体的状态类抽象出来。

1、状态和行为：
  所谓对象的状态，通常指的就是对象实例的属性的值：而行为指的就是对象的功能，具体点：行为多半可以对应到方法上
  状态模式的功能就是分离状态的行为，通过维护状态的变化，来调用不同的状态对应的不同的功能。
  也就是说，状态和行为是相关联的，它们的关系可描述为：状态决定行为
  由于状态是在运行期被改变的，因此行为也会在运行期，根据状杰的改变而改变，看起来同一个对象，在不同的运行时刻，
行为是不一样的，就像是类被修改了一样

2、行为的平行性：
  注意是平行性而不是平等性。所渭平行性指的是各个状态的行为所处的层次是一样的，相互是独立的、没有关联的，
是根据不同的状态来决定走平行线的那一条，行为是不同的，当然对应的实现也是不同的，相互之间不可替换
  而平等性强调的是可替换性，是同一行为的不同描述或实现，因此在同一个行为发生的时候，可以根条件来选择任意一个实现来进行相应的处理。
  2.1、状态模式和策略模式：
  状态模式的结构和策略模式的结构完全一样，但是，它们的目的、实现、本质都是完个不一样的。
  行为之间的特性也是状态模式和策略模式一个很重要的区别：
  状态模式的行为是平行性的，不可相互替换的
  策略模式的行为是平等性的，是可以相互替换的

3、上下文和状态处理对象：
  在状态模式中，上下文是持有状态的对象，但是上下文自身并不处理跟状态相关的行为，而是把处理状态的功能委托给
状态对应的状态处理类来处理。
  在具体的状态处理类里面经常需要获取上下文自身的数据，甚至在必要的时候会回调上下文的方法，
因此，通常将上下文自身当作一个参数传递给具体的状态处理类。
  客户端一般只和上下文交互，客户端可以用状态对象来配置一个上下文，一旦配置完毕，就不再需要和状态对象交互了，
客户端通常不负责运行期间状态的维护，也不负责决定到底后续使用哪一个具体的状态处理对象。

4、不完美的OCP体验：
  使用状态模式来修改和扩展功能，是没有完全遵循OCP原则的。由于状态的维护和转换在状态模式结构里面，
不管是扩展了状态实现类，还是新添加了状态实现类，都需要修改状态维护和转换的地方，以使用新的实现。
```

四、写法: 
```
1、创和销毁状态对象：
  在应用状态模式的时候，有一个常见的考虑，就是：究竟何时创建和销毁状态对象。
  常见的有几个选择：
1.1、一个是当需要使用状态对象的时候创建．使用完后就销毁它们：
选择场景：如果要进入的状态在运行时是不可知的，而且上下文是比较稳定的，不会经改变状态，而且使用也不频繁

1.2、另一个是提前创建它们并且始终不销毁
选择场景：如果状态改变很频繁，也就是需要频繁的创建状态对象，而且状态对象还存储着大量的信息数据

1.3、还有一种是采用延迟加载和缓存合用的方式，就是当第一次需要使用状态对象的时候创建，使用完后并不销毁对象，
而是把这个对象缓存起来，等待下一次使用，而且在合适的时候，会山缓存框架销毁状态对象
选择场景：如果无法确定状态改变是否频繁，而且有些状态对象的状态数量大，有些比较小，一切都是未知的

  事实上，在实际工程开发中，第三种方案是首选，因为它兼顾了前面两种方案的优点，而又避免了它们的缺点，
几乎能适应各种情况的需要。只是这个方案在实现的时候，要实现一个合理的缓存柜架，而且要考虑多线程并发的问题，
因为需要由缓存框架来在合适的时候销毁状态对象，因此实现上难度稍点。另外在实现中还可以考虑结合享元模式，
通过享元模式来共享状态对象

2、状态维护和状态转换的控制：
  状态维护：指的就是维护状态的数据，就是给状态设置不同的状态值
  状态转换：指的就是根据状态的变化，选择不同的状态处理对象。
  
  在状态模式中，通有两个地方可以进行状态的维护和转换控制。
  2.1、在上下文当中：因为状态本身通常被实现为上下文对象的状态，因此可以在上下文里面进行状态维护，当然也就可以控制状态的转换
  选择场景：一般情况下，如果状态转换的规则是一定的，一般不需要进行什么扩展规则，那么适合在上下文种统一进行状态的维护
  
  2.2、在状态的处理类里面：当每个状态处理对象处理完自身状态所对应的功能后，可以根需要指定后继的状态，
以便让应用能正确处理后续的请求
  选择场景：如果状态的转换取决于前一个状态动态处理的结果，或者是依赖于外部数据，为了增强灵活性，
这种情况下，一般是在状态处理类里面进行状态的维护

3、使用数据库来维护状态：
  在实际开发中，还有一个方式来维护状态，那就是使用数据库，在数据库中存储下一个状态的识别数据，
也就是说，维护下一个状态，演化成了维护下个状态的识别数据，比如状态编码。
  这样在程序中，通过查询数据库中的数据来得到状态编码，然后再根据状态编码来创建以相应的状态对象，
然后再委托相应的状态对象进行功能处理。
  还有一种情况是直接把“转移"通过序列化的方式记录到数据库中，这样会更灵活。
  所谓转移：指的就是描述从A状态到B状态的这么一个转换变化

4、模拟工作流：
  简单实现：把流程数据存放在数据库里面，然后在程序里面自己来进行流程控制。
对于简单的业务流程控制，可以使用状态模式来辅助进行流程控制，因为大部分这种流程都是状态驱动的。
```

五、优点: 
```
1、简化应用逻辑控制
2、更好的分离状态和行为
3、更好的扩展性
4、封装了转换规则。 
5、枚举可能的状态，在枚举状态之前需要确定状态种类。 6、将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，只需要改变对象状态即可改变对象的行为。 7、允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块。 
8、可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数
```

六、缺点: 
```
1、显示化进行状态转换
2、状态模式的使用必然会增加系统类和对象的个数。 
3、状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱。 
4、状态模式对"开闭原则"的支持并不太好，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，
否则无法切换到新增状态，而且修改某个状态类的行为也需修改对应类的源代码
```

七、使用场景: 
```
1、行为随状态改变而改变的场景：如果一个对象的行为取决于它的状态，而且它必须在运行时刻根状态来改变它的行为。可以使用状态模式，
来把状态和行为分离开，虽然分离开了，但状态和行为是有对应关系的，可以在运行期间，通过改变状态，
就能够调用到该状态对应的状态处理对象上去，从而改变对象的行为
2、条件、分支语句的代替者：如果一个操作中含有庞大的多分支语句，而且这些分支依赖于该对象的状态。可以使用状态模式，
把各个分支的处理分散包装到单独的对象处理类里面，这些分支对应的对象就可以不依赖于其它对象而独立变化了
```

八、注意事项: 
```
在行为受状态约束的时候使用状态模式，而且状态不超过 5 个
```

Client.java: 
```Java
package com.mutistic.behavioral.state.structure;
import com.mutistic.utils.PrintUtil;
// Client：客户端
// 演示 状态模式[State Pattern]
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("状态模式[State Pattern]");
		
		Context ctx = new Context();
		ctx.setState(new ConcreteStateA());
		ctx.request("ConcreteStateA");
		
		ctx.setState(new ConcreteStateB());
		ctx.request("ConcreteStateB");
	}
}
```
Context.java: 
```Java
package com.mutistic.behavioral.state.structure;
import com.mutistic.utils.PrintUtil;
// Context：
// 环境，也称上下文。通常用来定义客户端需要的接口，同时维护一个具体处理当前状态的实例对象
public class Context {
	/** 持有 State状态实例对象 */
	private State state;

	/**
	 * 客户端需要的接口方法
	 * @param param
	 */
	public void request(String param) {
		PrintUtil.three("Context.request()客户端需要的接口方法，转调具体的状态实例功能", state);
		state.handle(param);
	}
	// 获取状态对象
	public State getState() { return state; }
	// 设置状态对象
	public void setState(State state) {
		this.state = state;
		PrintUtil.two("Context.setState()设置具体的状态实例", state);
	}
}
```
State.java: 
```Java
package com.mutistic.behavioral.state.structure;
// State：
// 状态接口。用来封装于上下文的一个特定状态所对应的行为
public interface State {
	/**
	 * 定义：状态对应的处理接口
	 * @param param 具体参数
	 */
	void handle(String param);
}
```
ConcreteStateA.java: 
```Java
package com.mutistic.behavioral.state.structure;
import com.mutistic.utils.PrintUtil;
// ConcreteState：
// 具体实现状态处理的类，每个类实现一个状态的具体处理
public class ConcreteStateA implements State {
	/**
	 * 状态对应的具体处理
	 * @param param
	 * @see com.mutistic.behavioral.state.structure.State#handle(java.lang.String)
	 */
	@Override
	public void handle(String param) {
		PrintUtil.three("具体实现状态处理的类，每个类实现一个状态的具体处理", "ConcreteStateA.handle()");
	}
}
```
ConcreteStateB.java: 
```Java
package com.mutistic.behavioral.state.structure;
import com.mutistic.utils.PrintUtil;
public class ConcreteStateB implements State {
	@Override
	public void handle(String param) {
		PrintUtil.three("具体实现状态处理的类，每个类实现一个状态的具体处理", "ConcreteStateB.handle()");
	}
}
```

---
### <a id="a_memento">二十九、备忘录模式[Memento Pattern]</a> <a href="#a_state">last</a> <a href="#a_interpreter">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M22_MementoPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M22_MementoPattern.png)<br/>

一、定义、本质: 
```
定义: 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将对象恢复到原先保存的状态
本质: 保存和恢复内部状态
```

二、结构和说明: 
```
Memento：备忘录。主要用来存储原发器对象的内部状态，但是具体需要存储哪些数据是由原发器对象来决定的。
另外备忘录应该只能由原发器对象来访问它内部的数据，原发器外部的对象不应该能访问到备忘录对象的内部数据，
一般定义为窄接口（不声明任何方法）,标识对象的类型

Originator：原发器。使用备忘录来保存某个时刻原发器自身的状态，也可以使用备忘录来恢复内部状态。

MementoImpl：具体备忘录对象。实现备忘录窄接口，在Originator原发器内部中实现成私有的内部类，不让外部访问。同时可以声明为静态的

Caretaker：备忘录管理者，或者称为备忘录负责人。主要负责保存备忘录对象，但是不能对备忘录对象的内容过行操作或检查。
```

三、理解: 
```
1、备忘录模式的功能：
  备忘录模的功能，首先是在不破坏封装性的前提下，捕获一个对象的内部状态。
  这里要注意两点：
  1.1、一个是不破坏封装性，也就是对象不能暴露它不应该暴露的细节；
  1.2、另外一个是捕获的是对象的内部状态，而且通常还是运行期间某个时刻，对象的内部状态。
  
  捕获对象的内部状态原因和作用：
  是为了在以后的某个时候，将该对象的状态恢复到备忘录所保存的状态，这才是备忘录真正的目的，前面保存状态就是为了后面恢复，
虽然不是一定要恢复，但是目的是为了恢复。这也是很多理解备忘录模式的时候，忽视掉的地方，他们太关注备忘，而忽视了恢复，这是不全面的理解。
  
  捕获的状态存放的位置：
  备忘录模式中，捕获的内部状态，存储在备忘录对象中。而备忘录对象，通常会被存储在原发器对象之外，也就是被保存状态的对象的外部，
通常是存放在管理者对象里面

2、备忘录对象：
  在备忘录模式中，备忘录对象，通常就是用来记录原发器需要保存的状态的对象，简单点的实现，就是个封装数据的对象。
  但是这个备忘录对象和普通的封装数据的对象还是有区别的，主要就是这个备忘录对象，一般只让原发器对象来操作，
而不是像普通的封装数据的对象那样，谁都可以使用。为了保证这一点，通常会把备忘录对象作为原发器对象的内部类来实现，
而且会实现成私有的，这就断绝了外部来访问这个备忘录对象的途径
  但是备录对象需要保存在原发器对象之外，为了与外部交互，通常备忘录对象都会实现窄接口，来标识对象的类型。

3、原发器对象：
  原发器对象，就是需要被保存状态的对象，也是有可能需要恢复状态的对象。原发器一般会包含备忘录对象的实现。
  通常原发器对象应该提供捕获某个时刻对象内部状态的方法，在这个方法里面，原发器对象会创建备忘录对象，
把需要保存的状态数据设置到备忘录对象中，然后把备忘录对象提供给管理者对象来保存。

4、管理者对象：
  在备忘录模式中管理者对象，主要是负责保存备忘录对象。有以下几点要注意：
  4.1、并不一定要特别的做出一个管理者对象来，广义地说，调用原发器获得备忘录对象后，备忘录对象放在哪里，
哪个对象就可以算是管理者对象。
  4.2、管理者对象并不是只能管理一个备忘录对象，一个管理者对象可以管理多个备忘录对象
  4.3、狄义的管理者对象，是只管理同一类的备忘录对象，但是广义管理者对象是可以管理不同类型的备忘录对象的
  4.4、管理者对象需要实现的基本功能主要就是：存入备忘录对象、保存备忘录对象、获取备忘录对象，
如果从功能上看，就是一个缓存功能的实现，或者是一个简单的对象实例池的实现
```

四、写法: 
```
1、窄接口和宽接口：
  窄接口：管者只能看到备忘录的窄接口，它的实现里面通常没有任何的方法，只是一个类型标识，窄接口使得管理者只能将备忘录传递给其它对象。
  宽接口：原发器能够看到一个宽接口，允许它访问所需的所有数据，来返回到先前的状态。理想状况是：
只允许生成备忘录的原发器来访问该备忘录的内部状态，通常实现成为原发器内的一个私有内部类。

  备忘录模式的标准实现方式，那就是窄接口没有任何的方法，把备忘录对象实现成为原发器对象的私有内类。
  那么能不能在窄接口里面提供备忘录对象对外的方法，，变相对外提供一个宽接口？
  通常情况是不会这么做的，因为这样一来，所有能拿到这个接口的对象就可以通过这个接口来访问备忘录内部的数据或是功能，
这违反了备忘录模式的初衷，备忘录模式要求“在不破坏封性的前提下”，如果这么做，那就等于是暴露了内部细节，
因此，备忘录模式买现的时候，对外多是采用窄接口，而且通常不会定义任何方法。

2、使用备忘录的潜在代价：
  标准的备忘录模式的实现机制是依靠缓存来实现的，因此，当需要备忘的数据量较大时，或者是存储的备忘录对象数据量不大
但是数量很多的时候，或者是用户很频繁的创建备忘录对象的时候，这些都会导致非常大的开销。
  因此在使用备忘录模式的时候，一定要好好思考应用的环境，如果使用的代价太高，就不要选用备忘录模式，可以采用其它的替代方案

3、增量存储：
  如果需要频繁的创建备忘录对象，而且创建和应用备忘录对象来恢复状态的顺序是可控的，那么可以让备忘录进行增量存储，
也就是备忘录可以仅仅存储原发器内部相对于上次存储状态后的增量改变。
  比如，在命令模式实现可撤销命令的实现中，就可以使用备忘录来保存每个命令对应的状态，然后在撤销命令的时候，
使用备忘录来恢复这些状态。由于命令的历史列表是按点命令操作的顺序来存放的，也是按照这个历史列表来进行取消和重做的，
因此顺序是可控的。那么这种情况，还可以让备忘录对象只存储一个命令所产生的增量改变而不是它所影响的每一个对象的完整状态。

4、结合原型模式：
  在原发器对象创建备忘录对象的时候，如果原发器对象中全部或者大部分的状态都需要保存，一个简洁的方式就是直接克隆一个原发器对象。
也就是说，这个时候备忘录对象里面存放的是一个原发器对象的实例

5、离线存储：
  标准的备忘录模式，没有讨论离线存储的实现。
  事实上，从备忘录模式的功能和实现上，是可以把备忘录的数实现成为离线存能的，也就是不仅限于存储于内存中，
可以把这些备忘数据存储到文件中、xml中、数据库中，从而支持跨越会话的备份和恢复功能
  离线存储甚至能帮助应对应用崩溃，然后关闭重启的情况，应用重启过后，从离线存储里面获取相应的数据，
然后重新没置状态，恢复到崩溃前的状态

6、结合命令模式：
  可以实现可撤销操作，存储式恢复，意思就是把操作前的状态记录下来，然后要撤销操作的时候就直接恢复回去就可以了
```

五、优点: 
```
1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。 
2、更好的封装性：实现了信息的封装，使得用户不需要关心状态的保存细节
3、窄接口和宽接口
```

六、缺点: 
```
1、可能会导致高开销，消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存
```

七、使用场景: 
```
1、如果必须保存一个对象在某一个时刻的全部或者部分状态，这样在以后需要的时候，可以把该对象恢复到先前的状态。
可以使用备忘录模式，使用备录对象来封装和保存需要保存的内部状态，然后把备忘录对象保存到管理者对象里面，
在需要的时候，再从管理者对象里面获取备忘录对象，来恢复对象的状态
2、如果需要保存一个对象的内部状态，但是如果用接口来让其它对象百接得到这些需要保存的状态，
将会暴露对象的实现细节并破坏对象的封装性。可以使用备忘录模式，把备忘录对象实现成为原发器对象的内部类，
而且是私有的，从而保证只有原发器对象才能访问该备忘录对象。这样既保存了需要保存的状态，
又不会暴露原发器对象的内部实现细节。

具体场景：
1、Windows 里的Ctrl+Z恢复操作
2、浏览器中的后退操作
3、数据库的事务管理
```

八、注意事项: 
```
1、为了符合迪米特原则，还要增加一个管理备忘录的类。 
2、为了节约内存，可使用原型模式+备忘录模式
```

Client.java: 
```Java
package com.mutistic.behavioral.memento.structure;
import com.mutistic.utils.PrintUtil;
// Client：客户端 
// 演示 备忘录模式[Memento Pattern]-结构
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("备忘录模式[Memento Pattern]-结构");
		// 创建原发器实例，设置原发器状态
		Originator originator = new Originator();
		originator.setState("AAA");
		
		// 创建忘录管理者，保存从原发器创建出来的备忘录
		Caretaker caretaker = new Caretaker();
		caretaker.saveMemento(originator.createMemento());
		
		// 设置原发器其他状态
		originator.setState("BBB");
		
		// 原发器 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
		originator.setMemento(caretaker.retriverMemento());
		originator.getState();
	}
}
```
Memento.java: 
```Java
package com.mutistic.behavioral.memento.structure;
// Memento：备忘录。定义为窄接口（不声明任何方法）
// 主要用来存储原发器对象的内部状态，但是具体需要存储哪些数据是由原发器对象来决定的。
// 另外备忘录应该只能由原发器对象来访问它内部的数据，原发器外部的对象不应该能访问到备忘录对象的内部数据
public interface Memento {

}
```
Caretaker.java: 
```Java
package com.mutistic.behavioral.memento.structure;
import com.mutistic.utils.PrintUtil;
// Caretaker： 备忘录管理者
// 或者称为备忘录负责人。主要负责保存备忘录对象，但是不能对备忘录对象的内容过行操作或检查。
public class Caretaker {
	/** 持有 保存的备忘录对象*/
	private Memento memento;
	/**
	 * 保存备忘录对象 
	 * @param memeto 被保存的备忘录对象
	 */
	public void saveMemento(Memento memento) {
		PrintUtil.three("Caretaker.saveMemento()：保存备忘录对象", memento);
		this.memento = memento;
	}
	/**
	 * 获取被保存的备忘录对象 
	 * @return 被保存的备忘录对象
	 */
	public Memento retriverMemento() {
		PrintUtil.two("Caretaker.retriverMemento()：获取被保存的备忘录对象 ", memento);
		return memento;
	}
}
```
Originator.java: 
```Java
package com.mutistic.behavioral.memento.structure;
import com.mutistic.utils.PrintUtil;
// Originator： 原发器。
// 使用备忘录来保存某个时刻原发器自身的状态，也可以使用备忘录来恢复内部状态。
public class Originator {
	/** 示意：表示原发器的状态 */
	private String state;
	// 获取原发器的状态
	public String getState() {
		PrintUtil.two("Originator.getState()：获取原发器的状态", state);
		return state;
	}
	// 设置原发器的状态
	public void setState(String state) {
		PrintUtil.two("Originator.setState()：设置原发器的状态", state);
		this.state = state;
	}
	/**
	 * 创建保存原发器对象的状态的备忘录对象
	 * @return 创建好的备忘录对象
	 */
	public Memento createMemento() {
		Memento memento = new MementoImpl(state);
		PrintUtil.three("Originator.createMemento()：创建保存原发器对象的状态的备忘录对象：Memento", memento);
		return memento;
	}
	/**
	 * 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
	 * @param memento 记录有原发器状态的备忘录对象
	 */
	public void setMemento(Memento memento) {
		MementoImpl impl = (MementoImpl) memento;
		PrintUtil.three("Originator.createMemento()：重新设置原发器对象的状态，让其回到备忘录对象记录的状态", impl);
		this.state = impl.getState();
	}
	
	/**
	 * MementoImpl：具体备忘录对象 
	 * 实现备忘录窄接口，在Originator原发器内部中实现成私有的内部类，不让外部访问。同时可以声明为静态的
	 */
	private static class MementoImpl implements Memento {
		/** 示意：表示要保存的状态（可以是对象等，引用对象需要深度克隆） */
		private String state;
		/**
		 * 构造函数：设置要保存的状态
		 * @param state
		 */
		public MementoImpl(String state) {
			PrintUtil.two("MementoImpl()：构造函数：设置要保存的状态", state);
			this.state = state;
		}

		// 获取 保存的状态 
		public String getState() {
			PrintUtil.three("MementoImpl.getState()：获取 保存的状态 ", state);
			return state;
		}
		
	}
}
```

---
### <a id="a_interpreter">三十、解释器模式[Interpreter Pattern]</a> <a href="#a_memento">last</a> <a href="#a_responsibility">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M23_InterpreterPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M23_InterpreterPattern.png)<br/>

一、定义、本质: 
```
定义: 给定一个语言，定义它的语法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
本质: 分离实现，解释执行
```

二、结构和说明: 
```
AbstractExpression：定义解释器的接口，约定解释器的解释操作。

TerminalExpression：终结符解释器，用来实现语法规则中和终结符相关的操作，不再包含其它的解释器，
如果用组合模式来构建抽象语法树的话，就相当于组合模式中的叶子对象，可以有多种终结符解释器。

NonteminalExpression：非终结符解释器，用来实现语法规则中非终结符相关的操作，通常一个解释器对应一个语法规则，
可以包含其它的解释器，如果用组合模式来构建抽象语法树的话，相当于组合模式中的组合对象，可以有多种终结符解释器。

Context：上下文，通常包含各个解释器需要的数据，或是公共的功能。

Client：客户端，指的是使用解释器的客户端，通常在这里去把按照语言的语法做的表达式，
转换成为解释器对象捐述的抽象浯法树，这一步也叫解析器，然后调用解释操作。
```

三、理解: 
```
主要解决：对于一些固定语法构建一个解释句子的解释器。
如何解决：构建语法树，定义终结符与非终结符。

1、解释器模式的功能：
  解释器模式使用解释器对象来表示和处理相应的语法规则，一般一个解释器处理一条语法规则。
理论上来说，只要能用解释器对象把符合语法的表达式表示以来，而且能够构成抽象的语法树，那都可以使用解释器模式来处理。

2、语法规则和解释器：
  语法规则和解释器之间是有对应关系的，一般一个解释器处理一条语法规，但是反过来并不成立，
一条浯法规则是可以有多种解释和处理的，也就是一条语法规则可以对应多个解释器对象。

3、上下文的公用性：
  上下文在解释器模式中起到非重要的作用，由于上下文会被传递到所有的解释器中，因此可以在上下文中存储和
访问问解释器的状态，比如解释器可以存储一些数据在上下文中，后而的解释器就可以获取这些值
  另外还可以通过上下文传递一些在解释器外部，但是解释器需要的数据，也可以是一些全局的，公共的数据。
  上下文还有一个功能，可以提供所有解释器对象的公共功能，类似于对象组合，而不是使用继承来获取公共功能，
在每个解释器对象里面都可以调用。

4、谁来构建抽象语法树：
 在客户端手工来构建抽象语法树，是很麻烦的，但是在解释器模式中，并没有涉及这部分功能，
只是负责对构建好的抽象语法树进行解释处理。
  还存在的问题，就是一条语法规则是可以对应多个解释器对象的，也就是说同一个元素，
是可以转换成多个解释器对象的，这也就意味着同样一个表达式，是可以构成不同的抽象语法树的，
这也造成构建抽象语法树变得很困难，而且工作量很大。

5、谁负责解释操作：
  只要定义好了抽象语法树，肯定是解释器来负责解释执行。虽然有不同的语法规则，
但是解释器不负责选择究竟用哪一个解释器对象来解释执行语法规则选释器的功能在构建抽象语法树的时候就完成了。
```

四、写法: 
```
1、解释xml：
  解析器：指的是把描述客户端调用要求的表达式，经过解忻，形成一个抽象语法树的程序，不是指xml的解析器。
  解释器：指的是解释抽象语法树，并执行每个节点对应的功能的程序

  要解决通用解析xml的问题，
  1.1、需要先设计一个简单的表达式语言，在客户端调用解析程序的时候，传入用这个表达式语言拙述的一个表达式，
然后把这个表达式通过解析器的解析，形成一个抽象的浯法树
  1.2、解析完成后，自动调用解释器来解释抽象语法树，并执行每个节点所对应的功能，从而完成通用的xml解析
  这样，每次当xml结构发生了更改，也就是在客户端调用的时候传入不同的表达式即可，整个解析xml过程的代码不需要再修改了。

  1.3、比如约定表达式的文法如下：
  1.3.1、获取单个元素的值：从根元素开始，一直到想要获取值的元素，元素中间用“/”分隔，根元素前不加“/”。
比如表达式“root/a/b/c”，就表示获取根元素下、a元素下、b元素下的c元素的值
  1.3.2、获取单个元素的属性的值：要获取值的属性一定是表达式的最后一个元素的属性，在最后一个元素后面添加“．”
然后再加上属性的名称。如"root/a/b/c.name”就表示获取根元素下、a元素下、b元素下、c元素的name属性的值
  1.3.3、获取相同元素名称的值，当然是多个：要获取值的元素一定是表达式的最后一个元素，在最后一个元素后面添加“$”。
比如表达式“root/a/b/d$”就表示获取根元素下、a元素下、b元素下的多个d元素的值的集合
  1.3.4、获取相同元素名称的属性的值，当然也是多个：要获取属性值的元素一定是表达式的最后一个元素，
在最后一个元素后面添加“$”，然后在后面添加“.”然后再加上属性的名称，在属性名称后面也添加“$”。
比如表达式“root/a/b/d$.id$”就表示获取根元素下、a元素下、b元素下的多个d元素的id属性的值的集合

2、解析器：
  解析器负责把表达式，解析转换成为解释器需要的抽象语法树。当然解析器是跟表达式的语法，还有解释器对象紧密关联的。
  解析器有很多种实现方式，没有什么定式，只要能完成相应的功能即可，比如表驱动、语法分析生成程序等。
  也可以分解表达式以实现构建抽象语法树的功能，没有使用递归，而是用循环实现的。

  循环实现思路：
  2.1、把客户端传递来的表达式进行分解，分解成为单个的元素，并用一个对应的解析模型来封装这个元素的一些信息。
  2.2、根每个元素的信息，转化成相对应的解析器对象
  2.3、按照先后顺序，把这些解析器对象组合起来，得到抽象浯法树
  
  不把第一步和第二步合并，直接分解出一个元素就转转成相应的解释器对象的原因：
  一是功能分离，不要让一个方法的功能过于复杂。
  二是为了之后的修改和扩展，如果语法复杂了，直接转换就很杂乱了。
  事实上，封装解析属性的数据模型充当了第一步和第二步操作间的接口，使第一步和第二步都变简单了
```

五、优点: 
```
1、可扩展性比较好，灵活。 
2、增加了新的解释表达式的方式。 
3、易于实现简单语法（文法）。
```

六、缺点: 
```
1、可利用场景比较少。 
2、对于复杂的文法比较难维护。 
3、解释器模式会引起类膨胀。 
4、解释器模式采用递归调用方法。
```

七、使用场景: 
```
1、当有一个语言需要解释执行，并且可以将该语言中的句子表示为一个抽象语法树的时候，可以考使用解释器模式。
  在使用解释器模式的时候，还有两个特点需要考虑，一个是语法相对应该比较简单，太复杂的语法不合适使用解释器模式。
另一个是效率要求不是很高，对效率要求很高的情况下，不适合使用解释器模式。

具体场景：
1、编译器、运算表达式计算
```

八、注意事项: 
```
可利用场景比较少，JAVA 中如果碰到可以用 expression4J 代替
```

Client.java: 
```Java
package com.mutistic.behavioral.interpreter.structure;
import com.mutistic.utils.PrintUtil;
// Client：
// 客户端，指的是使用解释器的客户端，通常在这里去把按照语言的语法做的表达式，
// 转换成为解释器对象捐述的抽象浯法树，这一步也叫解析器，然后调用解释操作。
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("解释器模式[Interpreter Pattern]-结构");
		
		NonteminalExpression root = new NonteminalExpression();
		NonteminalExpression note = new NonteminalExpression();
		TerminalExpression term = new TerminalExpression();
		root.add(note);
		note.add(term);
		
		Context ctx = new Context();
		root.interpret(ctx);
	}
}
```
Context.java: 
```Java
package com.mutistic.behavioral.interpreter.structure;
// Context：
// 上下文，通常包含各个解释器需要的数据，或是公共的功能。
public class Context {
}
```
AbstractExpression.java: 
```Java
package com.mutistic.behavioral.interpreter.structure;
// AbstractExpression：抽象表达式
// 定义解释器的接口，约定解释器的解释操作。
public abstract class AbstractExpression {
	/**
	 * 定义：解释的操作
	 * @param ctx 上下文对象
	 */
	public abstract void interpret(Context ctx);
}
```
NonteminalExpression.java: 
```Java
package com.mutistic.behavioral.interpreter.structure;
import java.util.ArrayList;
import java.util.List;
import com.mutistic.utils.PrintUtil;
//  NonteminalExpression：非终结符表达式
// 非终结符解释器，用来实现语法规则中非终结符相关的操作，通常一个解释器对应一个语法规则，
// 可以包含其它的解释器，如果用组合模式来构建抽象语法树的话，相当于组合模式中的组合对象，可以有多种终结符解释器。
public class NonteminalExpression extends AbstractExpression {
	/** 持有 表达式集合 */
	private List<AbstractExpression> list = new ArrayList<AbstractExpression>();
	/**
	 * 添加表达式
	 * @param expression
	 */
	public void add(AbstractExpression expression) {
		list.add(expression);
	}
	/**
	 * 非终结符表达式：解释操作
	 * @param ctx 上下文
	 * @see com.mutistic.behavioral.interpreter.structure.AbstractExpression#interpret(com.mutistic.behavioral.interpreter.structure.Context)
	 */
	@Override
	public void interpret(Context ctx) {
		PrintUtil.two("NonteminalExpression.interpret()", "实现与语法规则中的非终结符相关联的解释操作：递归调用"+ctx);
		for (AbstractExpression abstractExpression : list) {
			abstractExpression.interpret(ctx);
		}
	}
}
```
TerminalExpression.java: 
```Java
package com.mutistic.behavioral.interpreter.structure;
import com.mutistic.utils.PrintUtil;
// TerminalExpression：终结符表达式
// 终结符解释器，用来实现语法规则中和终结符相关的操作，不再包含其它的解释器，
// 如果用组合模式来构建抽象语法树的话，就相当于组合模式中的叶子对象，可以有多种终结符解释器。
public class TerminalExpression extends AbstractExpression {
	/**
	 * 终结符表达式：解释操作
	 * @param ctx 上下文
	 * @see com.mutistic.behavioral.interpreter.structure.AbstractExpression#interpret(com.mutistic.behavioral.interpreter.structure.Context)
	 */
	@Override
	public void interpret(Context ctx) {
		PrintUtil.two("TerminalExpression.interpret()", "实现与语法规则中的终结符相关联的解释操作"+ ctx);
	}
}
```

---
### <a id="a_responsibility">三十一、职责链模式[Chain of Responsibility Pattern]</a> <a href="#a_interpreter">last</a> <a href="#a_visitor">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M24_ChainofResponsibilityPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M24_ChainofResponsibilityPattern.png)<br/>

一、定义、本质: 
```
定义: 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合美系。将这些对象连成一条链，
并沿着这条链传递该请求，直到有一个对象处理它为止。
本质: 分离职责，动态组合
```

二、结构和说明: 
```
Handler：定义职责的接口，通常在这里定义处理请求的方法，可以在这实现后继链

ConcreteHandler：实现职责的类，在这个类里面，实现对它职责范围内请求的处理，如果不处理，
就继续转发请求给后继者。

Client：职责链的客户端，向链上的具体处理者对象提交请求，让职责链负责处理
```

三、理解: 
```
主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，
无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。
如何解决：拦截的类都实现统一接口。

1、职责链模式的功能：
  职责链模式主要用来处理：“客户端发出一个请求，有多个对象都有机会来处理这一个请求，但是客户端不知道究竟谁会来处理他的请求”，
这样的情况。也就是需要让请求者和接收者解耦，这样就可以动态的切换和组合接收者了。
  注意在标准的职责链模式里面，是只要有对象处理了请求，这个请求就到此为止，不再被传递和处理了。
  如果是要变形使用职责链，就可以让这个请求继续传递，每个职责对象对这个请求进行一定的功能处理，
从而形成一个处理请求的功能链。

2、隐式接收者：
  当客户端发出请求的时候，客户端并不知逍谁会真正处理他的请求，客户端只知道他提交请求的第一个对象。
从第一个处理对开始，整个职责里面的对象，要么自己处理请求，要么继续转发给下一个接收者。

3、谁来处理：
  职责链中那么多处理对象，到底准来处理请求呢，这个是在运行时期动态决定的。
当请求被传递到某个处理对象的时候，这个对象会按照己经没定好的条件来判断，是否属于自己处理的范上，
如果是就处理，如果不是就转发请求给下一个对象

4、请求是否一定被处理：
  在职责链模式中，请求不一定会被处理，因为可能没有合适的处理者，请求在职责链面从头传递尾，
每个处理对象都判断不属于自己处理，最后请求就没有对象来处理。这一点是需要注意的。
  可以在职责链的末端始终加一个不支持此功能处理的职责对象，如果传递到这个职责，提示本职责链没有真正的职责对象处理这个请求
```

四、写法: 
```
1、如何构建链：
  可以按照实现的地方：
  1.1、外部链：可以实现在客户端，在提交请求前组合链，也就是在使用的时候动态组合链，称为外部链
  1.2、内部链：可以在Handler里面实现链的组合，算是内部链的一种
  1.3、内部连：可以在各个职责对象而，由各个职责对象自行决定后续的处理对象，
这种实现力式要求每个职责对象除了进行业务处理外，还必须了解整个业务流程。
按照构建的数据来源，也就是决定了按照什么顺序来组合链的数据，分以下几种：
  1.3.1：可以在程序里面动态组合
  1.3.2：可以通过外部，如数据库来获取组合的数据，这种属于数据库驱动的方式
  1.3.3：可以通过配置文件传递过来，也可以是流程的配置文件，
  如果是从外部获取数据来构建链，那么在程序运行的时候，会读取这些数据，然后根据数据的要求
来获取相应的对象，并组合起来。
  1.3.4、不需要构建链，因为己有的对象己经自然构成链了，这种情况多以现在组合模式构建的对象树中，
这样子对象可以很自然的向上找到自己的父对象。

2、处理多种请求的方式：
  2.1、简单的处理方式：一个简单的方法就是为每种业务单独定义一个方法，然后客户端根据不同的需要调用不同的方法
  2.2、涌用请求的处理方式：2.1的方式有一个很明显的问题，那就是只要增加一个业务，就需要修改职责的接口，
不是很灵活的，Java开发中很强调面向接口编程，因此接口应该相对保持稳定，接口一修改，要修改的地方就太多了，
频繁修改接口绝对不是个好主意。
  
  分析现在变化的东西：
    不同的业务需要传递的业务数据不同
    不同的业务请求的方法不同
    不同的职责对象处理这些不同的业务请求的业务逻辑不同
  解决这些问题，可以首先定义一套通用的调用框架、用一个通用的请求对象来封装请求传递的参数；
然后定义一个通用的调用方法，这个方法不区分具体业务，所有的业务都是这一个方法，
那么具体的业务如何区分呢，就是在通用的请求对象里面会有一个业务的标记，
到了职责对象里面，属于本职责处理就跟原来一样的处理方式，如果不属于，就传递到下一个处理对象就好了。

3、功能链：
  在实际开发中，经会出现一个把职责链稍稍变形的用法。
  在标准的职责链中，一个请求在职责链中传递，只要有一个对象处理了这个请求，就会停止。
  现在稍稍变一下，改成一个请求在职责链中传递，每个职责区对象负责处理请求的某一方面功能，处理完成后，不是停止，
而是继续向下传递请求，当请求通过很多职责对象处理过后，功能也就处理完了，把这样的职责链称为功能链。
  虽然可以使用装饰模式来实现这样的功能，但是职责链会更灵活一些，
因为装饰模式是在已有的功能上增加新的功能，多个装饰器之间会有一定的联系。
而职责链模式的各个职责对象实现的功能，相互之间是没有关联的，是自己实现属于自己处理的那一份功能。
```

五、优点: 
```
1、请求者和就接收者松散耦合
2、动态组合职责
3、简化了对象。使得对象不需要知道链的结构
4、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 
5、增加新的请求处理类很方便。 
```

六、缺点: 
```
1、产生很多细粒度对象
2、请求不一定能被处理
3、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。 
4、可能不容易观察运行时的特征，容易出错
```

七、使用场景: 
```
1、如果有多个对象可以处理同一个请求，但是具体由哪个对象来处理该请求，是运行时刻动态确定的。
这种情况可以使用职责链模式，把处理请求的对象实现成为职责对象，然后把它们构成一个职责链，
当请求在这个链中传递的时候，具体由哪个职责对象来处理，会在运行时动态判断

2、如果想在不明确指定接收者的情况下，向多个对象中的一个提交一个请求的话，可以使用职责链模式，
职责链模式实现了请求者和接收者之间的解耦，请求者不需要知道究竟是哪一个接收者对象来处理了请求

3、如果想要动态指定处理一个请求的对象集合，可以使用职责链模式，职责链模式能动态的构建职责链，
也就是动态的来决定到底哪些职责对象来参处理请求中来，相当于是动态指定了处一个请求的职责对象集合

具体场景：
1、JS 中的事件冒泡。 
2、JAVA WEB 中 Apache Tomcat 对 Encoding 的处理，Struts2 的拦截器，jsp servlet 的 Filter。 
```

八、注意事项: 
```
在 JAVA WEB 中遇到很多应用，比如Filter
```

Client.java: 
```Java
package com.mutistic.behavioral.chainofresponsibility.sturctrue;
import com.mutistic.utils.PrintUtil;
/**
 * Client：
 * 职责链的客户端，向链上的具体处理者对象提交请求，让职责链负责处理
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("职责链模式[Chain of Responsibility Pattern]-结构");
		Handler h1 = new ConcreteHandler1();
		
		PrintUtil.two("创建职责链ConcreteHandler1", h1);
		
		Handler h2 = new ConcreteHandler2();
		PrintUtil.two("创建职责链ConcreteHandler1", h2);
		
		h1.setSuccessor(h2);
		h1.handleRequest();
	}
}
```
Handler.java: 
```Java
package com.mutistic.behavioral.chainofresponsibility.sturctrue;
import com.mutistic.utils.PrintUtil;
/**
 * Handler：
 * 定义职责的接口，通常在这里定义处理请求的方法，可以在这实现后继链
 */
public abstract class Handler {
	/**
	 * 持有：后继的职责对象
	 */
	protected Handler successor;
	/**
	 * 设置后继的职责对象 
	 * @param successor 后继的职责对象
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
		PrintUtil.two(this.getClass().getSimpleName()+".setSuccessor()：设置后继的职责对象 ", successor);
	}
	
	/**
	 * 定义：示意处理请求方法（入参和返回值根据具体的需求） 
	 */
	public abstract void handleRequest();
	
}
```
ConcreteHandler1.java: 
```Java
package com.mutistic.behavioral.chainofresponsibility.sturctrue;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteHandler：
 * 实现职责的类，在这个类里面，实现对它职责范围内请求的处理，如果不处理，就继续转发请求给后继者
 */
public class ConcreteHandler1 extends Handler {
	/**
	 * 示意处理请求方法（入参和返回值根据具体的需求） 的具体实现
	 * @see com.mutistic.behavioral.chainofresponsibility.sturctrue.Handler#handleRequest()
	 */
	@Override
	public void handleRequest() {
		PrintUtil.two("ConcreteHandler1.handleRequest()", "处理其职责范围内的请求");
		
		if(this.successor != null) {
			PrintUtil.three("非本身的职责范围内的请求，转发给后继职责对象处理", this.successor.getClass().getSimpleName()+".handleRequest()");
			this.successor.handleRequest();
		}
	}
}
```
ConcreteHandler2.java: 
```Java
package com.mutistic.behavioral.chainofresponsibility.sturctrue;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteHandler：
 * 实现职责的类，在这个类里面，实现对它职责范围内请求的处理，如果不处理，就继续转发请求给后继者
 */
public class ConcreteHandler2 extends Handler {
	/**
	 * 示意处理请求方法（入参和返回值根据具体的需求） 的具体实现
	 * @see com.mutistic.behavioral.chainofresponsibility.sturctrue.Handler#handleRequest()
	 */
	@Override
	public void handleRequest() {
		PrintUtil.two("ConcreteHandler2.handleRequest()", "处理其职责范围内的请求");
		
		if(this.successor != null) {
			PrintUtil.three("非本身的职责范围内的请求，转发给后继职责对象处理", "this.successor.handleRequest()");
			this.successor.handleRequest();
		}
	}
}
```

---
### <a id="a_visitor">三十二、访问者模式[Visitor Pattern]</a> <a href="#a_responsibility">last</a> <a href="#a_object">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M25_VisitorPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M25_VisitorPattern.png)<br/>

一、定义、本质、原则: 
```
定义: 表示一个作用域某对象结构中的各元素的操作。客户端在不改变各元素的类的前提下定义作用这些元素的新操作。
本质: 预留通路，回调实现
原则: 体现了单一职责原则
```

二、结构和说明: 
```
Visitor：访问者接口，为所有的访问者对象声明一个visit方法，用来代表为对象结构添加的功能，理论上可以代表任意的功能。

ConcreteVisitor：具体访问者实现对象，实现要真正被添加到对象结构中的功能。

Element：抽象的元素对象，对象结构的顶层接口，定义接受访问的操作。

ConcreteElement：具体元素对象，对象结构中具体的对象，也是被访问的对象，通常会回调访问者的真实功能，
同时开放自身的数供访问者使用

ObjectStructure：对象结构，通常包含多个被访问的对象，它可以遍历这多个被访问的对象，
也可以让访问者访问它的元素。可以是一个复合或是一个集合，如一个列表或无序集合。
  注意：这个ObjectStructure不是指组合模式中的Component对象结构，Component对象结构是指的一系列对象的定义结构，是概念上的东西
而ObjectStructure可以看成是对象结构中的一系列对象的一个集合，是用来辅助客户端访问这一系列对象的
```

三、理解: 
```
主要解决：稳定的数据结构和易变的操作耦合问题。
如何解决：在被访问的类里面加一个对外提供接待访问者的接口。

1、访问者的功能：
  访问者模式能给一系列对象，透明的添加新功能。从而避免在护期间，对这一系列对象进行修改，
而且还能变相实现复用访问者所具有的功能。
  由于是针对一系列对象的操作，这也导致，如果只想给一系列对蒙中的部分对象添加功能，就会有些麻烦。
而且要始终能保证把这一系列对象都要调用到，不管是循环也好，还是递归也好，总之要让每个对象都要被访间到。

2、调用通路：
  访问者之所以能实现“为一系列对象透明的添加新功能”，透明意味着这一系列对象是不知道被添加功能的。
  重要的就是依靠通用方法，访问者这边说要去访问，就提供一个访问的方法，如visit方法。
而元素接受访问，提供一个接受访问的方法，如accept方法。这两个方法并不代表任何具体的功能，只是构成一个调用的通路，
那么真正的功能实现是在accept方法里面，回调visit的方法，从而回调到访问者的具体实现上，
而这个访问者的具体实现的方法才是要添加的新的功能，最后在回元素的业务功能方法，实现真实的业务。

3、两次分发技术：
  访问者模式能够实现在不改变对象结构的情况下，就能给对象结构中的类增加功能，实现这个效果所使用的核心技术就是两次分发的技术
  第一次分发：在访问者模式中，当客户端ObjectStructure的时候，会遍历ObjectStructure中所有的元素，
调用这些元素的accept方法，让这些元素来接受访问，这是请求的第一次分发
  第二次分发：在具体的元素对象中实现accept方法的时候，会回调访问者的visit方法，等于请求被第二次分发了，
请求被分发给访问者来进行处理，真正实现功能的正是访问者的visit方法。
  
  两次分发技术使得客户端的请求不再被静态的绑定在元素对象上，这个时候真正执行什么样的功能同时取决于
访问者类型和元素类型，就算同一种元素类型，只要访问者类型不一样，最终执行的功能也不会一样，
这样一来，就可以在元素对象不变的情况下，通过改变访问者的类型，来改变真正执行的功能。
  两次分发技术还有一个优点：就是可以在程序运行期间进行动态的功能组装和切换，只需要在客户端调用时，组合使用不同的访问者对象实例即可。
  
  从另一个层面思考，Java回调技术也有点类似于两次分发技术，客户端调用某方法，这个方法就类似于accept方法，
传入一个接口的实现对象，这个接口的实现对象就有点像是访问者，在方法内部，会回调这个接口的方法，就类似于．
调用访问者的visit方法，最终执行的还是接口的具体实现里面实现的功能。

4、为何不在Element父类中实现回调visit方法
  不能把回调访问者方法的调用语句放到父类，虽然看起来是相似的语句，主要是因为要传入的this本身。
  this是代表当前的对象实例的，在具体子类中回调访问者的实现，传入具体的元素，
就可以通过这不同的对象实例来访问不同的实例对象的数据了。
  如果回调放在父类中，那么传递的就是父类对象的实例，是没有子对象的数据的
```

四、写法: 
```
1、空的访问方法：
  并不是所有的的问方法都需要实现，由于问者模式默认的是访问对象结构中的所有元素，
因此在实现某些功能的时候，如果不需要涉及到某些元素的访问方法，这方法可以实现成为空的，
比如：这个访问者只想要处理组合对象，那么访问叶子对象的方法就可以为空，虽然还是需要访问所有的元素对象
  
  还有一种解释有条件接收访问，在元素终的accept方法里面进行判断，满足要求的接受，不满足要求的，
就相当于空的访问方法，不做任何处理

2、结合组合模式：
  对于使用组合模式构建的组合对象结构，对外有一个统一的外观，要想添加新的功能不是很困难，
只要在组件的接口上定义新的功能就可以了，麻烦的是这样一来，需要修改所有的子类。
而且，每次添加一个新功能，都需要修改组件接口，然后修改所有的子类，这是相当糟糕的。

  为了让组合对象结构更灵活、更容易维护和更好的扩展性，可以使用访问者模式结合组合模式来实现。
这样在今后再进行功能改造的时候，就不需要再改动这个组合对象结构了

  访问者模式和组合模式组合使用的思路：首先把组合对象结构中的功能方法分离出来，
虽然维护组合对象结构的方法也可以分离出来，但是为了维持组合对象结构本身，这些方法还是放在组合对象结构里面；
然后把这些功能方法分别实现成为访问者对象，通过访问者模式添加到组合的对象结构中去。

3、遍历所有元素对象：
  在访问者模式中，访问者必须要能够访问到对象结构中的每个对象，因为访问者．要为每个对象添加功能，
为此特别在模式中定义出一个ObjectStructure来，然后由ObjectStructure来负责遍历访问一系列对象中的每个对象
  
  在ObjectStructure代所有的元素时，又分成两种情况。
  3.1、一种是元素的对象结构是通过合来组织的，那么直接在Objectstructure中对集合进行迭代，对每一个元素调用accept
  3.2、一种情况是元素的对象结构是通过组合模式来组织的，通常可以构成对象树，这种情况般就不需要在ObjectStructure中迭代了，
而通常的做法是在组合对象的acept方法里而，递归遍历它的子元素，然后调用子元素的的accept方法
```

五、优点: 
```
1、更好的扩展性
2、更好的复用性
3、更好的灵活性
4、分离无关行为
```

六、缺点: 
```
1、对象结果变化很困难
2、破坏封装
3、具体元素对访问者公布细节，违反了迪米特原则
4、违反了依赖倒置原则，依赖了具体类，没有依赖抽象
```

七、使用场景: 
```
1、如果想对一个对象结构，实施一些依赖于对象结构中的具体类的操作，可以使用访问者模式

2、如果想对一个对象结构中的各个元素，进行很多不同的而且不相关的操作，为了避免这些操作使得类变得杂乱，
可以使用访问者模式，把这些操作分散到不同的访问者对象中去，每个访问者对象实现同一类功能。

3、如果对象结构很少变动，但是需要经常给对象结构中的元素对象定义新的操作，可以使用访问者模式
```

八、注意事项: 
```
访问者可以对功能进行统一，可以做报表、UI、拦截器与过滤器
```

Client.java: 
```Java
package com.mutistic.behavioral.visitor.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Client：客户端
 * 演示 访问者模式[Visitor Pattern]-结构
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("访问者模式[Visitor Pattern]-结构");
		// 创建ObjectStructure对象结构
		ObjectStructure os = new ObjectStructure();
		// 创建被访问的具体元素
		Element ea = new ConcreteElementA();
		Element eb = new ConcreteElementB();
		// 将元素添加至对象结构中
		os.addElement(ea);
		os.addElement(eb);
		// 创建具体的访问者对象1
		Visitor v1 = new ConcreteVisitor1();
		// 调用业务处理方法
		os.handleRequest(v1);
		
		// 创建具体的访问者对象
		Visitor v2 = new ConcreteVisitor2();
		// 调用业务处理方法
		os.handleRequest(v2);
	}
}
```
ObjectStructure.java: 
```Java
package com.mutistic.behavioral.visitor.structure;
import java.util.ArrayList;
import java.util.List;
import com.mutistic.utils.PrintUtil;
/**
 * ObjectStructure：
 * 对象结构，通常包含多个被访问的对象，它可以遍历这多个被访问的对象，也可以让访问者访问它的元素。可以是一个复合或是一个集合，如一个列表或无序集合。
 */
public class ObjectStructure {
	/**
	 * 示意：表示对象结构，可以是一个组合结果或是集合
	 */
	private List<Element> eleList = new ArrayList<Element>();
	/**
	 * 示意：向组合对象结构添加元素（不同的对象结构有不同的构建方法）
	 * @param element 被添加的元素
	 */
	public void addElement(Element element) {
		if(null != element) {
			eleList.add(element);
			PrintUtil.two("addElement.addElement()：向组合对象结构添加元素（不同的对象结构有不同的构建方法）", element);
		}
	}
	/**
	 * 示意：提供给客户端操作的高层接口（元素接受具体的访问者实例）
	 * @param visitor
	 */
	public void handleRequest(Visitor visitor) {
		PrintUtil.two("ObjectStructure.handleRequest()：提供给客户端操作的高层接口", visitor);
		for (Element element : eleList) {
			PrintUtil.two("ObjectStructure.handleRequest()：元素接受具体的访问者实例", element);
			element.accept(visitor);
		}
	}
}
```
Visitor.java: 
```Java
package com.mutistic.behavioral.visitor.structure;
/**
 * Visitor：
 * 访问者接口，为所有的访问者对象声明一个visit方法，用来代表为对象结构添加的功能，理论上可以代表任意的功能。
 * @author mutisitic
 * @date 2018年9月11日
 */
public interface Visitor {
	/**
	 * 定义：访问具体元素A：相当于给元素A添加访问者的功能 
	 * @param elementA 具体元素A
	 */
	void visitConceteElementA(ConcreteElementA elementA);
	/**
	 * 定义：访问具体元素B：相当于给元素B添加访问者的功能 
	 * @param elementB 具体元素B
	 */
	void visitConceteElementB(ConcreteElementB elementB);
}
```
ConcreteVisitor1.java: 
```Java
package com.mutistic.behavioral.visitor.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteVisitor：
 * 具体访问者实现对象，实现要真正被添加到对象结构中的功能。
 */
public class ConcreteVisitor1 implements Visitor {
	/**
	 * 具体的访问具体元素A：相当于给元素A添加访问者的功能 
	 * @param elementA
	 * @see com.mutistic.behavioral.visitor.structure.Visitor#visitConceteElementA(com.mutistic.behavioral.visitor.structure.ConcreteElementA)
	 */
	@Override
	public void visitConceteElementA(ConcreteElementA elementA) {
		PrintUtil.three("ConcreteVisitor1.visitConceteElementA()", "具体的访问具体元素A：相当于给元素A添加访问者的功能 ");
		elementA.operation();
	}
	/**
	 * 具体的访问具体元素B：相当于给元素B添加访问者的功能 
	 * @param elementB
	 * @see com.mutistic.behavioral.visitor.structure.Visitor#visitConceteElementB(com.mutistic.behavioral.visitor.structure.ConcreteElementB)
	 */
	@Override
	public void visitConceteElementB(ConcreteElementB elementB) {
		PrintUtil.three("ConcreteVisitor1.visitConceteElementB()", "具体的访问具体元素A：相当于给元素A添加访问者的功能 ");
		elementB.operation();
	}
}
```
ConcreteVisitor2.java: 
```Java
package com.mutistic.behavioral.visitor.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteVisitor：
 * 具体访问者实现对象，实现要真正被添加到对象结构中的功能。
 */
public class ConcreteVisitor2 implements Visitor {
	/**
	 * 具体的访问具体元素A：相当于给元素A添加访问者的功能 
	 * @param elementA
	 * @see com.mutistic.behavioral.visitor.structure.Visitor#visitConceteElementA(com.mutistic.behavioral.visitor.structure.ConcreteElementA)
	 */
	@Override
	public void visitConceteElementA(ConcreteElementA elementA) {
		PrintUtil.three("ConcreteVisitor2.visitConceteElementA()", "具体的访问具体元素A：相当于给元素A添加访问者的功能 ");
		elementA.operation();
	}
	/**
	 * 具体的访问具体元素B：相当于给元素B添加访问者的功能 
	 * @param elementB
	 * @see com.mutistic.behavioral.visitor.structure.Visitor#visitConceteElementB(com.mutistic.behavioral.visitor.structure.ConcreteElementB)
	 */
	@Override
	public void visitConceteElementB(ConcreteElementB elementB) {
		PrintUtil.three("ConcreteVisitor2.visitConceteElementB()", "具体的访问具体元素A：相当于给元素A添加访问者的功能 ");
		elementB.operation();
	}
}
```
Element.java: 
```Java
package com.mutistic.behavioral.visitor.structure;
/**
 * Element：
 * 抽象的元素对象，对象结构的顶层接口，定义接受访问的操作。
 */
public abstract class Element {
	/**
	 * 定义：接受访问者的访问 
	 * @param visitor 具体的访问者对象
	 */
	public abstract void accept(Visitor visitor);
}
```
ConcreteElementA.java: 
```Java
package com.mutistic.behavioral.visitor.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Element： 
 * 抽象的元素对象，对象结构的顶层接口，定义接受访问的操作。
 */
public class ConcreteElementA extends Element {
	/**
	 * 接受访问者的具体访问，回调访问者对象的相应方法
	 * @param visitor
	 * @see com.mutistic.behavioral.visitor.structure.Element#accept(com.mutistic.behavioral.visitor.structure.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		PrintUtil.three("ConcreteElementA.accept()", "接受访问者的具体访问，回调访问者对象的相应方法");
		visitor.visitConceteElementA(this);
	}
	/**
	 * 示意：表示元素已有的功能实现 
	 */
	public void operation() {
		PrintUtil.three("ConcreteElementA.operation()", "示意：表示元素已有的功能实现");
	}
}
```
ConcreteElementB.java: 
```Java
package com.mutistic.behavioral.visitor.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Element： 
 * 抽象的元素对象，对象结构的顶层接口，定义接受访问的操作。
 */
public class ConcreteElementB extends Element {

	/**
	 * 接受访问者的具体访问，回调访问者对象的相应方法
	 * @param visitor
	 * @see com.mutistic.behavioral.visitor.structure.Element#accept(com.mutistic.behavioral.visitor.structure.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		PrintUtil.three("ConcreteElementB.accept()", "接受访问者的具体访问，回调访问者对象的相应方法");
		visitor.visitConceteElementB(this);
	}
	/**
	 * 示意：表示元素已有的功能实现 
	 */
	public void operation() {
		PrintUtil.three("ConcreteElementB.operation()", "示意：表示元素已有的功能实现");
	}
}
```

---
### <a id="a_object">三十三、空对象模式[Null Object Pattern]</a> <a href="#a_visitor">last</a> <a href="#a_mvc">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M26_NullObjectPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M26_NullObjectPattern.png)<br/>
[Null Object Pattern](http://www.cs.oberlin.edu/~jwalker/nullObjPattern)

一、定义、本质: 
```
定义: 提供一个对象作为缺少给定类型对象的代理。该空对象提供智能"什么也不做"行为，隐藏其合作者的细节。
本质: 统一行为，默认实现
```

二、结构和说明: 
```
Client：空对象模式客户端，使用协作者完成具体的功能

AbstractObject：声明协作者的接口，根据需要，为所有类共有的接口实现默认行为

RealObject：定义AbstractObject的具体子类，其实例提供客户期望的有用行为

NullObject：提供与AbstractObject相同的接口，以便可以用空对象替换真实对象，实现其界面，什么也不处理。
究竟什么也不处理取决于客户期望的行为，当有多种方法什么也不做的行为，可能需要多个NullObject类

ObjectFactory：对象工厂，负责根据条件创建AbstractObject对象的具体实例：RealObject 或 NullObject
```

三、理解: 
```
主要解决：使用对象的时候，客户端没有针对对象做Null检查，导致空指针异常（java.lang.NullPointerException）
如何解决：声明一个NullObject类，当实际对象为Null时，返回NullObject对象

1、空对象模式目的：
  有时需要协作者的类不需要协作者做任何事情。但是，该类希望对一个协作者的处理方式与处理实际提供行为的协作者一样。

2、空对象模式功能：
  定义由真实对象和空对象组成的类层次结构。当期望对象什么也不做时，可以使用空对象代替真实对象。
每当客户端代码需要一个真实对象时，它也可以使用一个空对象。

  使客户端代码简单。客户可以统一处理真正的协作者和空合作者。客户通常不知道（也不应该关心）他们是在处理真实合作者还是空合作者。
这简化了客户端代码，因为它避免了编写特别处理null协作者的测试代码。

  将无执行代码封装到null对象中。什么也不处理的代码很容易找到。它与AbstractObject和RealObject类的变化很明显。
它可以有效地编码。它不需要包含空值的变量，因为这些值可以硬编码为常量，或者无任何代码可以完全避免使用这些值。

  使null对象中的任何代码都易于重用。所有需要协作者什么也不处理的多个客户端都将以同样的方式做任何事情。
如果不需要修改任何行为，则可以在一个地方更改代码。此后，所有客户端将继续使用相同的什么也不处理行为，这是现在修改后什么也不处理的行为。

  使什么也不处理行为难以分配或混合到几个协作对象的真实行为中。同样不做任何行为都不能轻易地添加到几个类中，
除非这些类都将行为委托给可以是null对象类的类。

  可能需要为每个新的AbstractObject类创建一个新的NullObject类。

  如果各种客户端不同意null对象应该什么也不处理，就像没有很好地定义AbstractObject接口那样，可能很难实现。

  总是充当什么也不处理的对象。Null对象不会转换为Real对象。

3、NullObject是CHECKS模式语言中Exceptional Value模式的一个特例：
  异常值是用于表示特殊情况的特殊整体值（另一种模式）。它要么吸收所有的消息，要么产生无意义的行为（另一种模式）。一个NullObject是一个如此特殊的值。
```

四、写法: 
```
1、单例模式：
  Null Object类通常实现为Singleton。由于null对象通常没有任何状态，因此其状态不能更改，因此多个实例是相同的。
系统可以重复使用单个实例，而不是使用多个相同的实例。

2、客户不同意null行为：
  如果某些客户端期望null对象不以任何方式执行任何操作，则需要多个NullObject类。如果必须在运行时自定义不执行任何行为，
则NullObject类将需要可插入变量，以便客户端可以指定null对象不应该执行任何操作。
这通常可能是AbstractObject没有明确定义（语义）界面的症状。

3、转换为真实对象：
  Null对象不会转换为真实对象。如果对象可能决定停止提供不执行任何操作并开始提供实际行为，则它不是空对象。
它可以是具有无效模式的真实对象，例如可以进入和退出只读模式的控制器。如果它是一个必须从无操作对象变为实际对象的单个对象，
则应使用状态模式实现。在这种情况下，可以使用空状态，或者代理可以保持空对象。

4、空对象不是代理：
  null对象的使用可以类似于代理Proxy的使用，但这两种模式具有不同的目的。

  4.1、代理在访问真实目的时提供间接级别，从而控制对主题的访问。
  4.2、null协作者不会隐藏真实对象并控制对它的访问，它会替换真实对象。
  4.3、代理可能最终变异以开始像真实主体一样行事。
  4.4、null对象不会变异以开始提供真实行为，它将始终提供不执行任何行为。

5、空对象作为特殊策略：
  空对象可以是策略模式的特例。策略将几个ConcreteStrategy类指定为完成任务的不同方法。
如果其中一种方法始终如一，那么ConcreteStrategy就是一个NullObject。
例如，Controller是用于处理输入的View的策略，NoController是忽略所有输入的策略。

6、空对象作为特殊状态：
  空对象可以是状态模式的特例。通常，每个ConcreteState都有一些不做任何方法，因为它们不适合该状态。
实际上，给定的方法通常被实现为在大多数状态下做一些有用的事情，但至少在一个状态中什么都不做。
如果特定的ConcreteState实现其大多数方法不执行任何操作或至少给出null结果，则它将变为无效状态，因此是空状态。

6、空对象作为访客对象:
  Null对象可用于允许访问者安全地访问层次结构并处理空状况。

6、Null Object类不是内部类：
  Null Object是一个具体的协作者类，充当需要一个客户的协作者。
  null行为不是设计用于混合(mixin)到需要执行任何操作的对象中。
  它是为一个类而设计的，该类向协作者委派可能会或可能不会执行任何行为的所有行为。
```

五、优点: 
```
1、简化客户端对null验证的检查
2、一定程度上避免了空指针异常（java.lang.NullPointerException）
3、统一了对象的操作行为，并且对null验证提供了默认功能
```

六、缺点: 
```
1、NullObject可能会增加类的数目
2、并不是所有的对象都需要NullObject，NullObject可能会引起不必要的错误
```

七、使用场景: 
```
1、一个对象需要一个协作者。Null对象模式不会引入此协作，它使用已存在的协作。
2、一些协作者实例应该什么也不处理。
3、想要从客户端抽象出null的处理。
```

八、注意事项: 
```
应该针对具体对象使用空对象模式，而不是针对所有的类使用空对象模式
```

Client.java: 
```Java
package com.mutistic.behavioral.nullobject.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Client：
 * 空对象模式客户端，使用协作者完成具体的功能
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("空对象模式[Null Object Pattern]");
		
		AbstractObject o1 = ObjectFactory.createrFacoty("AAA"); 
		PrintUtil.three("获取AAA对象的name：", o1.getName());
		
		AbstractObject o2 = ObjectFactory.createrFacoty("BBB"); 
		PrintUtil.three("获取BBB对象的name：", o2.getName());
		
		AbstractObject o3 = ObjectFactory.createrFacoty("CCC"); 
		PrintUtil.three("获取CCC对象的name：", o3.getName());
		
		AbstractObject o4 = ObjectFactory.createrFacoty("DDD"); 
		PrintUtil.three("获取DDD对象的name：", o4.getName());
	}
}
```
AbstractObject：.java: 
```Java
package com.mutistic.behavioral.nullobject.structure;

/**
 * AbstractObject：
 * 声明协作者的接口，根据需要，为所有类共有的接口实现默认行为
 */
public abstract class AbstractObject {
	/** 示意：可能存在的属性 */
	protected String name;
	/**
	 * 定义：是否为NullObject对象
	 * @return true：NullObject对象，false：真实对象
	 */
	public abstract boolean isNull();
	/**
	 * 定义：获取属性
	 * @return
	 */
	public abstract String getName();
	/**
	 * 定义：设置属性
	 * @param name
	 */
	public abstract void setName(String name);
}
```
RealObject.java: 
```Java
package com.mutistic.behavioral.nullobject.structure;
/**
 * RealObject：
 * 定义AbstractObject的具体子类，其实例提供客户期望的有用行为
 */
public class RealObject extends AbstractObject {
	/**
	 * 是否为NullObject对象具体方法
	 * @return true：NullObject对象，false：真实对象
	 */
	@Override
	public boolean isNull() {
		return false;
	}
	/**
	 * 获取属性具体方法
	 * @return
	 */
	@Override
	public String getName() {
		return this.name;
	}
	/**
	 * 设置属性具体方法
	 * @param name
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}
}
```
NullObject.java: 
```Java
package com.mutistic.behavioral.nullobject.structure;
import com.mutistic.utils.PrintUtil;
/**
 * NullObject：
 * 提供与AbstractObject相同的接口，以便可以用空对象替换真实对象，实现其界面，什么也不处理。
 * 究竟什么也不处理取决于客户期望的行为，当有多种方法什么也不做的行为，可能需要多个NullObject类
 */
public class NullObject extends AbstractObject {
	/** 声明 单例对象 成员变量 */
	private static NullObject intance = new NullObject();
	/**
	 * 私有构造函数
	 */
	private NullObject() {
		super();
	}
	/**
	 * 获取单例对象 
	 * @return
	 */
	public static NullObject getIntance() {
		return intance;
	}
	/**
	 * 是否为NullObject对象具体方法
	 * @return true：NullObject对象，false：真实对象
	 */
	@Override
	public boolean isNull() {
		return true;
	}
	/**
	 * 获取属性具体方法
	 * @return
	 */
	@Override
	public String getName() {
		return "Object为空，不能调用getName()方法";
	}
	/**
	 * 设置属性具体方法
	 * @param name
	 */
	@Override
	public void setName(String name) {
		PrintUtil.three("Object为空，不能调用getName()方法", name);
	}
}
```
ObjectFactory.java: 
```Java
package com.mutistic.behavioral.nullobject.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Factory：工厂对象 
 * 创建AbstractObject对象具体实例
 */
public class ObjectFactory {
	/**
	 * 根据name创建 AbstractObject对象实例
	 * @param name
	 * @return 
	 */
	public static AbstractObject createrFacoty(String name) {
		AbstractObject obj = null;
		if("AAA".equals(name)) {
			obj = new RealObject();
		} else if("BBB".equals(name)) {
			obj = new RealObject();
		} else {
			obj = NullObject.getIntance();
		}
		
		PrintUtil.two("ObjectFactory.createrFacoty()：创建AbstractObject对象实例", obj);
		obj.setName(name);
		return obj;
	}
}
```

---
## <a id="a_j2ee">J2EE 设计模式[J2EE Patterns]</a> <a href="#a_behavioral">行为型模式</a> <a href="#a_xmind">思维导图</a>
### <a id="a_mvc">三十四、MVC 模式[MVC Pattern]</a> <a href="#a_object">last</a> <a href="#a_business">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M27_MVCPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M27_MVCPattern.png)
[基于J2EE的MVC设计模式的研究与实现](https://www.ixueshu.com/document/767839226ad5f27b.html)<br/>

一、定义、本质: 
```
定义: M是指业务模型，V是指用户界面，C则是控制器，使用MVC的目的是将M和V的实现代码分离，从而使同一个程序可以使用不同的表现形式
本质: 分离实现
```

二、结构和说明: 
```
Model：模型，是应用程序中用于处理应用程序数据逻辑的部分。通常模型对象负责在数据库中存取数据
 
View：视图，是应用程序中处理数据显示的部分。通常视图是依据模型数据创建的

Controller：控制器，是应用程序中处理用户交互的部分。通常控制器负责从视图读取数据，控制用户输入，并向模型发送数据
```

三、理解: 
```
1、MVC设计模式：
  MVC全名是Model View Controller，是模型(model)－视图(view)－控制器(controller)的缩写，一种软件设计典范，
用一种业务逻辑、数据、界面显示分离的方法组织代码，将业务逻辑聚集到一个部件里面，
在改进和个性化定制界面及用户交互的同时，不需要重新编写业务逻辑。
  MVC被独特的发展起来用于映射传统的输入、处理和输出功能在一个逻辑的图形化用户界面的结构中。

2、理解MVC设计模式：
  MVC 分层有助于管理复杂的应用程序，可以在一个时间内专门关注一个方面。
例如，可以在不依赖业务逻辑的情况下专注于视图设计。同时也让应用程序的测试更加容易。
  MVC 分层同时也简化了分组开发。不同的开发人员可同时开发视图、控制器逻辑和业务逻辑

3、MVC框架是什么：
  MVC框架：它强制性的使应用程序输入、处理和输出分开。使用MVC应用程序被分成三个核心部件：模型、视图、控制器。
它们各自处理自己的任务。要使用MVC框架，则一定要遵守该框架的规则，它有它的强制性所在。
它所使用的三个核心部件其实都是来自MVC设计模式。只不过在框架中让他们彼此更加独立了去处理各自的任务而已。
```
3.4、理解架构、框架、设计模式：
[软件重用](https://wiki.mbalib.com/wiki/%E8%BD%AF%E4%BB%B6%E9%87%8D%E7%94%A8)
```
1、架构、框架、设计模式概念：
  1.1、架构：简单的说架构就是一个蓝图，是一种设计方案，将客户的不同需求抽象成为抽象组件，
并且能够描述这些抽象组件之间的通信和调用。
  1.2、框架：软件框架是项目软件开发过程中提取特定领域软件的共性部分形成的体系结构，
不同领域的软件项目有着不同的框架类型。框架不是现成可用的应用系统。
而是一个半成品，提供了诸多服务，开发人员进行二次开发，实现具体功能的应用系统。
  1.3、设计模式：是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结，它强调的是一个设计问题的解决方法

2、框架与架构关系：
  2.1首先说框架不是架构，应该说框架比架构更具体，更偏重于技术，而架构偏重于设计。还有一个关系就是架构可以通过多种框架来实现

3、框架与设计模式关系：
  3.1、设计模式研究的是针对单一问题的设计思路和解决方法，一个模式可应用于不同的框架和被不同的语言所实现；
  3.2、框架则是一个应用的体系结构，是一种或多种设计模式和代码的混合体虽然它们有所不同，但却共同致力于使人们的设计可以被重用，
在思想上存在着统一性的特点，因而设计模式的思想可以在框架设计中进行应用。

4、架构与设计模式关系：
  4.1、两者的关系也是很好区分的，设计模式主要是针对单一问题的解决方法，范畴比较小，
  4.2架构是高层次的针对体系结构的一种设计思路，范畴比较大
  可以这么说，一个架构中可能会出现多个设计模式来解决多种架构中的问题。

5、总结：
  三者之间的区别还是有很多，首先架构应该是一个范畴最大的概念，是最高层次的设计。
一个架构设计中可能会用到多个框架和多个设计模式；
而框架是针对共性抽象出来的半成品，这里面可能包含着多个设计模式；
而设计模式就是解决单一问题的设计思路和解决方法。

  在做一个项目的时候首先出来的应该是架构，是对整个问题的一个总体上的设计，
之后再会考虑运用什么样的框架和设计模式来实现我们的架构；
当然，只使用框架和设计模式中的一种也是经常遇到的。

  三者的共同点都是解决现实生活中的问题而出现的，而且三者中都会表现出来的就是“高内聚，低耦合”的理念；
所以他们的共同点就是让我们的设计更面向对象化。
```

四、写法: 
```
1、MVC 工作模型原理：
  MVC 模式将所面对的系统分为 3 个部分，分别是数据模型、视图和控制器，并定义了这 3 个部分之间实现通信的一种模式，
使每个部分不必卷入到其他部分的状态表示和方法实现的细节中去。
每个部分有自己的数据管理规则，各个部分对象之间的通信只能使用已定义的一个受限连接集合进行。
保持这种分离性通常是好的面向对象编程和设计要追求的目标，让各个对象只需专注于自己的事务。
  Model 本质上封装了数据及行为 ,其中包含对数据控制及修改的规则，提供了一套查询、改变 Model 状态的方法。
  View 是 Model 所表示出来的图形界面，它主要用于提交 Model 的信息展示给用户。
  Controller 是 Model 和 View 之间的协调者，它的主要作用有以下几点 :
    1、定义用户界面对用户输入的响应方式。
    2、解释用户的输入，并命令 Model 进行相应的操作创造相应模型。
    3、负责将模型信息传递给 View，必要时还要负责创建新的 View 和 Controller
```

五、优点: 
```
1、可以为一个模型在运行时同时建立和使用多个视图。变化-传播机制可以确保所有相关的视图及时得到模型数据变化，
从而使所有关联的视图和控制器做到行为同步。 

2、视图与控制器的可接插性，允许更换视图和控制器对象，而且可以根据需求动态的打开或关闭、甚至在运行期间进行对象替换。 

3、模型的可移植性。因为模型是独立于视图的，所以可以把一个模型独立地移植到新的平台工作。需要做的只是在新平台上对视图和控制器进行新的修改。 

4、潜在的框架结构。可以基于此模型建立应用程序框架，不仅仅是用在设计界面的设计中

5、分离数据和其表示：使得添加或者删除一个用户视图变得很容易，甚至可以在程序执行过程中动态地进行用户视图的更新。
模型和视图能够单独开发，即业务逻辑和用户表现的分离，增加了程序的可维护性，可扩展性、并使测试变得更为容易

6、将控制逻辑和表现界面分离：允许程序能够在运行时根据工作流、用户习惯或者模型状态来动态选择不同的用户界面。
现在一个应用程序需要用越来越多的方式访问，MVC 设计模式支持多个视图能共享一个模型，
因此在MVC 设计模式中应用开发人员可以最大化的重用他的代码，大大提高了软件开发的效率和质量
```

六、缺点: 
```
1、增加了系统结构和实现的复杂性。对于简单的界面，严格遵循MVC，使模型、视图与控制器分离，会增加结构的复杂性，
并可能产生过多的更新操作，降低运行效率。 

2、视图与控制器间的过于紧密的连接。视图与控制器是相互分离，但确实联系紧密的部件，视图没有控制器的存在，其应用是很有限的，
反之亦然，这样就妨碍了他们的独立重用。 

3、视图对模型数据的低效率访问。依据模型操作接口的不同，视图可能需要多次调用才能获得足够的显示数据。
对未变化数据的不必要的频繁访问，也将损害操作性能。 

4、目前，一般高级的界面工具或构造器不支持模式。改造这些工具以适应MVC需要和建立分离的部件的代价是很高的，从而造成MVC使用的困难。
```

七、使用场景: 
```
1、需要分离数据和其表示时，可以使用MVC设计模式
2、需要将控制逻辑和表现界面分离时，可以使用MVC设计模式

具体场景：
最典型的MVC就是JSP + Servlet + Javabean的模式
```

八、注意事项: 
```
MVC设计模式是MVC框架的一种抽象，MVC框架是MVC设计模式的一种具体实现
```

Client.java：
```java
package com.mutistic.j2ee.mvc.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Client：客户端
 * 演示 MVC 模式[MVC Pattern]-结构
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("MVC 模式[MVC Pattern]-结构");
		
		// 创建模型对象
		Model model = new Model();
		// 创建视图对象
		View view = new View();
		// 创建控制器对象
		Controller controller = new Controller(model, view);
		
		// 调用控制器具体业务
		controller.updateModelName("AAA");
		controller.updateModelValue("111");
		controller.showView();
		PrintUtil.three("调用Controller获取Name属性值", controller.getModelName());
		PrintUtil.three("调用Controller获取Value属性值", controller.getModelValue());
	}
}
```
Model.java：
```java
package com.mutistic.j2ee.mvc.structure;
/**
 * Model：
 * 模型，是应用程序中用于处理应用程序数据逻辑的部分。通常模型对象负责在数据库中存取数据
 */
public class Model {
	/** 示意：可能存在的属性  */
	private String name;
	/** 示意：可能存在的属性  */
	private String value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
```
View.java：
```java
package com.mutistic.j2ee.mvc.structure;
import com.mutistic.utils.PrintUtil;
/**
 * View：
 * 视图，是应用程序中处理数据显示的部分。通常视图是依据模型数据创建的
 */
public class View {
	/**
	 * 示意：处理数据的显示 
	 * @param model
	 */
	public void showModel(String name, String value) {
		PrintUtil.three("View.showModel()：处理数据的显示 ", "Model [name=" + name + ", value=" + value + "]");
	}
}
```
Controller.java：
```java
package com.mutistic.j2ee.mvc.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Controller：
 * 控制器，是应用程序中处理用户交互的部分。通常控制器负责从视图读取数据，控制用户输入，并向模型发送数据
 */
public class Controller {
	/** 持有Model模型对象 */
	private Model model;
	/** 持有View视图对象*/
	private View view;
	/**
	 * 构造函数：注入Model和View对象
	 * @param model 模型对象
	 * @param view 视图对象
	 */
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		
		PrintUtil.two("Controller：构造函数：注入Model对象", model);
		PrintUtil.three("Controller：构造函数：注入View对象", view);
	}
	/**
	 * 获取Model的属性Name
	 * @return
	 */
	public String getModelName() {
		PrintUtil.two("Controller.getModelName()", "获取Model的属性Name");
		return model.getName();
	}
	/**
	 * 修改Model的属性Name
	 * @param name
	 */
	public void updateModelName(String name) {
		PrintUtil.two("Controller.updateModelName()", "修改Model的属性Name="+ name);
		model.setName(name);
	}
	/**
	 * 获取Model的属性Value
	 * @return
	 */
	public String getModelValue() {
		PrintUtil.two("Controller.getModelvalue()", "获取Model的属性Value");
		return model.getValue();
	}
	/**
	 * 修改Model的属性Value
	 * @param value
	 */
	public void updateModelValue(String value) {
		PrintUtil.two("Controller.updateModelValue()", "修改Model的属性Value="+ value);
		model.setValue(value);
	}
	/**
	 * 显示Model数据信息 
	 */
	public void showView() {
		PrintUtil.two("Controller.showView()", "显示Model数据信息，转调视图相应的方法");
		view.showModel(model.getName(), model.getValue());
	}
}
```

---
### <a id="a_business">三十五、业务代表模式[Business Delegate Pattern]</a> <a href="#a_mvc">last</a> <a href="#a_entity">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M28_BusinessDelegatePattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M28_BusinessDelegatePattern.png)<br/>

一、定义、本质: 
```
定义: 对表示层和业务层的解耦。它基本上是用来减少通信或对表示层代码中的业务层代码的远程查询功能
本质: 解耦表示层和业务层，减少通信
```

二、结构和说明: 
```
Clinet：客户端，表示层代码可以是 JSP、Servlet 或 UI java 代码

BusinessDelegate：具体业务代表，一个为客户端实体提供的入口类，它提供了对业务服务方法的访问

BusinessService：业务服务接口，提供了业务实现逻辑的统一接口

ConcreteService：具体的业务服务，业务实现逻辑的具体实现

LookUpService：查询服务，查找服务对象负责获取相关的业务服务实现，并提供业务对象对业务代表对象的访问
```

三、理解: 
```
1、业务代表模式：
  在J2EE系统中，一般划分为表现层和业务逻辑层，为实现表现层和业务逻辑层之间的最大限度解耦，引入业务代表模式，
这样，当表现层或业务逻辑层具体实现技术发生时，对彼此的影响很小，当然，如果希望实现完全解耦，我们可以使用消息系统JMS来实现

2、业务代表模式实现目标：
  业务层所有服务完全展示给客户端。客户端可以完全介入调用。
  动态扩展性强，可为整个业务逻辑层动态扩展新的功能。　　
  客户端调用业务层的实现代码必须简洁，至少是可配置的，最大限度降低代码的耦合性
```

四、写法: 
```
1、结合工厂模式：
　　一般使用工厂模式涉及到静态类或单态模式，可以使用静态或单例模式实现，从而形成客户端单一访问业务逻辑层入口，
    1.1、这工厂模式带来的优点： 
    由于业务逻辑入口是单一的，客户端对业务逻辑访问的可控性强，例如可动态单一入口加入权限检查或其它全局统一功能。
Jave中权限正是这样实现。可控性强。
    客户端代码简洁，作为客户端的表现层技术，如果更换了实现技术，修改的代码很少

　　1.2、工厂模式带来的主要缺点是：
　　当ServiceFactory实现子类很多时，试图使用一个总入口来包含这些Service会造成过多代码耦合在一个类中，
造成Facade模式滥用的后果。也就是说，使用工厂模式，扩展性不是很强。
　　由于使用静态或单例模式，在性能上，容易走入单线程、单并发用户的误区，违背了J2EE多线程并发使用的原则

2、结合组合模式：
　　Command模式可以说解决了工厂模式的缺点，Command模式将所有的服务都展示给客户端，
客户端可以通过特定命令形式直接指定调用后台众多Service中任何一种，Petstore中Web对EJB调用就是使用了Command模式实现。

　　Command模式虽然突破了工厂模式单一入口的缺点，但是带来的缺点是易用性不够，Command模式代码实现起来不方便。

　　Command模式主要问题是可控性不强，如果要为所有Service动态增加类似Filter等这样通用功能，如权限检查等是非常不方便的。
```

Client.java
```java
package com.mutistic.j2ee.businessdelegate.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Clinet：
 * 客户端，表示层代码可以是 JSP、Servlet 或 UI java 代码。
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("业务代表模式[Business Delegate Pattern]-结构");
		// 创建业务代表对象
		BusinessDelegate delegate = new BusinessDelegate();
		
		// 设置业务类型
		delegate.setServiceType("A");
		delegate.doTask();
		
		// 设置业务类型
		delegate.setServiceType("B");
		delegate.doTask();
		
		// 设置业务类型
		delegate.setServiceType("C");
		delegate.doTask();
	}
}
```
BusinessService.java
```java
package com.mutistic.j2ee.businessdelegate.structure;
/**
 * BusinessService：
 * 业务服务接口，提供了业务实现逻辑的统一接口
 */
public interface BusinessService {
	/**
	 * 定义：可能存在业务功能 
	 */
	void operation();
}
```
ConcreteServiceA.java
```java
package com.mutistic.j2ee.businessdelegate.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteService：
 * 具体的业务服务际业务实现逻辑的具体实现
 */
public class ConcreteServiceA implements BusinessService {
	/**
	 * 可能存在业务功能的具体实现
	 * @see com.mutistic.j2ee.businessdelegate.structure.BusinessService#operation()
	 */
	@Override
	public void operation() {
		PrintUtil.three("ConcreteServiceB.operation()", "具体的业务服务，业务实现逻辑的具体实现");
	}
}
```
ConcreteServiceB.java
```java
package com.mutistic.j2ee.businessdelegate.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteService：
 * 具体的业务服务，业务实现逻辑的具体实现
 */
public class ConcreteServiceB implements BusinessService {
	/**
	 * 可能存在业务功能的具体实现
	 * @see com.mutistic.j2ee.businessdelegate.structure.BusinessService#operation()
	 */
	@Override
	public void operation() {
		PrintUtil.three("ConcreteServiceB.operation()", "具体的业务服务，业务实现逻辑的具体实现");
	}
}
```
LookUpService.java
```java
package com.mutistic.j2ee.businessdelegate.structure;
import com.mutistic.utils.PrintUtil;
/**
 * LookUpService：
 * 查询服务，查找服务对象负责获取相关的业务服务实现，并提供业务对象对业务代表对象的访问
 */
public class LookUpService {
	/**
	 * 根据服务类型创建具体的业务服务对象
	 * @param serviceType 服务类型
	 * @return 具体的业务服务对象
	 */
	public BusinessService creterBusinessService(String serviceType) {
		BusinessService service = null;
		if ("A".equals(serviceType)) {
			service =  new ConcreteServiceA();
		} else if ("B".equals(serviceType)) {
			service = new ConcreteServiceB();
		}
		
		PrintUtil.three("LookUpService.creterBusinessService()：根据服务类型创建具体的业务服务对象", service);
		return service;
	}
}
```
BusinessDelegate.java
```java
package com.mutistic.j2ee.businessdelegate.structure;
import com.mutistic.utils.PrintUtil;
/**
 * BusinessDelegate：
 * 具体业务代表，一个为客户端实体提供的入口类，它提供了对业务服务方法的访问
 */
public class BusinessDelegate {
	/** 持有：查询服务 */
	private LookUpService lookupService = new LookUpService();
	/** 持有：具体的业务服务 */
	private BusinessService businessService;
	/** 业务类型 */
	private String serviceType;
	/**
	 * 设置业务类型
	 * @param serviceType 业务类型
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		PrintUtil.two("BusinessDelegate.setServiceType()：设置业务类型 ", "serviceType = "+serviceType);
	}
	/**
	 * 开始访问业务服务
	 */
	public void doTask() {
		PrintUtil.two("BusinessDelegate.doTask()", "开始访问业务服务");
		businessService = lookupService.creterBusinessService(serviceType);
		if(businessService == null) {
			PrintUtil.three("BusinessDelegate.doTask()", "查找服务没有查找到具体的业务服务，本业务调用结束");
			return;
		}
		businessService.operation();
	}
}
```

---
### <a id="a_entity">三十六、组合实体模式[Composite Entity Pattern]</a> <a href="#a_business">last</a> <a href="#a_data">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M29_CompositeEntityPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M29_CompositeEntityPattern.png)<br/>

一、定义、本质: 
```
定义: 在EJB持久化机制中，一个组合实体是一个EJB实体bean，代表了对象的图解。当更新一个组合实体时，
内部依赖对象beans会自动更新，因为它们是由EJB实体bean管理的。
本质: 组合实体，自动更新
```

二、结构和说明: 
```
CompositeEntity：组合实体，它是主要的实体bean。它可以是粗粒的，或者可以包含一个粗粒度对象，用于持续生命周期。

CoarseGrainedObject：粗粒度对象，该对象包含依赖对象。它有自己的生命周期，也能管理依赖对象的生命周期。

DependentObject：依赖对象，是一个持续生命周期依赖于粗粒度对象的对象。

Strategies：策略，表示如何实现组合实体。
```

Client.java
```java
package com.mutistic.j2ee.compositeentity.structure;
import java.util.Arrays;
import com.mutistic.utils.PrintUtil;
/**
 * Client：客户端
 * 演示 组合实体模式[Composite Entity Pattern]-结构 
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("组合实体模式[Composite Entity Pattern]-结构");
		
		// 创建组合实体
		CompositeEntity composite = new CompositeEntity();
		// 调用组合实体业务setData功能
		composite.setData("AAA", "BBB");
		// 调用组合实体业务getData功能
		PrintUtil.three("调用组合实体业务getData功能：", Arrays.asList(composite.getData()));
	}
}
```
DependentObjectA.java
```java
package com.mutistic.j2ee.compositeentity.structure;
/**
 * DependentObject：
 * 依赖对象，是一个持续生命周期依赖于粗粒度对象的对象。
 */
public class DependentObjectA {
	/** 定义：可能存在的属性 */
	private String data;
	/**
	 * 设置属性值
	 * @param data 需要设置的属性值
	 */
	public void setData(String data) { this.data = data; }
	/**
	 * 获取属性值
	 * @return 属性值
	 */
	public String getData() { return data; }
}
```
DependentObjectB.java
```java
package com.mutistic.j2ee.compositeentity.structure;
/**
 * DependentObject：
 * 依赖对象，是一个持续生命周期依赖于粗粒度对象的对象。
 */
public class DependentObjectB {
	/** 定义：可能存在的属性 */
	private String data;
	/**
	 * 设置属性值
	 * @param data 需要设置的属性值
	 */
	public void setData(String data) { this.data = data; }
	/**
	 * 获取属性值
	 * @return 属性值
	 */
	public String getData() { return data; }
}
```
CoarseGrainedObject.java
```java
package com.mutistic.j2ee.compositeentity.structure;
import com.mutistic.utils.PrintUtil;
/**
 * CoarseGrainedObject：
 * 粗粒度对象，该对象包含依赖对象。它有自己的生命周期，也能管理依赖对象的生命周期。
 */
public class CoarseGrainedObject {
	/** 持有：细粒度对象A */
	private DependentObjectA objA = new DependentObjectA();
	/** 持有：细粒度对象B */
	private DependentObjectB objB = new DependentObjectB();
	/**
	 * 设置所持有的细粒度对象的属性值
	 * @param dataA 需要设置的细粒度对象属性值data值
	 * @param dataB 需要设置的细粒度对象属性值data值
	 */
	public void setData(String dataA, String dataB) {
		objA.setData(dataA);
		objB.setData(dataB);
		PrintUtil.three("CoarseGrainedObject.setData()：设置所持有的细粒度对象的属性值", "dateA = "+ dataA +"，dateB = "+ dataB);
	}
	/**
	 * 获取所持有的细粒度对象的属性值 
	 * @return 获取到的属性值
	 */
	public String[] getData() {
		PrintUtil.three("CoarseGrainedObject.getData()", "获取所持有的细粒度对象的属性值");
		return new String[] { objA.getData(), objB.getData() };
	}
}
```
CompositeEntity.java
```java
package com.mutistic.j2ee.compositeentity.structure;
import com.mutistic.utils.PrintUtil;
/**
 * CompositeEntity：
 * 组合实体，它是主要的实体bean。它可以是粗粒的，或者可以包含一个粗粒度对象，用于持续生命周期。
 */
public class CompositeEntity {
	/** 持有：粗粒度对象*/
	private CoarseGrainedObject object = new CoarseGrainedObject();
	/**
	 * 转调粗粒度对象的设置属性值功能
	 * @param dataA 值A
	 * @param dataB 值B
	 */
	public void setData(String dataA, String dataB) {
		PrintUtil.two("CompositeEntity.setData()：转调粗粒度对象的设置属性值功能",  "dateA = "+ dataA +"，dateB = "+ dataB);
		object.setData(dataA, dataB);
	}
	/**
	 * 转调粗粒度对象的获取属性值功能
	 * @return 获取到的属性值
	 */
	public String[] getData() {
		PrintUtil.two("CompositeEntity.getData()",  "转调粗粒度对象的获取属性值功能");
		return object.getData();
	}
}
```

---
### <a id="a_data">三十七、数据访问对象模式[Data Access Object Pattern]</a> <a href="#a_entity">last</a> <a href="#a_front">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M30_DataAccessObjectPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M30_DataAccessObjectPattern.png)<br/>

一、定义、本质: 
```
定义: 把低级的数据访问 API 或操作从高级的业务服务中分离出来。
本质: 分离数据操作接口
```

二、结构和说明: 
```
DataAccessObjectInterface：数据访问对象接口，该接口定义了在一个模型对象上要执行的标准操作。

DataAccessObjectConcreteClass：数据访问对象实体类，该类实现了数据访问对象接口。该类负责从数据源获取数据，
数据源可以是数据库，也可以是 xml，或者是其他的存储机制。

ModelObject/ValueObject：模型对象/数值对象，该对象是简单的POJO，包含了get/set方法来存储通过使用DAO类检索到的数据
```

Client.java
```java
package com.mutistic.j2ee.dataaccessobject.structure;
import java.util.List;
import com.mutistic.utils.PrintUtil;
/**
 * Client：客户端
 * 演示 数据访问对象模式[Data Access Object Pattern]-结构
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("数据访问对象模式[Data Access Object Pattern]");
		// 创建数据操作接口实例
		DataAccessObjectInterface dao = new DataAccessObjectConcreteClass();
		PrintUtil.two("创建数据操作接口实例", dao);
		// 调用getAllModel()接口
		List<ModelObject> modelList = dao.getAllModel();
		for (ModelObject model : modelList) {
			PrintUtil.three("输出所有的ModelObject信息", model.toString());
		}
		// 调用updateModel()接口
		ModelObject model = modelList.get(0);
		model.setValue("CCCC");
		dao.updateModel(model);
		PrintUtil.three("调用updateModel()接口的数据", modelList);
		// 调用deleteModel()接口
		dao.deleteModel(modelList.get(1));
		PrintUtil.three("调用deleteModel()接口的数据", modelList);
	}
}
```
DataAccessObjectInterface.java
```java
package com.mutistic.j2ee.dataaccessobject.structure;
import java.util.List;
/**
 * DataAccessObjectInterface：
 * 数据访问对象接口，该接口定义了在一个模型对象上要执行的标准操作。
 */
public interface DataAccessObjectInterface {
	/**
	 * 定义：获取所有的ModelObject数据 
	 * @return
	 */
	List<ModelObject> getAllModel();
	/**
	 * 定义：根据ID获取对应的ModelObject
	 * @param id
	 * @return
	 */
	ModelObject getModel(long id);
	/**
	 * 定义：修改ModelObjec数据
	 * @param model
	 */
	void updateModel(ModelObject model);
	/**
	 * 定义：删除ModelObject数据 
	 * @param model
	 */
	void deleteModel(ModelObject model);
}
```
DataAccessObjectConcreteClass.java
```java
package com.mutistic.j2ee.dataaccessobject.structure;
import java.util.ArrayList;
import java.util.List;
import com.mutistic.utils.PrintUtil;
/**
 * DataAccessObjectConcreteClass：
 * 数据访问对象实体类，该类实现了数据访问对象接口。该类负责从数据源获取数据，数据源可以是数据库，也可以是 xml，或者是其他的存储机制。
 */
public class DataAccessObjectConcreteClass implements DataAccessObjectInterface {
	/** 示意：数据集合：对应数据库 */
	private List<ModelObject> objList = new ArrayList<ModelObject>();
	/** 模拟测试数据 */
	static  {
		objList.add(new ModelObject(111, "AAA"));
		objList.add(new ModelObject(222, "BBB"));
	}
	/**
	 * 获取所有的ModelObject数据 
	 * @return
	 */
	@Override
	public List<ModelObject> getAllModel() {
		PrintUtil.two("DataAccessObjectConcreteClass.getAllModel()", "获取所有的ModelObject数据 ");
		return objList;
	}
	/**
	 * 根据ID获取对应的ModelObject
	 * @param id
	 * @return
	 */
	@Override
	public ModelObject getModel(long id) {
		PrintUtil.two("DataAccessObjectConcreteClass.getModel()：根据ID获取对应的ModelObject", id);
		for (ModelObject model : objList) {
			if(id == model.getId()) {
				return model;
			}
		}
		return null;
	}
	/**
	 * 修改ModelObjec数据
	 * @param model
	 */
	@Override
	public void updateModel(ModelObject model) {
		PrintUtil.two("DataAccessObjectConcreteClass.updateModel()：修改ModelObjec数据", model.toString());
		for (ModelObject temp : objList) {
			if(model.getId() == temp.getId()) {
				temp.setValue(model.getValue());
				break;
			}
		}
	}
	/**
	 * 删除ModelObject数据 
	 * @param model
	 */
	@Override
	public void deleteModel(ModelObject model) {
		PrintUtil.two("DataAccessObjectConcreteClass.updateModel()：删除ModelObject数据 ", model.toString());
		objList.remove(model);
	}
}
```
ModelObject.java
```java
package com.mutistic.j2ee.dataaccessobject.structure;
/**
 * ModelObject/ValueObject：
 * 模型对象/数值对象，该对象是简单的POJO，包含了get/set方法来存储通过使用DAO类检索到的数据
 */
public class ModelObject {
	/** 示意：可能存在的属性ID */
	private long id;
	/** 示意：可能存在的属性value */
	private String value;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public ModelObject(long id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	@Override
	public String toString() {
		return "ModelObject [id=" + id + ", value=" + value + "]";
	}
}
```

---
### <a id="a_front">三十八、前端控制器模式[Front Controller Pattern]</a> <a href="#a_data">last</a> <a href="#a_intercepting">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M31_FrontControllerPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M31_FrontControllerPattern.png)<br/>

一、定义、本质: 
```
定义: 提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理。该处理程序可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序
本质: 集中请求，统一分发
```

二、结构和说明: 
```
FrontController：前端控制器、处理应用程序所有类型请求的单个处理程序，应用程序可以是基于web的应用程序，也可以是基于桌面的应用程序。

Dispatcher：调度器、前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。

View：视图是为请求而创建的对象
```

Client.java
```java
package com.mutistic.j2ee.frontcontroller.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Client：客户端
 * 演示 前端控制器模式[Front Controller Pattern]-结构
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("前端控制器模式[Front Controller Pattern]");
		// 创建前端控制器对象
		FrontController controller = new FrontController();
		// 客户端请求，转调调度器
		controller.dispatchRequest("A");
		controller.dispatchRequest("B");
		controller.dispatchRequest("C");
	}
}
```
FrontController.java
```java
package com.mutistic.j2ee.frontcontroller.structure;
import com.mutistic.utils.PrintUtil;
/**
 * FrontController：
 * 前端控制器、处理应用程序所有类型请求的单个处理程序，应用程序可以是基于
 */
public class FrontController {
	/** 持有：调度器对象 */
	private Dispatcher dispatcher = new Dispatcher();
	/**
	 * 示意：可能存在的功能：用户验证
	 * @return
	 */
	private boolean isAuthenticUser() {
		PrintUtil.three("FrontController.isAuthenticUser()", "可能存在的功能：用户验证");
		return true;
	}
	/**
	 * 示意：可能存在的功能：记录请求
	 * @param request
	 */
	private void trackRequest(String request) {
		PrintUtil.three("FrontController.trackRequest()", "可能存在的功能：记录请求：request = " + request);
	}
	/**
	 * 客户端请求，转调调度器
	 * @param request
	 */
	public void dispatchRequest(String request) {
		PrintUtil.two("FrontController.dispatchRequest()", "客户端请求，转调调度器request = " + request);
		trackRequest(request);

		if (isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}
}
```
Dispatcher.java
```java
package com.mutistic.j2ee.frontcontroller.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Dispatcher：
 * 调度器、前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。
 */
public class Dispatcher {
	/** 持有：视图对象 */
	private ViewA viewA = new ViewA();
	/** 持有：视图对象 */
	private ViewB viewB = new ViewB();
	/**
	 * 统一分发到具体的处理程序
	 * @param request 请求
	 */
	public void dispatch(String request) {
		PrintUtil.three("Dispatcher.dispatch()", "统一分发到具体的处理程序"+ request);
		if ("A".equals(request)) {
			viewA.show();
		} 
		else if ("B".equals(request)) {
			viewB.show();
		} else {
			PrintUtil.three("Dispatcher.dispatch()", "没有匹配到对应的处理程序，程序结束");
		}
	}
}
```
ViewA.java
```java
package com.mutistic.j2ee.frontcontroller.structure;
import com.mutistic.utils.PrintUtil;
/**
 * View：
 * 视图是为请求而创建的对象
 */
public class ViewA {
	/**
	 * 显示具体视图 
	 */
	public void show() {
		PrintUtil.three("ViewA.show()", "显示具体视图 ");
	}
}
```
ViewB.java
```java
package com.mutistic.j2ee.frontcontroller.structure;
import com.mutistic.utils.PrintUtil;
/**
 * View：
 * 视图是为请求而创建的对象
 */
public class ViewB {
	/**
	 * 显示具体视图 
	 */
	public void show() {
		PrintUtil.three("ViewB.show()", "显示具体视图 ");
	}
}
```

---
### <a id="a_intercepting">三十九、拦截过滤器模式[Intercepting Filter Pattern]</a> <a href="#a_front">last</a> <a href="#a_service">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M32_InterceptingFilterPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M32_InterceptingFilterPattern.png)<br/>

一、定义、本质: 
```
定义: 对应用程序的请求或响应做一些预处理/后处理。定义过滤器，并在把请求传给实际目标应用程序之前应用在请求上。
过滤器可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序
本质: 动态过滤请求
```

二、结构和说明: 
```
Filter：过滤器接口，定义在请求处理程序执行请求之前或之后，执行某些任务的统一接口

ConcteteFilter：过滤器，实现过滤器接口，在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现

FilterChain：过滤器链，带有多个过滤器，并在Target上按照定义的顺序执行这些过滤器

Target：目标对象，是请求处理的具体程序

FilterManager：过滤管理器，管理过滤器和过滤器链

Client：客户端，是向Target对象发送请求的对象
```

Client.java
```java
package com.mutistic.j2ee.interceptingfilter.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Client：客户端
 * 演示 拦截过滤器模式[Intercepting Filter Pattern]-结构
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("拦截过滤器模式[Intercepting Filter Pattern]");
		// 创建目标对象
		Target target = new Target();
		// 创建过滤管理器对象，注入目标对象
		FilterManager filterManager = new FilterManager(target);
		// 创建具体的过滤器对象
		Filter fa = new ConcreteFilterA();
		Filter fb = new ConcreteFilterB();
		// 添加过滤器
		filterManager.addFilter(fa);
		filterManager.addFilter(fb);
		// 转调过滤器链开始执行请求
		filterManager.filterRequest("HOME");
	}
}
```
Target.java
```java
package com.mutistic.j2ee.interceptingfilter.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Target：
 * 目标对象，是请求处理的具体程序
 */
public class Target {
	/**
	 * 请求处理的具体程序
	 * @param request 具体请求
	 */
	public void execute(String request) {
		PrintUtil.two("Target.execute()：目标对象，是请求处理的具体程序: ", "request = "+ request);
	}
}
```
Filter.java
```java
package com.mutistic.j2ee.interceptingfilter.structure;
/**
 * Filter：
 * 过滤器，在请求处理程序执行请求之前或之后，执行某些任务
 */
public interface Filter {
	/**
	 * 定义：在请求处理程序执行请求之前或之后，执行某些任务的统一接口
	 * @param request 具体请求
	 */
	void execute(String request);
	
}
```
ConcreteFilterA.java
```java
package com.mutistic.j2ee.interceptingfilter.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcteteFilter：
 * 过滤器，实现过滤器接口，在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现
 */
public class ConcreteFilterA implements Filter {
	/**
	 * 在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现
	 * @param request 具体请求
	 * @see com.mutistic.j2ee.interceptingfilter.structure.Filter#execute(java.lang.String)
	 */
	public void execute(String request) {
		PrintUtil.three("ConcreteFilterA.request()", "在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现：request = " + request);
	}
}
```
ConcreteFilterB.java
```java
package com.mutistic.j2ee.interceptingfilter.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcteteFilter：
 * 过滤器，实现过滤器接口，在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现
 */
public class ConcreteFilterB implements Filter {
	/**
	 * 在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现
	 * @param request 具体请求
	 * @see com.mutistic.j2ee.interceptingfilter.structure.Filter#execute(java.lang.String)
	 */
	public void execute(String request) {
		PrintUtil.three("ConcreteFilterB.request()", "在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现：request = " + request);
	}
}
```
FilterChain.java
```java
package com.mutistic.j2ee.interceptingfilter.structure;
import java.util.ArrayList;
import java.util.List;
import com.mutistic.utils.PrintUtil;
/**
 * FilterChain：
 * 过滤器链，带有多个过滤器，并在Target上按照定义的顺序执行这些过滤器
 */
public class FilterChain {
	/** 持有：过滤器集合 */
	private List<Filter> filterList = new ArrayList<Filter>();
	/** 持有：目标对象 */
	private Target target;
	/**
	 * 添加具体的过滤器 
	 * @param filter
	 */
	public void addFilter(Filter filter) {
		filterList.add(filter);
		PrintUtil.three("FilterChain.addFilter()：添加具体的过滤器：", filterList);
	}
	/**
	 * 执行过滤器链，转调具体的过滤器
	 * @param request
	 */
	public void execute(String request) {
		PrintUtil.three("FilterChain.execute()：执行过滤器链，转调具体的过滤器：", request);
		for (Filter filter : filterList) {
			filter.execute(request);
		}
		target.execute(request);
	}
	/**
	 * 设置目标对象 
	 * @param target 目标对象
	 */
	public void setTarget(Target target) {
		this.target = target;
		PrintUtil.three("FilterChain.setTarget()：设置目标对象 ：", target);
	}
}
```
FilterManager.java
```java
package com.mutistic.j2ee.interceptingfilter.structure;
import com.mutistic.utils.PrintUtil;
/**
 * FilterManager：
 * 过滤管理器，管理过滤器和过滤器链
 */
public class FilterManager {
	/** 持有：过滤器链 */
	private FilterChain filterChain = new FilterChain();
	/**
	 * 构造函数：注入目标对象
	 * @param target 目标对象
	 */
	public FilterManager(Target target) {
		PrintUtil.two("FilterManager：构造函数：注入目标对象：", target);
		filterChain.setTarget(target);
	}
	/**
	 * 添加过滤器
	 * @param filter 具体的过滤器对象
	 */
	public void addFilter(Filter filter) {
		PrintUtil.two("FilterManager.addFilter()：添加过滤器：", filter);
		filterChain.addFilter(filter);
	}
	/**
	 * 转调过滤器链开始执行请求
	 * @param request 具体的请求
	 */
	public void filterRequest(String request) {
		PrintUtil.two("FilterManager.filterRequest()：转调过滤器链开始执行请求：", request);
		filterChain.execute(request);
	}
}
```

---
### <a id="a_service">四十、服务定位器模式[Service Locator Pattern]</a> <a href="#a_intercepting">last</a> <a href="#a_transfer">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M33_ServiceLocatorPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M33_ServiceLocatorPattern.png)<br/>

一、定义、本质: 
```
定义: 使用JNDI查询定位各种服务的时候。考虑到为某个服务查找JNDI的代价很高，服务定位器模式充分利用了缓存技术。
在首次请求某个服务时，服务定位器在JNDI中查找服务，并缓存该服务对象。当再次请求相同的服务时，
服务定位器会在它的缓存中查找，这样可以在很大程度上提高应用程序的性能
本质: 缓存服务
```

二、结构和说明: 
```
Service：服务接口，定义处理请求的服务。对这种服务的引用可以在JNDI服务器中查找到

ConcreteService：具体服务，实现服务接口，处理请求的服务的具体实现

Context：初始的上下文，JNDIContext带有对要查找的服务的引用

ServiceLocator：服务定位器，是通过JNDI查找和缓存服务来获取服务的单点接触

Cache：缓存，存储服务的引用，以便复用它们

Client：客户端，是通过ServiceLocator调用服务的对象
```

Client.java
```java
package com.mutistic.j2ee.servicelocator.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Client：客户端，是通过ServiceLocator调用服务的对象
 * 演示：服务定位器模式[Service Locator Pattern]-结构
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("服务定位器模式[Service Locator Pattern]");
		// 从服务定位器中获取服务
		Service service = ServiceLocator.getService("ConcreteServiceA");
		service.execute();
		
		service = ServiceLocator.getService("ConcreteServiceB");
		service.execute();
		
		service = ServiceLocator.getService("ConcreteServiceA");
		service.execute();
		
		service = ServiceLocator.getService("ConcreteServiceC");
		if(service != null) {
			service.execute();
		} else {
			PrintUtil.three("没有符合服务名称为ConcreteServiceC的服务，调用结束", service);
		}
	}
}
```
Service.java
```java
package com.mutistic.j2ee.servicelocator.structure;
/**
 * Service：
 * 服务接口，定义处理请求的服务。对这种服务的引用可以在JNDI服务器中查找到
 */
public interface Service {
	/**
	 * 定义：获取服务名称接口
	 * @return 服务名称
	 */
	String getName();
	/**
	 * 定义：执行请求接口 
	 */
	void execute();
}
```
ConcreteServiceA.java
```java
package com.mutistic.j2ee.servicelocator.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteService：
 * 具体服务，实现服务接口，处理请求的服务的具体实现
 */
public class ConcreteServiceA implements Service {
	/**
	 * 获取服务名称
	 * @return 服务名称
	 * @see com.mutistic.j2ee.servicelocator.structure.Service#getName()
	 */
	@Override
	public String getName() {
		return "ConcreteServiceA";
	}
	/**
	 * 执行具体的请求
	 * @see com.mutistic.j2ee.servicelocator.structure.Service#execute()
	 */
	public void execute() {
		PrintUtil.three("ConcreteServiceA.execute()", "执行具体的请求");
	}
}
```
ConcreteServiceB.java
```java
package com.mutistic.j2ee.servicelocator.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ConcreteService：
 * 具体服务，实现服务接口，处理请求的服务的具体实现
 */
public class ConcreteServiceB implements Service {
	/**
	 * 获取服务名称
	 * @return 服务名称
	 * @see com.mutistic.j2ee.servicelocator.structure.Service#getName()
	 */
	@Override
	public String getName() {
		return "ConcreteServiceB";
	}
	/**
	 * 执行具体的请求
	 * @see com.mutistic.j2ee.servicelocator.structure.Service#execute()
	 */
	public void execute() {
		PrintUtil.three("ConcreteServiceB.execute()", "执行具体的请求");
	}
}
```
Cache.java
```java
package com.mutistic.j2ee.servicelocator.structure;
import java.util.ArrayList;
import java.util.List;
import com.mutistic.utils.PrintUtil;
/**
 * Cache：
 * 缓存，存储服务的引用，以便复用它们
 */
public class Cache {
	/** 持有：服务集合，作为服务缓存对象 */
	private List<Service> serviceList = new ArrayList<Service>();
	/**
	 * 从缓存中获取服务
	 * @param jndiName 服务名称
	 * @return 具体的服务
	 */
	public Service getService(String jndiName) {
		for (Service service : serviceList) {
			if (service.getName().equals(jndiName)) {
				PrintUtil.three("Cache.getService()：缓存中存在"+ jndiName +"服务", service);
				return service;
			}
		}
		return null;
	}
	/**
	 * 添加服务到缓存中
	 * @param service
	 */
	public void addService(Service service) {
		boolean exists = false;
		for (Service temp : serviceList) {
			if (temp.getName().equals(temp.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			serviceList.add(service);
			PrintUtil.three("Cache.addService()：成功添加服务到缓存中：", service);
		} else {
			PrintUtil.three("Cache.addService()", "缓存中已经存在该服务，无需重复添加服务");
		}
	}
}
```
Context.java
```java
package com.mutistic.j2ee.servicelocator.structure;
import com.mutistic.utils.PrintUtil;
/**
 * Context：
 * 初始的上下文，JNDIContext带有对要查找的服务的引用
 */
public class Context {
	/**
	 * 查找JNDI服务功能
	 * @param jndiName JNDI服务名称
	 * @return 具体的服务
	 */
	public Service lookup(String jndiName) {
		PrintUtil.three("InitialContext.lookup()：开始根据服务名称查找具体的服务", jndiName);
		
		Service service = null;
		if (jndiName.equals("ConcreteServiceA")) {
			service = new ConcreteServiceA();
			PrintUtil.three("InitialContext.lookup()：开始查找JNDI服务ConcreteServiceA，并创建具体的服务对象", service);
			return service;
		}
		else if (jndiName.equals("ConcreteServiceB")) {
			service = new ConcreteServiceB();
			PrintUtil.three("InitialContext.lookup()：开始查找JNDI服务ConcreteServiceB，并创建具体的服务对象", service);
			return service;
		}
		PrintUtil.three("InitialContext.lookup()", "未查询到具体的服务，无法创建服务");
		return service;
	}
}
```
ServiceLocator.java
```java
package com.mutistic.j2ee.servicelocator.structure;
import com.mutistic.utils.PrintUtil;
/**
 * ServiceLocator：
 * 服务定位器，是通过JNDI查找和缓存服务来获取服务的单点接触
 */
public class ServiceLocator {
	/** 持有：缓存对象  */
	private static Cache cache = new Cache();
	/**
	 * 从缓存中获取服务对象
	 * @param jndiName 服务名称
	 * @return 具体的服务对象
	 */
	public static Service getService(String jndiName) {
		PrintUtil.two("ServiceLocator.getService()：开始从缓存中获取服务对象", jndiName);
		
		Service service = cache.getService(jndiName);
		if (service != null) {
			PrintUtil.three("ServiceLocator.getService()：成功从缓存中获取到服务镀锡", service);
			return service;
		}

		Context context = new Context();
		service = context.lookup(jndiName);
		if(service != null) {
			PrintUtil.three("ServiceLocator.getService()：缓存中不存在"+jndiName+"服务，开始创建服务", service);
			cache.addService(service);
		} else {
			PrintUtil.three("ServiceLocator.getService()：没有符合服务名称为"+jndiName+"的服务", service);
		}
		return service;
	}
}
```

---
### <a id="a_transfer">四十一、传输对象模式[Transfer Object Pattern]</a> <a href="#a_service">last</a> <a href="#a_summary">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M34_TransferObjectPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M34_TransferObjectPattern.png)<br/>

一、定义、本质: 
```
定义: 从客户端向服务器一次性传递带有多个属性的数据。传输对象也被称为数值对象。
传输对象是一个具有getter/setter方法的简单的POJO类，它是可序列化的，所以它可以通过网络传输。
它没有任何的行为。服务器端的业务类通常从数据库读取数据，然后填充POJO，并把它发送到客户端或按值传递它。
对于客户端，传输对象是只读的。客户端可以创建自己的传输对象，并把它传递给服务器，以便一次性更新数据库中的数值
本质: 传输对象数据
```

二、结构和说明: 
```
BusinessObject：业务对象，为传输对象填充数据的业务服务
    
TransferObject：传输对象，简单的POJO，只有设置/获取属性的方法

Client：客户端，可以发送请求或者发送传输对象到业务对象
```

Client.java
```java
package com.mutistic.j2ee.transferobject.structure;
import java.util.List;
import com.mutistic.utils.PrintUtil;
/**
 * Client：客户端，可以发送请求或者发送传输对象到业务对象
 * 演示：传输对象模式[Transfer Object Pattern]-结构
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("传输对象模式[Transfer Object Pattern]");

		// 创建数据操作接口实例
		BusinessObject business = new BusinessObject();
		PrintUtil.two("创建业务对象实例", business);

		// 调用getAllObject()接口
		List<TransferObject> objList = business.getAllObject();
		for (TransferObject model : objList) {
			PrintUtil.three("输出所有的TransferObject信息", model.toString());
		}

		// 调用updateObject()接口
		TransferObject model = objList.get(0);
		model.setValue("CCCC");
		business.updateObject(model);
		PrintUtil.three("调用updateObject()接口的数据", objList);

		// 调用deleteObject()接口
		business.deleteObject(objList.get(1));
		PrintUtil.three("调用deleteObject()接口的数据", objList);
	}
}
```
BusinessObject.java
```java
package com.mutistic.j2ee.transferobject.structure;
import java.util.ArrayList;
import java.util.List;
import com.mutistic.utils.PrintUtil;
/**
 * BusinessObject：
 * 业务对象，为传输对象填充数据的业务服务
 */
public class BusinessObject {
	/** 示意：传输对象集合，当作一个数据库*/
	private static List<TransferObject> objList = new ArrayList<TransferObject>();
	/** 注入测试数据  */
	static {
		objList.add(new TransferObject(111l, "AAA"));
		objList.add(new TransferObject(222l, "BBB"));
	}
	/**
	 * 获取所有的TransferObjectt数据 
	 * @return
	 */
	public List<TransferObject> getAllObject() {
		PrintUtil.two("BusinessObject.getAllObject()", "获取所有的TransferObject数据 ");
		return objList;
	}
	/**
	 * 根据ID获取对应的TransferObjectt
	 * @param id
	 * @return
	 */
	public TransferObject getObject(int id) {
		PrintUtil.two("BusinessObject.getObject()：根据ID获取对应的TransferObject", id);
		for (TransferObject model : objList) {
			if(id == model.getId()) {
				return model;
			}
		}
		return null;
	}
	/**
	 * 修改TransferObject数据
	 * @param model
	 */
	public void updateObject(TransferObject object) {
		PrintUtil.two("BusinessObject.updateObject()：修改TransferObject数据", object.toString());
		for (TransferObject temp : objList) {
			if(object.getId() == temp.getId()) {
				temp.setValue(object.getValue());
				break;
			}
		}
	}
	/**
	 * 删除TransferObjectt数据 
	 * @param model
	 */
	public void deleteObject(TransferObject object) {
		PrintUtil.two("BusinessObject.deleteObject()：删除TransferObject数据 ", object.toString());
		objList.remove(object);
	}
}
```
TransferObject.java
```java
package com.mutistic.j2ee.transferobject.structure;
/**
 * TransferObject：
 * 传输对象，简单的 POJO，只有设置/获取属性的方法
 */
public class TransferObject {
	/** 示意：可能存在的属性ID */
	private long id;
	/** 示意：可能存在的属性value */
	private String value;
	public TransferObject(Long id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	@Override
	public String toString() {
		return "TransferObject [id=" + id + ", value=" + value + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
```

---
## <a id="a_summary">模式相关总结</a> <a href="#a_transfer">last</a> <a href="#a_summary1">next</a>
#### 选择模式：
```
1、模式选择的方法：
  模式的功能：看是否能解决问题
  模式的本质：看模式是否主要用来解决这类问题
  模式的适用程度：看使用这个模式是否贴切，看是否需要变形
  应用模式的复杂程度：看使用模式带来的开发复杂度是否可接受或可扌空
  应用模式的代价：看使用模式的代价是否可接受或可控，如：引入过多的对象、耗费更彩的内存等

2、很多模式都可以组合使用

3、有些模式功能相近，结构类似，要特别注意它们的辨析

4、掌握模式要从思想上、本质上、整体上去把握
```

#### <a id="a_summary1">创建型模式：</a> <a href="#a_summary">last</a> <a href="#a_summary2">结构型模式</a>
#### <a id="a_mode1">一、简单工厂模式的相关模式：</a> <a href="#a_summary">last</a> <a href="#a_mode2">next</a>
1.1、简单工厂模式[Simple Factory Pattern]：
```
定义: 提供一个创建对象实例的功能，无需关心其具体的实现。被创建时间的类型可以是接口、抽象类，也可以是具体的类.
本质: 选择实现
```
1.2、简单工厂和抽象工厂模式：
```
  简单工厂是用来选择实现的，可以选择任意接口的实现，一个简单工厂可以有个用于选择并创建对象的方法，
多个方法创建的对象可以有关系也可以没有关系。
  抽象工厂模式是用来选择产品簇的实现的，也就是说一般抽象工厂而有多个用于选择并创建对象的方法，
但是这些方法所创建的对象之间通常是有关系的，这些被创建的对象通常是构成一个产品簇所需要的部件对象。
  
  所以从某种意义上来说，简单工厂和抽象工厂是类似的，如果抽象工厂退化成为只有一个实现，不分层次，
那么就相当于简单工厂了。
```
1.3、简单工厂和工厂方法模式：
```
  简单工厂和工厂方法模式也是非常类似的。
  工厂方法的本质也是用来选择实现的，跟简单工厂的区别在于工厂方法是把选择具体实现的功能延迟到子类去实现。
  
  如果把工厂方法中选择的实现放到父类直接实现，那就等同于简单工厂
```
1.4、简单工厂和能创建对象实例的模式：
```
  简单工厂的本质是选择实现，所以它可以跟其它任何能够具体的创建对象实例的模式配合，
比如：单例模式、原型模式、外观模式、建造者模式等等。
```

#### <a id="a_mode2">二、单例模式的相关模式：</a> <a href="#a_mode1">last</a> <a href="#a_mode3">next</a>
2.1、单例模式[Signleton Pattern]：
```
定义: 保证一个类仅有一个实例，并提供一个访问该类的全局访问接口。
本质: 控制实例的数目
```
2.2、相关模式：
```
很多模式都可以使用厂例模式，只要这些模式中的某个类，需要控制实例为一个的时候，就可以很自然的使用上单例模式。
比如抽象工厂方法中的具体工厂类就通常是一个单例。

还可以结合外观模式、适配器模式、抽象工厂模式、状态模式、空对象模式、享元模式等模式
```

#### <a id="a_mode3">三、工厂模式的相关模式：</a> <a href="#a_mode2">last</a> <a href="#a_mode4">next</a>
3.1、工厂模式[Factory Pattern]：
```
定义: 定义一个用于创建对象的接口，让子类决定实例化哪一个类，Factory Method使一个类的实例化延迟到子类
本质: 延迟到子类来选择实现
```
3.1、工厂方法模式和模板模式：
```
  这两个个模式外观类似，都是有一个抽象类，然后由子类来提供一些实现：
  工厂方法模式的子类专注的是创建产品对象，
  模板模式的子类专注的是为固定的算法骨架提供某些步骤的实现。

  这两个模式可以组合使用，通常在模板模式里面，使用工厂方法来创建模板方法需要的对象
```

#### <a id="a_mode4">四、抽象工厂模式的相关模式：</a> <a href="#a_mode3">last</a> <a href="#a_mode5">next</a>
4.1、抽象工厂模式[Abstract Factory Pattern]：
```
定义: 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
本质: 选择产品簇的实现
```
4.2、抽象工厂模式和工厂方法模式：
```
  这两个模式既有区别，又有联系，可以组合使用。
  工厂方法模式一般是针对单独的产品对象的创建
  抽象工厂模式注重产品簇对象创建，这是它们的区别

  如果把抽象工厂创建的产品簇简化，这个产品簇就只有一个产品那么这个时候的抽象工厂跟工厂方法是不多的，
也就是抽象工厂可以退化成工厂方法，而工厂方法又可以退化成简单工厂，这是它们的联系。

  在抽象工厂的实现中，还可以使用工厂方法来提供抽象工厂的具体实现，也就是说它们可以组合使用。
```
4.3、抽象工厂模式和厂例模式：
```
  这两个模式可以组合使用。
  在抽象工厂模式里面，具体的工厂实现，在整个应用中，通常一个产品系列只需要一个实例就可以了，
因此可以把具体的工厂实现成为单例
```

#### <a id="a_mode5">五、建造者模式的相关模式：</a> <a href="#a_mode4">last</a> <a href="#a_mode6">next</a>
5.1、建造者模式（生成器模式）[Builder Pattern]：
```
定义: 将一个复杂对象的构建与它的表示分离，是的同样的构建过程可以创建不同的表示
本质: 分离整体构建算法和组件构造
```
5.2、建造者模式和工厂方法模式：
```
  这两个模式可以组合使用
  建造者模式的Builder实现中，通常需要选择具体的部件实现，方案就是实现成为工厂方法，
通过工厂方法来获取具体的部件对象部件的装配。
```
5.3、建造者模式和抽象工厂模式：
```
  这两个模式既相似又有区别，也可以组合使用。
  区别：抽象工厂模式的主要目的是创建产品簇，这个产品簇里面的单个产品，就相当于是构成一个复杂对象的部件对象，
抽象工厂对象创建完成过后就立即返回整个产品簇：
  建造者模式的要目的是按照构建算法，一步一步来构建一个复杂的产品对象，通要等到整个构建过结東过后，
才会得到最终的产品对象

  事实上，这两个模式是可以组合使用的，在建造者模式的Builder实现中，需要创建各个部件对象，
而这部件对象是有关联的，通是构成一个复杂对象的部件对象，也就是说，Builder实现中，
需要获取构成一个复杂对象的产品簇，那自然就可以使用抽象工厂模式来实现。
这样一来，由抽象工厂模式负责了部件对象的创建，Builder实现里而就主要负责产品对象整体的构建了。
```
5.4、建造者模式和模板模式：
```
  这也是两个非常类似的模式。初看之下，不会觉得这两个模式有什么关联，但是仔细思考，发现两个模式在功能上很类似。

  模板模式主要是用来定义算法的骨架，把算法中某些步骤延迟到类中实现，
Director用用来定义整体的构建算法，把算法中某些涉及到具体部件对象的创建和装配的功能，
委托给具体的Builder来实现。
  虽然建造者不是延迟到子类，是委托给Builder，但那只是具体实现方式的的差别，
从实质上看两个模式很类似，都是定义一个固定的算法骨架，然后把算法中的某些具体步骤交给其它类来完成，
都能实现整体算法步驟和某些具体步骤实现的分离。

  当然两个模式也有很大的区别：
  首先是模式的目的：建造者模式是用来构建复杂对象的，而模板方法是用来定义算法骨架，
尤其是一些复杂的业务功能的处理算法的骨架，
  
  其次是模式的实现：建造者模式是采用委托的方法，而模板方法是采用的继承的方式
  
  另外从使用的复杂度上：
  建造者模式需要组合Director和Builder对象，然后才能开始构建，要等构建完后才能获得最终的对象，
  模板方法没有这么麻烦，直接使用子类对象即可。
```
5.5、建造者模式和组合模式：
```
  这两个模式可以组合使用。
  对于复杂的组合结构，可以使用建造者模式来一步一步构建
```

#### <a id="a_mode6">六、原型模式的相关模式：</a> <a href="#a_mode5">last</a> <a href="#a_mode7">next</a>
6.1、原型模式[Prototype Pattern]：
```
定义: 用原型实例执行创建对象的种类，并通过拷贝这些原型创建新的对象
本质: 克隆生成对象
```
6.2、原模式和抽象工厂模式：
```
  功能上有相似，都是用来获取一个新的对象实例的。
  不同之处在于：原型模式的着重点是在如何创造出实例对象来，最后选择的方案是通过克隆
  抽象工厂模式的着重点则在于如何来创造产品簇，至于具体如何创建出产品簇中的每个对象实例，抽象工厂模式不是很关注。

  正是因为它们的关注点不一样，所以它们也可以配合使用，比如在抽象工厂模式里面，
具体创建每一种产品的时候就可以使用该种产品的原型，也就是抽象工厂管产品簇，
具体的每种产品怎么创建则可以选择原型模式。
```
6.3、原型模式和建造者模式：
```
  这两种模式可以配合使用。
  建造者模式关注的是构建的过程，而在构建的过程中，很可能需要某个部件的实例，
那么很自然地就可以应用上原型模式，通过原型模式来得到部件的实例
```

#### <a id="a_summary2">结构型模式：</a> <a href="#a_summary1">创建型模式</a> <a href="#a_summary3">行为型模式</a>
#### <a id="a_mode7">七、过滤器模式的相关模式：</a> <a href="#a_mode6">last</a> <a href="#a_mode8">next</a>
7.1、过滤器模式[Filter Pattern]：
```
定义: 使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。也称标准模式（Criteria Pattern）
本质: 结合多个标准来获得单一标准
```

#### <a id="a_mode8">八、外观模式的相关模式：</a> <a href="#a_mode7">last</a> <a href="#a_mode9">next</a>
8.1、外观模式[Facade Pattern]：
```
定义: 为系统中的一组接口提供一个一致的界面。Facade模式定义高层接口，这个接口使得客户端容易使用这一系统。
本质: 封装交互、简化调用
```
8.2、外观模式和中介者模式：
```
  这两个模式非常类似，但是有本质的区别。
  中介者模式主要用来封装多个对象之间相互的交互，多用在系统内部的多个模块之间
  外观模式封装的是单向的交互，是从客户端访问系统的调用，没有从系统中来访问客户端的调用

  在中介者模式的实现里面，是需要实现具体的交互功能的。
  外观模式的实现里面，一般是组合调用或是转调内部实现的功能，通常外观模式本身并不实现这些功能。

  中介者模式的目的主要是松散多个模块之闻的耦合，把这些耦合关系个部放到中介者中去实现
  外观模式的目的是简化客户端的调用，这点和中介者模式也不同
```
8.3、外观模式和单例模式：
```
  通常一个子系统只需要一个外观实例，所以外观模式可以和单例模式组合使用，把Facade类实现成单例。
当然，把外观类的构造方法私有化，然后把提供给客户端的方法实现成为静态的
```
8.4、外观模式和抽象工厂模式：
```
  外观模式的外观类通常需要和系统内部的多个模块交互，每个模块一般都有自己的接口，所以在外观类的具体实现里面，
需要获取这些接口，然后组合这些接口来完成客户端的功能。
  那么获取这些接口的方式就可以和抽象工厂一起使用，外观类通过抽象工厂来获取所需要的接口，
而抽象工厂也可以把模块内的实现对Facade过行屏蔽，也就是说Facade也仅仅只是知道它从模块中获取的它需要的功能，
不知道模块内部的细节
```

#### <a id="a_mode9">九、适配器模式的相关模式：</a> <a href="#a_mode8">last</a> <a href="#a_mode10">next</a>
9.1、适配器模式[Adapter Pattern]：
```
定义: 将一个类的接口转换客户端希望的另外一个接口。适配器模式使得原本由于接口不兼容而能一起工作的那些类可以一起工作。
本质: 转换匹配，复用功能
```
9.2、适配器模式与桥接模式：
```
  其实这两个模式除了结构略为相似外，功能上完全不同。
  适配器模式是把两个或者多个接口的功能进行转换匹配
  桥接模式是让接口和实现部分相分离，以便它们可以，相对独立的变化。
```
9.3、适配器模式与装饰模式：
```
  从某种意义上讲，适配器模式能模拟实现简单的装饰模式的功能，也就是为己有功能增添功能。
  造成这种类似的原因：两种设计模式在实现上都是使用的对象组合，都可以在转调组合对象的功能前后进行一些附加的处理，
因此有这么一个相似性。它们的目的和本质都是不一样的。
  
  两个模式有一个很大的不同：
  一般适配器适配过后是需要改变接口的，如果不改接口就没有必要适配了
  装饰模式是不改接口的，无论多少层装饰都是一个接口
  
  因此装饰模式可以很容易的支持递归组合，而适配器就做不了，每次的接口不同，没法递归。
```
9.4、适配器模式和代理模式：
```
  适配器模式可以跟代理模式组合使用，在实现适配器的时候，可以通过代理来调用Adaptee，这可以获得更大的灵活性
```
9.5、适配器模式和抽象工厂模式：
```
  在适配器实现的时候，通需要得到被适配的对象，如果被适配的是一个接口,那么就可以结合一些可以创造对象实例的设计模式，
来得到被适配的对象示例。比如：抽象工厂模式、单例模式、工厂方法模式等
```

#### <a id="a_mode10">十、代理模式的相关模式：</a> <a href="#a_mode9">last</a> <a href="#a_mode11">next</a>
10.1、代理模式[Proxy Pattern]：
```
定义: 为其他对象提供一种代理以控制对这个对象的访问
本质: 控制对象访问
```
10.2、代理模式和适配器模式：
```
  这两个模式有一定的相似性，但也有差异。
  相似性：它们都为另一个对象提供间接性的访问，而且都是从自身以外的一个接口向这个对象转发请求

  但是从功能上，两个模式是不一样的：
  适配器模式主要用来解决接口之间不匹配的问题，它通是为所适配的对象提供一个不同的接口
  代理模式会实现和目标对象相同的接口
```
10.3、代模式和装饰模式：
```
  这两个模式从实现上相似，但是功能上是不同的。
  装饰模式的实现和保护代理的实现上是类似的，都是在转调其它对象的前后执行一定的功能。

  它们的目的的和功能都是不同的：
  装饰模式的目的是为了在不生成类就可以给对象添加职责，也就是为了动态的增加功能
  代理模式的主要目的是控制对对象的访问
```

#### <a id="a_mode11">十一、组合模式的相关模式：</a> <a href="#a_mode10">last</a> <a href="#a_mode12">next</a>
11.1、组合模式[Composite Pattern]：
```
定义: 将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性
本质: 统一叶子对象和组合对象
```
11.2、组合模式和装饰模式：
```
  这两个模式可以组合使用。
  装饰模式在组装多个装饰器对象的时候，是一个装饰器找下一个装饰器，下一个再找下一个，如此递归下去。
那么这种结构也可以使用组合模式来帮助构建，这样一来，装饰器对象就相当于组合模式的Composite对象了。
  要让两个模式能好的组合使用，通会让它们有一个公共的父类，因此装饰器必须支持组合模式需要的一些功能，
比如，增加、删除了组件等等。
```
11.3、组合模式和享元模式：
```
  这两个模式可以组合使用。
  如果组合模式中出现大量相似的组件对象的话，可以考虑使用享元模式来帮助缓存组件对象，这可以减少对内存的需要。

  使用享元模式也是有条件的，如果组件对象的可变化部分的状态能够从组件对象里而分离出去，
而且组件对象本身不需要向父组件发送请求的话，就可以采用享元模式。
```
11.4、组合模式和迭代器模式：
```
  这两个模式可以组合使用。
  在组合模式中，通常可以使用迭代器模式来遍历组合对象的子对象合而无需关心具体存放子对象的聚合结构。
```
11.5、组合模式和访问者模式：
```
  这两个模式可以组合使用。
  访问者模式能够在不修改原有对象结构的情况下，给对象结构中的对象增添新的功能。
将访问者模式和组合模式合用，可以把原本分散在Compsite和Leaf类中的操作和行为都局部化
  
  如果在使用组合模式的时候，预计到今后可能会有增添其它功能的可能，
那么可以采用访问者模式，来预留好添加新功能的方式和通道，这样以后在添加新功能的时候，
就不需要再修改己有的对象结构和己经实现的功能了
```
11.6、组合模式和职责链模式：
```
  这两个模式可以组合使用。
  职责链模式要解决的问是：实现请求的发送者和接收者之间解耦。职责链模式的实现方式是把多个接收者组合起来，
构成职责链，然后让请求在这条链上传递，直到有接收者处理这个请求为止。
  可以应用组合模式来构建这条链，相当于是子组件找父组件，父组件又找父组件，如此递归下去，
构成一条处理请求的组件对象链。
```
11.5、组合模式和命令模式：
```
  这两个模式可以组合使用。
  命令模式中有一个宏命令的功能，通常这个宏命令就是使用组合模式来组装出来的
```

#### <a id="a_mode12">十二、装饰模式的相关模式：</a> <a href="#a_mode11">last</a> <a href="#a_mode13">next</a>
12.1、装饰模式[Decorator Pattern]：
```
定义: 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式比生成子类更为灵活
本质: 动态组合
```
12.2、装饰模式和适配器模式：
```
  这是两个没有什么关联的模式，放到一起来说，是因为它们有一个共同的别名：Wrapper。
  这两个模式功能上是不一样的，适配器模式是用来改变接口的，而装饰模式是用来改变对象功能的。
```
12.3、装饰模式和组合模式：
```
  这两个模式有相似之处，都涉及到对象的递归调用，从某个角度来说，可以把装饰看成是只有一个组件的组合。
  
  但是它们的目的完全不一样：
  装饰模式是要动态的给对象增加功能
  组合模式是想要管理组合对象和叶子对象，为它们提供一个一致的操作接口给客户端，方便客户端的使用
```
12.4、装饰模式和策略模式：
```
  这两个模式可以组合使用。
  策略模式也可以实现动态的改变对象的功能，但是策略模式只是一层选择，也就是根据策略选择一下具体的实现类而己。
  装饰模式不是一层，而是递归调用，无数层都可以，只要组合好装饰器的对象组合，那就可以依次调用下去，所以装饰模式会更灵活。

  策略模式改变的是原始对象的功能，不像装饰模式，后面一个装饰器改变的是经过前个装饰器装饰过后的对象，
也就是策略模式改变的是对象的内核，而装饰模式改变的是对象的外壳。

  这两个模式可以组合使用，可以在一个具体的装饰器里面使用策略模式，来选择更具体的实现方式。
```
12.5、装饰模式和模板模式：
```
  这是两个功能上有相似点的模式。
  模板模式主要应用在算法骨架固定的情况，那么要是算法步骤不固定，也就是一个相对动态的算法步骤，
就可以使用装饰模式了，因为在使用装饰模式的时候，进行装饰器的组装，其实也相当于是一个调用算法步骤的组装，
相当于是一个动态的算法骨架。

  既然装饰模式可以实现动态的算法步骤的组装和调用，那么把这些算法步骤固定下来，
那就是模板模式实现的功能了，因此装飾模式可以模拟实现模板模式的功能。
 
  注意，仅仅只是可以模拟功能而已，两个模式的设计目的、原本功能、本质思想等都是不一样的
```

#### <a id="a_mode13">十三、享元模式的相关模式：</a> <a href="#a_mode12">last</a> <a href="#a_mode14">next</a>
13.1、享元模式[Flyweight Pattern]：
```
定义: 运用共享技术有效地支持大量细粒度的对象
本质: 分离与共享
```
13.2、享元模式和单例模式：
```
  这两个模式可以组合使用。
  通常情况下，享元模式中的享元工厂可以实现成为单例
  另外，享元工厂里面缓存的享元对象，都是单实例的，可以看成是单例模式的一种变形控制，
在享元工厂里面来单例享元对象。
```
13.3、享元模式和组合模式：
```
  这两个模式可以组合使用。
  在享元模式里面，存在不需要共享的享元实现，这些不需要共享的享元通常是对共享的享元对象的组合对象，
也就是说，享元模式通常会和组合模式组合使用，来实现更复杂的对象层次结构。
```
13.4、享元模式和状态模式：
```
  这两个模式可以组合使用。
  可以使用享元模式来共享状态模式中的状态对象，通常在状态模式中，会存在数量很大的、细粒度的状态对象，
而且它们基本上都是可以重复使用的，都是用来处理某一个固定的状态的，它们需要的数据通常都是由上下文传入，
也就是变化部分都分离出去了，所以可以用享元模式来实现这些状态对象。
```
13.5、享元模式和策略模式：
```
  这两个模式可以组合使用。
  可以使用享元模式来实现策略模式中的策略对象，跟状态模式一样，在策略模式中也存在大量细粒度的策略对象，
它们需要的数据同样是从上下文传入的，所以可以使用享元模式来实现这些策略对象
```

#### <a id="a_mode14">十四、桥接模式的相关模式：</a> <a href="#a_mode13">last</a> <a href="#a_mode15">next</a>
14.1、桥接模式[Bridge Pattern]：
```
定义: 将抽象部分与它的实现部分分离，使它们都可以独立地变化
本质: 分离抽象和实现
```
14.2、桥接模式和策略模式：
```
  这两个模式有很大的相似之处。
  如果把桥接模式的抽象部分简化来看，如果暂时不去扩展Abstraction，也就是去掉RefinedAbstraction会发现，
这个时候它们的结构都类似，可以体会到桥接模式和策略模式是如此相似。可以把策略模式的Context视做是使用接口的对象，
而Strategy就是某个接口了，具体的策略实现那就相当于接口的具体实现。这样看来的话，某些情况下可以使用桥接模式来
模拟实现策略模式的功能

  这两个模式虽然相似，也还是有区别的。最主要的是模式的目的不一样：
  策略模式的目的是封装一系列的算法，使得这些算法可以相互替换
  桥接模式的目的是分离抽象和实现部分，使得它们可以独立的变化。
```
14.3、桥接模式和状态模式：
```
  由于从模式结构上看，状态模式和策略模式是一样的，这两个模式的关系也基本上类似于桥接模式和策略模式的关系。
  只不过状态模式的目的是封装状态对应的行为，并在内部状态改变的时候改变对象的行为。
```
14.4、桥接模式和抽象工厂模式：
```
  这两个模式可以组合使用。
  桥接模式中，抽象部分需要获取相应的实现分的接口对象，那么创建建实现部分的具体实现对象，
可以用抽象工厂模式来创建和配置一个特定的具体实现的对象。
  事实上，抽象工厂主要是用来创建一系列对象的，如果创建的对象很少，或者是很简单，还可以采用简单工厂，
可以达到一样的效果，但是会比抽象工厂来得简单
```
14.5、桥接模式和模板模式：
```
  这两个模式有相似之处。
  虽然标准的模板模式是采用继承来实现的，但是模板方法也可以通过回调接口的方式来实现，
如果把接口的实现独立出去，那就类似于模板方法通过接去调用具体的实现方法了。这样的结构就和简化的桥接模式类似了。

  可以使用桥接模式来模拟实现模板模式的功能。如果在实现Abstraction对象的时候，
在里面定义方法，方法里面就是某个固定的算法骨架，也就是说这个方法就相当于模板方法。
在模板模式里，是把不能确定实现的步骤延迟到子类去实现。
现在在桥接模式里而，把不能确定实现的步骤委托给具体实现部分去完成，通过回调实现部分的接口，
来完成算法骨架中的某些步骤。这一来，就可以实现使用桥接模式来模拟实现模板模式的功能了。

  使用桥接模式来模拟实现模板模式的功能，还有个潜在的好处，就是模板方法也可以很方便的扩展和变化了。
在标准的模板方法里面，一个问题就是当模板发生变化的时候，所有的子类都要变化，非常不方便。
而使用桥接模式来实现类似的功能，就没有这个问题了。

  另外，只是说从实现具体的业务功能上，桥接模式可以模拟实现以模板模式能实现的功能，
并不是说桥接模式和模板模式就变成一样的，或者是桥接模式就可以替换掉模板模式了。
要注意它们本身的功能、目的、本质思想都是不一样的。
```
14.6、桥接模式和适配器模式：
```
  这两个模式可以组合使用。
  这两个模式功能是完个不一样的：适配器模式的功能主要是用来帮助无关的类协同工作，
重点在解决原本由于接口不兼容而不能一起工作的那些类，使得它们可以一起工作。
  桥接模式则重点在分离抽象和实现部分。

  所以在使用上，通在系统设计完成过后，才会考虑使用适配器模式。桥接模式，是系统开始的时候就要考虑使用。
  
  虽然功能上不一样，这两个模式还是可以组合使用的，比如：己有实现部分的接口，
但是有些不太适应现在新的功能对接口的需要，可以使用适配器来过行适配，使得旧的接口能够适应新的功能的需要。
```

#### <a id="a_summary3">行为型模式：</a> <a href="#a_summary2">结构型模式</a> <a href="#a_xmind">思维导图</a>
#### <a id="a_mode15">十五、中介者模式的相关模式：</a> <a href="#a_mode14">last</a> <a href="#a_mode16">next</a>
15.1、中介者模式[Mediator Pattern]：
```
定义: 用一个中介对象来封装一系列的对象交付。终结者是的各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立的改变他们之间的交互
本质: 封装交互
```
15.2、中介者模式和外观模式：
```
  这两个模式有相似的地方，也存在很大的不同。
  外观模式多用来封装一个子系统内部的多个模块，目的是向子系统外部提供简单易用的接口，
也就是说外观模式封装的是子系统外部和子系统内部模块间的交互
  中介者模式是提供多个平等的同事对象之间交互关系的封装，一般是用在内部实现上。

  外观模式是实现单向的交互，是从子系统外部来调用子系统内部．不会反过来，
  中介者模式实现的是内部多个模块间多向的交互。
```
15.3、中介者模式和观察者模式：
```
  这两个模式可以组合使用。
  中介者模式可以组合使用观察者模式，来实现当同事对象发生改变的时候，通知中介对象，
让中介对象去过行与其它相关对象的交互。
```

#### <a id="a_mode16">十六、观察者模式的相关模式：</a> <a href="#a_mode15">last</a> <a href="#a_mode17">next</a>
16.1、观察者模式[Observer Pattern]：
```
定义: 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
本质: 触发联动
```
16.2、观察者模式和状态模式：
```
  观察者模式和状态模式是有相似之处的。
  观察者模式是当目标状态发生改变时，触发并通知观察者，让观察者去执行相应的操作。
  状态模式是根据不同的状态，选择不同的实现，这个实现类的主要功能就是针对状态的相应的操作，
它不像观察者，观察者本身还有很多其它的功能，接收通知并执行相应处理只是观察者的部分功能。

  当然观察者模式和状态模式是可以结合使用的。
  观察者模式的重心在触发联动，但是到底决定哪些观察者会被联动，这时就可以采用状态模式来实现了，
也可以采用策略模式来进行选择需要联动的观察者
```
16.3、观察者模式和中介者模式：
```
  观察者模式和中介者模式是可以结合使用的。
  如果观察者和被观察的目标之间的交互关系很复杂，这种情况下，很明显需要相关的状态都联动准备好了，
然后再一次性的通知观察者，可以使用中介者模式来封装观察者和目标的关系。
  在使用Swing的引用程序里面，也可以使用中介者模式。比如：把一个界面所有的事件使用一个对象来处理，
把一个组件触发事件过后，需要操作其它组件的动作都封装到一起，这个对象就是典型的中介者
```

#### <a id="a_mode17">十七、命令模式的相关模式：</a> <a href="#a_mode16">last</a> <a href="#a_mode18">next</a>
17.1、命令模式[Command Pattern]：
```
定义: 将一个请求封装为一个对象，从而使得可用不同的请求对客户进行参数化。对请求排队或记录请求日志，以及支持可撤销的操作
本质: 封装请求
```
17.2、命令模式和组合模式：
```
  这两个模式可以组合使用。
  在命令模式中，实现宏命令的功能，就可以使用组合模式来实现
实现这点请注忌。
```
17.2、命令模式和备录模式：
```
  这两个模式可以组合使用。

  在命令模式中，实现可撤销操作功能时，有两种实现力式，其中一种就是保存命令执行前的状态，
撤销的时候就把状态恢复回去。如果采用这种方式实现，就可以考虑使用备忘录模式。
  如果状态存储在命令对象里面，那么还可以使用原型模式，把命令对象当作原型来克降一个新的对象，
然后把克隆出来的对象通过备忘录模式存放。
```
17.3、命令模式和模板模式：
```
  这两个模式从某种意义上有相似的功能。
  命令模式可以作为模板方法的种替代模式，也就是说命令模式可以模仿实现模板模式的功能。

  退化的命令模式可以实现Java的回调，而Invoker智能化后向服务进化，如果Invoker的方法就是一个算法骨架，
其中有两步在这个骨架里面没有具体实现，需要外部来实现，这个时候就可以通过回调命令接口来实现。
  而类似的功能在模板方法里面，一个算法骨架，其中有两步在这个骨架里面没有具体实现，是先调用抽象方法，
然后等待子类来实现。可以看出然实现方式不一样，但是可以实现相同的功能。
```

#### <a id="a_mode18">十八、迭代器模式的相关模式：</a> <a href="#a_mode17">last</a> <a href="#a_mode19">next</a>
18.1、迭代器模式[Iterator Pattern]：
```
定义: 提供一种方法顺序访问一个聚合对象中各个元素，而又不需暴露该对象的内部表示
本质: 控制访问聚合对象中的元素
```
18.2、迭代器模式和组合模式：
```
  这两个模式可以组合使用。
  组合模式是一种递归的对象结构，在枚举某个组合对象的了对象的时候通会使用迭代器模式。
```
18.3、迭代器模式和工厂方法模式：
```
  这两个模式可以组合使用。
  在聚合对象创建迭代器的时候，通常会采用工厂方法模式来实例化相应的迭代器对象
```

#### <a id="a_mode19">十九、模板模式的相关模式：</a> <a href="#a_mode18">last</a> <a href="#a_mode20">next</a>
19.1、模板模式[Template Pattern]：
```
定义: 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法是的子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
本质: 固定算法骨架
```
19.2、模板模式和工厂方法模式：
```
  这两个模式可以配合使用。
  模板模式可以通过工厂方法来获取需要调用的对象。
```
19.3、模板模式和策略模式：
```
  这两个模式的功能有些相似，但是是有区别。
  从表面上看，两个模式都能实现算法的封装。

  模板方法封装的是算法的骨架，这个算法骨架是不变的，变化的是算法中某些步骤的具体实现
  策略模式是把某个步骤的具体实现算法封装起来，所有封装的算法对象是等价的，可以相互替换。

  因此，可以在模板方法中使用策略模式，就是把那些变化的算法步骤通过使用策略模式来实现，
但是具体选取哪个策略还是要由外部来确定，而整体的算法步骤，也就是算法骨架就由模板方法来定义了。
```

#### <a id="a_mode20">二十、策略模式的相关模式：</a> <a href="#a_mode19">last</a> <a href="#a_mode21">next</a>
20.1、策略模式[Strategy Pattern]：
```
定义: 定义一系列的算法，把它们封装起来，并且使它们可以相互替换。策略模式使得算法可独立于使用它的客户而变化
本质: 分离算法，选择实现
```
20.2、策略模式和状态模式：
```
  这两个模式从模式结构上看是一样的，但是实现的功能是不一样的
  
  状态模式是根据状态的变化来选择相应的行为，不同的状态对应不同的类，每个状态对应的类实现了该状态对应的功能，
在实现功能的同时，还会维护状态数的变化。这些实现状态对应的功能的类之间是不能相互替换的。
  策略模式是根据需要或者是客户端的要求来选择相应的实现类，各个实现类是平等的，是可以相互替换的。

  策略模式可以让客户端来选择需要使用的策略算法
  状态模式一般是由上下文，或者是在状态实现类里面维护具体的状态数掘，通常不由客户端来指定状态。
```
20.3、策略模式和模板模式：
```
  这两个模式可组合使用。
  模板方法重在封装法骨架，而策略模式在分离并封装算法实现。
```
20.4、策略模式和享元模式：
```
  这两个模式可组合使用。
  策略模式分离并封装出一系列的策略算法对象，这些对象的功能通常都比较单一，很多时候就是为了实现某个算法的功能而存在，
因此，针对这一系列的、多个细粒度的对象，可以应用享元模式来节省资源，但前提是这些算法对象要被频繁的使用，
如果偶尔用一次，就没有必要做成享元了。
```

#### <a id="a_mode21">二十一、状态模式的相关模式：</a> <a href="#a_mode20">last</a> <a href="#a_mode22">next</a>
21.1、状态模式[State Pattern]：
```
定义: 允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类
本质: 根据状态来分离和选择行为
```
21.2、状态模式和观察者模式：
```
  这两个模式功能从表面看是很相似的，但是又有区别，可以组合使用。
  
  模式都是在状态发生改变的时候触发行为，只不过观察者模式的行为是固定的，那就是通知所有的观察者，
而状态模式是根据状态来选择不同的处理。
  从表面来看两个模式功能相似：观察者中的被观察对象就好比状态模式中的上下文，
观察者模式中当被观察对象的状态发生改变的时候，触发的通知所有观察者的方法，
就好比状态模式中，根据状态的变化，选择对应的状态处理。

  实际这两个模式是不同的：
  观察者模式的目的是在被观察者的状态发生改变的时候，触发观察者联动，具体如何处理观察者模式不管
  状态模式的主要目的在于根根状来分离和选择行为，当状态发生改变的时候，动态改变行这两个

  模式是可以组合使用的：比如在观察者模式的观察者部分，当被观察对象的状态发生了改变，
触发通知了所有的观察者过后，观察者可以使用状态模式，根据通知过来的状态选择相应的处理。
```
21.3、状态模式和策略模式：
```
  这是两个是结构相同，功能各异的模式
```
21.4、状态模式和单例模式：
```
  这两个模式可以组合使用，可以把状态模式中的状态处理类实现成单例
```
21.5、状态模式和享元模式：
```
  这两个模式可以组合使用。
  由于状态模式把状态对应的行为分散到多个状态对象中，会造成很多细粒度的状态对象，
可以把这些状态处理对象通过亨元模式来共享，从而节省资源。
```

#### <a id="a_mode22">二十二、备忘录模式的相关模式：</a> <a href="#a_mode21">last</a> <a href="#a_mode23">next</a>
22.1、备忘录模式[Memento Pattern]：
```
定义: 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将对象恢复到原先保存的状态
本质: 保存和恢复内部状态
```
22.2、备忘录模式和命令模式：
```
  这两个模式可以组合使用。
  命令模式实现中，在实现命令的撤销和重做的时候，可以使用备忘录模式，在命令操作的时候记录下操作前后的状态，
然后在命令撤销和重做的时候，直接使用相应的备忘录对象来恢复状态就可以了。

  在这种撤销的执行顺序和重做执行顺序可控的情况下，备录对象还可以采用增量式记录的方式，
可以减少缓存的数据量。
```
22.3、备忘录模式和原型模式：
```
  这两个模式可以组合使用。
  在原发器对象创建备忘录对象的是否，如果原发器对象中全部或者大部分的状态都需要保存，
一个简洁的方式就是直接克隆一个原发器对象。也就是说，这个时候备忘录对象里而存放的是一个原发器对象的实例
```

#### <a id="a_mode23">二十三、解释器模式的相关模式：</a> <a href="#a_mode22">last</a> <a href="#a_mode24">next</a>
23.1、解释器模式[Interpreter Pattern]：
```
定义: 给定一个语言，定义它的语法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
本质: 分离实现，解释执行
```
23.2、解释器模式和组合模式：
```
  这两个模式可以组合使用。
  通常解释器模式都会使用组合模式来实现，这样能够方便的构建抽象语法树。
  一般非终结符解释器就相当于组合模式中的组合对象，终结符解释器就相当于叶子对象。
```
23.3、解释器模式和迭代器模式：
```
  这两个模式可以组合使用。
  由于解释器模式通常使用组合模式来实现，因此在遍历整个对象结构的时候，自然可以使用迭代器模式。
```
23.4、解释器模式和享元模式：
```
  这两个模式可以组合使用。
  在使用解释器模式的时候，可能会造成多个细粒度对象，比如会有各种各样的的终结符解释器，
而这些终结符解释器对不同的表达式来说是一样的，是可以共用的，因此可以引入享元模式共享这对象。
```
23.5、解释器模式和访问者模式：
```
  这两个模式可以组合使用。
  在解释器模式中，语法规则和解释器对象是有对应关系的。语法规则的变动意味着功能的变化，
自然会导致使用不同的解释器对象。而且一个法规则可以被不同的解释器解释执行。

  因此在构建抽象浯法树的时候，如果每个节点所对应的解释器对象是固定的，
这就意味着这个节点对应的功能是固定的，那么就不得不根据需要来构建不同的抽象语法树。

  为了让构建的抽象语法树较为通用，那就要求解释器的功能不要那么固定，要能很方便的改变解释器的功能，
这个时候问题就变成了，如何能够很方便的史改树形结构中节点对象的功能了，访问者模式可以很好的实现这个功能。
```

#### <a id="a_mode24">二十四、职责链模式的相关模式：</a> <a href="#a_mode23">last</a> <a href="#a_mode25">next</a>
24.1、职责链模式[Chain of Responsibility Pattern]：
```
定义: 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合美系。将这些对象连成一条链，
并沿着这条链传递该请求，直到有一个对象处理它为止。
本质: 分离职责，动态组合
```
24.2、职责链模式和组合模式：
```
  这两个模式可以组合使用。
  可以把职责对象通过组合模式来组合，这样可以通过组合对象自动递归的向上调用，由父组件作为子组件的后继，从而形成链。

  这也就是使用外部己有的链接，这种情况在客户端使用的时候，就不用再构造链了，虽然不构造链，
但是需要构造组合对象树，是一样的。
```
24.3、职责链模式和策略模式：
```
  这两个模式可以组合使用。
  这两个模式有相似之处，如果把职责链简化到直接就能选择到相应的处理对象，那就跟策略模式的选择差不多，
因此可以用职责链来模拟策略模式的功能。只是如果把职责链简化到这个地步，也就不存在链了，也就称不上是职责链了。

  两个模式可以组合使用，可以在职责链模式的某个职责的实现的是否，使用策略模式来选择具体的实现，
同样也可以在策略模式的某个策略实现里面，使用职责链模式来实现功能处理。
```
24.4、职责毓模式和装饰模式：
```
  这两个模式相似，从某个角度讲，可以相互模拟实现对方的功能。
  装饰模式能够动态的给被装饰对象添加功能，要求装饰器对象和被装饰的对象实现相同的接口。
  职责链模式可以实现动态的职责组合，标准的功能是有一个对象处理就结束，但是如果处理完本职责不急于结束，
而是继续向下传递请求，那么功能就和装饰模式的功能差不多了，每个职责对象就类似于装饰器，可以实现某种功能。

  两个模式的本质也类似，都需要在运行期间动态组合，装饰模式是动态组合装饰器，
  职责链是动态组合处理清求的职责对象的链。

  但是从标准的设计模式上来，这两个模式还是有较大区别的，
  首先是目的不同：装饰模式是要实现透明的为对象添加功能，而职责链模式是要实现发送者和接收者解耦

  另外：装饰模式是无限递归调用的，可以有任多个对象来装饰功能，但是职责链模式是有一个处理就结束
```

#### <a id="a_mode25">二十五、访问者模式的相关模式：</a> <a href="#a_mode24">last</a> <a href="#a_mode26">next</a>
25.1、访问者模式[Visitor Pattern]：
```
定义: 表示一个作用域某对象结构中的各元素的操作。客户端在不改变各元素的类的前提下定义作用这些元素的新操作。
本质: 预留通路，回调实现
```
25.3、访问者模式和组合模式：
```
  这两个模式可以组合使用。
  通过访问者模式给组合对象预留下扩展功能的接口，使得给组合模式的对象结构添加功能非常容易。
```
25.2、访问者模式和装饰模式：
```
  这两个模式从表面看功能有些相似，都能够实现在不修改原对象结构的情况下修改原对象的功能。
  
  装饰模式更名的是实现对已有功能加强、或者修改、或者完全全新实现
  访问者模式更名的是实现给对象结构添加新的功能。
```
25.2、访问者模式和解释器模式：
```
  这两个模式可以组合使用。
  解释器模式在构建抽象语法树的时候，是使用组合模式构建的，也就是说解释器模式解释并执行
的抽象语法树是一个组台对象结构，这个组合对象结构是很少变动的，但是可能经常需要为解释器增加新的功能，
实现对同一对象结构的不同解释和执行的功能，这正好是访问者模式的优势所在，
因此这在使用解释器模式的时候通常会组合访问者模式来使用。
```

#### <a id="a_mode26">二十六、空对象模式的相关模式：</a> <a href="#a_mode25">last</a> <a href="#a_xmind">next</a>
26.1、空对象模式[Null Object Pattern]：
```
定义: 提供一个对象作为缺少给定类型对象的代理。该空对象提供智能"什么也不做"行为，隐藏其合作者的细节。
本质: 统一行为，默认实现
```
26.2、空对象模式和单例模式：
```
  这两个模式可以组合使用。
  通常用于实现Null对象，因为多个实例的行为完全相同，并且没有可能发生变化的内部状态。
```
26.3、空对象模式和享元模式：
```
  这两个模式可以组合使用。
  当多个null对象实现为单个NullObject类的实例时，可以使用享元模式。
```
26.4、空对象模式和策略模式：
```
  这两个模式可以组合使用。
  策略模式通常有一个Null对象代表什么都不做的策略。
```
26.5、空对象模式和状态模式：
```
  这两个模式可以组合使用。
  状态模式经常使用Null Object来表示客户端不应该执行任何操作的状态。
```
26.6、空对象模式和迭代器模式：
```
  这两个模式可以组合使用。
  迭代器可能将Null对象作为一种特殊情况，不会迭代任何东西。
```
26.7、空对象模式和适配器模式：
```
  这两个模式可以组合使用。
  适配器可能将Null对象作为一种特殊情况，假装适应另一个对象而不实际调整任何东西。
```

---
## <a id="a_xmind">[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle) </a> <a href="#a_summary">模式相关总结</a> <a href="#a_ea">next</a>
[P0-面向对象设计原则: SOLID](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P0_SOLID.xmind)<br/>
[P1-单一职责原则[SR: Single Responsibility Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P1_SRP.xmind)<br/>
[P2-开闭原则[OCP: Open Closed Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P2_OCP.xmind)<br/>
[P3-里氏替换原则[LSP: Liskov Substitution Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P3_LSP.xmind)<br/>
[P4-接口隔离原则[ISP: Interface Segregation Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P4_ISP.xmind)<br/>
[P6-依赖倒置原则[DIP: Dependence Inversion Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P5_DIP.xmind)<br/>
[P7-迪米特法则[LoD: Law of Demeter，最少知识原则: LKP: Least Knowledge Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P6_LoD.xmind)<br/>

---
## <a id="a_ea">[EA模型](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode) </a> <a href="#a_xmind">last</a> <a href="#a_down">next</a>
<a href="#a_creational">创建型模式[Creational Patterns]: </a><br/>
[M1-简单工厂模式[Simple Factory Pattern]](https://github.com/mutistic/mutistic.principle/blob/master/com.mutistic.principle/notes/mode/eap/M1_FactoryMethodPattern.eap)<br/>
[M2-单例模式[Signleton Pattern]](https://github.com/mutistic/mutistic.principle/blob/master/com.mutistic.principle/notes/mode/eap/M2_SignletonPattern.eap)<br/>
[M3-工厂模式[Factory Pattern]](https://github.com/mutistic/mutistic.principle/blob/master/com.mutistic.principle/notes/mode/eap/M3_FactoryPattern.eap)<br/>
[M4-抽象工厂模式[Abstract Factory Pattern]](https://github.com/mutistic/mutistic.principle/blob/master/com.mutistic.principle/notes/mode/eap/M4_AbstractFactoryPattern.eap)<br/>
[M5-建造者模式[Builder Pattern]](https://github.com/mutistic/mutistic.principle/blob/master/com.mutistic.principle/notes/mode/eap/M5_BuilderPattern.eap)<br/>
[M6-原型模式[Prototype Pattern]](https://github.com/mutistic/mutistic.exercise/tree/master/com.mutistic.principle/notes/mode/eap/M6_PrototypePattern.eap)<br/>
<a href="#a_structural">结构型模式[Structural Patterns]: </a><br/>
[M7-外观模式[Facade Pattern]](https://github.com/mutistic/mutistic.principle/blob/master/com.mutistic.principle/notes/mode/eap/M7_FacadePattern.eap)<br/>
[M8-适配器模式[Adapter Pattern]](https://github.com/mutistic/mutistic.principle/blob/master/com.mutistic.principle/notes/mode/eap/M8_AdapterPattern.eap)<br/>
[M9-代理模式[Proxy Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M9_ProxyPattern.eap)<br/>
[M10-组合模式[Composite Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M10_CompositePattern.eap)<br/>
[M11-装饰模式[Decorator Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M11_DecoratorPattern.eap)<br/>
[M12-享元模式[Flyweight Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M12_FlyweightPattern.eap)<br/>
[M13-桥接模式[Bridge Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M13_BridgePattern.eap)<br/>
[M14-过滤器模式[Filter Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M14_FilterPattern.eap)<br/>
<a href="#a_behavioral">行为型模式[Behavioral Patterns]: </a><br/>
[M15-中介者模式[Mediator Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M15_MediatorPattern.eap)<br/>
[M16-观察者模式[Observer Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M16_ObserverPattern.eap)<br/>
[M17-命令模式[Command Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M17_CommandPattern.eap)<br/>
[M18-迭代器模式[Iterator Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M18_IteratorPattern.eap)<br/>
[M19-模板模式[Template Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M19_TemplatePattern.eap)<br/>
[M20-策略模式[Strategy Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M20_StrategyPattern.eap)<br/>
[M21-状态模式[State Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M21_StatePattern.eap)<br/>
[M22-备忘录模式[Memento Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M22_MementoPattern.eap)<br/>
[M23-解释器模式[Interpreter Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M23_InterpreterPattern.eap)<br/>
[M24-职责链模式[Chain of Responsibility Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M24_ChainofResponsibilityPattern.eap)<br/>
[M25-访问者模式[Visitor Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M25_a_visitorPattern.eap)<br/>
[M26-空对象模式[Null Object Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M26_NullObjectPattern.eap)<br/>
<a href="#a_j2ee">J2EE 设计模式[J2EE Patterns]: </a><br/>
[M27-MVC 模式[MVC Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M27_MVCPattern.eap)<br/>
[M28-业务代表模式[Business Delegate Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M28_BusinessDelegatePattern.eap)<br/>
[M29-组合实体模式[Composite Entity Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M29_CompositeEntityPattern.eap)<br/>
[M30-数据访问对象模式[Data Access Object Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M30_DataAccessObjectPattern.eap)<br/>
[M31-前端控制器模式[Front Controller Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M31_FrontControllerPattern.eap)<br/>
[M32-拦截过滤器模式[Intercepting Filter Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M32_InterceptingFilterPattern.eap)<br/>
[M33-服务定位器模式[Service Locator Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M33_ServiceLocatorPattern.eap)<br/>
[M34-传输对象模式[Transfer Object Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M34_TransferObjectPattern.eap)<br/>

---
<a id="a_down"></a>  
<a href="#a_top">Top</a> 
<a href="#a_catalogue">Catalogue</a><br/>
<a href="#a_design">设计原则</a><br/>
<a href="#a_creational">创建型模式[Creational Patterns]</a><br/>
<a href="#a_structural">结构型模式[Structural Patterns]</a><br/>
<a href="#a_behavioral">行为型模式[Behavioral Patterns]</a><br/>
<a href="#a_j2ee">J2EE 设计模式[J2EE Patterns]</a><br/>
<a href="#a_xmind">思维导图</a>
<a href="#a_ea">EA模型</a>
