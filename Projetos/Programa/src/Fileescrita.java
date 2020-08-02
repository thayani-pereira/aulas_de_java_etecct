import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileescrita {

	public static void main(String[] args) {
     //VETOR
	 String[] lines = new String[] {"ISSO É UM TESTE DE ARQUIVO MANO!!!!!!!" , "TESTE" , "TESTE"}	;
     String path ="C:\\temp\\Teste.txt";
     try(BufferedWriter bw=new BufferedWriter(new FileWriter(path, true))) {
    	 for(String line:lines) {
    		 bw.write(line);
    	     bw.newLine();
    	 
    	 }
	}
     catch(IOException e){
			e.printStackTrace();
	}
}
}
