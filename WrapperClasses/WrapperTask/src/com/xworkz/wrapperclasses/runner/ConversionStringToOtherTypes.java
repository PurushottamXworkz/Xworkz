package com.xworkz.wrapperclasses.runner;

public class ConversionStringToOtherTypes {
	public static void main(String[] args) {
		String sentence="123";
		int i=Integer.parseInt(sentence);
		System.out.println("Sentence value :"+sentence);
		System.out.println("Integer value :"+i);
		System.out.println("--------------------");
		float f=Float.parseFloat(sentence);
		System.out.println("Senetence value :"+sentence);
		System.out.println("Float value :"+f);
		System.out.println("--------------------");
		byte b=Byte.parseByte(sentence);
		System.out.println("Sentence value :"+sentence);
		System.out.println("Byte value :"+b);
		System.out.println("--------------------");
		short s=Short.parseShort(sentence);
		System.out.println("Sentence value :"+sentence);
		System.err.println("short value :"+s);
		System.out.println("--------------------");
		long l=Long.parseLong(sentence);
		System.out.println("Sentence value:"+sentence);
		System.out.println("Long value :"+l);
		System.out.println("--------------------");
		boolean b1=Boolean.parseBoolean(sentence);
		System.out.println("Sentence value :"+sentence);
		System.out.println("Boolean value :"+b1);
		System.out.println("--------------------");
		
		String sent="Ravi";
		char ch=sent.charAt(0);
		System.out.println("Sentece value :"+sent);
		System.out.println("Character value :"+ch);
	}
}
