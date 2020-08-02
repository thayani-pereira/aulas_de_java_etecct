import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String path = "C:\\temp\\Meuarquivo.txt";    
      
      try(BufferedReader br=new BufferedReader(new FileReader(path))) {
    	 
    	  // ou pode ser usado desse -->br=new BufferReader(new FileReader(path));
    	 String line= br.readLine();
    	 while (line!= null) {
    		 System.out.println(line);
    		 line=br.readLine();
    	 }
    	 }
    	 catch(IOException e){
    			System.out.println("Erro:" + e.getMessage());
    			 	 
    	       }
           }
}



