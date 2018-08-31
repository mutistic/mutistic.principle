package com.mutistic.behavioral.memento.structure;

/**
 * @program Memento：备忘录。定义为窄接口（不声明任何方法）
 * @description 主要用来存储原发器对象的内部状态，但是具体需要存储哪些数据是由原发器对象来决定的。
 * 另外备忘录应该只能由原发器对象来访问它内部的数据，原发器外部的对象不应该能访问到备忘录对象的内部数据
 * 一般定义为窄接口（不声明任何方法）,标识对象的类型
 * @author mutisitic
 * @date 2018年8月30日
 */
public interface Memento {

}
