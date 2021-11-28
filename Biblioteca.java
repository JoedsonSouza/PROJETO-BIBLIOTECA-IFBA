import java.util.Scanner;
import java.util.HashMap;

public class Biblioteca{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu;

        System.out.println("=============== BIBLIOTECA ===============");
        System.out.println("================== IFBA ================== \n");

        System.out.println("MENU DE OPÇÕES: ");
        System.out.println("[1] - CADASTRAR ALUNO");
        System.out.println("[2] - CADASTRAR LIVRO");
        System.out.println("[0] - SAIR \n");
        System.out.println("DIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
        menu = scan.nextInt();
        System.out.println("");

        if (menu != 0) {
            switch (menu) {
                case 1:
                    String nome;
                    String cpf;
                    String matricula;
                    String email;
                    String telefone;
                    String endereco;
    
                    System.out.println("::::::< CADASTRAR ALUNO >:::::: \n");
    
                    //ARMAZENAR ALUNOS EM UMA ÚNICA VARIÁVEL E USAR O CPF COMO KEY
                    HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
    
                    System.out.println("NOME: ");
                    nome = scan.nextLine();
                    System.out.println("CPF: ");
                    cpf = scan.nextLine();
                    System.out.println("NÚMERO DE MATRÍCULA: ");
                    matricula = scan.nextLine();
                    System.out.println("EMAIL: ");
                    email = scan.nextLine();
                    System.out.println("TELEFONE: ");
                    telefone = scan.nextLine();
                    System.out.println("ENDEREÇO: ");
                    endereco = scan.nextLine();
    
                    Aluno alu = new Aluno(nome, cpf, matricula, email, telefone, endereco);
                    alunos.put(cpf, alu);
    
                    break;
                case 2:
                    System.out.println("::::::< CADASTRAR LIVRO >:::::: \n");
                    break;
    
                default:
                    break;
            }
        }else
            System.out.println("OBRIGADO POR UTILIZAR NOSSO SISTEMA!");
        
        scan.close();
    }
}