import java.util.ArrayList;
import java.util.List;

public class code2942 {
    public static void main(String[] args) {
       String words[] = {"leet","code"};
       char x = 'e';
       List<Integer> li=new ArrayList();
       for(int i=0;i<words.length;i++)
       {
            if(words[i].contains(""+x))
            {
                li.add(i);
            }
       }
       System.out.println(li);
    }
}
