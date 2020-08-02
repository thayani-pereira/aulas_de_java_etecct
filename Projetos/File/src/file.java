import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class file {

	public static void main(String[] args) {
		//Configuração de arquivo file
		
		File file = new File("C:\\temp\\Meuarquivo.txt");
		
	    //Scanner null
		Scanner sc = null;
		
		//TRATANDO OS ERROS
try {
	sc = new Scanner(file);
	while (sc.hasNextLine()) {
	System.out.println(sc.nextLine());
	
}
	}
	catch(IOException e){
		System.out.println("Erro:" + e.getMessage());
			
	}
    finally {
    	if(sc!=null) {
    		sc.close();
    	   }
         }
       }
     }