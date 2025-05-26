import java.util.Arrays;

public class code1941 {
    public static void main(String[] args) {
        String s = "vvvvvvvvvvvvvvvvvvv";
        int num[]=new int[123];
        for(int i=0;i<s.length();i++)
        {
            num[(int)s.charAt(i)]+=1;
        }
        System.out.println(Arrays.toString(num));
        int same=-1;
        boolean key=true;
        for(int i=98;i<123;i++)
        {
           
                if(num[i]!=0)
                {
                    if (same == -1) {
                        same = num[i]; 
                    }
                    else if(same!=num[i])
                    {
                         key=false;
                         break;
                    }
                   
                }
                
        }
        System.out.println(key);
    }
}
