import java.util.Arrays;

public class code283 {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        int inc=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            
            for(int j=nums.length-1;j>0;j--)
            {
                if(nums[j]==0&&j+1<nums.length)
                {
                
                    int temp=nums[i];
                    nums[i]=nums[j+1];
                    nums[j+1]=temp;
                
                }
            }
            
        }
        System.out.println(Arrays.toString(nums));
    }
}
