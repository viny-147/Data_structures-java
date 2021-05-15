public class duplicateZeros
{
	public static void main(String[] args) {
	    int[] arr = new int[]{1,0,2,3,0,4,5,0};
        int duplicate = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=arr.length-1;j>i;j--)
                {
		            arr[j]=arr[j-1];
		        }
                i++;
            }
        }
		for(int result = 0; result< arr.length;result++){
			System.out.println(arr[result]);
		}
	}
}
