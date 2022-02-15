import java.util.Scanner;
import java.util.HashMap;

public class Biblioteca{
    Scanner scan = new Scanner(System.in);
    private int menu;
    private String cpf_consulta;
    private String ISBN_consulta;

    public Biblioteca(){

    }

    public int getMenu() {
        return menu;
    }
    public void setMenu(int menu) {
        this.menu = menu;
    }
    public String getCpf_consulta() {
        return cpf_consulta;
    }
    public void setCpf_consulta(String cpf_consulta) {
        this.cpf_consulta = cpf_consulta;
    }
    public String getISBN_consulta() {
        return ISBN_consulta;
    }
    public void setISBN_consulta(String iSBN_consulta) {
        ISBN_consulta = iSBN_consulta;
    }

    public void menuOpcoes(){
        System.out.println("\n\n=============== BIBLIOTECA ===============");
        System.out.println("================== IFBA ================== \n");

        System.out.println("MENU DE OPÇÕES: ");
        System.out.println("[1] - CADASTRAR ALUNO");
        System.out.println("[2] - CONSULTAR ALUNO");
        System.out.println("[3] - CADASTRAR LIVRO");
        System.out.println("[4] - CONSULTAR LIVRO");
        System.out.println("[-1] - SAIR \n");
        System.out.print("DIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
        
        setMenu(scan.nextInt());
    }

}