/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aplicatie_6;

/**
 *
 * @author egrog
 */
public class Aplicatie_6 {


    public static StringBuffer encrypt(String text, int step)
    {
        StringBuffer result = new StringBuffer();
 

        for (int i=0; i<text.length(); i++)
        {

            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + step - 65) % 26 + 65);
                result.append(ch);
            }

            else if (Character.isLowerCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + step - 97) % 26 + 97);
                result.append(ch);
            }

            else {
                result.append(text.charAt(i));
            }
        }

        return result;
    }

    public static StringBuffer decrypt(String text, int step)
    {
        StringBuffer result = new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {

            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) - step + 65) % 26 + 65);
                result.append(ch);
            }

            else if (Character.isLowerCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) - step + 97) % 26 + 97);
                result.append(ch);
            }

            else {
                result.append(text.charAt(i));
            }
        }
        
        return result;
    }
 
    public static void main(String[] args)
    {
        String text = "George Olaru";

        int step = 13;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + step);
        
        String encrypted = encrypt(text,step).toString();
        System.out.println("Cipher: " + encrypted);
        
        String decrypted = decrypt(encrypted,step).toString();
        System.out.println("Decrypted: " + decrypted);
        
        
    }
}
