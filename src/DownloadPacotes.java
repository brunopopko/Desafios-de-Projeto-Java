
import java.util.Scanner;

public class DownloadPacotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Porcentagem: ");
        int tamanho = scan.nextInt();
        
        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download
        
        switch (tamanho) {
          case 1:
            System.out.println("/");
            break;
          case 2:
            System.out.println("//");
            break;
          case 3:
            System.out.println("///");
            break;
          case 4:
            System.out.println("////");
            break;
          case 5:
            System.out.println("/////");
            break;
          case 6:
            System.out.println("//////");
            break;
          case 7:
            System.out.println("///////");
            break;
          case 8:
            System.out.println("////////");
            break;
          case 9:
            System.out.println("/////////");
            break;
          case 10:
            System.out.println("//////////");
            break;  
        }
        
    }
}
