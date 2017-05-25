package com.connext.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.connext.util.TestBean;
//静态导入
import static com.connext.util.TestBean.getStr;

public class Test2 {

	/**
	 * Collection<? extends BaseClass>作为参数再试一次
	 * @param c
	 */
	public static void printCollection(Collection<?> c) { 

	    //如此遍历Collection的简洁方式也是JDK1.5新引入的 

	       for (Object o : c) { 

	              System.out.println(o); 
	    } 

	} 
	
	/**
	 * 把任何对象的数组，变成这个对象的List
	 * @param a
	 * @param c
	 */
	public static <T> void fromArrayToCollection(T[] a, Collection<T> c) { 

	       for (T o : a) { 

	           c.add(o); //合法。注意与Collection<?>的区别 

	    } 

	} 
	
	/**
	 * 泛型测试
	 */
	public void test1(){

		System.out.println(".........Test2 : test1");
		List<String> list = new ArrayList<String>();
		list.add("fuck");
		list.add("you");
		
		String str = list.get(0);
		
		System.out.println(list.get(0)+":"+list.get(1));
		
		Map<String,TestBean> tbM  = new HashMap<String,TestBean>();
		
		TestBean tb  = new TestBean();
		tb.setStrA("first One");
		tbM.put("1", tb);
		tb.setStrA("Second Two");
		tbM.put("2", tb);

		String name ;
		for(Iterator i = tbM.keySet().iterator(); i.hasNext();){
			name  = (String) i.next();
			tb = tbM.get(name);
			System.out.println(name+":"+tb.getStrA());
		}
		
		
		this.printCollection(list);
		
	}
	
	
	
	/**fdf
	 * foreach
	 * 操作对象可以使数组 list map set
	 */
	public void test2(){
		System.out.println(".........Test2 : test2");
		List<String> list = new ArrayList<String>();
		list.add("fuck");
		list.add("you");
		list.add("every");
		list.add("day");
		list.add("100");
		list.add("times");
		
		for(String str : list){
			System.out.println(str);
		}
		

		Map<String,TestBean> tbM  = new HashMap<String,TestBean>();
		
		TestBean[] tbArray = new TestBean[10];
		
		TestBean tb  = new TestBean();
		tb.setStrA("first One");
		tbM.put("1", tb);
		tbArray[0] = tb;
		
		//给Map里加新的对象必须新建一个，否则都会指向最后一个，因为对象的变量只有一个指向，除非new
		tb  = new TestBean();
		tb.setStrA("Second Two");
		tbM.put("2", tb);
		tbArray[1] = tb;

		String name ;
		
		
		for(TestBean tb2 : tbArray){
			//只能取出2个，而且都是后放进去的那个，再取就空指针了
			if(tb2!=null){
				System.out.println(tb2.getStrA());
			}
			
		}
		
		int[] a = {1,2,3,4,5};
		for(int b : a)
		{
		   System.out.println(b);
		}
		

		
	}
	
	/**
	 * Autoboxing
	 */
	public void test3(){
		System.out.println(".........Test2 : test3");
		Integer i = new Integer(98);
		
		System.out.println(102+i);
	}
	
	/**
	 * 枚举
	 */
	public void test4(){
		System.out.println(".........Test2 : test4");
		
		System.out.println(Season.winter);
		
		System.out.println(Coin.quarter.value());
		
		Season s = Season.winter;
		switch(s)
		{ 
		case spring:
		System.out.println("春天");
		break;
		case summer:
		System.out.println("夏天");
		break;
		case fall:
		System.out.println("秋天");
		break;
		case winter:
		System.out.println("冬天");
		break;
		}
	}
	
	/**
	 * 静态导入
	 */
	public void test5(){
		System.out.println(".........Test2 : test5");
		
		
		System.out.println(getStr());
	}
}

enum Season { winter, spring, summer, fall }

enum Coin { 

	penny(1), nickel(5), dime(10), quarter(25); 

	Coin(int value) { this.value = value; } 

	private final int value; 

	public int value() { return value; } 
} 
