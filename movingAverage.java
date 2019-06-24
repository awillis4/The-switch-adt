import java.util.*;

//promt user to enter nums into a que array, find the sum, find the average, find the 3 num rolling avg.

/*public class movingAverage{public static void main(String[]args){Scanner scan=new Scanner(System.in);

int i=0;int p=30;int[]d=new int[p];int sum=0;int sum2=0;int av=0;int avg=0;int c=0;int m=0;

System.out.println("enter an int<30");p=scan.nextInt();c=p;
System.out.println("enter an int then press enter p times");for(i=0;i<p;i++){p=scan.nextInt();}

for(i=0;i<p;i++){sum+=d[i];}System.out.println("the sum is"+sum);
avg=sum/c;System.out.println("the average is"+avg);
for(i=3;i<p;i++){i=m;for(m=0;m<i-3;m++){sum2+=d[i];}}av=sum2/c;
System.out.println("the rolling average is"+av);

}}*/

public class movingAverage{

private final Queue<Float>window=new LinkedList<Float>();
private int period;private float sum;

public movingAverage(int period){this.period=period;}
public void newNum(float num){sum+=num;window.add(num);
if(window.size()>period){sum-=window.remove();}}
public float getAvg(){if(window.isEmpty()){return sum/window.size();}return 0;}

public static void main(String[]args){Scanner scan=new Scanner(System.in);
int p=30;int q=0;int r=0;float[]data=new float[p];int[]winsize=new int[p];

System.out.println("Enter number datapoints, enter, window sizes, enter.");
q=scan.nextInt();r=scan.nextInt();

System.out.println("enter each data point then press enter now.");
for(p=0;p<q;p++){data[p]=scan.nextFloat();}
System.out.println("now enter the window sizes.");
for(p=0;p<r;p++){winsize[p]=scan.nextInt();}

for(int winsiz:winsize){movingAverage mama=new movingAverage(winsiz);
for(float x:data){mama.newNum(x);System.out.println("nexnum= "+x+", SMA= "+mama.getAvg());}        
System.out.println();}}}

//https://rosettacode.org/wiki/Averages/Simple_moving_average#Java 
// was the only code i could find that does that.