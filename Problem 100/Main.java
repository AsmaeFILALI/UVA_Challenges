import java.io.*;
import java.util.*;


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

        if ((car < 0) && (lg == 0)) return (null);  // eof
        return (new String (lin, 0, lg));
    }
     
    public static void main(String args []) {
        
      Main mc=new Main();
        mc.begin();
							
	}
    
   
    
    void begin()  {
	String input;
        StringTokenizer idata;
		 while ((input = Main.ReadLn (255)) != null){
                    idata = new StringTokenizer (input);
                    
		  int n1=Integer.parseInt(idata.nextToken());
                  int n2=Integer.parseInt(idata.nextToken()); 
                  
                  int ma,mi;
                  if(n1>n2){ma=n1;mi=n2;}
                  else{ ma=n2;mi=n1;}
                  System.out.print(n1+" "+n2+" ");
                  int max=-1;
                  
                  for( int j=mi;j<=ma;j++)
                  {
                   int cycle=1;
                   int n=j;
       while(n!=1)
        {cycle++;
           
            if(n%2!=0){
            n=n*3+1;
            }else{ n=n/2;}
            
        }
     
              if(cycle>max)max=cycle;  
                  }
                  System.out.print(max+"\n");
                  
                  }
    
    }
        }