
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
       
       String line;
       int m,i,lenght;
       char [] output;
       boolean start=true;
       while ((line= Main.ReadLn (255))!= null){
     // chek if we have to put a double cote or a right doublecote
      
       
          output=line.toCharArray();
          i=0;
          lenght=output.length;
       while(i<lenght)
       {
           if(output[i]=='"'){
           if(start){System.out.print("``"); start=false;}
           else {System.out.print("''"); start=true;}
          
           }else System.out.print(output[i]);
           
           i++;
       
       }
       System.out.print("\n");
       }
      
     
   }
}
