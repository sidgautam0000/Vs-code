import java.util.*;

public class hello{
    public static void main(String[] args ){
        Scanner sid=new Scanner(System.in);
        int n=sid.nextInt();
        int[] a=new int[n];
        int i,sum=0,j=0;
        for(i=0;i<n;i++){
            a[i]=sid.nextInt();
            sum=a[0];
        }
        for(i=0;i<n;i++){
            if(sum<a[i]){
                sum=a[i];
            }
        }
        for(i=0;i<n;i++){
            
            if(sum==a[i]){
                j+=1;
            }
        }
        System.out.println(j);
    }
}