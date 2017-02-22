package practice;

public class Primary {

	
	 public static void main(String[] args) {
		 
			int x = -1;
			
			//Ternary example in Java
			System.out.println( x > 0 ? "True" : "False");
			

			//Foreach loop in Java
			String[] fruits = new String[] { "Orange", "Apple", "Pear", "Strawberry" };
			for (String fruit : fruits) {
				System.out.println(fruit);
			}
			
			
			//iterator
			//array of unknown size
	
			Fibonacci.fib(0, 1);
			
			FizzBuzz.fizzbuzz();
	    }


	 

		 
		 
	 
}//end class Primary
