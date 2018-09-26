package jp.co.internous.action;

public class Test {

	public static void main(String[] args){
		Person taro = new Person();
		taro.name="山田太郎";
		taro.talk();
		taro.age=20;
		taro.phonenumber="09011111111";
		taro.address="東京都杉並区";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phonenumber);
		System.out.println(taro.address);
		
		
		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phonenumber="080111111112";
	    jiro.address="東京都港区";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phonenumber);
		System.out.println(jiro.address);
		jiro.walk();
		
		Person hanako =new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phonenumber="07000000000";
		hanako.address="千葉県市川市";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phonenumber);
		System.out.println(hanako.address);
		
		
		Person keisuke = new Person();
		keisuke.name="澁澤恵祐";
		keisuke.age=25;
		keisuke.phonenumber="08022222222";
	    keisuke.address="千葉県船橋市";
		System.out.println(keisuke.name);
		System.out.println(keisuke.age);
		System.out.println(keisuke.phonenumber);
		System.out.println(keisuke.address);
		
		Robot aibo= new Robot();
		aibo.name="aibo";
	    aibo.talk();
	    aibo.walk();
	    aibo.run();
	    
	    Robot asimo= new Robot();
	    asimo.name="asimo";
	    asimo.talk();
	    asimo.walk();
	    asimo.run();
	    
	    Robot pepper = new Robot();
	    pepper.name="pepper";
	    pepper.talk();
	    pepper.walk();
	    pepper.run();
	    
	    Robot doraemon = new Robot();
	    doraemon.name="doraemon";
	    doraemon.talk();
	    doraemon.walk();
	    doraemon.run();
	    
	}
}
