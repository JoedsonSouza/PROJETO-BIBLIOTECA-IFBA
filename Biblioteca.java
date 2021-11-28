import java.util.Scanner;
import java.util.HashMap;

public class Biblioteca{
    public static void main(String[] args) {

        HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
        Scanner scan = new Scanner(System.in);
        int menu, menu_cadastro, menu_consulta;

        do{
        menu = 0;
        System.out.println("\n\n=============== BIBLIOTECA ===============");
        System.out.println("================== IFBA ================== \n");

        System.out.println("MENU DE OPÇÕES: ");
        System.out.println("[1] - CADASTRAR ALUNO");
        System.out.println("[2] - CONSULTAR ALUNO");
        System.out.println("[3] - CADASTRAR LIVRO");
        System.out.println("[0] - SAIR \n");
        System.out.print("DIGITE O NÚMERO DA OPÇÃO ESCOLHIDA: ");
        menu = scan.nextInt();

            switch (menu) {
                case 1:
                    String nome;
                    String cpf;
                    String matricula;
                    String email;
                    String telefone;
                    String endereco;
    
                    System.out.println("\n\n::::::< CADASTRAR ALUNO >:::::: \n");
    
                    //ARMAZENAR ALUNOS EM UMA ÚNICA VARIÁVEL E USAR O CPF COMO KEY

                    do{
                        scan.nextLine();
                        System.out.print("NOME: ");
                        nome = scan.nextLine();
                        System.out.print("CPF: ");
                        cpf = scan.nextLine();
                        System.out.print("NÚMERO DE MATRÍCULA: ");
                        matricula = scan.nextLine();
                        System.out.print("EMAIL: ");
                        email = scan.nextLine();
                        System.out.print("TELEFONE: ");
                        telefone = scan.nextLine();
                        System.out.print("ENDEREÇO: ");
                        endereco = scan.nextLine();
        
                        Aluno alu = new Aluno(nome, cpf, matricula, email, telefone, endereco);
                        alunos.put(cpf, alu);

                        System.out.println("\n\nMENU DE OPÇÕES (CADASTRO DE ALUNO): \n");
                        System.out.println("[1] - CADASTRAR OUTRO ALUNO");
                        System.out.println("[0] - SAIR");
                        System.out.print("\nSUA ESCOLHA: ");
                        menu_cadastro = scan.nextInt();
                    }while(menu_cadastro != 0);
    
                    break;

                case 2:
                    System.out.println("\n\n::::::< CONSULTA DE ALUNO >:::::: \n");
                   
                    do{
                    scan.nextLine();
                    System.out.print("\nDIGITE O CPF DO ALUNO PARA REALIZAR A CONSULTA: ");
				    alunos.get(scan.nextLine()).DadosAluno();

                    System.out.println("\n\nMENU DE OPÇÕES (CONSULTA DE ALUNO): \n");
                        System.out.println("\n[1] - CONSULTAR OUTRO ALUNO");
                        System.out.println("[0] - SAIR");
                        System.out.print("\nSUA ESCOLHA: ");
                        menu_consulta = scan.nextInt();
                    }while(menu_consulta != 0);
                    break;

                case 3:
                    System.out.println("::::::< CADASTRAR LIVRO >:::::: \n");
                    break;
    
                default:
                    break;
            }

        }while (menu != 0);

        System.out.println("\n\nOBRIGADO POR UTILIZAR NOSSO SISTEMA!\n\n");
        
        scan.close();
    }
}