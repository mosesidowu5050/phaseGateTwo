
class ArrayDescendingOder {

public static int getDescendingOrder(int[] nums){

int receiver = 0;

for (int count = 0; count < nums.length-1; count++){
		if (nums[count] < nums[count+1]){
			receiver = nums[count];
			nums[count+1] = nums[count];
			nums[count] = nums[count+1];
			nums[count] = receiver;
		}
	}
	
		return receiver;
}

public static void main(String[] args){

int[] nums = {1, 4, 6, 2, 5};

System.out.print("\nBefore descending..");
for (int num : nums){
	System.out.print(num + " ");
}
for (int 

	}
}