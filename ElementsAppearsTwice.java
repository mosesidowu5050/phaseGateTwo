
class ElementsAppearsTwice {

public static int getStringLength(int[] nums){
int temp = 0;

for (int c = 0; c < nums.length; c++){
	if (nums[c] == nums[c]){
		temp = nums[c];
	nums[c] = nums[c];
		temp = nums[c];
}
}
	return temp;
}


public static void main(String[] args){

int[] nums = {2, 2, 1};

System.out.print(getStringLength(nums));

	}
}