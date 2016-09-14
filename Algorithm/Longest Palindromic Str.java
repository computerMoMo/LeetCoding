/**
 * Created by momo on 16-9-14.
 */
public class PalindromicSubstring {
    public String findsubstr(String s,int l,int r)
    {
        int len = s.length();
        while(l>=0 && r<=len-1 && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }

        return s.substring(l+1,r);
    }
    public String longestPalindrome(String s)
    {
        if(s.length() == 0)
            return "";
        int i =0;
        String longeststr;
        longeststr = findsubstr(s,0,0);
        String temp1,temp2;
        for(i=0;i<s.length()-1;i++)
        {
            temp1 = findsubstr(s,i,i);
            if(temp1.length() >= longeststr.length())
            {
                longeststr = temp1;
            }
            temp2 = findsubstr(s,i,i+1);
            if(temp2.length() >= longeststr.length())
            {
                longeststr = temp2;
            }
        }
        return longeststr;
    }
//    public static void main(String [] args)
//    {
//        PalindromicSubstring test = new PalindromicSubstring();
//        String re;
//        re = test.longestPalindrome("abba");
//        System.out.println(re);
//    }

}
