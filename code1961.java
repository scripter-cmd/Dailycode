public class code1961 {

    public static void main(String[] args) {
        String s = "iloveleetcode"; String words[] = {"apples","i","love","leetcode"};
        String con="";
        boolean ans=false;
        for(String ar:words)
        {
            if(con.equals(""))
            {
                con=ar;
            }
            else
            {
                if(s.contains(con))
                {
                    con=con+ar;
                }
            }
            if(s.equals(con))
            {
                ans=true;
                break;
            }
        }
        System.out.println(ans);

        System.out.println(con);

    }
}
