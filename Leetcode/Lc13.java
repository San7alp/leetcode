import java.util.HashMap;
import java.util.Scanner;
public class Lc13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int value=0;
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            char x=c[i];
            int y=(i + 1 < c.length) ? map.get(c[i + 1]) : 0;
            if(map.get(x)<y){
                value-=map.get(x);
                continue;
            }
            value+=map.get(x);
            }
          return value;  
        }
    }
