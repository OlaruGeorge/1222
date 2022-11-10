/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aplicatie_3;
import java.util.Hashtable;

/**
 *
 * @author egrog
 */
public class Aplicatie_3 {

    public static void main(String[] args) {
        
        Hashtable<String, Boolean> prezenteazi = new Hashtable<String, Boolean>(); 

        prezenteazi.put("George", false);
        prezenteazi.put("Ilie", false);
        prezenteazi.put("Razvan", true);
        prezenteazi.put("Luca", true);
 
        System.out.println("Mappings of prezenteazi : " + prezenteazi);
    }
}
