/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class uniquechars {
   
    public static void main(String str[])
    {
     HashMap<String,String> m =new HashMap<String,String>();
     m.put("Chennai","Banglore");
     m.put("Bombay","Delhi");
     m.put("Goa","Chennai");
     m.put("Delhi","Goa");
     printresult(m);
     }
    private static void printresult(HashMap<String,String> m)
    {
        HashMap<String,String> rev_m=new HashMap<String,String>();
        for(HashMap.Entry<String ,String> e:m.entrySet())
        {
            rev_m.put(e.getValue(),e.getKey());
        }
        String start=null;
        for(HashMap.Entry<String ,String> e:m.entrySet())
        {
            if(!rev_m.containsKey(e.getKey()))
            {
                start=e.getKey();
                break;
            }
        }
        if(start==null)
        {
            System.out.println("Invalid Input");
            return;
        }
        String to=m.get(start);
        while(to!=null)
        {
            System.out.println(start+"->"+to);
            start=to;
            to=m.get(start);
        }
        
            
    }
 
    
}
