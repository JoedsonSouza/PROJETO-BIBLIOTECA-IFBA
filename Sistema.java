import java.util.Scanner;

public class Sistema{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Biblioteca menu = new Biblioteca(); 

        do{
            menu.menuOpcoes();
            menu.respostaMenu();
        }while (menu.getMenu() != -1);

        System.out.println("\n\nOBRIGADO POR UTILIZAR NOSSO SISTEMA!\n\n");
        scan.close();
    }
}