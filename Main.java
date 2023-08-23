import java.util.Arrays;

public class Main{

public static void main(String[] args) {
    // System.out.println("bisex");
    int[] arr = {3,4,5,9};
    int m =3;
    int ans =0;
    Arrays.sort(arr);
    int hi = arr[arr.length-1];
    int[] arr2 = new int[hi];
    int l =1, h = hi;
    while(l<=h){
        int mid = (l+h)/2;
        int c =0;
        for(int i =0;i<arr.length;i++){
             c += arr[i]/mid;
        }
         if(c>=m){ 
             ans=Math.max(mid,ans);
                l = mid+1;
         }
        else h = mid-1;
        
    }
   System.out.println(ans);
}
}