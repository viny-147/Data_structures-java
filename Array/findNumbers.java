public class findNumbers
{
	public static void main(String[] args) {
	    int count=0;
		int[] nums = new int[]{12,345,2,6,7896};
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            String str = Integer.toString(num);
            if(str.length()%2==0){
                count++;
            }
        }
        System.out.println(count);
	}
}