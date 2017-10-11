/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto.classes;

import java.util.*;

/**
 *
 * @author Gevindu
 */
public class Mono_cipher {
    
    ArrayList<String> list = new ArrayList<String>() {{
        add("A");add("B");add("C");add("D");add("E");add("F");add("G");add("H");add("I");add("J");add("K");add("L");add("M");add("N");add("O");add("P");add("Q");add("R");add("S");add("T");add("U");add("V");
        add("W");add("X");add("Y");add("Z");
    }}; 
  
    ArrayList<String> map = new ArrayList<String>() {{
        add("N");add("D");add("R");add("L");add("T");add("E");add("Q");add("G");add("Z");add("K");add("A");add("P");add("J");add("U");add("Y");add("F");add("S");add("V");add("O");add("C");add("W");add("I");
        add("H");add("X");add("B");add("M");
    }}; 
    
     
     public String genetate(String msg){
         
         String s = "";
         int len = msg.length();
         String[] charArr = msg.split("");

         for (int i = 0; i < len; i++) {
             
             int plainIndex = list.indexOf(charArr[i]);
             s += map.get(plainIndex);
             

         }
     
         
         return s;
     }
}
