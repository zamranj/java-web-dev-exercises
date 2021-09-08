package org.launchcode.java.studiocountingcharacters;

import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args) {
        String s = "If the product of two terms is zero then common sense says at " +
                "least one of the two terms has to be zero to start with. So if you " +
                "move all the terms over to one side, you can put the quadratics into " +
                "a form that can be factored allowing that side of the equation to equal " +
                "zero. Once you’ve done that, it’s pretty straightforward from there.";
        //initailze a hashmap
        HashMap<Character, Integer> charMap = new HashMap<>();
        //convert a string into char array
        char[] charArray = s.toCharArray();
        /*iterate over each char in the array
          we will save the results in the hashmap.
          Check if we have any character already mapped if NOT add 1
          Else if there is already one present add +1 to the value
         */
        for(char c: charArray){
            if(!charMap.containsKey(c)){
                charMap.put(c, 1);
            }else {
                charMap.put(c, charMap.get(c)+1);
            }
        }
        System.out.println(charMap.entrySet());
    }

}
