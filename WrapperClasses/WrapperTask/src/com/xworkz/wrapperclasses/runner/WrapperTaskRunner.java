package com.xworkz.wrapperclasses.runner;

public class WrapperTaskRunner {
		public static void main(String[] args) {
			System.out.println("-------------Autoboxing----------------");
			short s=2;
			Short sh=new Short(s);
			System.out.println("Short class sh :"+sh);
			System.out.println("short value s :"+s);
			
					
			byte a=10;
			Byte value=new Byte(a);
			System.out.println("Value :"+value);
			System.out.println("a :"+a);
			
			float f=42.4f;
			Float flo=new Float(f);
			System.out.println("Float class value :"+flo);
			System.out.println("Float value "+f);
			
			int i=40;
			Integer integer=new Integer(i);
			System.out.println("Integer class value:"+integer);
			System.out.println("Int value :"+i);
			
			double d=40.976;
			Double dou=new Double(d);
			System.out.println("Double class value :"+dou);
			System.out.println("double value:"+d);
			
			long l=5345897654623l;
			Long lo=new Long(l);
			System.out.println("Long class value :"+lo);
			System.out.println("long value :"+l);
			
			
			char c='c';
			Character ch=new Character(c);
			System.out.println("Character class value:"+ch);
			System.out.println("Character value : "+c);
			
			System.out.println("--------------Unboxing-----------------");
			
			Integer integer1=new Integer(40);
			int i1=integer1;
			System.out.println("Integer class value:"+integer1);
			System.out.println("Int value :"+i1);
			
			
			
			Character ch1=new Character('C');
			char c1=ch1;
			System.out.println("Character class value:"+ch1);
			System.out.println("Character value : "+c1);
			
			
			
			Long lo1=new Long(5345897654623l);
			long l1=lo1;
			System.out.println("Long class value :"+lo1);
			System.out.println("long value :"+l1);
			
			
			Byte value1=new Byte((byte) 10);
			byte a1=value1;
			System.out.println("Value :"+value1);
			System.out.println("a :"+a1);
			
		}
}
