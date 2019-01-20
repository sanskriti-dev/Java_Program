/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
 class ClassQ {
    class pair
    {
        int first,second;
        pair(int f,int s)
        {
            first=f;
            second=s;
        }
    }
    void findpairs(int arr[],int n)
    {
        HashMap<Integer,pair> map =new HashMap<Integer,pair>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                int sum=arr[i]+arr[j];
                if(!map.containsKey(sum))
                {
                    map.put(sum, new pair(i,j));
                }
                else
                {
                    pair p =map.get(sum);
                    System.out.println(arr[p.first]+ ","+ arr[p.second] + "and" + arr[i] + "," + arr[j]) ;
                    i=n;
                }
                
            }
        }
    }
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        ClassQ c=new ClassQ();
        c.findpairs(a,m);
        
    }
    
}
