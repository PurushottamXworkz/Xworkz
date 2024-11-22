class Notes{
	public static void main(String args[]){
	String subject="Self Help";
	String topics="Reshape";
	String colorUsed="Yellow";

	String headline=new String("How to Train");
	System.out.println("----------Length --------------------");
	System.out.println("Length of Headline :"+headline.length());
	System.out.println("Length of Subject :"+subject.length());
	System.out.println("Length of Topics :"+topics.length());
	System.out.println("Length of Color Used :"+colorUsed.length());

	System.out.println("----------Concat--------------------");
	System.out.println(headline.concat(" "+subject));
	System.out.println(topics.concat(" "+colorUsed));

	System.out.println("----------starts With--------------------");
	System.out.println(headline.startsWith("how"));
	System.out.println(subject.startsWith("Self"));
	System.out.println(topics.startsWith("Res"));
	System.out.println(colorUsed.startsWith("Blue"));

	System.out.println("--------------ends With--------------------");
	System.out.println(headline.endsWith("Train"));
	System.out.println(subject.endsWith("Help"));
	System.out.println(topics.endsWith("Res"));
	System.out.println(colorUsed.endsWith("Blue"));

	System.out.println("--------------is Empty--------------------");
	System.out.println(headline.isEmpty());
	System.out.println(subject.isEmpty());
	System.out.println(topics.isEmpty());
	System.out.println(colorUsed.isEmpty());

	System.out.println("--------------To Uppercase--------------------");
	System.out.println(headline.toUpperCase());
	System.out.println(subject.toUpperCase());
	System.out.println(topics.toUpperCase());
	System.out.println(colorUsed.toUpperCase());

	System.out.println("--------------To Lowercase--------------------");
	System.out.println(headline.toLowerCase());
	System.out.println(subject.toLowerCase());
	System.out.println(topics.toLowerCase());
	System.out.println(colorUsed.toLowerCase());

	System.out.println("--------------Equals--------------------");
	System.out.println(headline.equals(subject));
	System.out.println(subject.equals(headline));
	System.out.println(topics.equals(colorUsed));
	System.out.println(colorUsed.equals(topics));


	System.out.println("--------------CharAt--------------------");
	char value1=headline.charAt(4);
	System.out.println(value1);
	char value2=subject.charAt(0);
	System.out.println(value2);
	char value3=topics.charAt(5);
	System.out.println(value3);
	char value4=colorUsed.charAt(2);
	System.out.println(value4);


	System.out.println("--------------indexof--------------------");
	
	System.out.println(headline.indexOf('t'));
	System.out.println(subject.indexOf('H'));
	System.out.println(topics.indexOf('e'));
	System.out.println(colorUsed.indexOf('w'));

	System.out.println("--------------Compare to--------------------");
	System.out.println(headline.compareTo(subject));
	System.out.println(subject.compareTo(subject));
	System.out.println(topics.compareTo(subject));
	System.out.println(colorUsed.compareTo(colorUsed));

	System.out.println("--------------Trim--------------------");
	String myStr = "       Hello World!       ";
	System.out.println(myStr);
	System.out.println(myStr.trim());

	System.out.println("--------------Replace--------------------");
	String myStr1 = "Hello";
	System.out.println(myStr1.replace('l', 'p'));

	System.out.println("--------------Contains--------------------");
	System.out.println(myStr1.contains("yellow"));
	}
}