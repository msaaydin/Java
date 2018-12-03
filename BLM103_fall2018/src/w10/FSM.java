/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w10;

/**
 *
 * @author Erebor
 */
public class FSM {
    void fsm (String s, int num){
        int count = 0;
        while (count < num){
            if (s.charAt(count) != ' '){
                System.out.print(s.charAt(count));
                count++;
            }else
                count++;
        }
    }
    int fsm(String s, char c){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                count++;
            }
        }        
        return count;                
    }
    int [] fsm(String s,char c,boolean b){
        int [] indexArray = new int [fsm(s,c)];
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                indexArray[num++] = i;
            }
        }
        return indexArray;
    }
}
