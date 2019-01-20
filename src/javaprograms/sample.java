/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

/**
 *
 * @author lenovo
 */
/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class sample {
   public static void main(String args[] ) throws Exception {

       Scanner sc =new Scanner(System.in);
       String s =sc.nextLine();
       StringBuilder s1=new StringBuilder(s);
        String s2=s1.reverse().toString();
        char c[]=s2.toCharArray();
       
        
       for(int i=0;i<c.length;i++)
       {
           if(c[i]=='A')
               c[i]='T';
           else  if(c[i]=='T')
               c[i]='A';
               else if(c[i]=='C')
               c[i]='G';
                else if(c[i]=='G')
               c[i]='C';
           System.out.print( c[i]);
       }
            System.out.println( );
       
      

   }
}

