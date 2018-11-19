/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w8;

/**
 *
 * @author Erebor
 */
public class MyString {

    // string içerisindeki parametre olarak aldığı ilk karakteri, ikinci parametre olarak aldığı 
    // karakter ile değiştiren ve yeni string i geri döndüren metod
    static String myReplace(char old, char newChar, String metin) {
        String temp = "";
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == old) {
                temp += newChar;
            }else
                temp += metin.charAt(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        String gelen = myReplace('a', 'r', "Fatih Sultan Mahmah mah hah");
        System.out.println(gelen);
    }
}
