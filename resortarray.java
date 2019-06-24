import java.util.*;

public class resortarray{
public static void main(String[]args){

//Accepts a sorted array with n>10 its as arg. 5 points.
//Replaces any 3 integers in arg with random integers. 5 points.
//Sorts the new array in ascending order and returns resorted array. 20 points.

// src examples did not include random class.


Random rand=new Random();int x=rand.nextInt(10);

int[]n=new int[]{2,3,5,6,14,15,15,16,17,18,21,25,27,31,35,36,40,41,45,49};
System.out.println("before"+n);
 
int random=n[rand.nextInt(3)];
System.out.println("during"+n);

int h=1;while(h<=n.length/3){h=3*h+1;}
while(h>0){for(int i=0;i<n.length;i++){
int temp=n[i];int j;

for(j=i;j>h-1&&n[j-h]>=temp;j=j-h){n[j]=n[j-h];}
n[j]=temp;}h=(h-1)/3;}

System.out.print("after"+n);

//keeps printing  [I@6d06d69c and I cant find why.

}}