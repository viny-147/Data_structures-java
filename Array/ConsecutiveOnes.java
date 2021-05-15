import java.io.*;
public class ConsecutiveOnes
{
	public static void main(String[] args) {
	    int[] nums=new int[] {1,1,0,1,1,1};
		int maxvalue=0, count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxvalue=Math.max(maxvalue,count);
            }
            else
                count=0;
        }
        System.out.println(maxvalue);
	}
}