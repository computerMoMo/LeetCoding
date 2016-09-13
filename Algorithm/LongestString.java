/**
 * Created by momo on 16-9-10.
 */
public class LongestString {
    public  int lengthOfLongestSubstring(String s)
    {
        int maxlen = 1;
        char [] res;
        res = s.toCharArray();
        int s_length = s.length();
        if(s_length == 0)
            return 0;
        int a = 0;
        int b = 0;
        int len = 1;
        for(b=1;b<s_length;)
        {
            if(judege(res,a,b))
            {
                //a++;
                b++;
                len++;
            }
            else
            {
                if(maxlen < len)
                    maxlen = len;
                a++;
                b=a+1;
                len = 1;
            }
        }

        return len > maxlen ?len:maxlen;
    }
     public boolean judege (char[] str,int a,int b)
     {
         boolean flag = true;
         int i;
         for(i=a;i<b;i++)
         {
             if(str[i] == str[b])
             {
                 flag = false;
                 break;
             }
         }
         return flag;
     }
}
