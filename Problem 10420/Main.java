
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author info
 */
public class Main {
    
       static String ReadLn (int maxLg)  // utility function to read from stdin
    {
        byte lin[] = new byte [maxLg];
        int lg = 0, car = -1;
        String line = "";

        try
        {
            while (lg < maxLg)
            {
                car = System.in.read();
                if ((car < 0) || (car == '\n')) break;
                lin [lg++] += car;
            }
        }
        catch (IOException e)
        {
            return (null);
        }

        if ((car < 0) && (lg == 0)) return (null);  
        return (new String (lin, 0, lg));
    }
       public static void main(String args[]){
  Main mc=new Main();
  mc.begin();
  }
       
       void begin()
       {
            TreeMap lk=new TreeMap<String,Integer>();
         StringTokenizer tok;
         String country;
         int nbr;
         int count=Integer.parseInt(Main.ReadLn(255));
                 for(int i=0;i<count;i++)
                 {
                    String line=Main.ReadLn(255);
                    tok=new StringTokenizer(line);
                    country=tok.nextToken();
                    if(lk.containsKey(country))
                    { 
                        nbr=(int) lk.get(country);
                        nbr++;
                        lk.put(country, nbr);
                    }
                    else
                    {
                        lk.put(country, 1);
                    }
                    
                    
                 
                 }
                 
               
               Set entry=lk.entrySet();
               Iterator it=entry.iterator();
               while(it.hasNext())
               {
                   tok=new StringTokenizer(it.next().toString(),"=");
                   System.out.print(tok.nextToken()+" "+tok.nextToken());
               }
               
                 
       }
    
}
