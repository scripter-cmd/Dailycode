import java.util.ArrayList;
import java.util.Arrays;

public class code2248 {
    public static void main(String[] args) {
        // int nums[][] = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        int nums[][] = {{1,2,3},{4,5,6}};
        ArrayList<Integer> ar=new ArrayList<>();
        System.out.println(nums.length);
        System.out.println(nums[0].length);
        int num[]=new int[10];
        System.out.println(Arrays.toString(num));
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                num[nums[i][j]]=num[nums[i][j]]+1;
            }
        }
        System.out.println(Arrays.toString(num));
        int max=num[0];
        for(int i=1;i<num.length;i++)
        {
            if(max<num[i])
            {
                max=num[i];
            }
        }
        System.out.println(max);
        if(max!=0&&max!=1)
        {
        for(int i=0;i<num.length;i++)
        {   if(max==num[i])
                ar.add(i);
        }
        }
        
        System.out.println(ar);
        
    }
}
