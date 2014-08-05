
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
       
       String fct(String in)
       {String out="";
       char [] nbrs;
       int nb,res,l;
       nbrs=in.toCharArray();
       l=nbrs.length;
       res=0;
      if(l>1)
       { 
           for(int i=0;i<l;i++)
             {
                 res+=Integer.parseInt(nbrs[i]+"");
             }
           out=fct(Integer.toString(res));
       return out;
       }
      else{ out=in;
             return out;  }
       
       }
       
       void begin()
       {
         String input=Main.ReadLn(255);
          String fin="0";
           while(input.compareTo(fin)!=0)
           {
             System.out.println(fct(input));
             input=Main.ReadLn(255);
           }
          
       }
    
}
