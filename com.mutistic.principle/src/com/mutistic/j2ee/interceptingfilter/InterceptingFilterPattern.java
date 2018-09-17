package com.mutistic.j2ee.interceptingfilter;

import com.mutistic.utils.PrintUtil;

/**
 * @program 拦截过滤器模式[Intercepting Filter Pattern]
 * @description
 * @author mutisitic
 * @date 2018年9月17日
 */
public class InterceptingFilterPattern {
	public static void main(String[] args) {
		PrintUtil.ln("拦截过滤器模式[Intercepting Filter Pattern]");
		PrintUtil.ln("一、定义、本质:\r\n" + 
				"\r\n" + 
				"定义: 对应用程序的请求或响应做一些预处理/后处理。定义过滤器，并在把请求传给实际目标应用程序之前应用在请求上。\r\n" + 
				"过滤器可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序\r\n" + 
				"本质: 动态过滤请求\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"Filter：过滤器接口，定义在请求处理程序执行请求之前或之后，执行某些任务的统一接口\r\n" + 
				"\r\n" + 
				"ConcteteFilter：过滤器，实现过滤器接口，在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现\r\n" + 
				"\r\n" + 
				"FilterChain：过滤器链，带有多个过滤器，并在Target上按照定义的顺序执行这些过滤器\r\n" + 
				"\r\n" + 
				"Target：目标对象，是请求处理的具体程序\r\n" + 
				"\r\n" + 
				"FilterManager：过滤管理器，管理过滤器和过滤器链\r\n" + 
				"\r\n" + 
				"Client：客户端，是向Target对象发送请求的对象\r\n" + 
				"");
	}
}
