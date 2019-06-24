import java.util.*;import java.io.*;

//make 2 lists of nums, merge the list, sort the nums.

public class mergeLinkedList{
    
    public static int[]merge(int[]ac,int[]bd){
    int[]newList=new int[ac.length+bd.length];
    for(int i=0;i<ac.length;i++){newList[i]=ac[i];}
    sort(newList);return newList;}

public static void sort(int[]list){
    for(int i=0;i<list.length-1;i++){int m=list[i];int mIndex=i;
    for(int j=i+1;j<list.length;j++){if(list[j]<m){m=list[j];mIndex=j;}}
    if(mIndex!=i){list[mIndex]=list[i];list[i]=m;}}}

public static void main(String[]args)throws IOException{
Scanner scan=new Scanner(System.in);int i=0;

System.out.println("Enter list 1: ");
int[]ac=new int[scan.nextInt()];for(i=0;i<ac.length;i++){ac[i]=scan.nextInt();}

System.out.println("Enter list 2: ");
int[]bd=new int[scan.nextInt()];for(i=0;i<bd.length;i++){bd[i]=scan.nextInt();}

int[]newList=merge(ac,bd);System.out.println("The merged list: ");
for(int e:newList){System.out.println(" "+e);}System.out.println();}}

//http://ecomputernotes.com/java/array/singly-linked-list
//http://tutorials.jenkov.com/java-collections/sorting.html
//https://knowm.org/convert-an-array-into-a-linkedlist-in-java/
//https://github.com/jsquared21/Intro-to-Java-Programming/blob/master
//https://stackoverflow.com/questions/189559/how-do-i-join-two-lists-in-java


/*int e=30;List a=new List(e);List b=new List(e);List c=new List(e);

System.out.println("Enter 10 nums for list a");e=scan.nextInt();
System.out.println("Enter 10 nums for list b");e=scan.nextInt();

System.out.print(a);System.out.print(b);}}*/

