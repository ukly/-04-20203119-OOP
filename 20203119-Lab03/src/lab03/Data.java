package lab03;

//An exploration of primitive data types.
class Data {
	//Declares and uses variables of various types.
	public static void main(String[] args) {

		int num1 = 40, num2 = 65, x = 99;
		float num3 = 18.53f;
		char letter = 'x';
		num1 = 777;
		
		System.out.println("The value of num1: " + num1);
		System.out.println("The value of num3: " + num3);
		System.out.println("The value of x: " + x);
		System.out.println("The letter x: " + letter);
		
		double num4 = num1;
		System.out.println("The value of num4: " + num4);
		
		Boolean flag = false;
		System.out.println("The value of flag: " + flag);
		
		final int FIXED = 2020;
		//FIXED = 3030 ;
		//num1 = flag;
		System.out.println("The value of FIXED: " + FIXED);
	
	} // method main
	
} // class Data