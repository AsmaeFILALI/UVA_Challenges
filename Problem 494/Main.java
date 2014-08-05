
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

 class Main {
    
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
        mc.Begin();
        
       
    }
      
     
      
      void Begin()
    {
        String input;
             int count;
              StringTokenizer tok;

        while ((input = Main.ReadLn (255)) != null)
        {
             count=0;
              
               tok =new StringTokenizer(input);
          
           
           while(tok.hasMoreTokens())
           {
               String s=tok.nextToken();
               if(Pattern.matches("[a-zA-Z].*", s)) 
               { count++;}


           }
           
           System.out.println(count);
       }
        }
    
}