# <a id="a_top">Java设计模式</a> <a href="#a_catalogue">Catalogue</a> <a href="#a_down">Down</a>
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
--引用[百度百科](https://baike.baidu.com/item/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/1212549): 
```
设计模式[Design pattern] 代表了最佳的实践，通常被有经验的面向对象的软件开发人员所采用。

设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。
这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。

设计模式是一套被反复使用的、多数人知晓的、经过分类编目的、代码设计经验的总结。
使用设计模式是为了重用代码、让代码更容易被他人理解、保证代码可靠性。 

毫无疑问，设计模式于己于他人于系统都是多赢的，设计模式使代码编制真正工程化，设计模式是软件工程的基石。
项目中合理地运用设计模式可以完美地解决很多问题，每种模式在现实中都有相应的原理来与之对应，
每种模式都描述了一个在我们周围不断重复发生的问题，以及该问题的核心解决方案，这也是设计模式能被广泛应用的原因
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
组合模式[Composite Pattern]、装饰器模式[Decorator Pattern]、享元模式[Flyweight Pattern]、
桥接模式[Bridge Pattern]、过滤器模式[Filter Pattern]、
```

三、<a href="#a_behavioral">行为型模式[Behavioral Patterns]: </a><br/>
描述算法和对象间的职责的分配
```
中介者模式[Mediator Pattern]、观察者模式[Observer Pattern]、命令模式[Command Pattern]、
迭代器模式[Iterator Pattern]、模板模式[Template Pattern]、策略模式[Strategy Pattern]、
状态模式[State Pattern]、备忘录模式[Memento Pattern]、解释器模式[Interpreter Pattern]、
责任链模式[Chain of Responsibility Pattern]、访问者模式[Visitor Pattern]、空对象模式[Null Object Pattern]、
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
29. <a href="#a_iterator">迭代器者模式[Iterator Pattern]</a>
30. <a href="#a_template">模板模式[Template Pattern]</a>
31. <a href="#a_strategy">策略模式[Strategy Pattern]</a>
32. <a href="#a_state">状态模式[State Pattern]</a>
33. <a href="#a_memento">备忘录模式[Memento Pattern]</a>
34. <a href="#a_interpreter">解释器模式[Interpreter Pattern]</a>
35. <a href="#a_responsibility">责任链模式[Chain of Responsibility Pattern]</a>
36. <a href="#a_visitor">访问者模式[Visitor Pattern]</a>
37.	<a href="#a_object">对象模式[Null Object Pattern]</a>
38. <a href="#a_j2ee">#J2EE设计模式#</a>
39. <a href="#a_mvc">MVC 模式[MVC Pattern]</a>
40. <a href="#a_business">业务代表模式[Business Delegate Pattern]</a>
41. <a href="#a_entity">组合实体模式[Composite Entity Pattern]</a>
42. <a href="#a_data">数据访问对象模式[Data Access Object Pattern]</a>
43. <a href="#a_front">前端控制器模式[Front Controller Pattern]</a>
44. <a href="#a_intercepting">拦截过滤器模式[Intercepting Filter Pattern]</a>
45. <a href="#a_service">服务定位器模式[Service Locator Pattern]</a>
46. <a href="#a_transfer">传输对象模式[Transfer Object Pattern]</a>
97. <a href="#a_xmind">思维导图</a>
98. <a href="#a_ea">EA</a>
99. <a href="#a_down">down</a>


## <a id="a_design">设计原则</a> <a href="#a_catalogue">目录</a> <a href="#a_creational">设计模式</a>
### <a id="a_SOLID">一、面向对象设计原则: SOLID</a> <a href="#a_catalogue">last</a> <a href="#a_SRP">next</a>
1.1、[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P0_SOLID.xmind)<br/>

1.2、面对对象编程[Object Oriented Programming，OOP，面向对象程序设计]: 
```
万物皆对象。
本质是以建立模型体现出来的抽象思维过程和面向对象的方法。
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
面向对象有诸多的设计原则，但是通常我们提到的设计原则是其中最重要的五个设计原则，
也是公认的面向对象设计的五大原则，也是通常所说的“S.O.L.I.D ”: 
	1、单一职责原则告诉我们实现类要职责单一
	2、里氏替换原则告诉我们不要破坏继承关系
	3、依赖倒置原则告诉我们要面向接口编程
	4、接口隔离原则告诉我们在设计接口的时候要精简单一
	5、开闭原则告诉我们要对扩展开发，对修改关闭
	6、迪米特法则告诉我们要降低耦合
```

---
### <a id="a_SRP">二、单一职责原则[SRP: Single Responsibility Principle]</a> <a href="#a_SOLID">last</a> <a href="#a_OCP">next</a>
[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P1_SRP.xmind)<br/>
一、定义: 单一职责原则（SRP: Single responsibility principle，单一功能原则]: 
```
规定一个类应该只有一个发生变化的原因。或者说一个类只负责一个功能领域中的相应职责。
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
对于扩展是开放的（Open for extension），对于修改是关闭的（Closed for modification），意味着模块的行为是可以扩展的。
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
当应用的需求改变时，我们可以对模块进行扩展，使其具有满足那些改变的新行为。也就是说，我们可以改变模块的功能。

2、对于修改是关闭的（Closed for modification）。对模块行为进行扩展时，不必改动模块的源代码或者二进制代码。
模块的二进制可执行版本，无论是可链接的库、DLL或者.EXE文件，都无需改动。
```

四、原理: 
```
实现开闭原则的关键就在于“抽象”。
1、把系统的所有可能的行为抽象成一个抽象底层，这个抽象底层规定出所有的具体实现必须提供的方法的特征。
作为系统设计的抽象层，要预见所有可能的扩展，从而使得在任何扩展情况下，系统的抽象底层不需修改；
同时，由于可以从抽象底层导出一个或多个新的具体实现，可以改变系统的行为，因此系统设计对扩展是开放的。

2、我们在软件开发的过程中，一直都是提倡需求导向的。这就要求我们在设计的时候，要非常清楚地了解用户需求，
判断需求中包含的可能的变化，从而明确在什么情况下使用开闭原则。

3、关于系统可变的部分，还有一个更具体的对可变性封装原则（Principle of Encapsulation of Variation, EVP），
它从软件工程实现的角度对开闭原则进行了进一步的解释。
EVP要求在做系统设计的时候，对系统所有可能发生变化的部分进行评估和分类，每一个可变的因素都单独进行封装。

4、我们在实际开发过程的设计开始阶段，就要罗列出来系统所有可能的行为，并把这些行为加入到抽象底层，根本就是不可能的，
这么去做也是不经济的。因此我们应该现实的接受修改拥抱变化，使我们的代码可以对扩展开放，对修改关闭
```

五、优点: 
```
如果一个软件系统符合开闭原则的，那么从软件工程的角度来看，它至少具有这样的好处: 
1、可复用性好: 我们可以在软件完成以后，仍然可以对软件进行扩展，加入新的功能，非常灵活。
因此，这个软件系统就可以通过不断地增加新的组件，来满足不断变化的需求。

2、可维护性好: 由于对于已有的软件系统的组件，特别是它的抽象底层不去修改，
因此，我们不用担心软件系统中原有组件的稳定性，这就使变化中的软件系统有一定的稳定性和延续性。
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
继承必须确保超类所拥有的性质在子类中仍然成立。或者说任何超类可以出现的地方，子类一定可以出现。
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
客户端不应该依赖它不需要的接口；一个类对另一个类的依赖应该建立在最小的接口上。或者说使用多个专口的接口，而不使用单一的总接口
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
是的其实ISP和SRP都是强调职责的单一性， 接口隔离原则告诉我们在定义接口的时候要根据职责定义“较小”的接口，
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
抽象不应该依赖于细节，细节应该依赖于抽象
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
我们在项目中使用这个原则要遵循下面的规则: 
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
接口声明依赖: 在接口的方法中声明依赖对象，在为什么我们要符合依赖倒置原则的例子中，我们采用了接口声明依赖的方式，该方法也叫做接口注入
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
就是说一个对象应当对其他对象有尽可能少的了解,不和陌生人说话	
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

1、建造者模式: 其中心在于分离构建算法和具体的构造实现，从而使得构建算法可以重用，
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
	2.2、在构建组件的方法里曲可以实现选择并创建具体的组件对象，然后再把这个组件对象组装到产品对象中去，
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
	直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
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
1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。 2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制
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
主要解决：它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以向处理简单元素一样来处理复杂元素，
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
主要解决：在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，
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

---
### <a id="a_filter">二十一、过滤器模式[Filter Pattern]</a> <a href="#a_bridge">last</a> <a href="#a_mediator">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M14_FilterPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M14_FilterPattern.png)<br/>

---
## <a id="a_behavioral">行为型模式[Behavioral Patterns]</a> <a href="#a_structural">结构型模式</a> <a href="#a_j2ee">J2EE 设计模式</a>
### <a id="a_mediator">二十二、中介者模式[Mediator Pattern]</a> <a href="#a_filter">last</a> <a href="#a_observer">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M15_MediatorPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M15_MediatorPattern.png)<br/>
一、定义、本质: 
```
定义: 用一个中介对象来封装一系列的对象交付。终结者是的各对象不需要显式地相互引用，
	从而而使其耦合松散，而且可以独立的改变他们之间的交互
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
主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
如何解决：将多个类相互耦合新城的网状结构分离为星型结构(局域网就是星型结构)。

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
  具体的目标实现对象要能维护观察者的注册信息，最简厂的实现方案就是采用一个集合来保存观察者的注册信息。
  具体的目标实现对象需要维护引起通知的状态，一般情况下是目标自身的状态，变形使用的情况下，也可以是别的对象的状态。
  具体的观察者实现对象需要能接收目标的通知，能够接收目标传递的数据或者是能够主动去获取目标的数据，并进行后续处理。
  如果是一个观察者观察多个目标，那么在观察者的更新方法里曲，需要去判断是来自哪一个目标的通知。
简单的解决方案就是扩展update方法，比如在方法里面多传递一个参数过行区分。还有一种简单的方法，比如定义不同的回调方法。

4、观察者模式又被称为发布-订阅模式

5、触发通知的时机：一般情况下，是在完成了状态维护后触发，因为通知会传递数据，不能够先通知后改数据，否则会导致观察者和目标对象的状态不一致

6、相互观察：A对象的状态变化会引起C对象的联动操作，反过来，C对象的变化也会引起A对象的联动操作。对于这种状况，要小心处理，避免循环通知
否则会引起死循环的情况（中介者模式不处理好循环调用也可能导致死循环）

7、通知顺序：从理论上说，当目标对象的状态变化后通知所有观察者的时候，顺序是不确定的，因此观察者实现的功能，不要依赖于通知的顺序，
也就是说，多个观察者之间的功能是平行的，相互不应该有先后的依赖关系。如果需要顺序可以采用责任链模式
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

4、Java中的观察者模式：java.util.Observable 实现了大部分我们需要的目标的功能，还有一个java.util.Observer接口，
里面定义了一个update的方法，就是观察者的接口

5、Swing中的观察者模式： 
  Swing中到处都是观察者模式的身影，比如事件处理（早期的Swing事件处理用的是职责链）
  Swing组件是被观察的目标，而每个实现监听器的类就是观察者，监听器的就扣就是观察者的接口，在调用addListener方法
的时候就相当于注册观察者。
  当组件被点击，状态发生改变的时候，就会产生相应的通知，会调用注册的观察者的方法，就是我们说实现实现的监听器的方法

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
4、通知观察者不建议依赖于通知的顺序。如果无法避免建议采用责任链模式
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
### <a id="a_iterator">二十五、迭代器者模式[Iterator Pattern]</a> <a href="#a_command">last</a> <a href="#a_template">next</a>
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
// 演示：迭代器者模式[Iterator Pattern]
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("迭代器者模式[Iterator Pattern]（外部迭代器）");
		
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
	 * @description 定义：移动到聚合对象的第一个位置接口
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
  好莱坞原则：不要给我们打电话，我们会给你打电话(don‘t call us, we‘ll call you)
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
因为有的算法会使用这些数据，而有的算法不会使用，但是上下文和策略对象之闷交互的开销是存在的了。
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
  3.2、把策略的接口改成抽象类，然后在里曲实现具体算法的公共功能。
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

---
### <a id="a_responsibility">三十一、责任链模式[Chain of Responsibility Pattern]</a> <a href="#a_interpreter">last</a> <a href="#a_visitor">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M24_ChainofResponsibilityPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M24_ChainofResponsibilityPattern.png)<br/>

---
### <a id="a_visitor">三十二、访问者模式[Visitor Pattern]</a> <a href="#a_responsibility">last</a> <a href="#a_object">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M25_a_visitorPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M25_a_visitorPattern.png)<br/>

---
### <a id="a_object">三十三、对象模式[Null Object Pattern]</a> <a href="#a_visitor">last</a> <a href="#a_mvc">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M26_NullObjectPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M26_NullObjectPattern.png)<br/>


---
## <a id="a_j2ee">J2EE 设计模式[J2EE Patterns]</a> <a href="#a_behavioral">行为型模式</a> <a href="#a_xmind">思维导图</a>
### <a id="a_mvc">三十四、MVC 模式[MVC Pattern]</a> <a href="#a_object">last</a> <a href="#a_business">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M27_MVCPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M27_MVCPattern.png)<br/>

---
### <a id="a_business">三十五、业务代表模式[Business Delegate Pattern]</a> <a href="#a_mvc">last</a> <a href="#a_entity">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M28_BusinessDelegatePattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M28_BusinessDelegatePattern.png)<br/>

---
### <a id="a_entity">三十六、组合实体模式[Composite Entity Pattern]</a> <a href="#a_business">last</a> <a href="#a_data">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M29_CompositeEntityPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M29_CompositeEntityPattern.png)<br/>

---
### <a id="a_data">三十七、数据访问对象模式[Data Access Object Pattern]</a> <a href="#a_entity">last</a> <a href="#a_front">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M30_DataAccessObjectPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M30_DataAccessObjectPattern.png)<br/>

---
### <a id="a_front">三十八、前端控制器模式[Front Controller Pattern]</a> <a href="#a_data">last</a> <a href="#a_intercepting">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M31_FrontControllerPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M31_FrontControllerPattern.png)<br/>

---
### <a id="a_intercepting">三十九、拦截过滤器模式[Intercepting Filter Pattern]</a> <a href="#a_front">last</a> <a href="#a_service">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M32_InterceptingFilterPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M32_InterceptingFilterPattern.png)<br/>

---
### <a id="a_service">四十、服务定位器模式[Service Locator Pattern]</a> <a href="#a_intercepting">last</a> <a href="#a_transfer">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M33_ServiceLocatorPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M33_ServiceLocatorPattern.png)<br/>

---
### <a id="a_transfer">四十一、传输对象模式[Transfer Object Pattern]</a> <a href="#a_service">last</a> <a href="#a_xmind">next</a>
[结构图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/structure/M34_TransferObjectPattern.png)
[时序图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/sequence/M34_TransferObjectPattern.png)<br/>


---
## <a id="a_xmind">[思维导图](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle) </a> <a href="#a_j2ee">last</a> <a href="#a_ea">next</a>
[P0-面向对象设计原则: SOLID](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P0_SOLID.xmind)<br/>
[P1-单一职责原则[SR: Single Responsibility Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P1_SRP.xmind)<br/>
[P2-开闭原则[OCP: Open Closed Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P2_OCP.xmind)<br/>
[P3-里氏替换原则[LSP: Liskov Substitution Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P3_LSP.xmind)<br/>
[P4-接口隔离原则[ISP: Interface Segregation Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P4_ISP.xmind)<br/>
[P6-依赖倒置原则[DIP: Dependence Inversion Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P5_DIP.xmind)<br/>
[P7-迪米特法则[LoD: Law of Demeter，最少知识原则: LKP: Least Knowledge Principle]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/principle/P6_LoD.xmind)<br/>

---
## <a id="a_ea">[EA](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode) </a> <a href="#a_xmind">last</a> <a href="#a_down">next</a>
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
[M11-装饰器模式[Decorator Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M11_DecoratorPattern.eap)<br/>
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
[M24-责任链模式[Chain of Responsibility Pattern]](https://github.com/mutistic/mutistic.exercise/blob/master/com.mutistic.principle/notes/mode/eap/M24_ChainofResponsibilityPattern.eap)<br/>
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
<a href="#a_ea">EA</a>