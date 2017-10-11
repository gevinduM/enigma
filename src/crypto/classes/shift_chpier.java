/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto.classes;

import java.util.ArrayList;

/**
 *
 * @author Gevindu
 */
public class shift_chpier {
    
    
    ArrayList<String> list = new ArrayList<String>() {{
        add("A");add("B");add("C");add("D");add("E");add("F");add("G");add("H");add("I");add("J");add("K");add("L");add("M");add("N");add("O");add("P");add("Q");add("R");add("S");add("T");add("U");add("V");
        add("W");add("X");add("Y");add("Z");
    }};
    
     public String cipher(String msg, int shift) {
        String s = "";
        
        
        int len = msg.length();
        for (int x = 0; x < len; x++) {
            char c = (char) (msg.charAt(x) + shift);
            if (c > 'z') {
                s += (char) (msg.charAt(x) - (26 - shift));
            } else {
                s += (char) (msg.charAt(x) + shift);
            }
        }
        return s;
    }
     
     public String shift(String msg, int shift){
     
        String s = "";
        int len = msg.length();
        String[] charArr = msg.split("");

        for (int x = 0; x < len; x++) {
            
            int shiftVal= (list.indexOf(charArr[x]) + shift);
            
            if(shiftVal > 25){
                
                s += list.get(shiftVal - 26);
            }
            else{
                s += list.get(shiftVal);
            }
            
        }
         return s;
        
         
     };
     
     
     
}
