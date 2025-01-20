import java.util.Scanner;

class PowerOfTwo {

public static boolean getPowerOfN(int n){
	
	if (n * n % Math.pow(2, n) == n/n) {
	
	return true;
	} 
	
	else {
		
	return false;
	} 
}


public static void main(String[] args){

Scanner reader = new Scanner(System.in);
System.out.println("Enter an integer of n: ");
int n = reader.nextInt();


System.out.print(getPowerOfN(n));

	}
}
