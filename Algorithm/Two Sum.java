mport java.io.*;
public class twosum
{
    public int [] twosums(int [] nums,int target)
    {
        int i,j;
        int [] index = new int [2];
        boolean judge = false;
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    index[0]=i;
                    index[1]=j;
                    judge = true;
                    break;
                }
            }
            if(judge)
                break;
        }
        return index;
    }
    public static void main(String args[]) throws IOException
    {
        /*int c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do
        {
            c = (int)br.read()-48;
            System.out.println(c);

        }while (true);*/
        int [] testnum = {2, 7, 11, 15};
        int target = 9;
        int [] index = new int [2];
       // index = new twosum.twosums(testnum,target);
        System.out.println(index[0]);
        System.out.println(index[1]);


    }
    /*public static void main(String[] args) {
        System.out.println("Hello, World!");
    }*/

}
