package python_gange_RSA_keys;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Get_RSA {

    public static void main(String[] args) throws IOException {
        String pythonScriptPath = "C:\\Users\\moadz\\OneDrive\\Desktop\\PFE CEBER SECURITY\\python sc\\Max.py";
        String arg1 = "value1";
        

        ProcessBuilder pb = new ProcessBuilder("python", pythonScriptPath, arg1);
        Process process = pb.start();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while (true) {
            String result = in.readLine();
            System.out.println(result);
            if (result==null) {
                break;
            }
        }
    }

}
