import java.util.*;

public class findSmallerString{
public static void main(String[]args){
    
    HashMap<String,Integer> hm=new HashMap<String,Integer>();
    Scanner scan=new Scanner(System.in);int p=0;int[]b=new int[3];
    
    hm.put("z",1);hm.put("y",2);hm.put("x",3);hm.put("w",4);hm.put("v",5);hm.put("u",6);
    hm.put("t",7);hm.put("s",8);hm.put("r",9);hm.put("q",10);hm.put("p",11);hm.put("o",12);
    hm.put("n",13);hm.put("m",14);hm.put("l",15);hm.put("k",16);hm.put("j",17);hm.put("i",18);hm.put("h",19);
    hm.put("g",20);hm.put("f",21);hm.put("e",22);hm.put("d",23);hm.put("c",24);hm.put("b",25);hm.put("a",26);
    
    System.out.println("Initial list of elements:");
    for(Map.Entry m:hm.entrySet()){System.out.println(m.getKey()+""+m.getValue());}
    
    System.out.println("this program returns the string value of an entered string by adding the string value of letters.");
    
    for(int t=0;t<3;t++){
    System.out.println("please enter your word here.");String s=scan.nextLine();
    
    char[]n=s.toCharArray();System.out.println(n.length);
            
    for(int i=0;i<n.length;i++){p=n[0]+n[i];}
    System.out.println(p);}
    
    List<Integer>list=Arrays.asList(p);//It expects p and wont take anything else.
    Collections.sort(list);
    
    System.out.println("the list in ascending order:"+list);
    
}}//by Armani Willis