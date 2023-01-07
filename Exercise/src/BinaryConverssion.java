public class BinaryConverssion {
    public static void main(String[] args) {
        int[] arr={0,1,0,0,0,1,0,0};
        int num=Solution.toogle(arr.length,arr);
        System.out.println("The maximum number of 1's in the arr is: "+num);
    }
}

class Solution {
    public static int toogle(int n, int[] arr) {
        int[] arr1=arr;
        int num=0;
        int st=0,en=0;
        int count =0,countValue=0;
        for(int i=0;i<n;i++) {
            if(arr[i]==0) {
                count++;
            }
            if(count>countValue) {
                countValue=count;
            }
            if(count>=countValue) {
                if(arr[i]==0) {
                    st = i-countValue+1;
                    en = i;
                }else {
                    st = i - countValue;
                    en = i-1;
                }
            }
            if(arr[i]==1) {
                count=0;
            }
        }
        for(int i=0;i<n;i++) {
            if(i>=st && i<=en) {
                arr[i]=1;
            }
        }
        for(int i=0;i<n;i++) {
            if(arr[i]==1) {
                num++;
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
        return num;
    }
}
