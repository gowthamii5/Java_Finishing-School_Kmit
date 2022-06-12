/*Given an array and k , find largest sum of subsequence of nums of length k from array

Return any such subsequence as an integer array of length k.

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

 
input =4
2 1 3 3 
2
output =3 3
The subsequence has the largest sum of 3 + 3 = 6.

input =4
-1 -2 3 4
3
output =-1 3 4
The subsequence has the largest sum of -1 + 3 + 4 = 6.

input =4
3 4 3 3
2
output =3 4
The subsequence has the largest sum of 3 + 4 = 7. 
Another possible subsequence is 4 3.

*/
import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        subsum(n,a,t);
    }
    public static void subsum(int n,int a[],int t){
        List<Integer> l=new ArrayList<>();
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=a[i];
        }
        Arrays.sort(a);
        int sum=0;
        for(int i=n-1;i>=n-t;i--){
            l.add(a[i]);
        }
        Collections.sort(l);
        for(int i=0;i<n;i++){
            if(l.contains(b[i])){
            System.out.println(b[i]);
            l.remove(l.indexOf(b[i]));
            }
        }
    }
}
