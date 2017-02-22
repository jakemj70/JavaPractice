package practice;

public class Fibonacci {

	 //Write a Java program to print Fibonacci series upto 100?
	 public static int fib(int a, int b){

		 if (b > 100){
			return b;
		 }else{
			System.out.println(b);
			fib(b, a + b);
		 }
	
		 return 0;
	 }
	 
}//end class Fibonacci
