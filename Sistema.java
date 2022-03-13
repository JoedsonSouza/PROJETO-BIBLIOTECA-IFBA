import java.util.Scanner;

public class Sistema{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Biblioteca menu = new Biblioteca(); 

        do{
            menu.menuOpcoes();

            switch (menu.getMenu()) {
                case 1:
                    menu.novoAluno();
                    break;
                case 2:
                    menu.consultarAluno();
                    break;
                case 3:
                    menu.novoLivro();
                    break;
                case 4:
                    menu.consultarLivro();
                    break;
                case 5:
                    menu.livrosDisponiveis();
                    break;
                case 6:
                    menu.livrosIndisponiveis();
                    break;
            
                default:
                    break;
            }
        }while (menu.getMenu() != -1);

        System.out.println("\n\nOBRIGADO POR UTILIZAR NOSSO SISTEMA!\n\n");
        scan.close();
    }
}