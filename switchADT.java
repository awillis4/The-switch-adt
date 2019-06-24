import java.util.*;import java.io.*;import java.lang.*; 
import java.util.stream.StreamSupport;

//converts the array data structures into the abstract data types list stack que
//heap map hash tree graph and back again
public class switchADT{switchADT(){}
public static Scanner scan=new Scanner(System.in);

public static int y=0;public static int j=0;
public static int[][]n=new int[scan.nextInt()][scan.nextInt()];

public void string(){Arrays.toString(n);String[]any="n".split("");}

public void list(){ArrayList[][]n=new ArrayList[y][j];n[0][0]=new ArrayList();
List<String>list=new ArrayList<String>();Integer[]a=new Integer[list.size()];
for(int c=0;c<list.size();c++){a[c]=Integer.valueOf(list.get(c));}
for(Integer myInt:a){System.out.print(myInt);}}

public void stack(){int i=0;int o=0;int[]a=new int[i*o];
for(i=0;i<y;i++){for(o=0;o<j;o++){n[i][o]=a[(i*y)+o];}}
String b=Arrays.toString(a);List<Stack<String>>list=new ArrayList<Stack<String>>();
Stack<String>stack=new Stack<String>();stack.add(b);}

public void que(){
    PriorityQueue<Integer>N=new PriorityQueue<Integer>();
    Integer[]a1=new Integer[n.length];Integer[]a2=N.toArray(a1);
    for(int c=0;c<a2.length;c++){System.out.println(a2[c]);}}

public static class heap<N extends Comparable<N>>{public heap(int s)
{int size=0;Comparable[]data;data=(N[])new Object[s];}}

public void map(){Map<String,String>p=new HashMap<>();Object[]oA=p.entrySet().toArray();}

public void hash(){Map<String,String>h=new HashMap<>();{
    HashMap<String,String>p=new HashMap<String,String>();
    Set<String>N=new HashSet<String>();
    String[]Na=N.toArray(new String[N.size()]);}}//works for set also

public void set(){{HashSet<String>p=new HashSet<String>();}}

public static class tree{int d;tree l;tree r;tree t;public tree(final int d){this.d=d;}
public void printTree(){final Queue list=new LinkedList();list.add(this);
while(!list.isEmpty()){System.out.println(t.d);if(t.l!=null){list.add(t.l);}}}}

public void graph(){int v=0;n=new int[v+1][v+1];}

/*public void stream(){int m[]=new int[n.length*n[0].length];
for(int k=0;k<n.length;k++){int[]r=n[k];
for(int l=0;l<r.length;l++){int numb=n[k][l];}}
Stream<String>s1=Arrays.stream(n);s1.forEach(x->System.out.println(x));
Stream<String>s2=    Stream.of(n);s2.forEach(x->System.out.println(x));}*/

//public void image(){}//requires bytestream

//and java forgot slew grid scope and breach 

public static void main(String[]args){System.out.println("Enter list 1: ");
for(y=0;y<n.length;y++){for(j=0;j<n.length;j++){n[y][j]=scan.nextInt();}} 
switchADT dt=new switchADT();//instances the array...
dt.string();dt.list();dt.stack();dt.que();dt.map();dt.hash();dt.set();dt.graph();}}
//cant call tree heap

//https://stackoverflow.com/questions/27114432/creating-an-array-heap-in-java
//https://kodejava.org/how-do-i-convert-an-array-to-a-map/
//https://stackoverflow.com/questions/31693781/convert-string-array-to-map-using-java-8-lambda-expressions
//https://www.sanfoundry.com/java-program-represent-graph-2d-arrays/
//https://stackoverflow.com/questions/16956720/how-to-create-an-2d-arraylist-in-java
//https://stackoverflow.com/questions/15929101/create-2d-array-of-lists-in-java
//https://stackoverflow.com/questions/10767471/convert-2d-array-in-java-to-image
//https://stackoverflow.com/questions/838439/array-of-stacks
//https://stackoverflow.com/questions/5134555/how-to-convert-a-1d-array-to-2d-array
//https://stackoverflow.com/questions/11340505/converting-string-array-to-hashmap
//https://www.techiedelight.com/convert-map-array-java/
//http://javadevnotes.com/java-list-to-array-examples/
//https://stackoverflow.com/questions/20959537/copy-stack-to-array
//https://www.tutorialspoint.com/java/util/priorityqueue_toarray.htm
//https://stackoverflow.com/questions/1090556/java-how-to-convert-hashmapstring-object-to-array
//https://www.javacodeexamples.com/convert-set-hashset-to-array-example/676
//https://stackoverflow.com/questions/26360865/how-to-use-arrayutils-for-array-of-objects-it-doesnt-delete-the-content-of-an
//https://stackoverflow.com/questions/26891747/convert-integer-array-into-a-binary-tree
//https://www.programcreek.com/2013/01/leetcode-convert-sorted-array-to-binary-search-tree-java/
//https://stackoverflow.com/questions/25405165/converting-a-2d-matrix-into-a-graph
//https://www.mkyong.com/java8/java-how-to-convert-array-to-stream/
//https://stackoverflow.com/questions/28305359/how-to-convert-2d-array-into-1d