public class Solution {
        
	//check is the number is even number
	public boolean isEven(int number) {
		boolean result = true;
		if (number % 2 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	
	//check if the number can be divided by three
	public boolean isDivisiblebyThree(int number) {
		boolean result = true;
		if (number % 3 == 0) {
			return result;
		} else {
			return false;
		}
	}
        //Read an array of integers and print out the result based on the conditions. 
	public void detectNumber(int[] a) {
		int l = a.length;
		for (int i = 0; i < l; i++) {
			String result = "";
			int c = a[i];
			//case 0: c is 0
			if(c == 0){	
				result = Integer.toString(0);
			}
			
			// case 1: c is even number
			else if (isEven(c)) {
				// case 1.1
				if (isDivisiblebyThree(c)) {
					result = "eventhree";
				} else {
					result = Integer.toString(c);
				}

			// case 2: c is odd number
			} else {
				//case 2.1
				if (isDivisiblebyThree(c)) {
					result = "three";
				} else {
					result = "odd";
				}
			}
			System.out.println(result);

		}
	}
}

