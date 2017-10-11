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
public class Brute_force {
    
    ArrayList<String> list = new ArrayList<String>() {{
        add("A");add("B");add("C");add("D");add("E");add("F");add("G");add("H");add("I");add("J");add("K");add("L");add("M");add("N");add("O");add("P");add("Q");add("R");add("S");add("T");add("U");add("V");
        add("W");add("X");add("Y");add("Z");
    }};
    
    public ArrayList<String> codeBreaker(String cypher) {

        int len = cypher.length();
        String[] charArr = cypher.split("");
        
        ArrayList<String> result = new ArrayList<String>();

        for (int shift = 0; shift < 26; shift++) {
            String s = "";

            for (int i = 0; i < len; i++) {
                
                int a = list.indexOf(charArr[i]);
                int plainIndx = (list.indexOf(charArr[i]) - shift);
                
                if(plainIndx < 0){
                     s += (list.get(26 + plainIndx));
                }
                else{
                    s += (list.get(plainIndx));

                }    
            }

            result.add(s);

        }
        
        return result;
    }

}
