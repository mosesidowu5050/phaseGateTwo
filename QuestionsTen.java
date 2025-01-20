class QuestionsTen {

public static int isEvenAndOdd(int[] numbers) {

int evenNumbers = 0;
int oddNumbers = 0;

for (int count = 0; count < numbers.length; count++){
	for (int counter = 0; counter < numbers[c].length-1; counter++){
	if(numbers[count][counter] % 2 == 0){
		numbers[count][counter] = 1;
		evenNumbers = numbers[count][counter+1];
	}
	
	if (numbers[count+1][counter] % 2 != 0){
		numbers[count][counter] = 0;
		oddNumbers =  numbers[count][counter+1];
	     } 
	   }
     }
	return evenNumbers, oddNumbers;
  }
}



public static void main(String[] args){


int[] numbers = {1, 2, 3, 4, 5};

System.out.print(isEvenAndOdd(numbers));
	}
}