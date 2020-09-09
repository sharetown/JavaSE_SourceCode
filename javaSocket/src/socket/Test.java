package socket;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author sharetown
 * @date 2020/8/25 14:34
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println(Math.pow(1,2));
//        System.out.println(reverseVowels("hello"));

        int[] nums1=new int[]{1,2,3,0,0,0};
        merge(nums1,3,new int[]{2,5,6},3);
        System.out.println(Arrays.toString(nums1));
    }
    public static String reverseVowels(String s) {
        char[] str=s.toCharArray();
        String set="aeiouAEIOU";
        int i=0;
        int j=s.length()-1;
        char temp=0;
        System.out.println(set.indexOf(String.valueOf(str[i]))==-1);
        while(i<j){
            if(set.indexOf(String.valueOf(str[i]))==-1){
                i++;
            }else if(set.indexOf(String.valueOf(str[i]))==-1){
                j--;
            }else{
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
                return new String(str);
            }
        }
        return null;
    }
    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static String m(String s){
        if (s == null) return null;
        int i = 0, j = s.length() - 1;
        char[] result = s.toCharArray();
        while (i <= j) {
            char ci = result[i];
            char cj = result[j];
            if (!vowels.contains(ci)) {
                i++;
            } else if (!vowels.contains(cj)) {
                j--;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }

    public static boolean validPalindrome(String s) {
        char[] str=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        int count=0;
        while(i<j){
            if(str[i++]!=str[j--]){
                return isHuiWen(s,i+1,j) || isHuiWen(s,i,j-1);
            }
        }
        return true;
    }

    public static boolean isHuiWen(String s,int i,int j){
        while(i<j){
            if (s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        int indexMerge = m + n - 1;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 < 0) {
                nums1[indexMerge--] = nums2[index2--];
            } else if (index2 < 0) {
                nums1[indexMerge--] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[indexMerge--] = nums1[index1--];
            } else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }




}
