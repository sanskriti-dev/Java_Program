/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
public class Linkedlist1 {
        Node  head;
      
     public  void midElement()
     {
         Node n = head;
         int count =0;
         while(n!=null)
         {
             count++;
             n=n.next;
         }
         n=head;
         int mid= count/2;
                  System.out.print(mid);

         while(mid>0 && n!=null)
         {
           n=n.next;
           mid--;
         }
         System.out.print(n.data);
     }
          public  void add(Node n)
          {
              if(head==null)
                  head=n;
              else
              {
                  Node temp = head;
              while(temp!=null)
              {
                  temp=temp.next;
              }
              temp.next=n;
          }
          }

    public static void main(String str[])
    {
        Linkedlist1 ll1 =new Linkedlist1();
        System.out.println("Enter the length of list");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a1=sc.nextInt();
        Node head =new Node(a1);
        ll1.add(head);
        for(int i=1;i<s;i++)
        {
        int a=sc.nextInt();
        ll1.add( new Node(a));
        }
         ll1.midElement();
          
           
        
    }
    
}
