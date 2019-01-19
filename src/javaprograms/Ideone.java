/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	         Scanner sc =new Scanner(System.in);
	         int t=sc.nextInt();
	         while(t>0)
	         {
	         	int t1=sc.nextInt();
	         	ArrayList<Integer> List1=new ArrayList<Integer>();
	         	for(int i=0;i<t1;i++)
	         	{
	         		List1.add(sc.nextInt());
	         	}
	         	int d1=sc.nextInt();
	         	ArrayList<Integer> List2=new ArrayList<Integer>();
	         	for(int i=0;i<d1;i++)
	         	{
	         		List2.add(sc.nextInt());
	         	}
	         	int t2=sc.nextInt();
	         	ArrayList<Integer> List3=new ArrayList<Integer>();
	         	for(int i=0;i<t2;i++)
	         	{
	         		List3.add(sc.nextInt());
	         	}
	         		int d2=sc.nextInt();
	         	ArrayList<Integer> List4=new ArrayList<Integer>();
	         	for(int i=0;i<d2;i++)
	         	{
	         		List4.add(sc.nextInt());
	         	}
	         	if(List1.containsAll(List3) && List2.containsAll(List4))
	         	System.out.println("yes");
	         	else
	         	System.out.println("no");
	         	t--;
	         	
	         	
	         	
	         }
		
	}
}
