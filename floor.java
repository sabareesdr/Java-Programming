package sdr;
import java.util.*;

public class floor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {1, 4, 6, 8, 9};
	        
	        for (int i = 0; i <= 10; i++) {
	            int ceil = 0;
	            int floor = 0;
	            
	            for (int j = 0; j < nums.length; j++) {
	                if (nums[j] == i) {
	                    ceil = floor = nums[j];
	                    break;
	                } else if (nums[j] < i) {
	                    floor = nums[j];
	                } else {
	                    ceil = nums[j];
	                    break;
	                }
	            }
	            
	            System.out.println("Number " + i + " -> ceil is " + ceil + ", floor is " + floor);
	        }
	}

}
