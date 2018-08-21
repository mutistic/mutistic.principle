package com.mutistic.creational.signleton;

import com.mutistic.utils.PrintUtil;

/**
 * @program 单例模式[Signleton Pattern]
 * @description 
 * @author mutisitic
 * @date 2018年8月21日
 */
public class SignletonPattern {
	public static void main(String[] args) {
		PrintUtil.printOne("单例模式[Signleton Pattern]");
		PrintUtil.println("一、定义和本质:\r\n" + 
				"\r\n" + 
				"定义: 保证一个类仅有一个实例，并提供一个访问该类的全局访问接口。\r\n" + 
				"本质: 控制实例的数目\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"Singleton: 负责创建Singleton类自己的唯一实例，并提供一个getInstance方法，让外部来访问这个类的唯一实例。\r\n" + 
				"\r\n" + 
				"三、理解:\r\n" + 
				"\r\n" + 
				"主要解决: 一个全局使用的类频繁地创建与销毁。\r\n" + 
				"如何解决: 判断系统是否已经有这个单例，如果有则返回，如果没有则创建。\r\n" + 
				"\r\n" + 
				"1、单例模式的功能: 保证这个类在运行期间自会被创建一个类实例，并提供一个全局唯一访问这个类实例的访问点。\r\n" + 
				"2、单例模式的范围: 是一个ClassLoader（类转载）及其子ClassLoader的范围（也可以认为是一个jvm的范围）\r\n" + 
				"3、单例模式-懒汉式: 体现了延迟加载思想: 一开始不要加载资源或者数据，当是要到这个资源或者数据才进行加载，\r\n" + 
				"	也称Lazy Load，其目的是为了尽可能的节约资源\r\n" + 
				"4、单例模式-懒汉式: 提现了缓存的实现: 也就是说某些资源或者数据被频繁的使用，可以吧这些数据缓存到内存里面，\r\n" + 
				"	当操作时，先从内从查找，如果存在就直接使用，如果不存在就先创建，然后设置到缓存中。\r\n" + 
				"	下一次访问可以直接从内存中获取。缓存是一种空间换时间的方案。\r\n" + 
				"\r\n" + 
				"四、写法:\r\n" + 
				"\r\n" + 
				"1、单例模式-懒汉式: 以时间换空间的方案，使用延迟加载和缓存的思想。\r\n" + 
				"\r\n" + 
				"2、单例模式-饿汉式: 以空间换时间的方案，使用JVM装载实现。\r\n" + 
				"2.1、饿汉式还可以在Java中通过 Lazy initialization holder class模式来实现。\r\n" + 
				"2.2、饿汉式还可以使用单元素枚举的方式来实现\r\n" + 
				"\r\n" + 
				"3、保证懒汉式的线程安全;\r\n" + 
				"3.1、在getInstance方法上添加同步锁synchronized，但是效率稍低\r\n" + 
				"3.2、使用双重检查枷锁的机制: 具体是指: \r\n" + 
				"	并不是每次进入getInstance方法都需要同步，而是先进入方法，检查实例是否存在，如果不存在才进入下面的同步代码块、这是第一重检查。\r\n" + 
				"	进入同步块后，再次检查视力是否存在，如果不存在就在同步的情况下创建一个实例，这第二重检查。\r\n" + 
				"	双重检查枷锁机制的实现会使用volatile: 被volatile修饰的变量的值，将不会被本地线程缓存，\r\n" + 
				"	所有对该变量的读写都是直接操作共享内存，从而确保多线程能正确处理该变量。\r\n" + 
				"	\r\n" + 
				"	private static volatile SignletonByVolatile uniqueIntance = null;\r\n" + 
				"	\r\n" + 
				"	public static SignletonByVolatile getIntance() {\r\n" + 
				"		if(uniqueIntance == null) {\r\n" + 
				"			synchronized (SignletonByVolatile.class) {\r\n" + 
				"				if(uniqueIntance == null) {\r\n" + 
				"					uniqueIntance = new SignletonByVolatile();\r\n" + 
				"				}\r\n" + 
				"			}\r\n" + 
				"		}\r\n" + 
				"		return uniqueIntance;\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"3.3、在Java中通过 Lazy initialization holder class模式: \r\n" + 
				"	该模式综合使用了Java的类级内部类和多线程默认同步锁的方法，实现了延迟加载和线程安全\r\n" + 
				"\r\n" + 
				"	private static class SignletonHolder {\r\n" + 
				"		public final static SignletonByLazzClass uniqueIntance = new SignletonByLazzClass();\r\n" + 
				"	}\r\n" + 
				"	\r\n" + 
				"	public static SignletonByLazzClass getIntance() {\r\n" + 
				"		return SignletonHolder.uniqueIntance;\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"3.4、通过枚举的方式: 单元素的枚举类型已经成为实现Singleton的最佳方法: \r\n" + 
				"	public enum SignletonByEnum { uniqueIntance; }\r\n" + 
				"\r\n" + 
				"五、优点:\r\n" + 
				"\r\n" + 
				"1、时间和空间: 懒汉式是典型的时间换空间的方案。饿汉式是典型的空间换时间的方案。\r\n" + 
				"2、线程安全: \r\n" + 
				"2.1、不加同步锁synchronized的懒汉式是线程不安全的。\r\n" + 
				"2.2、饿汉式是线程安全的，因为虚拟机JVM保证了自会装载一次。\r\n" + 
				"\r\n" + 
				"六、缺点:\r\n" + 
				"\r\n" + 
				"1、不加同步锁synchronized的懒汉式是线程不安全的\r\n" + 
				"\r\n" + 
				"七、使用场景:\r\n" + 
				"\r\n" + 
				"当需要控制一个类的实例只能有一个，而客户端只能从一个全局访问接口访问它时，可以选用单例模式，这些功能恰好是单例模式的问题。\r\n" + 
				"\r\n" + 
				"具体场景: \r\n" + 
				"1、要求生产唯一序列号。\r\n" + 
				"2、WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。 \r\n" + 
				"3、创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等\r\n" + 
				"\r\n" + 
				"八、注意事项:\r\n" + 
				"\r\n" + 
				"懒汉式的单例模式的getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) \r\n" + 
				"防止多线程同时进入造成 instance 被多次实例化\r\n" + 
				"");
	}
}
