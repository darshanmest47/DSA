package programesDSA.Strings;
import java.util.*;

public class LongestNorep{

    public static void main(String[] args) {
        String s = "abcdefaavvm";
        Set<Character>hs = new HashSet<>();
        int i=0,j=0,max=0;
        if(s.length()==0){
            System.out.println("Invalid");
        }

        else{
            while(i<s.length()){
                if(hs.contains(s.charAt(i))){
                    hs.remove(s.charAt(j));
                    j++;
                }
                else{
                    hs.add(s.charAt(i));
                    max = Math.max(max,i-j+1);
                    i++;
                }


            }
        }

       System.out.println("length of the longest substring with no repeating characters is "+max);
    }
}
