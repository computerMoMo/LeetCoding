public class Median
{
//    public static void main(String [] args)
//    {
//
//    }
 public double findMedianSortedArrays(int[] nums1, int[] nums2)
 {
     int n = nums1.length+ nums2.length;
     int mid = n/2;
     int [] temp = new int[mid+1];
     int i,j,k;
     for(i=0,j=0,k=0;i<nums1.length && j<nums2.length && k<temp.length;)
     {
         if(nums1[i] <= nums2[j])
         {
             temp[k] = nums1[i];
             i++;
         }
         else
         {
             temp[k] = nums2[j];
             j++;
         }
         k++;
     }
     double result;
     if(i == nums1.length)
     {
         while(k<temp.length && j<nums2.length)
         {
             temp[k] = nums2[j];
             k++;
             j++;
         }
     }
     if(j == nums2.length)
     {
         while(k<temp.length && i<nums1.length)
         {
             temp[k] = nums1[i];
             k++;
             i++;
         }
     }

     if(n%2 == 0)
     {
         result = (temp[mid]+temp[mid-1])/2.0;
     }
     else
     {
         result = temp[mid];
     }

     return result;

 }
}
