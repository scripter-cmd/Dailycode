import java.util.Arrays;

public class code66 {

    public static void main(String[] args) {
        int digits[] = {4,3,2,2};
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                break;
            }
            digits[i]=0;
        }
        int a[]=new int[digits.length+1];
        a[0]=1;
        System.out.println(Arrays.toString(a));

    }
}