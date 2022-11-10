/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aplicatie_4;

/**
 *
 * @author egrog
 */
public class Aplicatie_4 {

    int binarySearch(int arr[], int l, int r, int x)
    {
       
    while (l <= r) {
        int m = l + (r - l) / 2;

        if (arr[m] == x)
            return m;

        if (arr[m] < x)
            l = m + 1;

        else
            r = m - 1;
    }
        return -1;
    }
    
    public static void main(String args[])
    {
        Aplicatie_4 ob = new Aplicatie_4();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present.");
        else
            System.out.println("Element found at index " + result + ".");
    }
}
