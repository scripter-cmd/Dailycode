public class code766 {

    public static void main(String[] args) {
        // int matrix[][] = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int matrix[][]={{1,2},{2,2}};
        int ind1=(matrix.length-2);
        int ind2=0;
        // System.out.println(ind1);
        int same=-1;
        boolean ans=true;
        an:
        for(int i=0;i<=matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(ind1!=matrix.length &&ind2!=matrix[0].length)
                {
                    // System.out.println(matrix[ind1][ind2]);
                    if(same==-1)
                    {
                        same=matrix[ind1][ind2];
                    }
                    else
                    {
                        if(same!=matrix[ind1][ind2])
                        {
                            ans=false;
                            break an;
                        }
                    }
                    ind1++;
                    ind2++;
                }
            }
            same=-1;
            // System.out.println(ind1+" "+ind2);
            if(ind1<=matrix.length&&ind2<=matrix[0].length)
            {
                ind1=0;
                ind2=i;
                // System.out.println(i +" "+ind1+" "+ind2+" ");
            }
            else
            {
                ind1=(matrix.length-2)-1;
                ind2=0;
                if(ind1==0)
                {
                    ind1=0;
                    ind2=0;
                }
            }
            //  System.out.println(ind1+" "+ind2);
        }
        System.out.println(ans);

    }
}