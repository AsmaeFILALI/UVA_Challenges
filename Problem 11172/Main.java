
import java.io.IOException;
import java.util.StringTokenizer;
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
        mc.begin();
        
       
    }
    
    void begin()
    {
        String input;
        StringTokenizer idata;
        int n1,n2;
         try {
             
              input=Main.ReadLn(255);
            int count=Integer.parseInt(input);
            
            for(int i=0;i<count;i++)
            {
                input=Main.ReadLn(255);
                idata=new StringTokenizer(input);
                n1=Integer.parseInt(idata.nextToken());
                n2=Integer.parseInt(idata.nextToken());
                if(n1==n2){System.out.println("=");}
                else{
                if(n1>n2){System.out.println(">");}
                else System.out.println("<");
                    }
            }
        } catch (Exception ex) {
            
        }
    
    }
    
}
