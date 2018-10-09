import java.util.Scanner;

public class HelloWorld {

public static void main(String[] args) {
	
	System.out.println("Hello World!");
	
	//single line comment
	
	/* this
	 * is
	 * a
	 * block/multi-line
	 * comment
	 */
	
	System.out.println("Hello");
	System.out.print("world\n");
	
	//this is a scanner object
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter your age:");
	int userAge = scan.nextInt();
	System.out.println(userAge);
	
	//garbage line to clean out my scanner -->important for switching from numeric to scan.nextLine().
	scan.nextLine();
	
	System.out.println("Please enter your first and last name:");
	String userName = scan.nextLine();
	System.out.println(userName);
	
	// primitive data types
	byte b = 127; //max size for byte is 127, otherwise type mismatch error
	short s = 128; //larger than a byte maxes out at 32,767
	int i = 133333; 
	long l = 4564564565653L; //remember to always add "L" at the end of the value of a long variable to indicate that you intend to occupy that much space
	float f = 56.7F;  //remember to always add "f" at the end or cast written (float) in front of the value to advise compiler that this is a floating point number
	double d = 56.7; 
	char c = '@';
	boolean bool = true;
	
	// this is a constant and cannot change
	final String TEST = "hello";
	
	s++; // post-increment
	s--; // 
	
	++s; // pre-increment
	
	String words = "This is a sentence.";
	words += " and i added some words"; // could also do words = words + " new string info here"
	System.out.println(words);
	
	int nums = 5;
	nums += 12;
	System.out.println(nums); //same as: nums = nums + 12;
	
	//implicit casting example
	//java does this automatically
	int age = 31;
	double myAge = age;
	System.out.println(myAge);
	
	//explicit casting example
	//when going from  more precise to less precise data type...aka narrowing conversion
	double shopTotal = 158.67;
	int myTotal = (int) shopTotal; //drops anything past decimal point... does not round
	System.out.println(myTotal);
	
	//should close scanner at VERY END of program
	scan.close();
}

	}


