import java.io.File;
import java.util.Scanner;

public class Novo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o caminho do Arquivo desejado:");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		System.out.println("Qual Nome:" + path.getName());
		System.out.println("Qual Caminho:" + path.getParent());
		System.out.println("Qual Caminho:" + path.getPath());
		
		sc.close();

	}

}
