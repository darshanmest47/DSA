package programesDSA.Arrays;
import java.util.*;

public class RepetativeCharCount {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String: ");
       String input = sc.nextLine();
       String[] splitinput = input.split("");
       Map<String, Integer> hs = new HashMap<>();
       for(int i=0;i<splitinput.length;i++){
            if(hs.containsKey(splitinput[i])){
             hs.put(splitinput[i], hs.get(splitinput[i])+1);
            }
            else{
                hs.put(splitinput[i],1);
            }
       }

       System.out.println(hs);
    }
    
}
