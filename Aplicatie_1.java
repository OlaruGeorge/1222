/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aplicatie_1;

import static com.mycompany.aplicatie_1.QuickSort.printArray;
        
/**
 *
 * @author egrog
 */
public class Aplicatie_1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int arr[]= { 10, 7, 8, 9, 1, 5};
            int n=arr.length;
            
            QuickSort ob = new QuickSort();
            ob.sort(arr, 0, n-1);
            
            System.out.println("Sorted Array.");
            printArray(arr);
        
        
    }
}

class QuickSort
{
    int partition(int arr[],int low,int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        
        return i+1;
    }
    void sort(int arr[],int low,int high)
    {
        if(low < high)
        {
            int pi=partition(arr,low,high);
            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
    }
    static void printArray(int arr[])
    {
        int n= arr.length;
        for(int i=0;i<n;++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}