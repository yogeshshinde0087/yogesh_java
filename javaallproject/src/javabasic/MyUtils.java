package javabasic;

public class MyUtils {
	
	public static String printsomejurk(String argument) {
 //   	System.out.println("I am busy "+ argument);
		return argument;
    	
    }
    
    public static void printsomejurk(int argument) {
    	System.out.println("Integer:" +argument);
    }
 
    public static void sum2numbers(int firstArg, int SecondArg) {
        System.out.println("Sum method" + (firstArg+SecondArg));
    }
    
    public int add10(int SomeArgu) {
    	int result= SomeArgu+10;
    return result;
    }
}
