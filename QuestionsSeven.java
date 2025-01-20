import java.util.Scanner;

class QuestionsSeven {

public static int isPrime(int prime) {

int total = 0;

for(int count = 0; count < prime; count++){
	if (count % 3 == 0){
		
	total++;
   }
  }
	return total;
}

public static void main(String[] args){


Scanner reader = new Scanner(System.in);

System.out.print("Enter number for to get the prime: ");
int prime = reader.nextInt();

System.out.print(isPrime(prime));
	}
}