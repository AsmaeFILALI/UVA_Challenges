
import java.io.IOException;
import java.util.StringTokenizer;

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
  {   StringTokenizer tok;
      String s,line;
      int cases=Integer.parseInt(Main.ReadLn(255));
      int count,size,n_animals,n_friend,sum;
      
      for(int j=0;j<cases;j++){
          
      
      {sum=0;
        s=Main.ReadLn(255);
      
      count=Integer.parseInt(s);
      
      for(int i=0;i<count;i++)
      {
          line=Main.ReadLn(255);
          if(!line.isEmpty()){
          tok=new StringTokenizer(line);
          size=Integer.parseInt(tok.nextToken());
          n_animals=Integer.parseInt(tok.nextToken());
          n_friend=Integer.parseInt(tok.nextToken());
         
          sum+=size*n_friend;}
          
      }
      System.out.println(sum);
      }
  
  }
  }
}
