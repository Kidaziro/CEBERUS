package Tests;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class python_portable {
    
    public static void main(String[] args) throws IOException {
          ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "cd Cizar && python test.py");
          
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;String []L=null;
        while (true) {
            line = r.readLine();
            if (line == null) {  break; }
            L=line.split(",");
            
        } 
        for (int i = 0; i < L.length; i++) {
            System.out.println(L[i]);
            
        }
        

        
    }
    
}
