import java.util.*;

//prompt user for a singly linked stack of nums.

public class findMax{

/*private findMax<T>fm=new findMax<>();

public findMax();

public int size(){return fm.size();}
public boolean isEmpty(){return fm.isEmpty();}
public T top(){return fm.first();}
public void push(T e){fm.addFirst(e);}
public T pull(){return fm.removeFirst();}
public String toString(){return fm.String;}*/
    
private static final int c=1000;int[]a=new int[c];int t=-1;
int[]m=new int[c];int[]n=new int[c];

public static Stack<Integer>min=new Stack<>();
public static Stack<Integer>max=new Stack<>();
//public findMax(){min=new Stack<Integer>();max=new Stack<Integer>();}

public int min(){
    if(min.isEmpty()){return Integer.MAX_VALUE;}
    else{return min.peek();}}
public int max(){
    if(max.isEmpty()){return Integer.MIN_VALUE;}
    else{return max.peek();}}

public void push(int p){
    if(t<c-1){t++;a[t]=p;}
    else{System.out.println("Stack Overflow");}
    if(p<=min()){min.push(p);}if(p>=max()){max.push(p);}}

//public int pop(){int tmp=(int)min.getFirst();min.removeFirst();return tmp;}
    
public void pull(){
    if(t>0){t--;}else{System.out.println("Stack Underflow");}}

public void print(){
    if(t>=0){System.out.println("Elements in the stack :");
    for(int i=0;i<=t;i++){System.out.println(a[i]);}}}

public static void main(String[]args){
    
    Stack<Integer>s=new Stack();Scanner scan=new Scanner(System.in);
    
    System.out.println("enter an int for the size of the que.");
    int n=scan.nextInt();int e=0;
    
    System.out.println("now enter the values of the que,");
    while(n-->0){int[]c=new int[scan.nextInt()];
    if(c[n]==1){int[]x=new int[scan.nextInt()];if(s.isEmpty()){s.push(x[n]);}
    else{int y=s.peek();s.push(Math.max(x[n],y));}}
    
    if(c[n]==2){if(!s.isEmpty()){s.pop();}
    if(c[n]==3){System.out.println(s.peek());}}}} }
             

//https://stackoverflow.com/questions/7134129/stack-with-find-min-find-max-more-efficient-than-on
//https://codereview.stackexchange.com/questions/157233/finding-the-maximum-element-of-a-stack
//https://coderanch.com/t/591069/java/Find-max-element-Stack
   

