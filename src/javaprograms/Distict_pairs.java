/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Distict_pairs {
     public static void main(String str[])
     { 
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
         int m=sc.nextInt();
         System.out.println("Enter the sum");
         int sum=sc.nextInt();
         int a[]=new int[m];
         for(int i=0;i<m;i++)
         {
             a[i]=sc.nextInt();
         }
         HashSet<Integer> set=new HashSet<>();
         for (int i=0;i<m;i++)
         {
              
             int s=sum-a[i];
             if(s>0 && set.contains(s))
             {
                 System.out.println(s+" "+a[i]);
             }
             set.add(a[i]);
            
         }
         
             
     }
}
