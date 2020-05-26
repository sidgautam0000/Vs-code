#include <stdio.h>
#include<math.h>
#include<conio.h>
int main(){
   int i,j,k,m,n,r,p,t=0,s;
   scanf("%d %d %f",&i,&j,&k);
   for(m=i;m<=j;m++)
   {
       r=0;
       p=m;
       while(m!=0)
       {
           r=r*10;
           r=r+m%10;
           m=m/10;
       }
       s=(p-r)/k;
       if(s<0)
       {s=-s;}
       if(k%s==0)
       {
           t=t+1;
       }    
   }
   printf("%d",t);
    



}