package programesDSA.Strings;

import java.util.HashSet;
import java.util.Iterator;

public class LongestPaliStr {
    public static void main(String[] args) {
        String s="bmabbacmdmadam";
        //String s="bmamba";
        int i=0,j=1,len=0;

        String val="", pali="",sub="";
       HashSet<String> hs = new HashSet<>();
        
        while(j<s.length()){
         if(s.charAt(i)==s.charAt(j)){
            sub = s.substring(i, j+1);
                hs.add(sub);
          i++;
          j=i+1;
         }
         else{
            if(j>=s.length()-1){
             i++;
             j=i+1;
            }
            else{j++;}
            
         }
        }

       Iterator<String> it = hs.iterator();
       while(it.hasNext()){
          String nxt = it.next();
          int k=nxt.length()-1;
          while(k>=0){
           val+=nxt.charAt(k);
           k--;
          }

         if(val.equals(nxt)){
           if(nxt.length()>len){
            len=nxt.length();
            pali=val;
           }
       
         }
        val="";
    }
    System.out.println("longest palindrome substring is "+pali+ " with length of "+len);
    }
}
