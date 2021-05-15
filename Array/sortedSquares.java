import java.util.Arrays;
public class sortedSquares
{
	public static void main(String[] args) {
	    int[] nums=new int[] {-4,-1,0,3,10};
		int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
             result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
		for(int j=0;j<result.length;j++){
				System.out.println(result[j]);
		}
        
	}
}
