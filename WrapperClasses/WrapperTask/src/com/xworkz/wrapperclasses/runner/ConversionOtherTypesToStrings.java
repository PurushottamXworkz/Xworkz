package com.xworkz.wrapperclasses.runner;

public class ConversionOtherTypesToStrings {
	public static void main(String[] args) {
		System.out.println("Conversion Other Types To Strings");
		short sh=12;
		String str1=Integer.valueOf(sh).toString();
		System.out.println("Short value :"+sh);
		System.out.println("String value :"+str1);
		System.out.println("---------------------------------");
		byte by=123;
		String str2=Byte.valueOf(by).toString();
		System.out.println("Byte value :"+by);
		System.out.println("String value :"+str2);
		System.out.println("---------------------------------");
		int i=321;
		String str3=Integer.valueOf(i).toString();
		System.out.println("Integer value :"+i);
		System.out.println("String value :"+str3);
		System.out.println("---------------------------------");
		float f=321.06f;
		String str4=Float.valueOf(f).toString();
		System.out.println("Float value :"+f);
		System.out.println("String value :"+str4);
		System.out.println("---------------------------------");
		double d=321.06775743d;
		String str5=Double.valueOf(d).toString();
		System.out.println("Double value :"+d);
		System.out.println("String value :"+str5);
		System.out.println("---------------------------------");
		boolean b=true;
		String str6=Boolean.valueOf(b).toString();
		System.out.println("Boolean value :"+b);
		System.out.println("String value :"+str6);
		System.out.println("---------------------------------");
		char c='r';
		String str7=Character.valueOf(c).toString();
		System.out.println("Character value :"+c);
		System.out.println("String value :"+str7);
		
		
		
	}
}
